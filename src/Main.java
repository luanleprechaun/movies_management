
public class Main {
    public static void main(String[] args) {
        Ordenacao sort = new Ordenacao();
        Filme[] filmes = new FilmeAux().gerarFilmes(100);
        System.out.println();

        for (Filme filme : filmes) {
            System.out.println(filme.toString());
        }

        System.out.println();
        sort.insertionSort(filmes);
        // sort.mergeSort(filmes);

        for (Filme filme : filmes) {
            System.out.println(filme.toString());
        }
    }
}