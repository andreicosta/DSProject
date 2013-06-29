/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproject;

/**
 *
 * @author vinicius
 */
public class Professor
{
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;       
    private String cell;
    private String email;
    private String senha;
          
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
  
   
}
