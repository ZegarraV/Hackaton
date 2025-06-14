package pessoas;

public abstract class Pessoa {
    protected String nome;
    protected String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String obterNome() {
        return nome;
    }

    public String obterEmail() {
        return email;
    }
}