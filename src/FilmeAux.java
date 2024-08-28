import java.util.Random;

public class FilmeAux {
    private final char[] consoantes = {
        'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 
        'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'
    };

    private final char[] vogais = {'a', 'e', 'i', 'o', 'u'};

    private Random random = new Random();

    public Filme[] gerarFilmes(int quant) {
        Filme[] filmes = new Filme[quant];

        for (int i = 0; i < quant; i++) {
            filmes[i] = this.gerarFilme();
        }

        return filmes;
    }

    private Filme gerarFilme() {
        String nome = this.gerarNome();
        int ano = this.gerarAno();
        int nota = this.gerarNota();

        return new Filme(nome, ano, nota);
    }

    private int gerarNota() {
        return this.random.nextInt(6);
    }

    private int gerarAno() {
        return 1990 + this.random.nextInt(2025 - 1990);
    }

    private String gerarNome() {
        String nome = "";

        nome += this.getConsoante();
        nome += this.getVogal();
        nome += this.getConsoante();
        nome += this.getVogal();

        return nome;
    }

    private char getConsoante() {
        int indexRandom = this.random.nextInt(consoantes.length);

        return consoantes[indexRandom];
    }

    private char getVogal() {
        int indexRandom = this.random.nextInt(vogais.length);

        return vogais[indexRandom];
    }
}
