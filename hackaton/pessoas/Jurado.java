package pessoas;

import dominio.Projeto;

public class Jurado extends Profissional {
    private String especialidade;

    public Jurado(String nome, String email, String registro, String especialidade) {
        super(nome, email, registro);
        this.especialidade = especialidade;
    }

    public void avaliarProjeto(Projeto projeto, int nota) {
        projeto.getBanca().adicionarNota(this, nota);
    }
}
