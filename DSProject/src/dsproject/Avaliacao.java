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
   
   private boolean salvoParaEnviar;
   
   private boolean enviado;

    public boolean isEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }
   

   public Avaliacao()
   {    
       
       //this.data = null;
       this.horario = null;
       this.temperatura = null;
       
       this.massaCorporal = -1;
       this.estatura = -1;
       this.IMC = -1;
       this.envergadura = -1;
       this.sentarEAlcancar = -1;
       this.sentarEAlcancarComBanco = true;
       this.abdominal = -1;
       this._6Minutos = -1;
       this._9Minutos = -1;
       this.saltoHorizontal = -1;
       this.arremessoMedicineBall = -1;
       this.testeDoQuadrado = -1;
       this.corrida20Metros = -1;
       
       this.salvoParaEnviar = false;
       this.enviado = false;
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
    
        public void setData(Date data) {
        this.data = data;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setSalvoParaEnviar(boolean salvoParaEnviar) {
        this.salvoParaEnviar = salvoParaEnviar;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
}
