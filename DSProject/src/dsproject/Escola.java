package dsproject;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Escola {

    private static Escola instance = new Escola();
    private String nome;
    private ArrayList<Professor> professList;
    private Professor logado;
    private boolean islogado;
    private CriptografiaLogix cripto;
    private boolean errors;

    private Escola() {
        professList = new ArrayList<>();
        this.carregar();
    }

    public Professor getLogado() {
        return logado;
    }

    public boolean isIslogado() {
        return islogado;
    }

    public boolean isErrors() {
        return errors;
    }

    public static synchronized Escola getInstance() {
        return instance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Professor> getProfessList() {
        return professList;
    }

    public void setProfessList(ArrayList<Professor> professList) {
        this.professList = professList;
    }

    public boolean validarCpf(String strCpf) {
        int d1, d2;
        int digito1, digito2, resto;
        int digitoCPF;
        String nDigResult;

        d1 = d2 = 0;
        digito1 = digito2 = resto = 0;

        for (int nCount = 1; nCount < strCpf.length() - 1; nCount++) {
            digitoCPF = Integer.valueOf(strCpf.substring(nCount - 1, nCount)).intValue();

            //multiplique a ultima casa por 2 a seguinte por 3 a seguinte por 4 e assim por diante.
            d1 = d1 + (11 - nCount) * digitoCPF;

            //para o segundo digito repita o procedimento incluindo o primeiro digito calculado no passo anterior.
            d2 = d2 + (12 - nCount) * digitoCPF;
        };

        //Primeiro resto da divisão por 11.
        resto = (d1 % 11);

        //Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.
        if (resto < 2) {
            digito1 = 0;
        } else {
            digito1 = 11 - resto;
        }

        d2 += 2 * digito1;

        //Segundo resto da divisão por 11.
        resto = (d2 % 11);

        //Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.
        if (resto < 2) {
            digito2 = 0;
        } else {
            digito2 = 11 - resto;
        }

        //Digito verificador do validarCpf que está sendo validado.
        String nDigVerific = strCpf.substring(strCpf.length() - 2, strCpf.length());

        //Concatenando o primeiro resto com o segundo.
        nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

        //comparar o digito verificador do cpf com o primeiro resto + o segundo resto.
        return nDigVerific.equals(nDigResult);
    }

    public ArrayList<Integer> cadastrarProfessor(String cpf, String nome, String senha, String confsenha) {
        ArrayList<Integer> errorlist;
        errorlist = new ArrayList<>();
        errors = false;

        // Testa o Cpf    // retira "." "-" caso exista
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
        System.out.println("cpf em cadastrar professor = " + cpf);
// -------------------- Testa Campo Cpf  --------------------------------
        if (cpf.length() == 11) {
            if (cpf.matches("[0-9]{11}")) {
                if (!validarCpf(cpf)) {
                    //JOptionPane.showMessageDialog(null, "Digite um cpf válido", "Erro", JOptionPane.ERROR_MESSAGE);
                    errorlist.add(1);
                    errors = true;
                } else {
                    if (this.professList != null) {
                        for (int i = 0; i < this.professList.size(); i++) {
                            if (this.professList.get(i).getCpf().equals(cpf)) {
                                //JOptionPane.showMessageDialog(null, "Já existe professor cadastrado com o cpf", "Aviso", JOptionPane.WARNING_MESSAGE);
                                errorlist.add(9);
                                errors = true;
                            } else {
                                Interface.NewTeacherPanel.getLabelCpf().setForeground(Color.black);
                            }
                        }
                    } else {
                        Interface.NewTeacherPanel.getLabelCpf().setForeground(Color.black);
                        this.professList = new ArrayList<Professor>();
                    }
                }
            } else {
                //JOptionPane.showMessageDialog(null, "Digite um cpf válido", "Erro", JOptionPane.ERROR_MESSAGE);
                errorlist.add(1);
                errors = true;
            }
        } else {
            if (cpf.isEmpty()) {
                errorlist.add(1);
                errors = true;
            }
            /*else
             {
             JOptionPane.showMessageDialog(null, "Digite um cpf com 11 dígitos", "Erro", JOptionPane.ERROR_MESSAGE);
             errorlist.add(1);
             errors = true;
             }*/
        }
        /* ------------------------- Teste Campo Nome ------------------------
         */
        if (nome.isEmpty()) {
            //JOptionPane.showMessageDialog(null, "Digite um sobrenome", "Erro", JOptionPane.ERROR_MESSAGE);
            errorlist.add(2);
            errors = true;
        } else {
            //if(!nome.isEmpty())
            //{
            //nome = nome.toLowerCase();
            if (nome.charAt(nome.length() - 1) == ' ') {
                System.out.println(nome.length());
                nome = nome.substring(0, nome.length() - 1);
            }
            System.out.println(nome.length());
            System.out.println(nome);

            Pattern p = Pattern.compile("([a-z]+\\s)+[a-z]*");
            Matcher m = p.matcher(nome.toLowerCase());
            boolean matchFound = m.matches();

            if (!matchFound) {
                System.err.println("erro no nome");
                errorlist.add(2);
                errors = true;
            } else {
                Interface.NewTeacherPanel.getLabelNomeCompleto().setForeground(Color.black);
            }
            //}
            //}

            /*if (!nome.contains(" "))
             {
             //System.out.println("Nome nao contem sobrenome");
             JOptionPane.showMessageDialog(null, "Digite um sobrenome", "Erro", JOptionPane.ERROR_MESSAGE);
             errorlist.add(2);
             errors = true;
             }else
             {
             Interface.NewTeacherPanel.getLabelNomeCompleto().setForeground(Color.black);
             }*/
        }

        if (senha.isEmpty()) {
            errorlist.add(7);
            errors = true;
        } else {
            if (senha.length() < 4) {
                errorlist.add(10);
                errors = true;
            } else {
                if (confsenha.isEmpty()) {
                    errorlist.add(11);
                    errors = true;
                } else {
                    if (!(senha.equals(confsenha))) {

                        //JOptionPane.showMessageDialog(null, "Senhas diferentes", "Erro", JOptionPane.ERROR_MESSAGE);
                        errorlist.add(8);
                        errors = true;
                    } else {
                        Interface.NewTeacherPanel.getLabelSenha().setForeground(Color.black);
                        Interface.NewTeacherPanel.getLabelConfirmarSenha().setForeground(Color.black);
                    }
                }
            }

            if (errors == false) {
                Professor novoprof;

                // criptografa senha
                this.cripto = new CriptografiaLogix(cpf, senha);
                novoprof = new Professor(cpf, nome, cripto.getSenhaCriptografada());
                errorlist.add(0); // nao possui erros
                this.professList.add(novoprof);
                this.salvarProfessor(novoprof);
                //System.out.println(professList.size());
                //return (errorlist);
            }
        }

        // erros no cadastro
        return (errorlist);
    }

    public boolean login(String cpf, String senha) {
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
        System.out.println("cpf digitado - " + cpf + "\n" + "senha digitada - " + senha);
        if (cpf.equals("1") && senha.equals("1")) {

            Professor novoprof = new Professor(cpf, nome, senha);
            //this.professList.add(novoprof);
            logado = novoprof;
        } else {
            for (int i = 0; i < this.professList.size(); i++) {
                if (this.professList.get(i).getCpf().equals(cpf)) {
                    //achou o modafuka professor //checa a senha
                    //System.out.println("Senha no login = " + senha);
                    String senhaconf;
                    cripto = new CriptografiaLogix();
                    senhaconf = cripto.decriptografarSenha(cpf, this.professList.get(i).getSenha());
                    System.out.println("senha decriptografada - " + senhaconf);
                    if (senha.equals(senhaconf)) {
                        // delicinha 

                        if (!islogado) {
                            // nao tem ninguem logado
                            logado = this.professList.get(i);
                            System.out.println(" achou o professor e logou");
                            islogado = true;
                            return true;
                        } else {
                            System.out.println("Ja existe Professor logado no sistema");
                            return false;
                        }
                    } else {
                        // senha errada seu viadinho
                        System.out.println("senha errada - " + senha);
                        return false;
                    }
                }

            }
        }

        /*      
         * //professor no existe*/
        System.out.println("Nao existe cadastro com cpf =" + cpf);
        return false;
    }

    public Professor getProfessorLogado() {
        return this.logado;
    }

    public void salvar() {
        Professor p;
        for (int i = 0; i < professList.size(); i++) {
            p = professList.get(i);
            salvarProfessor(p, true);
        }
    }

    /*
     public void salvarContadores() throws IOException {
     ArrayList<Integer> contadores = new ArrayList<>();

     contadores.add(Professor.getCont());
     contadores.add(Turma.getCont());
     contadores.add(Aluno.getCont());

     ObjectOutputStream out;
     out = new ObjectOutputStream(new FileOutputStream("info.dat"));
     out.writeObject(contadores);
     out.close();
     }
     */
    public void salvarProfessor(Professor p) {
        salvarProfessor(p, false);
    }

    public void salvarProfessor(Professor p, boolean all) {

        ArrayList<Turma> turmas = p.getTurmas();
        p.setTurmas(new ArrayList<Turma>());
        Turma t;
        File f;
        String diretorio = p.getDir();

        f = new File(diretorio);
        if (!f.exists()) {
            f.mkdirs();
        }

        try {
            //salva o obj professor
            ObjectOutputStream out;
            out = new ObjectOutputStream(new FileOutputStream(diretorio + "/info.dat"));
            out.writeObject(p);
            out.close();
        } catch (IOException ex) {
        }
        if (all) {
            for (int i = 0; i < turmas.size(); i++) {
                t = turmas.get(i);
                this.salvarTurma(t, true);
            }
        }

        p.setTurmas(turmas);
    }

    public void salvarTurma(Turma t) {
        salvarTurma(t, false);
    }

    public void salvarTurma(Turma t, boolean all) {
        //salva obj
        ArrayList<Aluno> alunos = t.buscaTodosAlunos();
        t.setAlunos(new ArrayList<Aluno>());

        Aluno a;

        File f;

        f = new File(t.getDir());
        if (!f.exists()) {
            f.mkdirs();
        }


        //salva o obj turma
        try {
            ObjectOutputStream out;
            out = new ObjectOutputStream(new FileOutputStream(t.getDir() + "/info.dat"));
            out.writeObject(t);
            out.close();
        } catch (IOException ex) {
        }

        if (all) {
            for (int i = 0; i < alunos.size(); i++) {
                a = alunos.get(i);
                this.salvarAluno(a, true);
            }
        }

        t.setAlunos(alunos);
    }

    public void salvarAluno(Aluno a) {
        salvarAluno(a, false);
    }

    public void salvarAluno(Aluno a, boolean all) {
        //salva aluno
        //salva arrayList de avaliaÃ§Ãµes do aluno

        File f;
        f = new File(a.getDir());
        if (!f.exists()) {
            f.mkdirs();
        }

        Turma tmp = a.getTurma();
        a.setTurma(null);
        ArrayList<Avaliacao> ava = a.getAvaliacoes();
        a.setAvaliacoes(null);

        //salva o obj turma
        try {
            ObjectOutputStream out;
            out = new ObjectOutputStream(new FileOutputStream(a.getDir() + "/info.dat"));
            out.writeObject(a);
            out.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }

        a.setTurma(tmp);
        a.setAvaliacoes(ava);

        if (all) {
            salvarAvaliacoes(a);
        }

    }

    public void salvarAvaliacoes(Aluno a) {
        System.out.println(a.getNome());
        try {
            ObjectOutputStream out;
            out = new ObjectOutputStream(new FileOutputStream(a.getDir() + "/avaliacoes.dat"));
            out.writeObject(a.getAvaliacoes());
            out.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    //Carrega todo o sistema a partir dos arquivos salvo anteriormente
    public void carregar() {
        File f = new File("professores");
        String lista[] = f.list();
        ArrayList<Professor> professores = new ArrayList<>();

        int pro_cont = 0;

        
        Professor p;
        
        //carrega todos os professores
        for (int i = 0; lista != null && i < lista.length; i++) {
            System.out.println("Professor em: " + lista[i]);
            p = carregarProfessor("professores/" + lista[i]);

            if (p.getNumDir() > pro_cont) {
                pro_cont = p.getNumDir();
            }

            professores.add(p);
        }

        //seta a lista de professores do programa
        this.setProfessList(professores);

        //arruma o contador da classe professor
        if (Professor.getCont() < pro_cont) {
            Professor.setCont(pro_cont);
        }
        
    }

    //carrega um professor salvo no diretorio passado
    public Professor carregarProfessor(String diretorio) {
        try {
            Professor p;

            FileInputStream file = new FileInputStream(new File(diretorio + "/info.dat"));
            ObjectInputStream in = new ObjectInputStream(file);
            
            //carrega o objeto associado ao professor do diretorio passado
            p = (Professor) in.readObject();
            in.close();

            File f = new File(diretorio + "/turmas");
            //se existe uma pasta turmas no diretorio deste professor
            if (f.exists()) {
                String lista[] = f.list();

                //System.out.println(p.getTurmas().get(0).getId());

                ArrayList<Turma> turmas = new ArrayList<>();
                Turma t;

                int tur_cont = 0;
                //carrega todas as turmas deste professor
                for (int i = 0; lista != null && i < lista.length; i++) {
                    if (!lista[i].equalsIgnoreCase("info.dat")) {
                        t = carregarTurma(diretorio + "/turmas/" + lista[i]);

                        if (t.getNumDir() > tur_cont) {
                            tur_cont = t.getNumDir();
                        }

                        if ("Sem Turma".equals(t.getId()) && "1".equals(t.getAno())) {
                            turmas.add(0, t);
                        } else {
                            turmas.add(t);
                        }

                        System.out.println("Turma: " + t.getId());
                    }
                }
                //seta as turmas do professor
                p.setTurmas(turmas);
                
                //arruma o contador da classe turma
                if (Turma.getCont() < tur_cont) {
                    Turma.setCont(tur_cont);
                }
            }
            return p;
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
            return null;
        }
    }

    //carrega uma turma do diretorio passado
    public Turma carregarTurma(String diretorio) {
        try {
            Turma t;

            FileInputStream file = new FileInputStream(new File(diretorio + "/info.dat"));
            ObjectInputStream in = new ObjectInputStream(file);
            
            //carrega o objeto associado a turma do diretorio passado
            t = (Turma) in.readObject();
            in.close();

            File f = new File(diretorio + "/alunos");
            String lista[] = f.list();

            ArrayList<Aluno> alunos = new ArrayList<>();
            Aluno tmp;

            int alu_cont = 0;
            //carrega todos os alunos desta turma
            for (int i = 0; lista != null && i < lista.length; i++) {
                if (!lista[i].equalsIgnoreCase("info.dat")) {
                    System.out.println("Aluno em: " + lista[i]);
                    tmp = (carregarAluno(diretorio + "/alunos/" + lista[i]));
                    alunos.add(tmp);
                    tmp.setTurma(t);

                    if (tmp.getNumDir() > alu_cont) {
                        alu_cont = tmp.getNumDir();
                    }
                }
            }
            //seta os alunos da turma
            t.setAlunos(alunos);
            
            //arruma o contador da classe aluno
            if (Aluno.getCont() < alu_cont) {
                Aluno.setCont(alu_cont);
            }

            return t;
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
            return null;
        }

    }

    //carregar um aluno do diretorio passsado
    public Aluno carregarAluno(String diretorio) {
        try {
            Aluno a;

            FileInputStream file;
            ObjectInputStream in;

            file = new FileInputStream(new File(diretorio + "/info.dat"));
            in = new ObjectInputStream(file);

            //carrega o obejto associado ao aluno do diretorio passado
            a = (Aluno) in.readObject();
            in.close();
            
            //carrega as avaliações deste aluno
            carregarAvaliacoes(a);

            return a;
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
            return null;
        }
    }

    
    //carregar a avaliação de um aluno passado
    public void carregarAvaliacoes(Aluno a) {
        try {
            FileInputStream file;
            ObjectInputStream in;
            file = new FileInputStream(new File(a.getDir() + "/avaliacoes.dat"));
            in = new ObjectInputStream(file);

            //carrega o ArrayList de avaliações do aluno passado
            ArrayList<Avaliacao> avaliacoes = (ArrayList<Avaliacao>) in.readObject();
            in.close();

            a.setAvaliacoes(avaliacoes);
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
        }
    }
    
    //remove todos os arquivos associados ao professor passado
    public void removeProfessor(Professor p) {
        deleteDir(new File(p.getDir()));
    }

    //remove todos os arquivos associados a turma passado
    public void removeTurma(Turma t) {
        deleteDir(new File(t.getDir()));
    }

    //remove todos os arquivos associados ao aluno passado
    public void removeAluno(Aluno a) {
        deleteDir(new File(a.getDir()));
    }
    
    //Método que deleta pasta e arquivos recursivamente a partir de um diretorio passado
    public boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        return dir.delete();
    }

    //Faz logout do sistema
    public void logout() {
        this.logado = null;
        this.islogado = false;
    }

    //Exporta os dados referentes ao professor logado, salvando eles no arquivo referente ao caminho passado
    public boolean exportar(String path) {
        System.out.println("Caminho: " + path);
        try {
            System.out.println();
            ObjectOutputStream out;
            out = new ObjectOutputStream(new FileOutputStream(path));
            //simplesmente salva o professor logado em um arquivo, assim todos os dados associados a ele serão salvos juntos
            out.writeObject(this.getLogado());
            out.close();
        } catch (IOException ex) {
            System.err.println(ex);
            return false;
        }
        return true;
    }

    //Importa os dados, substituindo os dados do professor logado, carrega a partir do arquivo referente ao caminho passado
    public boolean importar(String path) {
        System.out.println("Caminho: " + path);
        ArrayList<Turma> turmas;
        Professor p = this.logado;
        try {
            Professor tmp;
            ObjectInputStream in;

            in = new ObjectInputStream(new FileInputStream(path));
            tmp = (Professor) in.readObject();
            in.close();
            
            ArrayList<Aluno> alunos;

            turmas = new ArrayList();
            //Arruma os diretorios das turmas e alunos importados
            for (Turma t : tmp.getTurmas()) {
                t.setNumDir(Turma.getCont());
                Turma.setCont(Turma.getCont() + 1);
                t.setDir(p.getDir() + "/turmas/" + t.getNumDir());

                alunos = new ArrayList();
                for (Aluno a : t.buscaTodosAlunos()) {
                    a.setNumDir(Aluno.getCont());
                    Aluno.setCont(Aluno.getCont() + 1);
                    a.setDir(t.getDir() + "/alunos/" + a.getNumDir());
                    alunos.add(a);
                }

                t.setAlunos(alunos);
                if ("Sem Turma".equals(t.getId()) && "1".equals(t.getAno())) {
                    turmas.add(0, t);
                } else {
                    turmas.add(t);
                }
            }
            
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
            return false;
        }
        //apaga os dados atuais do professor logado
        removeProfessor(p);
        //coloca os dados carregados no sistema
        p.setTurmas(turmas);
        //salva esses dados
        salvarProfessor(p, true);

        return true;
    }
    /*
    public boolean salvarParaEnviar(ArrayList<Turma> turmas, String path) {
        ArrayList<Aluno> paraEnviar = new ArrayList();
        Avaliacao tmp;

        for (Turma t : turmas) {
            for (Aluno a : t.buscaTodosAlunos()) {
                tmp = a.getLastAvaliation();
                if (tmp.isSalvoParaEnviar()) {
                    tmp.setEnviado(true);
                    paraEnviar.add(a);
                }
            }
        }

        String xml = "";

        xml += "<prodown_envio>\n";
        xml += "<alunos>";
        for (Aluno a : paraEnviar) {
            xml += "<aluno ";
            xml += "nome=\"" + a.getNome() + "\" ";
            xml += "aniversario=\"" + a.getBirthday().getTime() + "\" ";
            xml += "genero=\"" + a.getGenero() + "\" ";
            xml += "endereco=\"" + a.getEndereco() + "\" ";
            xml += "cidade=\"" + a.getCidade() + "\" ";
            xml += "nome_mae=\"" + a.getNomeMae() + "\" ";
            xml += "nome_pai=\"" + a.getNomePai() + "\" ";
            xml += "telefone=\"" + a.getTelefone() + "\" ";
            xml += "celular=\"" + a.getCelular() + "\" ";
            xml += "email=\"" + a.getEmail() + "\">";

            tmp = a.getLastAvaliation();

            xml += "\n<avaliacao ";
            xml += "data=\"" + tmp.getData().getTime() + "\" ";
            xml += "horario=\"" + tmp.getHorario() + "\" ";
            xml += "temperatura=\"" + tmp.getTemperatura() + "\" ";
            xml += "massa_corporal=\"" + tmp.getMassaCorporal() + "\" ";
            xml += "estatura=\"" + tmp.getEstatura() + "\" ";
            xml += "imc=\"" + tmp.getIMC() + "\" ";
            xml += "envergadura=\"" + tmp.getEnvergadura() + "\" ";
            xml += "abdominal=\"" + tmp.getAbdominal() + "\" ";
            xml += "sentar_e_alcancar=\"" + tmp.getSentarEAlcancar() + "\" ";
            xml += "seis_minutos=\"" + tmp.get6Minutos() + "\" ";
            xml += "nove_minutos=\"" + tmp.get9Minutos() + "\" ";
            xml += "salto_horizontal=\"" + tmp.getSaltoHorizontal() + "\" ";
            xml += "arremesso_medicineball=\"" + tmp.getArremessoMedicineBall() + "\" ";
            xml += "quadrado=\"" + tmp.getTesteDoQuadrado() + "\" ";
            xml += "corrida=\"" + tmp.getCorrida20Metros() + "\" ";
            xml += "> </avaliacao>\n";

            xml += "</aluno>\n";

            a.inserirAvaliacao();
            Escola.getInstance().salvarAvaliacoes(a);
        }
        xml += "</alunos>\n";
        xml += "</prodown_envio>\n";

        try {
            File arquivo;
            arquivo = new File(path);
            FileOutputStream fos = new FileOutputStream(arquivo);
            fos.write(xml.getBytes());
            return true;

        } catch (IOException ex) {
            System.err.println(ex);
            return false;
        }
    }
    */
    
    //salva as avaliações finalizadas que estão nas turmas passada, no arquivo referente ao caminho passado
    public boolean salvarParaEnviar2(ArrayList<Turma> turmas, String path) {
        ArrayList<Aluno> paraEnviar = new ArrayList();
        Avaliacao tmp;

        //coloca os alunos que possuem ac=valiação finalizada em um Array
        for (Turma t : turmas) {
            for (Aluno a : t.buscaTodosAlunos()) {
                tmp = a.getLastAvaliation();
                if (tmp.isSalvoParaEnviar()) {
                    tmp.setEnviado(true);
                    paraEnviar.add(a);
                }
            }
        }
        
        //Cria o que irá ser salvo no XML
        String xml = "";
        xml += "<prodown_envio>\n";
        xml += "<alunos>";
        for (Aluno a : paraEnviar) {
            xml += "<aluno>\n";
            xml += "<nome>" + a.getNome() + "</nome>\n";
            xml += "<aniversario>" + a.getBirthday().getTime() + "</aniversario>\n";
            xml += "<genero>" + a.getGenero() + "</genero>\n";
            xml += "<endereco>" + a.getEndereco() + "</endereco>\n";
            xml += "<cidade>" + a.getCidade() + "</cidade>\n";
            xml += "<nome_mae>" + a.getNomeMae() + "</nome_mae>\n";
            xml += "<nome_pai>" + a.getNomePai() + "</nome_pai>\n";
            xml += "<telefone> " + a.getTelefone() + "</telefone>\n";
            xml += "<celular> " + a.getCelular() + "</celular>\n";
            xml += "<email> " + a.getEmail() + "</email>\n";

            tmp = a.getLastAvaliation();

            xml += "<avaliacao>\n";
            xml += "<data>" + tmp.getData().getTime() + "</data>\n";
            xml += "<horario>" + tmp.getHorario() + "</horario\n>";
            xml += "<temperatura>" + tmp.getTemperatura() + "</temperatura>\n";
            xml += "<massa_corporal>" + tmp.getMassaCorporal() + "</massa_corporal>\n";
            xml += "<estatura>" + tmp.getEstatura() + "</estatura>\n";
            xml += "<imc>" + tmp.getIMC() + "</imc>\n";
            xml += "<envergadura>" + tmp.getEnvergadura() + "</envergadura>\n";
            xml += "<abdominal>" + tmp.getAbdominal() + "</abdominal>\n";
            xml += "<sentar_e_alcancar>" + tmp.getSentarEAlcancar() + "</sentar_e_alcancar>\n";
            xml += "<seis_minutos>" + tmp.get6Minutos() + "</seis_minutos>\n";
            xml += "<nove_minutos>" + tmp.get9Minutos() + "</nove_minutos>\n";
            xml += "<salto_horizontal>" + tmp.getSaltoHorizontal() + "</salto_horizontal>\n";
            xml += "<arremesso_medicineball>" + tmp.getArremessoMedicineBall() + "</arremesso_medicineball>\n";
            xml += "<quadrado>" + tmp.getTesteDoQuadrado() + "</quadrado>\n";
            xml += "<corrida>" + tmp.getCorrida20Metros() + "</corrida>\n";
            xml += "</avaliacao>\n";

            xml += "</aluno>\n";
        }
        xml += "</alunos>\n";
        xml += "</prodown_envio>\n";

        //salva em arquivo
        try {
            File arquivo;
            arquivo = new File(path);
            FileOutputStream fos = new FileOutputStream(arquivo);
            fos.write(xml.getBytes());
            fos.close();
            arquivo.setReadOnly();
        } catch (IOException ex) {
            System.err.println(ex);
            return false;
        }
        
        for (Aluno a : paraEnviar){
            a.inserirAvaliacao();
            Escola.getInstance().salvarAvaliacoes(a);
        }
        return true;
        
    }
    
}
