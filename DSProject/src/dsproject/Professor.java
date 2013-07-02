/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproject;

import java.io.File;
import java.util.ArrayList;

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
    
    public void removeTurma(Turma turma)
    {
        int idTurma;
        idTurma = buscaTurma(turma);

        this.turmas.remove(idTurma);
        
        File f = new File(turmas.get(idTurma).getDir());
        f.delete();
    }
     
    public int buscaTurma(Turma turma)
    {
        for (int i = 0; i < turmas.size(); i++)
        {
           if ((turmas.get(i).getId().equals(turma.getId())) && (turmas.get(i).getAno() == turma.getAno()))
              return i;
        }
        return -1;
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
