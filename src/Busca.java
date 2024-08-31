public class Busca implements Busca_IF {

    @Override
    public boolean checaVetorOrdenado(Filme[] filmes) {
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
            }else{
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
        return buscaBinaria_recursivaAux(filmes, 0, filmes.length-1, nota);
    }


    private Filme buscaBinaria_recursivaAux(Filme[] filmes, int ini, int fim, int nota) {
        int meio = (ini + fim) / 2;

        if (nota == filmes[meio].getNota()) {
            return filmes[meio];
        }
        if (ini == fim){
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
        throw new Exception("Not supported yet.");
    }
    
}
