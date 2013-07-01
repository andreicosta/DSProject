/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproject;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Israel, vinicius
 */
public  class Escola {
    private static String nome;
    private static ArrayList<Professor> professList;
    private static Professor logado;
    private static boolean islogado ;
    private static boolean errors;

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
     
    

    public static ArrayList<Integer> cadastrarProfessor(String cpf, String nome, String end, String tele, 
                                          String cell, String email, String senha, String confsenha)
    {
        ArrayList<Integer> errorlist;
        errorlist = new ArrayList<>();
        errors = false ;
        
        // Testa o Cpf    // retira "." "-" caso exista
        cpf = cpf.replace(".","");
        cpf = cpf.replace("-", "");
        
        if(Escola.professList != null){
            for (int i=0 ; i < Escola.professList.size() ; i++){ 
                if ( Escola.professList.get(i).getCpf().equals(cpf) ){
                    System.out.println("ja existe Professor cadastrado com o cpf");
                    errorlist.add(1);
                    errors =  true;
                }
            }
        }else{
            Escola.professList = new ArrayList<Professor>();
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
    
    public static void  login(String cpf , String senha ){
        System.out.println("cpf - "+ cpf + "\n" + "senha" + senha);
        for (int i =0 ; i< Escola.professList.size() ;i++){
            if(Escola.professList.get(i).getCpf().equals(cpf)){
                //achou o modafuka professor //checa a senha
                if(Escola.professList.get(i).getSenha().equals(senha) ){
                    // delicinha 
                    if(!islogado){
                        // nao tem ninguem logado
                        logado = new Professor(Escola.professList.get(i));
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
    
    private static void salvar(){
        Professor p;
        for (int i =0 ; i< Escola.professList.size() ;i++){
            p = professList.get(i);
            Escola.salvarProfessor(p);
        }
    }
    
    private static void salvarProfessor(Professor p){
        //salva o obj professor
        
        ArrayList<Turma> turmas = p.getTurmas();
        Turma t;
        
        for (int i = 0; i < turmas.size(); i++){
            t = turmas.get(i);
            Escola.salvarTurma(t, p.getDir());
        }
    }
    
    private static void salvarTurma(Turma t, String dir){
        //salva obj
        ArrayList<Aluno> alunos = t.buscaTodosAlunos();
        Aluno a;
        
        for (int i = 0; i < alunos.size(); i++){
            a = alunos.get(i);
            Escola.salvarAluno(a, t.getDir());
        }
    }
    
    private static void salvarAluno(Aluno a, String dir){
        //salva aluno
        //salva arrayList de avaliações do aluno
    }
}
