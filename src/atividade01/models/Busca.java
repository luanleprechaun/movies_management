package atividade01.models;

import atividade01.interfaces.Busca_IF;

public class Busca implements Busca_IF {
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
    public Filme buscaLinear_iterativa(Filme[] filmes, int nota) throws Exception {
        if (nota < 0)  {
            throw new Exception("Nota negativa, digite uma nota valida.");
        }

        for (Filme filme : filmes){
            if (filme.getNota() == nota){
                return filme;
            }
        }

        return null;
    }

    @Override
    public Filme buscaLinear_recursiva(Filme[] filmes, int nota) throws Exception {
        if (nota < 0)  {
            throw new Exception("Nota negativa, digite uma nota valida.");
        } 

        return buscaLinear_recursivaAux(filmes, 0, nota);
    }

    private Filme buscaLinear_recursivaAux(Filme[] filmes, int contador, int nota){
        if (contador >= filmes.length) {
            return null;
        }

        if (filmes[contador].getNota() == nota) {
            return filmes[contador];
        }

        return buscaLinear_recursivaAux(filmes, contador+1, nota);
    }

    @Override
    public Filme buscaBinaria_iterativa(Filme[] filmes, int nota) throws Exception {
        if (nota < 0)  {
            throw new Exception("Nota negativa, digite uma nota valida.");
        } 

        int ini = 0, fim = filmes.length - 1;
        
        while (ini < fim) {
            int meio = (ini + fim) / 2;

            if (nota == filmes[meio].getNota()) {
                return filmes[meio];
            }

            if (nota < filmes[meio].getNota()) {
                ini = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return null;
    }

    @Override
    public Filme buscaBinaria_recursiva(Filme[] filmes, int nota) throws Exception {
        if (nota < 0)  {
            throw new Exception("Nota negativa, digite uma nota valida.");
        } 
        return buscaBinaria_recursivaAux(filmes, 0, filmes.length, nota);
    }

    private Filme buscaBinaria_recursivaAux(Filme[] filmes, int ini, int fim, int nota) {
        int meio = (ini + fim) / 2;

        if (nota == filmes[meio].getNota()) {
            return filmes[meio];
        }
        if (ini == fim) {
            return null;
        }
        if (nota < filmes[meio].getNota()) {
            return buscaBinaria_recursivaAux(filmes, meio + 1, fim, nota);
        }

        if (nota > filmes[meio].getNota()) {
            return buscaBinaria_recursivaAux(filmes, ini, meio, nota);
        }

        return null;   
    }

    @Override
    public Filme buscaLinear_iterativa_duasPontas(Filme[] filmes, int nota) throws Exception {
        if (nota < 0)  {
            throw new Exception("Nota negativa, digite uma nota valida.");
        }

        for (int i = 0, j = filmes.length - 1; i <= j; i++, j--) {
            if (filmes[i].getNota() == nota) {
                return filmes[i];
            }

            if (filmes[j].getNota() == nota) {
                return filmes[j];
            }
        }

        return null;
    }
}
