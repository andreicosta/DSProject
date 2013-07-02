/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Israel, vinicius
 */
public  class Escola {
    private static Escola instance = new Escola();
    private String nome;
    private ArrayList<Professor> professList;
    private Professor logado;
    private boolean islogado ;
    private boolean errors;

    public static synchronized Escola getInstance(){
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

    public ArrayList<Integer> cadastrarProfessor(String cpf, String nome, String end, String tele, 
                                          String cell, String email, String senha, String confsenha)
    {
        ArrayList<Integer> errorlist;
        errorlist = new ArrayList<>();
        errors = false ;
        
        // Testa o Cpf    // retira "." "-" caso exista
        cpf = cpf.replace(".","");
        cpf = cpf.replace("-", "");
        
        if(this.professList != null){
            for (int i=0 ; i < this.professList.size() ; i++){ 
                if ( this.professList.get(i).getCpf().equals(cpf) ){
                    System.out.println("ja existe Professor cadastrado com o cpf");
                    errorlist.add(1);
                    errors =  true;
                }
            }
        }else{
            this.professList = new ArrayList<Professor>();
        }
        
        // caso nao exista cpf cadastrado , verifica o formato dos parametros 
        //verifica se nome contem sobrenome junto
        if(!nome.contains(" ")){
            System.out.println("Nome nao contem sobrenome");
            errorlist.add(2);
            errors = true ;
        }
        if(end.isEmpty()){
            System.out.println("campo em branco");
            errorlist.add(3);
            errors = true;
        }
        if(tele.isEmpty()){
            System.out.println("campo em branco");
            errorlist.add(4);
            errors =true;
        }
        if(cell.isEmpty()){
            System.out.println("campo em branco");
            errorlist.add(5);
            errors =true;
        }
                
        //Analisa email
        Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
        Matcher m = p.matcher(email);
        boolean matchFound = m.matches();

        if(!matchFound){
            System.out.println("erro no email");
            errorlist.add(6);
            errors = true;
        }
        
        if(!(senha.equals(confsenha))){
            System.out.println("senhas nao combinam");
            errorlist.add(7);
            errors=true;
        }
        if(errors == false){
            Professor novoprof;
            try {
                novoprof = new Professor(cpf,nome,end,tele,cell,email,senha);
                professList.add(novoprof);
                errorlist.add(0); // nao possui erros
                System.out.println(professList.size());
                return (errorlist);
                
            } catch (Exception e) {
                // tens que tratar este erro
                
            }
            
        }
    // erros no cadastro
    return(errorlist);
    }
    
    public void  login(String cpf , String senha ){
        System.out.println("cpf - "+ cpf + "\n" + "senha" + senha);
        for (int i =0 ; i< this.professList.size() ;i++){
            if(this.professList.get(i).getCpf().equals(cpf)){
                //achou o modafuka professor //checa a senha
                if(this.professList.get(i).getSenha().equals(senha) ){
                    // delicinha 
                    if(!islogado){
                        // nao tem ninguem logado
                        logado = new Professor(this.professList.get(i));
                        System.out.println(" achou o professor e logou");
                        islogado = true;
                        return;
                    }else{
                        System.out.println("Ja existe Professor logado no sistema");
                        return;
                    }
                }else{
                    // senha errada seu viadinho
                    System.out.println("senha errada - " + senha);
                    return;
                }
            }
        }
        //professor no existe
                System.out.println("Nao existe cadastro com cpf =" + cpf );
    
    }
    
    public Professor getProfessorLogado(){
        return this.logado;
    }
    
    public void salvar() throws IOException{
        ArrayList <Integer> contadores = new ArrayList<>();
        
        contadores.add(Professor.getCont());
        contadores.add(Turma.getCont());
        contadores.add(Aluno.getCont());
        
        ObjectOutputStream out;
        out = new ObjectOutputStream(new FileOutputStream("info.dat"));
        out.writeObject(contadores);
        out.close();
        
        Professor p;
        for (int i =0 ; i< professList.size() ;i++){
            p = professList.get(i);
            salvarProfessor(p, true);
        }
    }
    
    public void salvarProfessor(Professor p) throws IOException{
        salvarProfessor(p, false);
    }
    
    public void salvarProfessor(Professor p, boolean all) throws IOException{
        
        ArrayList<Turma> turmas = p.getTurmas();
        p.setTurmas(new ArrayList<Turma>());
        Turma t;
        File f;
        String diretorio = p.getDir();
        
        f = new File(diretorio);
        if (!f.exists()){
            f.mkdirs();
        }
        
        //salva o obj professor
        ObjectOutputStream out;
        out = new ObjectOutputStream(new FileOutputStream(diretorio+"/info.dat"));
        out.writeObject(p);
        out.close();            
        if (all){
            for (int i = 0; i < turmas.size(); i++){
                t = turmas.get(i);
                this.salvarTurma(t, true);
            }
        }
        p.setTurmas(turmas);
    }
    
    public void salvarTurma(Turma t) throws IOException{
        salvarTurma(t, false);
    }
    
    public void salvarTurma(Turma t, boolean all) throws IOException{
        //salva obj
        ArrayList<Aluno> alunos = t.buscaTodosAlunos();
        t.setAlunos(new ArrayList<Aluno>());
        
        Aluno a;
        
        File f;
        
        f = new File(t.getDir());
        if (!f.exists()){
            f.mkdirs();
        }
        
        
        //salva o obj turma
        ObjectOutputStream out;
        out = new ObjectOutputStream(new FileOutputStream(t.getDir()+"/info.dat"));
        out.writeObject(t);
        out.close();            
        
        if (all){
            for (int i = 0; i < alunos.size(); i++){
                a = alunos.get(i);
                this.salvarAluno(a, true);
            }
        }
        
        t.setAlunos(alunos);
    }
    
    public void salvarAluno(Aluno a) throws IOException{
        salvarAluno(a, false);
    }
    
    public void salvarAluno(Aluno a, boolean all) throws IOException{
        //salva aluno
        //salva arrayList de avaliaÃ§Ãµes do aluno
        
        File f;        
        f = new File(a.getDir());
        if (!f.exists()){
            f.mkdirs();
        }
        
        //salva o obj turma
        ObjectOutputStream out;
        out = new ObjectOutputStream(new FileOutputStream(a.getDir()+"/info.dat"));
        out.writeObject(a);
        out.close();
        
        out = new ObjectOutputStream(new FileOutputStream(a.getDir()+"/avaliacoes.dat"));
        out.writeObject(a.getAvaliacoes());
        out.close();
    }
    
    
    public void carregar() throws IOException, ClassNotFoundException{
        FileInputStream file = new FileInputStream(new File("info.dat"));
        ObjectInputStream in = new ObjectInputStream(file);
        
        ArrayList <Integer> contadores = (ArrayList<Integer>)in.readObject();
        
        Professor.setCont(contadores.get(0));
        Turma.setCont(contadores.get(1));
        Aluno.setCont(contadores.get(2));
        System.out.println("Contadores: "+ contadores.get(0) + " " + contadores.get(1) + " " + contadores.get(2));
        
        File f = new File("professores");
        String lista[] = f.list();
        ArrayList <Professor> professores = new ArrayList<>();        
        
        Professor p;
        for (int i =0 ; i< lista.length ;i++){
            System.out.println("Professor em: " + lista[i]);
            p = carregarProfessor("professores/" + lista[i]);
            professores.add(p);
        }
        
        //Escola.setProfessList(professores);
    }
    
    public Professor carregarProfessor(String diretorio) throws IOException, ClassNotFoundException{
        Professor p;

        FileInputStream file = new FileInputStream(new File(diretorio+"/info.dat"));
        ObjectInputStream in = new ObjectInputStream(file);
        
        p = (Professor)in.readObject();
        in.close();
        
        File f =  new File(diretorio+"/turmas");
        String lista[] = f.list();
        
        System.out.println(p.getTurmas().get(0).getId());
        
        ArrayList<Turma> turmas = new ArrayList<>();
        
        for (int i = 0; i < lista.length; i++){
            if (!lista[i].equalsIgnoreCase("info.dat")){
                System.out.println("Turma em: " + lista[i]);
                turmas.add(carregarTurma(diretorio+"/turmas/"+lista[i]));
            }
        }
        
        p.setTurmas(turmas);
        
        return p;
    }
    
    public Turma carregarTurma(String diretorio) throws IOException, ClassNotFoundException{
        //salva obj
        Turma t;
        
        FileInputStream file = new FileInputStream(new File(diretorio+"/info.dat"));
        ObjectInputStream in = new ObjectInputStream(file);
        
        t = (Turma)in.readObject();
        in.close();
        
        File f = new File(diretorio+"/alunos");
        String lista[] = f.list();
        
        ArrayList<Aluno> alunos = new ArrayList<>();
        
        for (int i = 0; i < lista.length; i++){
            if (!lista[i].equalsIgnoreCase("info.dat")){
                System.out.println("Aluno em: " + lista[i]);
                alunos.add(carregarAluno(diretorio+"/alunos/" + lista[i]));
            }
        }
        
        t.setAlunos(alunos);
        
        return t;
    }
    
    public Aluno carregarAluno(String diretorio) throws IOException, ClassNotFoundException{
        Aluno a;
        //salva aluno
        //salva arrayList de avaliaÃ§Ãµes do aluno
        
        FileInputStream file;
        ObjectInputStream in;
        
        file = new FileInputStream(new File(diretorio+"/info.dat"));
        in = new ObjectInputStream(file);
        
        a = (Aluno)in.readObject();
        in.close();
        
        file = new FileInputStream(new File(diretorio+"/avaliacoes.dat"));
        in = new ObjectInputStream(file);
        
        System.out.println("size: " + a.getAvaliacoes().size());
        
        ArrayList<Avaliacao> avaliacoes = (ArrayList<Avaliacao>)in.readObject();
        in.close();
        
        a.setAvaliacoes(avaliacoes);
        
        return a;
    }
    
}
