public class Ordenacao {
    public void mergeSort(Filme[] filmes) {
        if (filmes.length == 1) {
            return;
        } else {
            int meio = filmes.length / 2;
            Filme[] filmesEsquerda = new Filme[meio];
            Filme[] filmesDireita = new Filme[filmes.length - meio];
            Filme[] result = new Filme[filmes.length];

            for (int i = 0; i < meio; i++) {
                filmesEsquerda[i] = filmes[i];
            }

            for (int i = meio; i < filmes.length; i++) {
                filmesDireita[i - meio] = filmes[i];
            }

            mergeSort(filmesEsquerda);
            mergeSort(filmesDireita);

            result = mergeSortAux(filmesEsquerda, filmesDireita);

            for (int i = 0; i < filmes.length; i++) {
                filmes[i] = result[i];
            }
        }
    }

    private Filme[] mergeSortAux(Filme[] filmesEsquerda, Filme[] filmesDireita) {
        int iEsquerda = 0, iDireita = 0, iResult = 0;
        Filme[] result = new Filme[filmesEsquerda.length + filmesDireita.length];

        while (iEsquerda < filmesEsquerda.length && iDireita < filmesDireita.length) {
            if (filmesEsquerda[iEsquerda].compareTo(filmesDireita[iDireita]) <= 0) {
                result[iResult] = filmesEsquerda[iEsquerda];
                iEsquerda++;
            } else {
                result[iResult] = filmesDireita[iDireita];
                iDireita++;
            }

            iResult++;
        }

        if (iEsquerda < filmesEsquerda.length) {
            for (int i = iEsquerda; i < filmesEsquerda.length; i++) {
                result[iResult] = filmesEsquerda[iEsquerda];
                iResult++;
            }
        }

        if (iDireita < filmesDireita.length) {
            for (int i = iDireita; i < filmesDireita.length; i++) {
                result[iResult] = filmesDireita[iDireita];
                iResult++;
            }
        }

        return result;
    }
}
