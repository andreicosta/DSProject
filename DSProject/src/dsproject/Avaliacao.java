/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproject;

import java.io.Serializable;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author vinicius
 */
public class Avaliacao implements Serializable
{
   private Date data;
   private String horario;
   private String temperatura;
   //Testes referentes à aptidão física relacionada à saúde
   private float massaCorporal; //em Kg com uma casa decimal
   private float estatura; //em cm com uma casa decimal
   private float IMC; //IMC = Massa (Kg)/ estatura (m)²
   private float envergadura; //em cm com uma casa decimal
   private float sentarEAlcancar; //em cm com uma casa decimal
   private boolean sentarEAlcancarComBanco; //em cm com uma casa decimal
   private int abdominal; //(abdominal) número de movimentos completos realizados em 1 minuto.
   private float _9Minutos; //resultados serão anotados em metros com aproximação às dezenas.
   private float _6Minutos; //resultados serão anotados em metros com aproximação às dezenas.
   //Testes referentes ao desempenho motor
   private float saltoHorizontal; //distância do salto será registrada em centímetros, com uma casa decimal
   private float arremessoMedicineBall; //A medida será registrada em centímetros com uma casa decimal.
   private float testeDoQuadrado; //A medida será registrada em segundos e centésimos de segundo (duas casas após a vírgula).
   private float corrida20Metros; //tempo do percurso em segundos e centésimos de segundos (duas casas após a vírgula).
   
   private boolean salvar;
   

   public Avaliacao()
   {
       boolean verdadeiro = true;
       /* aqui tem que fazer um teste para ver se o campo do teste correspondente na interface não é nulo
       * caso seja nulo entao deve colocar o teste como não feito ou não preenchido.
       * Depois da verificação de cada campo deve colocar o valor do campo no teste ou null
       */
      if (Interface.TestPanel.getCampoDataDaAvaliacao() == null){
          JOptionPane.showMessageDialog(null, "Selecione a data do teste", "Erro", JOptionPane.ERROR_MESSAGE);
      }
      if (Interface.TestPanel.getCampoHora() == null){
          JOptionPane.showMessageDialog(null, "Preencha a hora do teste", "Erro", JOptionPane.ERROR_MESSAGE);
      }
      if( Interface.TestPanel.getCampoTemperatura() == null){
          JOptionPane.showMessageDialog(null, "Preencha a temperatura do dia do teste", "Erro", JOptionPane.ERROR_MESSAGE);
      }
      if (Interface.TestPanel.getCampoMassaCorporal() == -1)
      {
         //JOptionPane.showMessageDialog(null, "Erro na Massa Corporal", "Erro", JOptionPane.ERROR_MESSAGE);
         verdadeiro = false;
      }
      if (Interface.TestPanel.getCampoEstatura() == -1)
      {
         //System.out.println("Estatura faltando");
         verdadeiro = false;
      }
      if (Interface.TestPanel.getCampoIMC() == -1)
      {
         //System.out.println("IMC faltando");
         verdadeiro = false;
      }
      if (Interface.TestPanel.getCampoEnvergadura() == -1)
      {
         //System.out.println("Envergadura faltando");
         verdadeiro = false;
      }
      if (Interface.TestPanel.getCampoSentarEAlcancar() == -1)
      {
         //System.out.println("Sentar-e-Alcançar faltando");
         verdadeiro = false;
      }
      if (!Interface.TestPanel.getRadioSentarEAlcancarComBanco() && !Interface.TestPanel.getRadioSentarEAlcancarSemBanco())
      {
         JOptionPane.showMessageDialog(null, "Marque se sentar e alcançar é com banco ou sem banco", "Erro", JOptionPane.ERROR_MESSAGE);
      }
      if (Interface.TestPanel.getCampoAbdominal() == -1)
      {
         //System.out.println("Abdominal faltando");
         verdadeiro = false;
      }      
      if (Interface.TestPanel.getCampoCorrida6Ou9Minutos() == -1)
      {
         //System.out.println("Corrida faltando");
         verdadeiro = false;
      }
      if (!Interface.TestPanel.getRadio6Minutos() && !Interface.TestPanel.getRadio9Minutos())
      {
         JOptionPane.showMessageDialog(null, "Marque se corrida é de 6 ou 9 minutos", "Erro", JOptionPane.ERROR_MESSAGE);
      }
      if (Interface.TestPanel.getCampoSaltoHorizontal() == -1)
      {
         //System.out.println("Salto Horizontal faltando");
         verdadeiro = false;
      }
      if (Interface.TestPanel.getCampoArremessoDeMedicineBall() == -1)
      {
         //System.out.println("Medicineball faltando");
         verdadeiro = false;
      }
      if (Interface.TestPanel.getCampoQuadrado() == -1)
      {
         //System.out.println("Quadrado faltando");
         verdadeiro = false;
      }
      if (Interface.TestPanel.getCampoCorridaDe20Metros() == -1)
      {
         //System.out.println("Corrida de 20 Metros faltando");
         verdadeiro = false;
      }
      
      this.data = Interface.TestPanel.getCampoDataDaAvaliacao();
      this.horario = Interface.TestPanel.getCampoHora();
      this.temperatura = Interface.TestPanel.getCampoTemperatura();
      this.massaCorporal = Interface.TestPanel.getCampoMassaCorporal();
      this.estatura = Interface.TestPanel.getCampoEstatura();
      this.IMC = Interface.TestPanel.getCampoIMC();
      this.envergadura = Interface.TestPanel.getCampoEnvergadura();
      this.sentarEAlcancar = Interface.TestPanel.getCampoSentarEAlcancar();
      this.sentarEAlcancarComBanco = Interface.TestPanel.getRadioSentarEAlcancarComBanco();
      this.abdominal = Interface.TestPanel.getCampoAbdominal();
      
      if (Interface.TestPanel.getRadio6Minutos())
      {
         this._6Minutos = Interface.TestPanel.getCampoCorrida6Ou9Minutos();
         //se avaliação 9 minutos é -1 então a avaliação realizada foi a de 6 minutos
         this._9Minutos = -1;
      }
      else
      {
         this._9Minutos = Interface.TestPanel.getCampoCorrida6Ou9Minutos();
         //se avaliação 6 minutos é -1 então a avaliação realizada foi a de 9 minutos
         this._6Minutos = -1;
      }
      this.saltoHorizontal = Interface.TestPanel.getCampoSaltoHorizontal();
      this.arremessoMedicineBall = Interface.TestPanel.getCampoArremessoDeMedicineBall();
      this.testeDoQuadrado = Interface.TestPanel.getCampoQuadrado();
      this.corrida20Metros = Interface.TestPanel.getCampoCorridaDe20Metros();
      
      if(verdadeiro == false)
      {
         int x;
         x = JOptionPane.showConfirmDialog(null, "Existem campos em branco. Deseja salvar a avaliação? ");
         if(x == 0)
         {
            this.salvar = true;
         }
      }
      else
      {
         JOptionPane.showMessageDialog(null, "Avaliação salva com sucesso", "Confirmação!", JOptionPane.INFORMATION_MESSAGE);
         this.salvar = true;
      }
      
      /*
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
      */
   }

   public void setMassaCorporal(float massaCorporal)
   {
      this.massaCorporal = massaCorporal;
   }

   public void setEstatura(float estatura)
   {
      this.estatura = estatura;
   }

   public void setIMC(float IMC)
   {
      this.IMC = IMC;
   }

   public void setEnvergadura(float envergadura)
   {
      this.envergadura = envergadura;
   }

   public void setSentarEAlcancar(float sentarEAlcancar)
   {
      this.sentarEAlcancar = sentarEAlcancar;
   }

   public void setSentarEAlcancarComBanco(boolean sentarEAlcancarComBanco)
   {
      this.sentarEAlcancarComBanco = sentarEAlcancarComBanco;
   }
   
   public void setAbdominal(int abdominal)
   {
      this.abdominal = abdominal;
   }

   public void set9Minutos(float _9minutos)
   {
      this._9Minutos = _9minutos;
   }
   
   public void set6Minutos(float resistGeral)
   {
      this._6Minutos = resistGeral;
   }

   public void setSaltoHorizontal(float saltoHorizontal)
   {
      this.saltoHorizontal = saltoHorizontal;
   }

   public void setArremessoMedicineBall(float arremessoMedicineBall)
   {
      this.arremessoMedicineBall = arremessoMedicineBall;
   }

   public void setTesteDoQuadrado(float testeDoQuadrado)
   {
      this.testeDoQuadrado = testeDoQuadrado;
   }

   public void setCorrida20Metros(float corrida20Metros)
   {
      this.corrida20Metros = corrida20Metros;
   }

   public float getArremessoMedicineBall()
   {
      return arremessoMedicineBall;
   }

   public Date getData()
   {
      return data;
   }

   public String getHorario()
   {
      return horario;
   }

   public String getTemperatura()
   {
      return temperatura;
   }

   public float getMassaCorporal()
   {
      return massaCorporal;
   }

   public float getEstatura()
   {
      return estatura;
   }

   public float getIMC()
   {
      return IMC;
   }

   public float getEnvergadura()
   {
      return envergadura;
   }

   public float getSentarEAlcancar()
   {
      return sentarEAlcancar;
   }

   public boolean isSentarEAlcancarComBanco()
   {
      return sentarEAlcancarComBanco;
   }
   
   public int getAbdominal()
   {
      return abdominal;
   }

   public float get9Minutos()
   {
      return _9Minutos;
   }
   
   public float get6Minutos()
   {
      return _6Minutos;
   }

   public float getSaltoHorizontal()
   {
      return saltoHorizontal;
   }

   public float getTesteDoQuadrado()
   {
      return testeDoQuadrado;
   }

   public float getCorrida20Metros()
   {
      return corrida20Metros;
   }
   
    public boolean isSalvar() {
        return salvar;
    }

    public void setSalvar(boolean salvar) {
        this.salvar = salvar;
    }
}
