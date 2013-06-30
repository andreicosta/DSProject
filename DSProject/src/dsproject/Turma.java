/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproject;

import java.io.Serializable;
import java.util.ArrayList;


public class Turma implements Serializable, Cloneable
{
   static int cont = 0;
   private String dir;
   private String id;
   private int ano;
   private Professor professor;
   private ArrayList<Aluno> alunos;

   public Turma(String id, int ano, Professor professor)
   {
      this.id = id;
      this.ano = ano;
      this.professor = professor;
      this.alunos = new ArrayList<>();
      this.dir = "Turmas/" + cont;
      cont++;
   }

   public String getId()
   {
      return id;
   }

   public int getAno()
   {
      return ano;
   }

   public Professor getProfessor()
   {
      return professor;
   }

   public void setId(String id)
   {
      this.id = id;
   }

   public void setAno(int ano)
   {
      this.ano = ano;
   }

   public void setProfessor(Professor professor)
   {
      this.professor = professor;
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

   public void excluirTurma()
   {
       
   }
   
   public String getDir(){
       return this.dir;
   }
}
