package dsproject;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import javax.swing.JOptionPane;

public class Aluno extends Pessoa implements Serializable {

    private String nomeDaMae;
    private String nomeDoPai;
    private String telefone;
    private String celular;
    private String email;
    private Turma turma;
    private ArrayList<Avaliacao> avaliacoes;

    public Aluno(String nome, Date nascimento, String genero, String endereco, String cidade,
            String estado, String nomeMae, String nomePai, String telefone, String celular, String email) {
        super(nome, nascimento, genero, endereco, cidade, estado);
        this.nomeDaMae = nomeMae;
        this.nomeDoPai = nomePai;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.turma = null;
        this.avaliacoes = new ArrayList<>();
    }

    public boolean inserirAvaliacao(java.sql.Date dataDaAvaliacao, String horaDaAvaliacao, String temperatura) {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        Avaliacao test = new Avaliacao(dataDaAvaliacao, horaDaAvaliacao, temperatura);

        /* aqui tem que fazer um teste para ver se o campo do teste correspondente na interface não é nulo
         * caso seja nulo entao deve colocar o teste como não feito ou não preenchido.
         * Depois da verificação de cada campo deve colocar o valor do campo no teste ou null
         */

        if (Interface.TestPanel.getCampoMassaCorporal() == -1) {
            JOptionPane.showMessageDialog(null, "Erro na Massa Corporal", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (Interface.TestPanel.getCampoEstatura() == -1) {
            System.out.println("Estatura faltando");
            return false;
        }
        if (Interface.TestPanel.getCampoEstatura() > 257) {
            JOptionPane.showMessageDialog(null, "Digite uma estatura real", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (Interface.TestPanel.getCampoIMC() == -1) {
            System.out.println("IMC faltando");
            return false;
        }
        if (Interface.TestPanel.getCampoEnvergadura() == -1) {
            System.out.println("Envergadura faltando");
            return false;
        }
        if (Interface.TestPanel.getCampoEnvergadura() > 272) {
            JOptionPane.showMessageDialog(null, "Digite uma envergadura real", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (Interface.TestPanel.getCampoAbdominal() == -1) {
            System.out.println("Abdominal faltando");
            return false;
        }
        if (Interface.TestPanel.getCampoSentarEAlcancar() == -1) {
            System.out.println("Sentar-e-Alcançar faltando");
            return false;
        }
        if (!Interface.TestPanel.getRadioSentarEAlcancarComBanco() && !Interface.TestPanel.getRadioSentarEAlcancarSemBanco()) {
            JOptionPane.showMessageDialog(null, "Marque se sentar e alcançar é com banco ou sem banco", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        test.setSentarEAlcancarComBanco(Interface.TestPanel.getRadioSentarEAlcancarComBanco());

        if (Interface.TestPanel.getCampoCorrida6Ou9Minutos() == -1) {
            System.out.println("Corrida faltando");
            return false;
        }

        if (!Interface.TestPanel.getRadio6Minutos() && !Interface.TestPanel.getRadio9Minutos()) {
            JOptionPane.showMessageDialog(null, "Marque se corrida é de 6 ou 9 minutos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (Interface.TestPanel.getCampoSaltoHorizontal() == -1) {
            System.out.println("Salto Horizontal faltando");
            return false;
        }

        if (Interface.TestPanel.getCampoArremessoDeMedicineBall() == -1) {
            System.out.println("Medicineball faltando");
            return false;
        }

        if (Interface.TestPanel.getCampoQuadrado() == -1) {
            System.out.println("Quadrado faltando");
            return false;
        }

        if (Interface.TestPanel.getCampoCorridaDe20Metros() == -1) {
            System.out.println("Corrida de 20 Metros faltando");
            return false;
        }

        test.setMassaCorporal(Interface.TestPanel.getCampoMassaCorporal());
        test.setEstatura(Interface.TestPanel.getCampoEstatura());
        test.setIMC(Interface.TestPanel.getCampoIMC());
        test.setEnvergadura(Interface.TestPanel.getCampoEnvergadura());
        test.setAbdominal(Interface.TestPanel.getCampoAbdominal());
        test.setSentarEAlcancar(Interface.TestPanel.getCampoSentarEAlcancar());
        if (Interface.TestPanel.getRadio6Minutos()) {
            test.set6Minutos(Interface.TestPanel.getCampoCorrida6Ou9Minutos());
            //se avaliação 9 minutos é -1 então a avaliação realizada foi a de 6 minutos
            test.set9Minutos(-1);
        } else {
            test.set9Minutos(Interface.TestPanel.getCampoCorrida6Ou9Minutos());
            //se avaliação 6 minutos é -1 então a avaliação realizada foi a de 9 minutos
            test.set6Minutos(-1);
        }

        test.setSaltoHorizontal(Interface.TestPanel.getCampoSaltoHorizontal());
        test.setArremessoMedicineBall(Interface.TestPanel.getCampoArremessoDeMedicineBall());
        test.setTesteDoQuadrado(Interface.TestPanel.getCampoQuadrado());
        test.setCorrida20Metros(Interface.TestPanel.getCampoCorridaDe20Metros());
        System.out.println("data = " + sd.format(test.getData()));
        System.out.println("horario = " + test.getHorario());
        System.out.println("temperatura = " + test.getTemperatura() + "°C");
        System.out.println("massa corporal = " + test.getMassaCorporal() + "Kg");
        System.out.println("estatura = " + test.getEstatura() + "cm");
        System.out.println("IMC = " + test.getIMC());
        System.out.println("envergadura = " + test.getEnvergadura() + "cm");
        System.out.println("abdominal = " + test.getAbdominal());
        System.out.println("sentar e alcançar = " + test.getSentarEAlcancar() + "com banco = " + test.isSentarEAlcancarComBanco());
        if (test.get6Minutos() == -1) {
            System.out.println("corrida 9 minutos = " + test.get9Minutos());
        } else {
            System.out.println("corrida 6 minutos = " + test.get6Minutos());
        }
        System.out.println("salto Horizontal = " + test.getSaltoHorizontal());
        System.out.println("arremesso medicine ball = " + test.getArremessoMedicineBall() + "cm");
        System.out.println("teste do quadrado = " + test.getTesteDoQuadrado());
        System.out.println("corrida de 20 metros = " + test.getCorrida20Metros());
        this.setAvaliacoes(test);

        return true;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(Avaliacao avaliacao) {
        this.avaliacoes.add(avaliacao);
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return super.getNome();
    }

    public Avaliacao getLastAvaliation() {
        if (avaliacoes.size() > 0) {
            return avaliacoes.get(avaliacoes.size() - 1);
        } else {
            return null;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.nomeDaMae);
        hash = 13 * hash + Objects.hashCode(this.nomeDoPai);
        hash = 13 * hash + Objects.hashCode(this.getNome());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.nomeDaMae, other.nomeDaMae)) {
            return false;
        }
        if (!Objects.equals(this.nomeDoPai, other.nomeDoPai)) {
            return false;
        }
        if (!Objects.equals(this.getNome(), other.getNome())) {
            return false;
        }
        return true;
    }
}
