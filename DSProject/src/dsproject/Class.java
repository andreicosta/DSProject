/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproject;

import java.util.ArrayList;


public class Class implements Cloneable
{
   private String id;
   private int ano;
   private Professor professor;
   private ArrayList<Student> alunos;

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

   public void setId(String _id)
   {
      id = _id;
   }

   public void setAno(int _ano)
   {
      ano = _ano;
   }

   public void setProfessor(Professor _professor)
   {
      professor = _professor;
   }

   public Class(String _id, int _ano, Professor _professor)
   {
      id = _id;
      ano = _ano;
      professor = _professor;
      alunos = new ArrayList<>();

      cadastrarTurma();
   }
   
   public void inserirAluno(Student aluno)
   {
      alunos.add(aluno);
   }
   
   public void removeAluno(Student aluno)
   {
      int idaluno;
      idaluno = buscaAluno(aluno);

      alunos.remove(idaluno);
   }

   public int buscaAluno(Student aluno)
   {
      for (int i = 0; alunos.lenght; i++)
      {
         if (alunos[i] == aluno)
            return i;
      }
   }

   public void buscaTodosAlunos()
   {
      java.util.Arrays.sort(alunos);
      for (int i = 0; alunos.lenght; i++)
            System.out.printf("%s", alunos[i].getNome());
   }

   public void cadastrarTurma()
   {
      while(/*quer inserir aluno && (alunos.lenght != 0)*/)
      {
         Student tmpAluno();
         //cria aluno
         inserirAluno(tmpAluno);
      }

   }

   public void editarTurma()
   {
      Student tmpAluno;
      while(/*quer editar turma*/)
      {
         if(/*quer inserir ou remover aluno*/)
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
   public Class clone() throws CloneNotSupportedException
   {
      Class clone = (Class) super.clone();
      clone.Alunos = new ArrayList<>(Alunos);
      return clone;
   }

}
