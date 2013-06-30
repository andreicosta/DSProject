/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproject;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Israel
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
     
    
    
    /**
     *
     * @param cpf
     * @param nomecomp
     * @param nascdata
     * @param genero
     * @param endereco
     * @param cidade
     * @param estado
     * @param senha
     */
    public static void  cadastrarProfessor(String cpf, String nome, String end, String tele, 
                                          String cell, String email, String senha, String confsenha)
    {
        errors = false ;
        
        // Testa o Cpf    // retira "." "-" caso exista
        cpf = cpf.replace(".","");
        cpf = cpf.replace("-", "");
        
        if(Escola.professList != null){
            for (int i=0 ; i < Escola.professList.size() ; i++){ 
                if ( Escola.professList.get(i).getCpf().equals(cpf) ){
                    System.out.println("ja existe Professor cadastrado com o cpf");
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
            errors = true ;
        }
        if(end.isEmpty()){
            System.out.println("campo em branco");
            errors = true;
        }
        if(tele.isEmpty()){
            System.out.println("campo em branco");
            errors =true;
        }
                
        //Analisa email
        Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
        Matcher m = p.matcher(email);
        boolean matchFound = m.matches();

        if(!matchFound){
            System.out.println("erro no email");
            errors = true;
        }
        
        if(!(senha.equals(confsenha))){
            System.out.println("senhas nao combinam");
        }
        if(errors == false){
            Professor novoprof;
            try {
                novoprof = new Professor(cpf,nome,end,tele,cell,email,senha);
                professList.add(novoprof);
                System.out.println(professList.size());
            } catch (Exception e) {
            }
            
        }
        
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
    
}
