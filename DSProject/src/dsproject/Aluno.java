package dsproject;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Aluno extends Pessoa implements Serializable
{
   private String nameOfMother;
   private String nameOfFather;
   private String classId;
   private ArrayList<Avaliacao> tests = new ArrayList<>();

   public Aluno(String nameOfMother, String nameOfFather, String name, java.sql.Date dateOfBirth, 
                  String gender, String address, String city, String state)
   {
      super(name, dateOfBirth, gender, address, city, state);
      this.nameOfMother = nameOfMother;
      this.nameOfFather = nameOfFather;
   }

   public boolean saveTest(java.sql.Date testDate, String time, String temperature)
   {
      SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

      Avaliacao test = new Avaliacao(testDate, time, temperature);

      /* aqui tem que fazer um teste para ver se o campo do teste correspondente na interface não é nulo
       * caso seja nulo entao deve colocar o teste como não feito ou não preenchido.
       * Depois da verificação de cada campo deve colocar o valor do campo no teste ou null
       */
       
        if (Interface.TestPanel.getFieldBodyMass() == -1) {
            JOptionPane.showMessageDialog(null, "Erro na Massa Corporal", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (Interface.TestPanel.getFieldHeight() == -1) {
            System.out.println("Estatura faltando");
            return false;
        }
        if (Interface.TestPanel.getFieldHeight() > 257) {
            JOptionPane.showMessageDialog(null, "Digite uma estatura real", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (Interface.TestPanel.getFieldIMC() == -1) {
            System.out.println("IMC faltando");
            return false;
        }
        if (Interface.TestPanel.getFieldSpread() == -1) {
            System.out.println("Envergadura faltando");
            return false;
        }
        if (Interface.TestPanel.getFieldSpread() > 272) {
            JOptionPane.showMessageDialog(null, "Digite uma envergadura real", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (Interface.TestPanel.getFieldSitUp() == -1) {
            System.out.println("Abdominal faltando");
            return false;
        }
        if (Interface.TestPanel.getFieldSitAndAchieve() == -1) {
            System.out.println("Sentar-e-Alcançar faltando");
            return false;
        }
        if (!Interface.TestPanel.getRadioSitAndAchieveWithSeat() && !Interface.TestPanel.getRadioSitAndAchieveWithoutSeat()) {
            JOptionPane.showMessageDialog(null, "Marque se sentar e alcançar é com banco ou sem banco", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        test.setSentarEAlcancarComBanco(Interface.TestPanel.getRadioSitAndAchieveWithSeat());

        if (Interface.TestPanel.getFieldRun6Or9Minutes() == -1) {
            System.out.println("Corrida faltando");
            return false;
        }

        if (!Interface.TestPanel.getRadio6Minutes() && !Interface.TestPanel.getRadio9Minutes()) {
            JOptionPane.showMessageDialog(null, "Marque se corrida é de 6 ou 9 minutos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (Interface.TestPanel.getFieldHorizontalJump() == -1) {
            System.out.println("Salto Horizontal faltando");
            return false;
        }

        if (Interface.TestPanel.getFieldThrowOfMedicineBall() == -1) {
            System.out.println("Medicineball faltando");
            return false;
        }

        if (Interface.TestPanel.getFieldSquareTest() == -1) {
            System.out.println("Quadrado faltando");
            return false;
        }

        if (Interface.TestPanel.getField20MetersRun() == -1) {
            System.out.println("Corrida de 20 Metros faltando");
            return false;
        }

        test.setMassaCorporal(Interface.TestPanel.getFieldBodyMass());
        test.setEstatura(Interface.TestPanel.getFieldHeight());
        test.setIMC(Interface.TestPanel.getFieldIMC());
        test.setEnvergadura(Interface.TestPanel.getFieldSpread());
        test.setAbdominal(Interface.TestPanel.getFieldSitUp());
        test.setSentarEAlcancar(Interface.TestPanel.getFieldSitAndAchieve());
        if (Interface.TestPanel.getRadio6Minutes()) {
            test.set6Minutos(Interface.TestPanel.getFieldRun6Or9Minutes());
            //se avaliação 9 minutos é -1 então a avaliação realizada foi a de 6 minutos
            test.set9Minutos(-1);
        } else {
            test.set9Minutos(Interface.TestPanel.getFieldRun6Or9Minutes());
            //se avaliação 6 minutos é -1 então a avaliação realizada foi a de 9 minutos
            test.set6Minutos(-1);
        }

        test.setSaltoHorizontal(Interface.TestPanel.getFieldHorizontalJump());
        test.setArremessoMedicineBall(Interface.TestPanel.getFieldThrowOfMedicineBall());
        test.setTesteDoQuadrado(Interface.TestPanel.getFieldSquareTest());
        test.setCorrida20Metros(Interface.TestPanel.getField20MetersRun());
        System.out.println("data = " + sd.format(test.getData()));
        System.out.println("horario = " + test.getHorario());
        System.out.println("temperatura = " + test.getTemperatura() + "°C");
        System.out.println("massa corporal = " + test.getMassaCorporal() + "Kg");
        System.out.println("estatura = " + test.getEstatura() + "cm");
        System.out.println("IMC = " + test.getIMC());
        System.out.println("envergadura = " + test.getEnvergadura() + "cm");
        System.out.println("abdominal = " + test.getAbdominal());
        System.out.println("sentar e alcançar = "+test.getSentarEAlcancar()+"com banco = "+test.isSentarEAlcancarComBanco());
        if (test.get6Minutos() == -1) {
            System.out.println("corrida 9 minutos = " + test.get9Minutos());
        } else {
            System.out.println("corrida 6 minutos = " + test.get6Minutos());
        }
        System.out.println("salto Horizontal = " + test.getSaltoHorizontal());
        System.out.println("arremesso medicine ball = " + test.getArremessoMedicineBall() + "cm");
        System.out.println("teste do quadrado = " + test.getTesteDoQuadrado());
        System.out.println("corrida de 20 metros = " + test.getCorrida20Metros());
        this.setTests(test);

        return true;
    }

   public String getNomeDaMae()
   {
      return nameOfMother;
   }

   public String getNomeDoPai()
   {
      return nameOfFather;
   }

   public ArrayList<Avaliacao> getTestes()
   {
      return tests;
   }

   public void setClassId(String classId)
   {
      this.classId = classId;
   }

   public void setTests(Avaliacao test)
   {
      this.tests.add(test);
   }
   
}
