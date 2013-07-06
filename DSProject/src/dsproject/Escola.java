/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproject;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Escola
{

   private static Escola instance = new Escola();
   private String nome;
   private ArrayList<Professor> professList;
   private Professor logado;
   private boolean islogado;
   private CriptografiaLogix cripto;

   public Professor getLogado()
   {
      return logado;
   }

   public boolean isIslogado()
   {
      return islogado;
   }

   public boolean isErrors()
   {
      return errors;
   }
   private boolean errors;

   public static synchronized Escola getInstance()
   {
      return instance;
   }

   public String getNome()
   {
      return nome;
   }

   public void setNome(String nome)
   {
      this.nome = nome;
   }

   public ArrayList<Professor> getProfessList()
   {
      return professList;
   }

   public void setProfessList(ArrayList<Professor> professList)
   {
      this.professList = professList;
   }

   public boolean validarCpf(String strCpf)
   {
      int d1, d2;
      int digito1, digito2, resto;
      int digitoCPF;
      String nDigResult;

      d1 = d2 = 0;
      digito1 = digito2 = resto = 0;

      for (int nCount = 1; nCount < strCpf.length() - 1; nCount++)
      {
         digitoCPF = Integer.valueOf(strCpf.substring(nCount - 1, nCount)).intValue();

         //multiplique a ultima casa por 2 a seguinte por 3 a seguinte por 4 e assim por diante.
         d1 = d1 + (11 - nCount) * digitoCPF;

         //para o segundo digito repita o procedimento incluindo o primeiro digito calculado no passo anterior.
         d2 = d2 + (12 - nCount) * digitoCPF;
      };

      //Primeiro resto da divisão por 11.
      resto = (d1 % 11);

      //Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.
      if (resto < 2)
      {
         digito1 = 0;
      }
      else
      {
         digito1 = 11 - resto;
      }

      d2 += 2 * digito1;

      //Segundo resto da divisão por 11.
      resto = (d2 % 11);

      //Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.
      if (resto < 2)
      {
         digito2 = 0;
      }
      else
      {
         digito2 = 11 - resto;
      }

      //Digito verificador do validarCpf que está sendo validado.
      String nDigVerific = strCpf.substring(strCpf.length() - 2, strCpf.length());

      //Concatenando o primeiro resto com o segundo.
      nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

      //comparar o digito verificador do cpf com o primeiro resto + o segundo resto.
      return nDigVerific.equals(nDigResult);
   }

   public ArrayList<Integer> cadastrarProfessor(String cpf, String nome, String senha, String confsenha)
   {
      ArrayList<Integer> errorlist;
      errorlist = new ArrayList<>();
      errors = false;

      // Testa o Cpf    // retira "." "-" caso exista
      cpf = cpf.replace(".", "");
      cpf = cpf.replace("-", "");
      System.out.println("cpf em cadastrar professor = " + cpf);
// -------------------- Testa Campo Cpf  --------------------------------
      if (cpf.length() == 11)
      {
         if (cpf.matches("[0-9]{11}"))
         {
            if (!validarCpf(cpf))
            {
               //JOptionPane.showMessageDialog(null, "Digite um cpf válido", "Erro", JOptionPane.ERROR_MESSAGE);
               errorlist.add(1);
               errors = true;
            }
            else
            {
               if (this.professList != null)
               {
                  for (int i = 0; i < this.professList.size(); i++)
                  {
                     if (this.professList.get(i).getCpf().equals(cpf))
                     {
                        //JOptionPane.showMessageDialog(null, "Já existe professor cadastrado com o cpf", "Aviso", JOptionPane.WARNING_MESSAGE);
                        errorlist.add(9);
                        errors = true;
                     }
                     else
                     {
                        Interface.NewTeacherPanel.getLabelCpf().setForeground(Color.black);
                     }
                  }
               }
               else
               {
                  Interface.NewTeacherPanel.getLabelCpf().setForeground(Color.black);
                  this.professList = new ArrayList<Professor>();
               }
            }
         }
         else
         {
            //JOptionPane.showMessageDialog(null, "Digite um cpf válido", "Erro", JOptionPane.ERROR_MESSAGE);
            errorlist.add(1);
            errors = true;
         }
      }
      else
      {
         if (cpf.isEmpty())
         {
            errorlist.add(1);
            errors = true;
         }
         /*else
          {
          JOptionPane.showMessageDialog(null, "Digite um cpf com 11 dígitos", "Erro", JOptionPane.ERROR_MESSAGE);
          errorlist.add(1);
          errors = true;
          }*/
      }
      /* ------------------------- Teste Campo Nome ------------------------
       */
      if (nome.isEmpty())
      {
         //JOptionPane.showMessageDialog(null, "Digite um sobrenome", "Erro", JOptionPane.ERROR_MESSAGE);
         errorlist.add(2);
         errors = true;
      }
      else
      {
         //if(!nome.isEmpty())
         //{
         nome = nome.toLowerCase();
         if (nome.charAt(nome.length() - 1) == ' ')
         {
            System.out.println(nome.length());
            nome = nome.substring(0, nome.length() - 1);
         }
         System.out.println(nome.length());
         System.out.println(nome);

         Pattern p = Pattern.compile("([a-z]+\\s)+[a-z]*");
         Matcher m = p.matcher(nome);
         boolean matchFound = m.matches();

         if (!matchFound)
         {
            System.err.println("erro no nome");
            errorlist.add(2);
            errors = true;
         }
         else
         {
            Interface.NewTeacherPanel.getLabelNomeCompleto().setForeground(Color.black);
         }
         //}
         //}

         /*if (!nome.contains(" "))
          {
          //System.out.println("Nome nao contem sobrenome");
          JOptionPane.showMessageDialog(null, "Digite um sobrenome", "Erro", JOptionPane.ERROR_MESSAGE);
          errorlist.add(2);
          errors = true;
          }else
          {
          Interface.NewTeacherPanel.getLabelNomeCompleto().setForeground(Color.black);
          }*/
      }

      if (senha.isEmpty())
      {
         errorlist.add(7);
         errors = true;
      }
      else
      {
         if(senha.length() < 4)
         {
            errorlist.add(10);
            errors = true;
         }
         else
         {
            if(confsenha.isEmpty())
            {
               errorlist.add(11);
               errors = true;
            }
            else
            {
               if (!(senha.equals(confsenha)))
               {

                  //JOptionPane.showMessageDialog(null, "Senhas diferentes", "Erro", JOptionPane.ERROR_MESSAGE);
                  errorlist.add(8);
                  errors = true;
               }
               else
               {
                  Interface.NewTeacherPanel.getLabelSenha().setForeground(Color.black);
                  Interface.NewTeacherPanel.getLabelConfirmarSenha().setForeground(Color.black);
               }
            }
         }

         if (errors == false)
         {
            Professor novoprof;

            // criptografa senha
            this.cripto = new CriptografiaLogix(cpf, senha);
            novoprof = new Professor(cpf, nome, cripto.getSenhaCriptografada());
            errorlist.add(0); // nao possui erros
            this.professList.add(novoprof);
            try
            {
               this.salvarProfessor(novoprof);
               //System.out.println(professList.size());
               //return (errorlist);
            }
            catch (IOException ex)
            {
               System.err.println(ex);
            }
         }
      }
      // erros no cadastro
      return (errorlist);
   }

   public void login(String cpf, String senha)
   {
      cpf = cpf.replace(".", "");
      cpf = cpf.replace("-", "");
      System.out.println("cpf digitado - " + cpf + "\n" + "senha digitada - " + senha);
      if (cpf.equals("1") && senha.equals("1"))
      {

         Professor novoprof = new Professor(cpf, nome, senha);
         //this.professList.add(novoprof);
         logado = novoprof;
      }
      else
      {
         for (int i = 0; i < this.professList.size(); i++)
         {
            if (this.professList.get(i).getCpf().equals(cpf))
            {
               //achou o modafuka professor //checa a senha
               //System.out.println("Senha no login = " + senha);
               String senhaconf = null;
               senhaconf = cripto.decriptografarSenha(cpf, this.professList.get(i).getSenha());
               System.out.println("senha decriptografada - " + senhaconf);
               if (senha.equals(senhaconf))
               {
                  // delicinha 

                  if (!islogado)
                  {
                     // nao tem ninguem logado
                     logado = this.professList.get(i);
                     System.out.println(" achou o professor e logou");
                     islogado = true;
                     return;
                  }
                  else
                  {
                     System.out.println("Ja existe Professor logado no sistema");
                     return;
                  }
               }
               else
               {
                  // senha errada seu viadinho
                  System.out.println("senha errada - " + senha);
                  return;
               }
            }

         }
      }

      /*      
       * //professor no existe
       * System.out.println("Nao existe cadastro com cpf =" + cpf );
       */
   }

   public Professor getProfessorLogado()
   {
      return this.logado;
   }

   public void salvar() throws IOException
   {
      ArrayList<Integer> contadores = new ArrayList<>();

      contadores.add(Professor.getCont());
      contadores.add(Turma.getCont());
      contadores.add(Aluno.getCont());

      ObjectOutputStream out;
      out = new ObjectOutputStream(new FileOutputStream("info.dat"));
      out.writeObject(contadores);
      out.close();

      Professor p;
      for (int i = 0; i < professList.size(); i++)
      {
         p = professList.get(i);
         salvarProfessor(p, true);
      }
   }

   public void salvarProfessor(Professor p) throws IOException
   {
      salvarProfessor(p, false);
   }

   public void salvarProfessor(Professor p, boolean all) throws IOException
   {

      ArrayList<Turma> turmas = p.getTurmas();
      p.setTurmas(new ArrayList<Turma>());
      Turma t;
      File f;
      String diretorio = p.getDir();

      f = new File(diretorio);
      if (!f.exists())
      {
         f.mkdirs();
      }

      //salva o obj professor
      ObjectOutputStream out;
      out = new ObjectOutputStream(new FileOutputStream(diretorio + "/info.dat"));
      out.writeObject(p);
      out.close();
      if (all)
      {
         for (int i = 0; i < turmas.size(); i++)
         {
            t = turmas.get(i);
            this.salvarTurma(t, true);
         }
      }
      p.setTurmas(turmas);
   }

   public void salvarTurma(Turma t) throws IOException
   {
      salvarTurma(t, false);
   }

   public void salvarTurma(Turma t, boolean all) throws IOException
   {
      //salva obj
      ArrayList<Aluno> alunos = t.buscaTodosAlunos();
      t.setAlunos(new ArrayList<Aluno>());

      Aluno a;

      File f;

      f = new File(t.getDir());
      if (!f.exists())
      {
         f.mkdirs();
      }


      //salva o obj turma
      ObjectOutputStream out;
      out = new ObjectOutputStream(new FileOutputStream(t.getDir() + "/info.dat"));
      out.writeObject(t);
      out.close();

      if (all)
      {
         for (int i = 0; i < alunos.size(); i++)
         {
            a = alunos.get(i);
            this.salvarAluno(a, true);
         }
      }

      t.setAlunos(alunos);
   }

   public void salvarAluno(Aluno a) throws IOException
   {
      salvarAluno(a, false);
   }

   public void salvarAluno(Aluno a, boolean all) throws IOException
   {
      //salva aluno
      //salva arrayList de avaliaÃ§Ãµes do aluno

      File f;
      f = new File(a.getDir());
      if (!f.exists())
      {
         f.mkdirs();
      }

      //salva o obj turma
      ObjectOutputStream out;
      out = new ObjectOutputStream(new FileOutputStream(a.getDir() + "/info.dat"));
      out.writeObject(a);
      out.close();

      out = new ObjectOutputStream(new FileOutputStream(a.getDir() + "/avaliacoes.dat"));
      out.writeObject(a.getAvaliacoes());
      out.close();
   }

   public void carregar() throws IOException, ClassNotFoundException
   {
      FileInputStream file = new FileInputStream(new File("info.dat"));
      ObjectInputStream in = new ObjectInputStream(file);

      ArrayList<Integer> contadores = (ArrayList<Integer>) in.readObject();

      Professor.setCont(contadores.get(0));
      Turma.setCont(contadores.get(1));
      Aluno.setCont(contadores.get(2));
      System.out.println("Contadores: " + contadores.get(0) + " " + contadores.get(1) + " " + contadores.get(2));

      File f = new File("professores");
      String lista[] = f.list();
      ArrayList<Professor> professores = new ArrayList<>();

      Professor p;
      for (int i = 0; i < lista.length; i++)
      {
         System.out.println("Professor em: " + lista[i]);
         p = carregarProfessor("professores/" + lista[i]);
         professores.add(p);
      }

      this.setProfessList(professores);
   }

   public Professor carregarProfessor(String diretorio) throws IOException, ClassNotFoundException
   {
      Professor p;

      FileInputStream file = new FileInputStream(new File(diretorio + "/info.dat"));
      ObjectInputStream in = new ObjectInputStream(file);

      p = (Professor) in.readObject();
      in.close();

      File f = new File(diretorio + "/turmas");
      if(f.exists())
      {
         String lista[] = f.list();

         //System.out.println(p.getTurmas().get(0).getId());

         ArrayList<Turma> turmas = new ArrayList<>();

         for (int i = 0; i < lista.length; i++)
         {
            if (!lista[i].equalsIgnoreCase("info.dat"))
            {
               System.out.println("Turma em: " + lista[i]);
               turmas.add(carregarTurma(diretorio + "/turmas/" + lista[i]));
            }
         }

         p.setTurmas(turmas);
      }

      return p;
   }

   public Turma carregarTurma(String diretorio) throws IOException, ClassNotFoundException
   {
      //salva obj
      Turma t;

      FileInputStream file = new FileInputStream(new File(diretorio + "/info.dat"));
      ObjectInputStream in = new ObjectInputStream(file);

      t = (Turma) in.readObject();
      in.close();

      File f = new File(diretorio + "/alunos");
      String lista[] = f.list();

      ArrayList<Aluno> alunos = new ArrayList<>();

      for (int i = 0; i < lista.length; i++)
      {
         if (!lista[i].equalsIgnoreCase("info.dat"))
         {
            System.out.println("Aluno em: " + lista[i]);
            alunos.add(carregarAluno(diretorio + "/alunos/" + lista[i]));
         }
      }

      t.setAlunos(alunos);

      return t;
   }

   public Aluno carregarAluno(String diretorio) throws IOException, ClassNotFoundException
   {
      Aluno a;
      //salva aluno
      //salva arrayList de avaliaÃ§Ãµes do aluno

      FileInputStream file;
      ObjectInputStream in;

      file = new FileInputStream(new File(diretorio + "/info.dat"));
      in = new ObjectInputStream(file);

      a = (Aluno) in.readObject();
      in.close();

      file = new FileInputStream(new File(diretorio + "/avaliacoes.dat"));
      in = new ObjectInputStream(file);

      System.out.println("size: " + a.getAvaliacoes().size());

      ArrayList<Avaliacao> avaliacoes = (ArrayList<Avaliacao>) in.readObject();
      in.close();

      a.setAvaliacoes(avaliacoes);

      return a;
   }
}
