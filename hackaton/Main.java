import dominio.*;
import pessoas.*;
import colecoes.*;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       // equipe 1
        Equipe equipe1 = new Equipe("Equipe Alpha");
        for (int i = 1; i <= 5; i++) {
            equipe1.adicionarMembro(new Estudante("Estudante A" + i, "a" + i + "@email.com", "matA" + i));
        }

        Projeto projeto1 = new Projeto("Sistema Solar", "Simulador 3D do sistema solar", equipe1);
        Banca banca1 = new Banca();
        projeto1.setBanca(banca1);
        for (int i = 1; i <= 4; i++) {
            Jurado j = new Jurado("Jurado X" + i, "jx" + i + "@email.com", "regX" + i, "TI");
            j.avaliarProjeto(projeto1, 6 + i); // notas 7,8,9,10
        }

        Equipes.getInstancia().adicionar(equipe1);

        // Equipe 2
        Equipe equipe2 = new Equipe("Equipe Beta");
        for (int i = 1; i <= 5; i++) {
            equipe2.adicionarMembro(new Estudante("Estudante B" + i, "b" + i + "@email.com", "matB" + i));
        }

        Projeto projeto2 = new Projeto("App Saúde", "Aplicativo de monitoramento de saúde", equipe2);
        Banca banca2 = new Banca();
        projeto2.setBanca(banca2);
        for (int i = 1; i <= 4; i++) {
            Jurado j = new Jurado("Jurado Y" + i, "jy" + i + "@email.com", "regY" + i, "Saúde");
            j.avaliarProjeto(projeto2, 5 + i); // notas 6,7,8,9
        }

        Equipes.getInstancia().adicionar(equipe2);

    
        Apresentacoes.getInstancia().adicionar(new Apresentacao(projeto1, new Sala("Sala 101")));
        Apresentacoes.getInstancia().adicionar(new Apresentacao(projeto2, new Sala("Sala 102")));

        
        System.out.println("Projetos aprovados:");
        Apresentacoes.getInstancia().getApresentacoes().stream()
            .filter(a -> a.getProjeto().calcularNotaFinal() >= 7)
            .forEach(a -> System.out.println(a.getProjeto().getTitulo() + " - Nota Final: " + a.getProjeto().calcularNotaFinal()));
    }
}
