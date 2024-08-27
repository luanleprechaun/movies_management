public class Filme {
    private String nome;
    private int ano;
    private float nota;

    public Filme(String nome, int ano, float nota) {
        this.nome = nome;
        this.ano = ano;
        this.nota = nota;
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
        return nome + ", " + ano + ", " + nota;
    }
}
