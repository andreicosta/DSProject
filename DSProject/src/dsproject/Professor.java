/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproject;

import java.util.ArrayList;
import dsproject.Turma;

/**
 *
 * @author Israel
 */

public class Professor
{
    static int cont = 0;
    private int num_dir;
    private String dir;
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;       
    private String cell;
    private String email;
    private String senha;
    private ArrayList<Turma> turmas;
          
    public Professor(Professor copia) {
        this.cpf = copia.cpf;
        this.nome = copia.nome;
        this.telefone = copia.telefone;
        this.cell = copia.cell;
        this.email = copia.email;
        this.senha = copia.senha;
    }

    Professor(String cpf, String nome, String end, String tele, String cell, String email, String senha) {
            this.cpf = cpf;
            this.nome = nome;
            this.telefone = tele;
            this.cell = cell;
            this.email = email;
            this.senha = senha;
            this.turmas = new ArrayList<>();
            this.num_dir = cont;
            this.dir = "professores/" + cont;
            cont++;
    }
    
    public ArrayList<Integer> cadastrarTurma(String nome, String ano){
        ArrayList<Integer> errorlist;
        errorlist = new ArrayList<>();
        boolean errors = false ;
        
        if(this.turmas != null){
            for (int i=0 ; i < this.turmas.size() ; i++){ 
                if ( this.turmas.get(i).getId().equals(nome) ){
                    System.out.println("ja existe Turma com esse nome");
                    errorlist.add(1);
                    errors =  true;
                }
            }
        }else{
            this.turmas = new ArrayList<Turma>();
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
        if(errors == false){
            Turma novaTurma;
            try {
                novaTurma = new Turma(nome, ano);
                turmas.add(novaTurma);
                errorlist.add(0); // nao possui erros
                System.out.println(turmas.size());
                
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return this.turmas;
    }
    
    public Turma getTurmaPorDir(int num_dir){
        
        return null;
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
    
    public static int getCont(){
        return cont;
    }
    
    public static void setCont(int n){
        cont = n;
    }   
}
