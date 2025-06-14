package colecoes;

import java.util.ArrayList;
import java.util.List;
import dominio.Apresentacao;

public class Apresentacoes {
    private static Apresentacoes instancia;
    private List<Apresentacao> apresentacoes = new ArrayList<>();

    private Apresentacoes() {}

    public static Apresentacoes getInstancia() {
        if (instancia == null) instancia = new Apresentacoes();
        return instancia;
    }

    public void adicionar(Apresentacao ap) {
        apresentacoes.add(ap);
    }

    public List<Apresentacao> getApresentacoes() {
        return apresentacoes;
    }
}