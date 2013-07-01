package dsproject;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import javax.swing.JOptionPane;

public final class Aluno extends Pessoa implements Serializable {

    private String nomeDaMae;
    private String nomeDoPai;
    private String telefone;
    private String celular;
    private String email;
    private Turma turma;
    private ArrayList<Avaliacao> avaliacoes;
    
    static int cont = 0;
    private String dir;

    public Aluno(String nome, Turma turma, Date nascimento, String genero, String endereco, String cidade,
            String nomeMae, String nomePai, String telefone, String celular, String email) {
        super(nome, nascimento, genero, endereco, cidade, "");
        this.setNomeDaMae(nomeDaMae);
        this.setNomeDoPai(nomeDoPai);
        this.setTelefone(telefone);
        this.setCelular(celular);
        this.setEmail(email);
        this.turma = turma;
        this.avaliacoes = new ArrayList<>();
        this.dir = "alunos/" + cont;
        cont++;
    }

    public boolean inserirAvaliacao(java.sql.Date dataDaAvaliacao, String horaDaAvaliacao, String temperatura) {
      Avaliacao avaliacao = new Avaliacao();
      if (avaliacao.isSalvar()){
        this.addAvaliacao(avaliacao);
      }
        return true;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }
    
    public Date getBirthday(){
        return super.getDataDeNascimento();
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

    public void addAvaliacao(Avaliacao avaliacao) {
        this.avaliacoes.add(avaliacao);
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEmail(String email) {
        this.email = email;
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
