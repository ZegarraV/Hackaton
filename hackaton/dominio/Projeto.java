package dominio;

public class Projeto implements Avaliavel {
    private String titulo;
    private String descricao;
    private Equipe equipe;
    private Banca banca;

    public Projeto(String titulo, String descricao, Equipe equipe) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.equipe = equipe;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setBanca(Banca banca) {
        this.banca = banca;
    }

    public Banca getBanca() {
        return banca;
    }

    @Override
    public double calcularNotaFinal() {
        return banca.calcularMediaNotas();
    }
}
