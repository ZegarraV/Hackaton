package pessoas;

public class Profissional extends Pessoa {
    protected String registroProfissional;

    public Profissional(String nome, String email, String registro) {
        super(nome, email);
        this.registroProfissional = registro;
    }

    public String obterRegistro() {
        return registroProfissional;
    }
}
