package dominio;

import java.util.HashMap;
import java.util.Map;
import pessoas.Jurado;

public class Banca {
    private Map<Jurado, Integer> notas = new HashMap<>();

    public void adicionarNota(Jurado jurado, int nota) {
        notas.put(jurado, nota);
    }

    public double calcularMediaNotas() {
        return notas.values().stream().mapToInt(Integer::intValue).average().orElse(0);
    }
}
