package colecoes;

import java.util.ArrayList;
import java.util.List;
import dominio.Equipe;

public class Equipes {
    private static Equipes instancia;
    private List<Equipe> equipes = new ArrayList<>();

    private Equipes() {}

    public static Equipes getInstancia() {
        if (instancia == null) instancia = new Equipes();
        return instancia;
    }

    public void adicionar(Equipe equipe) {
        equipes.add(equipe);
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }
}
