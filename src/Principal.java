import filmora.calculos.CalculadoraDeTempo;
import filmora.modelos.Filme;
import filmora.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Média das avaliações: " + meuFilme.retornarMedia());

        System.out.println();

        Serie serie = new Serie();
        serie.setNome("Breaking Bad");
        serie.setAnoDeLancamento(2012);
        serie.setIncluidoNoPlano(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(25);
        serie.setMinutosPorEpisodios(50);
        serie.exibeFichaTecnica();
        System.out.println("Quantidade em minutos para maratonar Breaking Bad: " + serie.getDuracaoEmMinutos() + " minutos");

        Filme outroFilme = new Filme();
        outroFilme.setNome("Top Gun");
        outroFilme.setAnoDeLancamento(2022);
        outroFilme.setDuracaoEmMinutos(150);
        outroFilme.setIncluidoNoPlano(true);

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(outroFilme);
        calculadoraDeTempo.inclui(serie);
        System.out.println(calculadoraDeTempo.getTempoTotal());
    }
}
