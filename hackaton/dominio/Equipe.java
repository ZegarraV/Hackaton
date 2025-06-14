package dominio;

import java.util.ArrayList;
import java.util.List;
import pessoas.Estudante;

public class Equipe {
    private String nome;
    private List<Estudante> membros = new ArrayList<>();

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void adicionarMembro(Estudante e) {
        membros.add(e);
    }

    public String getNome() {
        return nome;
    }

    public List<Estudante> getMembros() {
        return membros;
    }
}
