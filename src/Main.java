
public class Main {
    public static void main(String[] args) throws Exception {
        Ordenacao sort = new Ordenacao();
        Busca busca = new Busca();
        // Gerador de filmes aleatórios, modifique a quantidade de filmes que deseja no método.
        Filme[] filmes = new FilmeAux().gerarFilmes(10);

        // Abaixo um vetor estático criado para testes de estabilidade:

        // Filme[] filmes = {new Filme("Filme 2 /", 2234, 2), new Filme("Filme 2 //", 2234, 2), new Filme("Filme 1", 2234, 1), new Filme("Filme 3 /", 2234, 3), new Filme("Filme 5", 2234, 5), new Filme("Filme 3 //", 2234, 3)};
        
        System.out.println("\n     ANTES DA ORDENACAO:");
        for (Filme filme : filmes) {
            System.out.println(filme.toString());
        }

        System.out.println();
        sort.insertionSort(filmes);
        // sort.mergeSort(filmes);
        // sort.quickSort(filmes);
        // sort.quickSortRandom(filmes);
        // sort.countingSort(filmes);

            
        System.out.println("\n     APOS A ORDENACAO:");
        for (Filme filme : filmes) {
            System.out.println(filme.toString());
                
        }
            
        System.out.print("\nVetor ordenado? ");
        System.out.println(busca.checaVetorOrdenado(filmes));

        System.out.print("\nFilmes buscado -> ");
        try {
            System.out.println(busca.buscaLinear_iterativa(filmes, 4));
            // System.out.println(busca.buscaLinear_recursiva(filmes, 4));
            // System.out.println(busca.buscaBinaria_iterativa(filmes, 4));
            // System.out.println(busca.buscaBinaria_recursiva(filmes, 4));
            // System.out.println(busca.buscaLinear_iterativa_duasPontas(filmes, 4));
            System.out.println();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
            
    }
}