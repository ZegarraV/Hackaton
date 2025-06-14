package dominio;

public class Apresentacao {
    private Projeto projeto;
    private Sala sala;

    public Apresentacao(Projeto projeto, Sala sala) {
        this.projeto = projeto;
        this.sala = sala;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public Sala getSala() {
        return sala;
    }
}
