public class Filme implements Comparable<Filme> {
    private String nome;
    private int ano;
    private int nota;

    public Filme(String nome, int ano, int nota) {
        this.nome = nome;
        this.ano = ano;
        this.nota = nota;
    }

    @Override
    public int compareTo(Filme filme) {
      if (this.nota != filme.nota) {
        return Integer.compare(filme.nota, this.nota);
      } else if (this.ano != filme.ano) {
        return Integer.compare(this.ano, filme.ano);
      } else {
        return this.nome.compareTo(filme.nome);
      }
    }

    public int getAno() {
      return ano;
    }

    public String getNome() {
      return nome;
    }

    public int getNota() {
      return nota;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + 
               " Ano: " + ano + 
               " Nota: " + nota;
    }
}
