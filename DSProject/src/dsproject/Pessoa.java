/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproject;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author vinicius
 */
public abstract class Pessoa implements Serializable
{
   private String dir;
   private String nome;
   private java.util.Date dataDenascimento;
   private String genero;
   private String endereco;
   private String cidade;
   private String estado;

   public Pessoa(String nome, java.util.Date dataDeNascimento, String genero, String endereco, String cidade, 
                 String estado)
   {
      this.nome = nome;
      this.dataDenascimento = dataDeNascimento;
      this.genero = genero;
      this.endereco = endereco;
      this.cidade = cidade;
      this.estado = estado;
   }

   public String getNome()
   {
      return nome;
   }
   
   public java.util.Date getDataDeNascimento()
   {
      return dataDenascimento;
   }

   public String getEndereco()
   {
      return endereco;
   }

   public String getGenero()
   {
      return genero;
   }

   public String getCidade()
   {
      return cidade;
   }

   public String getEstado()
   {
      return estado;
   }

    public void setDataDenascimento(Date dataDenascimento) {
        this.dataDenascimento = dataDenascimento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
