import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Filme[] filmes = new FilmeAux().gerarFilmes(10);
        System.out.println();

        for (Filme filme : filmes) {
            System.out.println(filme.toString());
        }

        System.out.println();
        Arrays.sort(filmes);

        for (Filme filme : filmes) {
            System.out.println(filme.toString());
        }
    }
}