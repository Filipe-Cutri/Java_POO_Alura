package Aula01.Ex_03;

public class Musica {
    // titulo, artista, anoLancamento, avaliacao e numAvaliacoes
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numeroAvaliacoes;

    // métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
    void exibirFichaTecnica() {
        System.out.println("Título da música: " + titulo);
        System.out.println("Nome do artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avaliarMusica(double nota) {
        avaliacao += nota;
        numeroAvaliacoes++;
    }

    public double calcularMedia() {
        return avaliacao / numeroAvaliacoes;
    }
}
