package entidades;

public class Curso {
    private int idcurso;
    private String nome;
    private String formarealizacao;
    private int vagas;
    private double valor;
    private int site;
    private String ofertante;
    private String situacao;

    public Curso() {
    }

    ;

    public Curso(int idcurso, String nome, String formarealizacao, int vagas, double valor, int site, String ofertante, String situacao) {
        this.idcurso = idcurso;
        this.nome = nome;
        this.formarealizacao = formarealizacao;
        this.vagas = vagas;
        this.valor = valor;
        this.site = site;
        this.ofertante = ofertante;
        this.situacao = situacao;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormarealizacao() {
        return formarealizacao;
    }

    public void setFormarealizacao(String formarealizacao) {
        this.formarealizacao = formarealizacao;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getSite() {
        return site;
    }

    public void setSite(int site) {
        this.site = site;
    }

    public String getOfertante() {
        return ofertante;
    }

    public void setOfertante(String ofertante) {
        this.ofertante = ofertante;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "idcurso=" + idcurso +
                ", nome='" + nome + '\'' +
                ", formarealizacao='" + formarealizacao + '\'' +
                ", vagas=" + vagas +
                ", valor=" + valor +
                ", site=" + site +
                ", ofertante='" + ofertante + '\'' +
                ", situacao='" + situacao + '\'' +
                '}';
    }
}
