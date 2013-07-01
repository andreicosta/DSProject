package dsproject;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Aluno extends Pessoa implements Serializable
{

   private String nomeDaMae;
   private String nomeDoPai;
   private Turma turma;
   private String telefone;
   private String celular;
   private String email;
   private ArrayList<Avaliacao> avaliacoes;

   public Aluno(String nomeDaMae, String nomeDoPai, Turma turma, String telefone, String celular, String email, 
                String nome, Date dataDeNascimento, String genero, String endereco, String cidade, String estado)
   {
      super(nome, dataDeNascimento, genero, endereco, cidade, estado);
      this.nomeDaMae = nomeDaMae;
      this.nomeDoPai = nomeDoPai;
      this.turma = turma;
      this.telefone = telefone;
      this.celular = celular;
      this.email = email;
      this.avaliacoes = new ArrayList<>();
   }
   
   public void inserirAvaliacao(java.sql.Date dataDaAvaliacao, String horaDaAvaliacao, String temperatura)
   {
      int verdadeiro = 1;
      SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

      Avaliacao avaliacao = new Avaliacao(dataDaAvaliacao, horaDaAvaliacao, temperatura);

      /* aqui tem que fazer um teste para ver se o campo do teste correspondente na interface não é nulo
       * caso seja nulo entao deve colocar o teste como não feito ou não preenchido.
       * Depois da verificação de cada campo deve colocar o valor do campo no teste ou null
       */

      if (Interface.TestPanel.getCampoMassaCorporal() == -1)
      {
         //JOptionPane.showMessageDialog(null, "Erro na Massa Corporal", "Erro", JOptionPane.ERROR_MESSAGE);
         verdadeiro = 0;
      }
      if (Interface.TestPanel.getCampoEstatura() == -1)
      {
         //System.out.println("Estatura faltando");
         verdadeiro = 0;
      }
      /*if (Interface.TestPanel.getCampoEstatura() > 257)
      {
         JOptionPane.showMessageDialog(null, "Digite uma estatura real", "Erro", JOptionPane.ERROR_MESSAGE);
         return false;
      }*/
      if (Interface.TestPanel.getCampoIMC() == -1)
      {
         System.out.println("IMC faltando");
         verdadeiro = 0;
      }
      if (Interface.TestPanel.getCampoEnvergadura() == -1)
      {
         System.out.println("Envergadura faltando");
         verdadeiro = 0;
      }
      /*if (Interface.TestPanel.getCampoEnvergadura() > 272)
      {
         JOptionPane.showMessageDialog(null, "Digite uma envergadura real", "Erro", JOptionPane.ERROR_MESSAGE);
         return false;
      }*/
      if (Interface.TestPanel.getCampoAbdominal() == -1)
      {
         System.out.println("Abdominal faltando");
         verdadeiro = 0;
      }
      if (Interface.TestPanel.getCampoSentarEAlcancar() == -1)
      {
         System.out.println("Sentar-e-Alcançar faltando");
         verdadeiro = 0;
      }
      if (!Interface.TestPanel.getRadioSentarEAlcancarComBanco() && !Interface.TestPanel.getRadioSentarEAlcancarSemBanco())
      {
         JOptionPane.showMessageDialog(null, "Marque se sentar e alcançar é com banco ou sem banco", "Erro", JOptionPane.ERROR_MESSAGE);
      }

      avaliacao.setSentarEAlcancarComBanco(Interface.TestPanel.getRadioSentarEAlcancarComBanco());

      if (Interface.TestPanel.getCampoCorrida6Ou9Minutos() == -1)
      {
         System.out.println("Corrida faltando");
         verdadeiro = 0;
      }

      if (!Interface.TestPanel.getRadio6Minutos() && !Interface.TestPanel.getRadio9Minutos())
      {
         JOptionPane.showMessageDialog(null, "Marque se corrida é de 6 ou 9 minutos", "Erro", JOptionPane.ERROR_MESSAGE);
      }

      if (Interface.TestPanel.getCampoSaltoHorizontal() == -1)
      {
         System.out.println("Salto Horizontal faltando");
         verdadeiro = 0;
      }

      if (Interface.TestPanel.getCampoArremessoDeMedicineBall() == -1)
      {
         System.out.println("Medicineball faltando");
         verdadeiro = 0;
      }

      if (Interface.TestPanel.getCampoQuadrado() == -1)
      {
         System.out.println("Quadrado faltando");
         verdadeiro = 0;
      }

      if (Interface.TestPanel.getCampoCorridaDe20Metros() == -1)
      {
         System.out.println("Corrida de 20 Metros faltando");
         verdadeiro = 0;
      }

      avaliacao.setMassaCorporal(Interface.TestPanel.getCampoMassaCorporal());
      avaliacao.setEstatura(Interface.TestPanel.getCampoEstatura());
      avaliacao.setIMC(Interface.TestPanel.getCampoIMC());
      avaliacao.setEnvergadura(Interface.TestPanel.getCampoEnvergadura());
      avaliacao.setAbdominal(Interface.TestPanel.getCampoAbdominal());
      avaliacao.setSentarEAlcancar(Interface.TestPanel.getCampoSentarEAlcancar());
      if (Interface.TestPanel.getRadio6Minutos())
      {
         avaliacao.set6Minutos(Interface.TestPanel.getCampoCorrida6Ou9Minutos());
         //se avaliação 9 minutos é -1 então a avaliação realizada foi a de 6 minutos
         avaliacao.set9Minutos(-1);
      }
      else
      {
         avaliacao.set9Minutos(Interface.TestPanel.getCampoCorrida6Ou9Minutos());
         //se avaliação 6 minutos é -1 então a avaliação realizada foi a de 9 minutos
         avaliacao.set6Minutos(-1);
      }

      avaliacao.setSaltoHorizontal(Interface.TestPanel.getCampoSaltoHorizontal());
      avaliacao.setArremessoMedicineBall(Interface.TestPanel.getCampoArremessoDeMedicineBall());
      avaliacao.setTesteDoQuadrado(Interface.TestPanel.getCampoQuadrado());
      avaliacao.setCorrida20Metros(Interface.TestPanel.getCampoCorridaDe20Metros());
      System.out.println("data = " + dataFormatada.format(avaliacao.getData()));
      System.out.println("horario = " + avaliacao.getHorario());
      System.out.println("temperatura = " + avaliacao.getTemperatura() + "°C");
      System.out.println("massa corporal = " + avaliacao.getMassaCorporal() + "Kg");
      System.out.println("estatura = " + avaliacao.getEstatura() + "cm");
      System.out.println("IMC = " + avaliacao.getIMC());
      System.out.println("envergadura = " + avaliacao.getEnvergadura() + "cm");
      System.out.println("abdominal = " + avaliacao.getAbdominal());
      System.out.println("sentar e alcançar = " + avaliacao.getSentarEAlcancar() + "com banco = " + avaliacao.isSentarEAlcancarComBanco());
      if (avaliacao.get6Minutos() == -1)
      {
         System.out.println("corrida 9 minutos = " + avaliacao.get9Minutos());
      }
      else
      {
         System.out.println("corrida 6 minutos = " + avaliacao.get6Minutos());
      }
      System.out.println("salto Horizontal = " + avaliacao.getSaltoHorizontal());
      System.out.println("arremesso medicine ball = " + avaliacao.getArremessoMedicineBall() + "cm");
      System.out.println("teste do quadrado = " + avaliacao.getTesteDoQuadrado());
      System.out.println("corrida de 20 metros = " + avaliacao.getCorrida20Metros());

      if(verdadeiro == 0)
      {
         int x;
         x = JOptionPane.showConfirmDialog(null, "Existem campos em branco. Deseja salvar a avaliação? ");
         if(x == 0)
         {
            this.setAvaliacoes(avaliacao);
         }
      }
      else
      {
         this.setAvaliacoes(avaliacao);
         JOptionPane.showMessageDialog(null, "Avaliação salva com sucesso", "Confirmação!", JOptionPane.INFORMATION_MESSAGE);
      }
   }

   public String getTurmaId()
   {
      return turma.getId();
   }

   public String getTelefone()
   {
      return telefone;
   }

   public String getCelular()
   {
      return celular;
   }

   public String getEmail()
   {
      return email;
   }
   
   public String getNomeDaMae()
   {
      return nomeDaMae;
   }

   public String getNomeDoPai()
   {
      return nomeDoPai;
   }

   public ArrayList<Avaliacao> getAvaliacoes()
   {
      return avaliacoes;
   }

   public void setAvaliacoes(Avaliacao avaliacao)
   {
      this.avaliacoes.add(avaliacao);
   }
   
   public Avaliacao buscarUltimaAvaliacao()
   {
      return avaliacoes.get(avaliacoes.size() - 1);
   }

   public void setTurma(Turma turma)
   {
      this.turma = turma;
   }

   public Turma getTurma()
   {
      return turma;
   }

   public void setNomeDaMae(String nomeDaMae)
   {
      this.nomeDaMae = nomeDaMae;
   }

   public void setNomeDoPai(String nomeDoPai)
   {
      this.nomeDoPai = nomeDoPai;
   }

   public void setTelefone(String telefone)
   {
      this.telefone = telefone;
   }

   public void setCelular(String celular)
   {
      this.celular = celular;
   }

   public void setEmail(String email)
   {
      this.email = email;
   }
   
}
