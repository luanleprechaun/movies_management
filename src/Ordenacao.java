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

    public void mergeSort(Filme[] filmes) {
        if (filmes.length == 1) {
            return;
        } else {
            int meio = filmes.length / 2;
            Filme[] filmesEsquerda = new Filme[meio];
            Filme[] filmesDireita = new Filme[filmes.length - meio];

            for (int i = 0; i < meio; i++) {
                filmesEsquerda[i] = filmes[i];
            }

            for (int i = meio; i < filmes.length; i++) {
                filmesDireita[i - meio] = filmes[i];
            }

            mergeSort(filmesEsquerda);
            mergeSort(filmesDireita);

            mergeSortAux(filmes, filmesEsquerda, filmesDireita);
        }
    }

    private void mergeSortAux(Filme[] filmes, Filme[] filmesEsquerda, Filme[] filmesDireita) {
        int iEsquerda = 0, iDireita = 0, iResult = 0;

        while (iEsquerda < filmesEsquerda.length && iDireita < filmesDireita.length) {
            if (filmesEsquerda[iEsquerda].compareTo(filmesDireita[iDireita]) <= 0) {
                filmes[iResult] = filmesEsquerda[iEsquerda];
                iEsquerda++;
            } else {
                filmes[iResult] = filmesDireita[iDireita];
                iDireita++;
            }

            iResult++;
        }

        while (iEsquerda < filmesEsquerda.length) {
            filmes[iResult] = filmesEsquerda[iEsquerda];

            iEsquerda++;
            iResult++;
        }

        while (iDireita < filmesDireita.length) {
            filmes[iResult] = filmesDireita[iDireita];

            iDireita++;
            iResult++;
        }
    }

    public void quickSort(Filme[] filmes) {}

    private void quickSortAux(Filme[] filmes, int ini, int fim) {
        if (ini < fim) {
            int pivo = partition(filmes, ini, fim);

            quickSortAux(filmes, ini, pivo - 1);
            quickSortAux(filmes, pivo + 1, fim);
        }
    }

    private int partition(Filme[] filmes, int ini, int fim) {
        return 1;
    }
}
