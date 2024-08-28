public class Filme implements Comparable<Filme> {
    private String nome;
    private int ano;
    private float nota;

    public Filme(String nome, int ano, float nota) {
        this.nome = nome;
        this.ano = ano;
        this.nota = nota;
    }

    @Override
    public int compareTo(Filme filme) {
      if (this.nota != filme.nota) {
        return Float.compare(filme.nota, this.nota);
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

    public float getNota() {
      return nota;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + 
               " Ano: " + ano + 
               " Nota: " + nota;
    }
}
