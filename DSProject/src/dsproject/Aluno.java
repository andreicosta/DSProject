package dsproject;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import javax.swing.JOptionPane;

public final class Aluno extends Pessoa implements Serializable {

    static int cont = 0;
    private int num_dir;
    private String dir;
    private String nomeDaMae;
    private String nomeDoPai;
    private String telefone;
    private String celular;
    private String email;
    private Turma turma;
    private ArrayList<Avaliacao> avaliacoes;
    

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
        num_dir = cont;
        cont ++;
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
//         String s[] = this.getDir().split("/");
//        Turma t = Escola.getInstance().getProfessorLogado().getTurmaPorDir(Integer.parseInt(s[4]));
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
    
        public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes){
        this.avaliacoes = avaliacoes;
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

    public int getNumDir(){
        return this.num_dir;
    }
    
    public void setDir(String dir){
        this.dir = dir;
    }
    
    public String getDir(){
        return this.dir;
    }
    
     public static int getCont(){
        return cont;
    }
    
    public static void setCont(int n){
        cont = n;
    }

}
