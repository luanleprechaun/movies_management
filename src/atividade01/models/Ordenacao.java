package atividade01.models;

import java.util.Random;

import atividade01.interfaces.Ordenacao_IF;

public class Ordenacao implements Ordenacao_IF {
    @Override
    public boolean checaVetorOrdenado(Filme[] filmes) {
        for (int i = 0, j = i + 1; j < filmes.length; i++, j++) {
            if (filmes[i].compareTo(filmes[j]) > 0) {
                return false;
            }
        }

        return true;
    }

    @Override
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

    @Override
    public void mergeSort(Filme[] filmes){
        mergeSortAux(filmes, 0, filmes.length - 1);
    }

    private  void mergeSortAux(Filme[] filmes, int ini, int fim){
        if (ini < fim) {
            int meio = ini + ((fim - ini)/2);

            mergeSortAux(filmes, ini, meio);
            mergeSortAux(filmes, meio + 1, fim);
            merge(filmes, ini, meio, fim);

        }
    }

    private void merge(Filme[] filmes, int ini, int meio, int fim){
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

    @Override
    public void quickSortRandom(Filme[] filmes) {
        this.quickSortRandomAux(filmes, 0, filmes.length - 1);
    }

    private void quickSortRandomAux(Filme[] filmes, int ini, int fim) {
        if (ini < fim) {
            int pivoRandom = new Random().nextInt(fim - ini) + 1 + ini;
            this.quickSortSwap(filmes, ini, pivoRandom);

            int pivo = this.quickSortPartition(filmes, ini, fim);

            quickSortRandomAux(filmes, ini, pivo - 1);
            quickSortRandomAux(filmes, pivo + 1, fim);
        }
    }

    @Override
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
        Filme pivo = filmes[ini];
        int i = ini + 1;

        for (int j = i; j <= fim; j++) {
            if (filmes[j].compareTo(pivo) <= 0) {
                this.quickSortSwap(filmes, i, j);

                i++;
            }
        }

        this.quickSortSwap(filmes, ini, i - 1);

        return i - 1;
    }

    private void quickSortSwap(Filme[] filmes, int i, int j) {
        Filme temp = filmes[i];
        filmes[i] = filmes[j];
        filmes[j] = temp;
    }

    @Override
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

        for (int i = 0; i< tam; i++) {
            filmes[i] = B[tam - 1 - i];
        }

    }
}
