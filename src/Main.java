
public class Main {
    public static void main(String[] args) throws Exception {
        Ordenacao sort = new Ordenacao();
        Busca busca = new Busca();
        Filme[] filmes = new FilmeAux().gerarFilmes(10);
        // Filme[] filmes = {new Filme("Filme 2 /", 2234, 2), new Filme("Filme 2 //", 2234, 2), new Filme("Filme 1", 2234, 1), new Filme("Filme 3 /", 2234, 3), new Filme("Filme 5", 2234, 5), new Filme("Filme 3 //", 2234, 3)};
        System.out.println();

        
        for (Filme filme : filmes) {
                System.out.println(filme.toString());
            }
        System.out.println(busca.checaVetorOrdenado(filmes));
            
            System.out.println();
            System.out.println(busca.checaVetorOrdenado(filmes));
            // sort.insertionSort(filmes);
            // sort.mergeSort(filmes);
            // sort.quickSort(filmes);
            sort.quickSortRandom(filmes);
            // sort.countingSort(filmes);

            System.out.println(busca.checaVetorOrdenado(filmes));

            // System.out.println(busca.buscaLinear_iterativa(filmes, 4));
            // System.out.println(busca.buscaLinear_recursiva(filmes, 4));
            // System.out.println(busca.buscaBinaria_iterativa(filmes, 4));
            // System.out.println(busca.buscaBinaria_recursiva(filmes, 4));
            System.out.println(busca.buscaLinear_iterativa_duasPontas(filmes, 1));

            System.out.println();
        for (Filme filme : filmes) {
            System.out.println(filme.toString());
        }
        System.out.println(busca.checaVetorOrdenado(filmes));
    }
}