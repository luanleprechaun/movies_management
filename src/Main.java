
public class Main {
    public static void main(String[] args) {
        Ordenacao sort = new Ordenacao();
        Filme[] filmes = new FilmeAux().gerarFilmes(10);
        System.out.println();

        for (Filme filme : filmes) {
            System.out.println(filme.toString());
        }

        System.out.println();
        // sort.insertionSort(filmes);
        // sort.mergeSort(filmes);
        // sort.mergeSort(filmes);
        sort.countingSort(filmes);

        for (Filme filme : filmes) {
            System.out.println(filme.toString());
        }
    }
}