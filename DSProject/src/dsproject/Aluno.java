package dsproject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public final class Aluno implements Serializable {

    static int cont = 0;
    private int num_dir;
    private String dir;
    private String nome;
    private Date nascimento;
    private String genero;
    private String endereco;
    private String cidade;
    private String nomeMae;
    private String nomePai;
    private String telefone;
    private String celular;
    private String email;
    private Turma turma;
    private ArrayList<Avaliacao> avaliacoes;

    public Aluno(String nome, Turma turma, Date nascimento, String genero, String endereco, String cidade,
            String nomeMae, String nomePai, String telefone, String celular, String email) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.genero = genero;
        this.endereco = endereco;
        this.cidade = cidade;
        this.setNomeDaMae(nomeMae);
        this.setNomeDoPai(nomePai);
        this.setTelefone(telefone);
        this.setCelular(celular);
        this.setEmail(email);
        this.turma = turma;
        this.avaliacoes = new ArrayList<>();
        num_dir = cont;
        cont ++;
        
        Avaliacao avaliacao = new Avaliacao();
        this.addAvaliacao(avaliacao);
    }

    public boolean inserirAvaliacao() {        
        Avaliacao avaliacao = new Avaliacao();
        this.addAvaliacao(avaliacao);
        return true;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataDeNascimento() {
        return nascimento;
    }

    public void setDataDeNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }
    
    public Date getBirthday(){
        return this.nascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getNomeDaMae() {
        return nomeMae;
    }

    public String getNomeDoPai() {
        return nomePai;
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
        this.nomeMae = nomeDaMae;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomePai = nomeDoPai;
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
        return this.nome;
    }

    public Avaliacao getLastAvaliation() {
        if (avaliacoes.size() > 0) {
            return avaliacoes.get(avaliacoes.size() - 1);
        } else {
            return null;
        }
    }

    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.nomeMae);
        hash = 13 * hash + Objects.hashCode(this.nomePai);
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
        if (!Objects.equals(this.nomeMae, other.nomeMae)) {
            return false;
        }
        if (!Objects.equals(this.nomePai, other.nomePai)) {
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
