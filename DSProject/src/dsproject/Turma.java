/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproject;

import java.util.ArrayList;


public class Turma implements Cloneable
{
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
      //cadastrarTurma();
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
      int idaluno;
      idaluno = buscaAluno(aluno);

      this.alunos.remove(idaluno);
   }

   public int buscaAluno(Aluno aluno)
   {
      for (int i = 0; i < alunos.size(); i++)
      {
         if (alunos.get(i).getName().equals(aluno.getName()))
            return i;
      }
      return -1;
   }

   /*public void buscaTodosAlunos()
   {
      java.util.Arrays.sort(alunos);
      for (int i = 0; alunos.lenght; i++)
            System.out.printf("%s", alunos[i].getNome());
   }

   public void cadastrarTurma()
   {
      while(/*quer inserir aluno && (alunos.lenght != 0)*//*)
      {
         Aluno tmpAluno();
         //cria aluno
         inserirAluno(tmpAluno);
      }

   }

   public void editarTurma()
   {
      Aluno tmpAluno;
      while(/*quer editar turma*//*)
      {
         if(/*quer inserir ou remover aluno*//*)
         {
            //cria aluno
            inserirAluno(tmpAluno);
         }
         else
         {
            //pega o aluno para exluir
            removeAluno(tmpAluno);
         }
      }
   }

   public void excluirTurma(){
      free(this)
   }


   @Override
   public Turma clone() throws CloneNotSupportedException
   {
      Turma clone = (Turma) super.clone();
      clone.Alunos = new ArrayList<>(Alunos);
      return clone;
   }*/

}
