package dsproject;

import java.io.Serializable;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;
import java.util.regex.Pattern;

public class Aluno implements Serializable {

    static int cont = 0;
    private int num_dir;
    private String dir;
    private String nome;
    private Calendar nascimento;
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

    public Aluno(String nome, Turma turma, Calendar nascimento, String genero, String endereco, String cidade,
            String nomeMae, String nomePai, String telefone, String celular, String email) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.genero = genero;
        this.endereco = endereco;
        this.cidade = cidade;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.turma = turma;
        this.avaliacoes = new ArrayList<>();
        num_dir = cont;
        cont ++;
        
        Avaliacao avaliacao = new Avaliacao();
        this.addAvaliacao(avaliacao);
    }

    public static void parse(String nome, Calendar nascimento, String endereco, String cidade,
            String nomeMae, String nomePai) throws Exception {
        
        Pattern p = Pattern.compile("([a-z]+\\s)+[a-z]*");

        if(nome != null && !p.matcher(Aluno.removeAccents(nome.toLowerCase())).matches()){
            throw new Exception("Erro no nome do Aluno");
        }
        
        if(!p.matcher(Aluno.removeAccents(nomeMae.toLowerCase())).matches()){
            throw new Exception("Erro no nome da Mãe do Aluno");
        }
        
        if(!p.matcher(Aluno.removeAccents(nomePai.toLowerCase())).matches()){
            throw new Exception("Erro no nome do Pai do Aluno");
        }        
    }
    
    private static String removeAccents(String str) {

        str = Normalizer.normalize(str, Normalizer.Form.NFD);

        str = str.replaceAll("[^\\p{ASCII}]", "");

        return str;

    }

    
    public boolean inserirAvaliacao() {        
        Avaliacao avaliacao = new Avaliacao();
        this.addAvaliacao(avaliacao);
        return true;
    }

    public String getNome() {
        return nome;
    }

    public Calendar getDataDeNascimento() {
        return nascimento;
    }

    public void setDataDeNascimento(Calendar nascimento) {
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
    
    public Calendar getBirthday(){
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
        hash = 13 * hash + Objects.hashCode(this.nome);
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
        if (!Objects.equals(this.nome, other.nome)) {
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
