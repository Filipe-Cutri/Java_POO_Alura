import filmora.calculos.CalculadoraDeTempo;
import filmora.calculos.FiltroRecomendacao;
import filmora.modelos.Episodio;
import filmora.modelos.Filme;
import filmora.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.retornarMedia());

        Serie serie = new Serie();
        serie.setNome("Breaking Bad");
        serie.setAnoDeLancamento(2012);
        serie.setIncluidoNoPlano(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(25);
        serie.setMinutosPorEpisodios(50);
        serie.exibeFichaTecnica();
        System.out.println("Quantidade em minutos para maratonar Breaking Bad: " + serie.getDuracaoEmMinutos() + " minutos");

        Filme outroFilme = new Filme("Top Gun");
        outroFilme.setAnoDeLancamento(2022);
        outroFilme.setDuracaoEmMinutos(150);
        outroFilme.setIncluidoNoPlano(true);

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(outroFilme);
        calculadoraDeTempo.inclui(serie);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista de filmes: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
    }
}
