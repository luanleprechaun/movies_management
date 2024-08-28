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

}
