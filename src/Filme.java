public class Filme implements Filme_IF {
  private String nome;
  private int ano;
  private int nota;
  
  public Filme(String nome, int ano, int nota) {
      this.nome = nome;
      this.ano = ano;
      this.nota = nota;
  }
  
    @Override
    public int compareTo(Filme_IF outro_filme) {
      if (this.nota != outro_filme.getNota()) {
        return Integer.compare(outro_filme.getNota(), this.nota);
      } else if (this.ano != outro_filme.getAno()) {
        return Integer.compare(this.ano, outro_filme.getAno());
      } else {
        return this.nome.compareTo(outro_filme.getNome());
      }
    }

    @Override
    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }    

    @Override
    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public int getAno() {
        return ano;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
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
