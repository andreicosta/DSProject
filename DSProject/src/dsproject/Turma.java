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
   private int num_dir;
   private String dir;
   private String id;
   private String ano;
   private ArrayList<Aluno> alunos;

   public Turma(String id, String ano)
   {
      this.id = id;
      this.ano = ano;
      this.alunos = new ArrayList<>();
      this.num_dir = cont;
      this.dir = "turmas/" + cont;
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
       aluno.setDir(this.dir + "/alunos/" + aluno.getNumDir());
       this.alunos.add(aluno);
   }
   
   public void setAlunos(ArrayList<Aluno> alunos){
       this.alunos = alunos;
   }
   
   public void removeAluno(Aluno aluno)
   {
      int idAluno;
      idAluno = buscaAluno(aluno);

      File f = new File(alunos.get(idAluno).getDir());
      f.delete();     
      
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
   
   public String getDir(){
       return this.dir;
   }
   
   public void setDir(String dir){
       this.dir = dir;
   }
   
   public int getNumDir(){
       return this.num_dir;
   }
   
   public static int getCont(){
       return cont;
   }
   
   public static void setCont(int n){
        cont = n;
    }

    @Override
    public String toString() {
        if(id.isEmpty()){
            return "";
        }
        return id + ", " + ano;
    }
}
