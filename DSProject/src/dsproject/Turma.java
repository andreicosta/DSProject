/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproject;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;


public class Turma implements Serializable, Cloneable
{
   static int cont = 0;
   private String dir;
   private String id;
   private String ano;
   private ArrayList<Aluno> alunos;

   public Turma(String id, String ano)
   {
      this.id = id;
      this.ano = ano;
      this.alunos = new ArrayList<>();
      this.dir = "Turmas/" + cont;
      cont++;
   }
   
   public String getId()
   {
      return id;
   }

   public String getAno()
   {
      return ano;
   }

   public void setId(String id)
   {
      this.id = id;
   }

   public void setAno(String ano)
   {
      this.ano = ano;
   }
   
   public void inserirAluno(Aluno aluno)
   {
      this.alunos.add(aluno);
   }
   
   public void removeAluno(Aluno aluno)
   {
      int idAluno;
      idAluno = buscaAluno(aluno);

      this.alunos.remove(idAluno);
      
      File f = new File(alunos.get(idAluno).getDir());
      f.delete();     
   }

   public int buscaAluno(Aluno aluno)
   {
      for (int i = 0; i < alunos.size(); i++)
      {
         if (alunos.get(i).getNome().equals(aluno.getNome()))
            return i;
      }
      return -1;
   }

   public ArrayList<Aluno> buscaTodosAlunos()
   {
      return alunos;
   }
   
   public String getDir(){
       return this.dir;
   }
}
