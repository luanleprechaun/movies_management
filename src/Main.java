
public class Main {
    public static void main(String[] args) {
        Ordenacao sort = new Ordenacao();
        Filme[] filmes = new FilmeAux().gerarFilmes(10);
        // Filme[] filmes = {new Filme("Filme 2 /", 2234, 2), new Filme("Filme 2 //", 2234, 2), new Filme("Filme 1", 2234, 1), new Filme("Filme 3 /", 2234, 3), new Filme("Filme 5", 2234, 5), new Filme("Filme 3 //", 2234, 3)};
        System.out.println();

        for (Filme filme : filmes) {
            System.out.println(filme.toString());
        }

        System.out.println();
        // sort.insertionSort(filmes);
        sort.mergeSort(filmes);
        // sort.mergeSort(filmes);
        // sort.countingSort(filmes);

        for (Filme filme : filmes) {
            System.out.println(filme.toString());
        }
    }
}