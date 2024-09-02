package Aula01.Ex_03;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.artista = "Hilsong";
        musica.titulo = "Uncomplicated";
        musica.anoLancamento = 2018;

        musica.exibirFichaTecnica();

        musica.avaliarMusica(9);
        musica.avaliarMusica(8);
        musica.avaliarMusica(9);

        double mediaDasAvaliacoes = musica.calcularMedia();
        System.out.println("Média das avaliações: " + mediaDasAvaliacoes);
    }
}
