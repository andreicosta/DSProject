package dsproject;

import java.io.File;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Professor implements Serializable
{
    static int cont = 0;
    private int num_dir;
    private String dir;
    private String cpf;
    private String nome;
    private String senha;
    private ArrayList<Turma> turmas;
    
    Professor(String cpf, String nome, String senha) {
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
        this.turmas = new ArrayList<>();
        cont++;
        this.num_dir = cont;
        this.dir = "professores/" + cont;
        this.cadastrarTurma("Sem Turma", "1");
    }

    public ArrayList<Integer> cadastrarTurma(String nome, String ano){
        ArrayList<Integer> errorlist;
        errorlist = new ArrayList<>();
        boolean errors = false ;
        
        for (int i=0 ; i < this.turmas.size() ; i++){ 
            if ( this.turmas.get(i).getId().equals(nome) ){
                System.out.println("ja existe Turma com esse nome");
                errorlist.add(1);
                errors =  true;
            }
        }
        
        if(nome.isEmpty()){
            System.out.println("campo em branco");
            errorlist.add(2);
            errors = true ;
        }
        if(ano.isEmpty()){
            System.out.println("campo em branco");
            errorlist.add(3);
            errors =true;
        }
        if (errors == false) {
            Turma novaTurma = new Turma(nome, ano);
            turmas.add(novaTurma);
            errorlist.add(0); // nao possui erros
            System.out.println(turmas.size());

            novaTurma.setDir(this.dir + "/turmas/" + novaTurma.getNumDir());
            
            try {
                Escola.getInstance().salvarTurma(novaTurma);
            } catch (Exception e) {
                // tens que tratar este erro
            }
            
        }
    // erros no cadastro
    return(errorlist);
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String Senha) {
        this.senha = Senha;
    }
    
    public void addTurma(Turma turma){
        turma.setDir(this.dir + "/turmas/" + turma.getNumDir());
        this.turmas.add(turma);
    }
    
    public ArrayList<Turma> getTurmas(){
        ArrayList<Turma> temp = this.turmas;
        Collections.sort(temp, new Comparator() {
                @Override
                public int compare( Object obj1, Object obj2 ) {
                    return ((((Turma)obj1).getId()).compareTo(((Turma)obj2).getId()));
                }  
        });
        
        return temp;
    }
    
    public ArrayList<Aluno> getAlunos(){
        ArrayList<Aluno> temp = new ArrayList<>();
        for(Turma i: this.turmas){
            temp.addAll(i.buscaTodosAlunos());
        }
        
        Collections.sort(temp, new Comparator() {
                @Override
                public int compare( Object obj1, Object obj2 ) {
                    return ((((Aluno)obj1).getNome()).compareTo(((Aluno)obj2).getNome()));
                }  
        });
        
        return temp;
    }
    
    public boolean haveYouAStudentWithThisName(String name){
        
        for(Aluno i : this.getAlunos()){
            if (i.getNome().equals(name)){
                return true; 
           }
        }
        
        return false;
    }
    
    public void removeTurma(Turma turma){
        int idTurma;
        idTurma = buscaTurma(turma);

        this.turmas.remove(idTurma);
        turma.excluirTurma();
        
        Escola.getInstance().removeTurma(turma);
    }
     
    public int buscaTurma(Turma turma){
        for (int i = 0; i < turmas.size(); i++)
        {
           if ((turmas.get(i).getId().equals(turma.getId())) && (turmas.get(i).getAno() == turma.getAno()))
              return i;
        }
        return -1;
    }
    
    public void setTurmas(ArrayList<Turma> turmas){
        this.turmas = turmas;
    }
    
    public void setDir(String dir){
       this.dir = dir;
   }
    
    public String getDir(){
        return this.dir;
    }
    
    public int getNumDir(){
        return num_dir;
    }
    
    public static int getCont(){
        return cont;
    }
    
    public static void setCont(int n){
        cont = n;
    }   
    
    public Turma getTurmaDefault(){
        Turma semTurma = null;
        for(Turma turma:this.turmas){
            if(turma.getId().equals("Sem Turma")){
                semTurma = turma;
                break;
            }
        }
        return semTurma;
    }
    
}
