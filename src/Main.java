public class Main {
    public static void main(String[] args) throws Exception {
        Ordenacao sort = new Ordenacao();
        Busca busca = new Busca();
        Filme[] filmes = new FilmeAux().gerarFilmes(10);
        long tempo;

        System.out.println("\n     ANTES DA ORDENACAO:");
        for (Filme filme : filmes) {
            System.out.println(filme.toString());
        }

        System.out.println();
        tempo = System.nanoTime();

        sort.insertionSort(filmes);
        // sort.mergeSort(filmes);
        // sort.quickSort(filmes);
        // sort.quickSortRandom(filmes);
        // sort.countingSort(filmes);

        System.out.println("Tempo de execucao (SORT): " + (System.nanoTime() - tempo) / 1000000000.0);
            
        System.out.println("\n     APOS A ORDENACAO:");
        for (Filme filme : filmes) {
            System.out.println(filme.toString());
                
        }
            
        System.out.print("\nVetor ordenado? ");
        System.out.println(busca.checaVetorOrdenado(filmes));

        System.out.print("\nFilmes buscado -> ");
        try {
            tempo = System.nanoTime();

            System.out.println(busca.buscaLinear_iterativa(filmes, 4));
            // System.out.println(busca.buscaLinear_recursiva(filmes, 4));
            // System.out.println(busca.buscaBinaria_iterativa(filmes, 4));
            // System.out.println(busca.buscaBinaria_recursiva(filmes, 4));
            // System.out.println(busca.buscaLinear_iterativa_duasPontas(filmes, 4));

            System.out.println();
            System.out.println("Tempo de execucao (BUSCA): " + (System.nanoTime() - tempo) / 1000000000.0);
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}