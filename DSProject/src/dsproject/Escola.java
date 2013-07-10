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

    public void carregar() {
        //carregarContadores();
        File f = new File("professores");
        String lista[] = f.list();
        ArrayList<Professor> professores = new ArrayList<>();

        int pro_cont = 0;

        Professor p;
        for (int i = 0; lista != null && i < lista.length; i++) {
            System.out.println("Professor em: " + lista[i]);
            p = carregarProfessor("professores/" + lista[i]);

            if (p.getNumDir() > pro_cont) {
                pro_cont = p.getNumDir();
            }

            professores.add(p);
        }

        this.setProfessList(professores);

        if (Professor.getCont() < pro_cont) {
            Professor.setCont(pro_cont);
        }

        System.out.println("Contadores: " + Professor.getCont() + " " + Turma.getCont() + " " + Aluno.getCont());
    }

    /*
     public void carregarContadores() throws ClassNotFoundException {
     try {
     FileInputStream file = new FileInputStream(new File("info.dat"));
     ObjectInputStream in = new ObjectInputStream(file);

     ArrayList<Integer> contadores = (ArrayList<Integer>) in.readObject();

     Professor.setCont(contadores.get(0));
     Turma.setCont(contadores.get(1));
     Aluno.setCont(contadores.get(2));
     System.out.println("Contadores: " + contadores.get(0) + " " + contadores.get(1) + " " + contadores.get(2));
     } catch (IOException ex) {
     System.err.println(ex);
     }

     }*/
    public Professor carregarProfessor(String diretorio) {
        try {
            Professor p;

            FileInputStream file = new FileInputStream(new File(diretorio + "/info.dat"));
            ObjectInputStream in = new ObjectInputStream(file);

            p = (Professor) in.readObject();
            in.close();

            File f = new File(diretorio + "/turmas");
            if (f.exists()) {
                String lista[] = f.list();

                //System.out.println(p.getTurmas().get(0).getId());

                ArrayList<Turma> turmas = new ArrayList<>();
                Turma t;

                int tur_cont = 0;

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

                p.setTurmas(turmas);

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

    public Turma carregarTurma(String diretorio) {
        //salva obj
        try {
            Turma t;

            FileInputStream file = new FileInputStream(new File(diretorio + "/info.dat"));
            ObjectInputStream in = new ObjectInputStream(file);

            t = (Turma) in.readObject();
            in.close();

            File f = new File(diretorio + "/alunos");
            String lista[] = f.list();

            ArrayList<Aluno> alunos = new ArrayList<>();
            Aluno tmp;

            int alu_cont = 0;

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

            t.setAlunos(alunos);

            if (Aluno.getCont() < alu_cont) {
                Aluno.setCont(alu_cont);
            }

            return t;
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
            return null;
        }

    }

    public Aluno carregarAluno(String diretorio) {
        try {
            Aluno a;
            //salva aluno
            //salva arrayList de avaliaÃ§Ãµes do aluno

            FileInputStream file;
            ObjectInputStream in;

            file = new FileInputStream(new File(diretorio + "/info.dat"));
            in = new ObjectInputStream(file);

            a = (Aluno) in.readObject();
            in.close();

            carregarAvaliacoes(a);

            return a;
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
            return null;
        }
    }

    public void carregarAvaliacoes(Aluno a) {
        try {
            FileInputStream file;
            ObjectInputStream in;
            file = new FileInputStream(new File(a.getDir() + "/avaliacoes.dat"));
            in = new ObjectInputStream(file);

            ArrayList<Avaliacao> avaliacoes = (ArrayList<Avaliacao>) in.readObject();
            in.close();

            a.setAvaliacoes(avaliacoes);
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
        }
    }

    public void removeProfessor(Professor p) {
        deleteDir(new File(p.getDir()));
    }

    public void removeTurma(Turma t) {
        deleteDir(new File(t.getDir()));
    }

    public void removeAluno(Aluno a) {
        deleteDir(new File(a.getDir()));
    }

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
        // Agora o diretório está vazio, restando apenas deletá-lo.  
        return dir.delete();
    }

    public void logout() {
        this.logado = null;
        this.islogado = false;
    }

    public boolean exportar(String path) {
        System.out.println("Caminho: " + path);
        try {
            System.out.println();
            ObjectOutputStream out;
            out = new ObjectOutputStream(new FileOutputStream(path));
            out.writeObject(this.getLogado());
            out.close();
            return true;
        } catch (IOException ex) {
            System.err.println(ex);
            return false;
        }
    }

    public boolean importar(String path) {
        System.out.println("Caminho: " + path);
        try {
            Professor p, tmp;
            ObjectInputStream in;

            in = new ObjectInputStream(new FileInputStream(path));
            tmp = (Professor) in.readObject();
            in.close();

            p = this.getLogado();
            removeProfessor(p);

            ArrayList<Turma> turmas;
            ArrayList<Aluno> alunos;

            turmas = new ArrayList();
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

            p.setTurmas(turmas);
            salvarProfessor(p, true);

            return true;
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
            return false;
        }
    }

    public void salvarParaEnviar(ArrayList<Turma> turmas, String path) {
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

        //int num = 1;

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

        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
