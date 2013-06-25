/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproject;

import java.io.Serializable;

/**
 *
 * @author vinicius
 */
public abstract class Pessoa implements Serializable
{
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
}
