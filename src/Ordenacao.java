public class Ordenacao {
    public void insertionSort(Filme[] filmes){
        for (int j = 1; j < filmes.length; j++) {
            Filme aux = filmes[j];
            int i = j - 1;
            
            while ( i >= 0 && filmes[i].compareTo(aux) > 0) {
                filmes[i + 1] = filmes[i];
                i--;
            }
            filmes[i + 1] = aux;
        }
    }  

    public void mergeSort(Filme[] filmes){
        mergeSortAux(filmes, 0, filmes.length - 1);
    }

    public void mergeSortAux(Filme[] filmes, int ini, int fim){
        if (ini < fim) {
            int meio = ini + ((fim - ini)/2);

            mergeSortAux(filmes, ini, meio);
            mergeSortAux(filmes, meio + 1, fim);
            merge(filmes, ini, meio, fim);

        }
    }

    public void merge(Filme[] filmes, int ini, int meio, int fim){
        int tamEsq = meio - ini + 1;
        int tamDir = fim - meio;

        Filme[] vetEsq = new Filme[tamEsq];
        Filme[] vetDir = new Filme[tamDir];

        for (int i = 0; i < tamEsq; i++) {
            vetEsq[i] = filmes[ini + i];
        }
        
        for (int j = 0; j < tamDir; j++) {
            vetDir[j] = filmes[meio + 1 + j];
        }

        int e = 0, d = 0, k = ini;

        while (e < tamEsq && d < tamDir) {
            if (vetEsq[e].compareTo(vetDir[d]) <= 0) {
                filmes[k] = vetEsq[e];
                e++;
            }else{
                filmes[k] = vetDir[d];
                d++;
            }
            k++;
        }

        while (e < tamEsq) {
            filmes[k] = vetEsq[e];
            e++;
            k++;
        }

        while (d < tamDir) {
            filmes[k] = vetDir[d];
            d++;
            k++;
        }
    }


    public void quickSort(Filme[] filmes) {
        this.quickSortAux(filmes, 0, filmes.length - 1);
    }

    private void quickSortAux(Filme[] filmes, int ini, int fim) {
        if (ini < fim) {
            int pivo = this.quickSortPartition(filmes, ini, fim);

            quickSortAux(filmes, ini, pivo - 1);
            quickSortAux(filmes, pivo + 1, fim);
        }
    }

    private int quickSortPartition(Filme[] filmes, int ini, int fim) {
        Filme pivo = filmes[fim];
        int i = ini - 1;

        for (int j = ini; j < fim; j++) {
            if (filmes[j].compareTo(pivo) <= 0) {
                i++;

                this.quickSortSwap(filmes, i, j);
            }
        }

        this.quickSortSwap(filmes, i + 1, fim);

        return i + 1;
    }

    private void quickSortSwap(Filme[] filmes, int i, int j) {
        Filme temp = filmes[i];
        filmes[i] = filmes[j];
        filmes[j] = temp;
    }

    public void countingSort(Filme[] filmes){
        int k = 6;
        int tam = filmes.length;

        int[] C = new int[k];
        Filme[] B = new Filme[tam];

        for(int i = 0; i < tam; i++){
            C[filmes[i].getNota()]++;
        }

        for(int i = 1; i < k; i++){
            C[i] = C[i] + C[i-1];
        }

        for(int i = tam - 1; i >= 0; i--){
            B[C[filmes[i].getNota()] - 1] = filmes[i];
            C[filmes[i].getNota()]--;
        }
        System.out.println();
        for (int i = 0; i< tam; i++) {
            System.out.println(B[i].toString());
        }
        System.out.println();
        for (int i = 0; i< tam; i++) {
            filmes[i] = B[tam - 1 - i];
        }

    }
}
