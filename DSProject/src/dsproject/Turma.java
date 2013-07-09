package dsproject;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
   
   public void inserirAluno(Aluno aluno) throws IOException
   {
       aluno.setDir(this.dir + "/alunos/" + aluno.getNumDir());

       Escola.getInstance().salvarAluno(aluno, true);

       this.alunos.add(aluno);
       aluno.setTurma(this);
   }
   
   public void setAlunos(ArrayList<Aluno> alunos){
       this.alunos = alunos;
   }
   
   public void removeAluno(Aluno aluno) throws IOException
   {
      int idAluno;
      idAluno = buscaAluno(aluno);      
      this.alunos.remove(idAluno);
      Escola.getInstance().removeAluno(aluno);
   }

   public int buscaAluno(Aluno aluno)
   {
      for (int i = 0; i < alunos.size(); i++)
      {
         if (alunos.get(i).equals(aluno))
            return i;
      }
      return -1;
   }

   public void excluirTurma(){
      Turma semTurma = Escola.getInstance().getLogado().getTurmas().get(0);
      for (Aluno i: alunos){
          try {
               //this.removeAluno(i);
              semTurma.inserirAluno(i);
          } catch (Exception e) {
              Logger.getLogger(Turma.class.getName()).log(Level.SEVERE, null, e);
          }
      }
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
        if(id.equals("Sem Turma")){
            return id;
        }
        return id + ", " + ano;
    }
}
