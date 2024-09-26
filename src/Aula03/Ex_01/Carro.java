package Aula03.Ex_01;

public class Carro {
    private String nomeModelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void definirModelo(String modelo) {
        this.nomeModelo = modelo;
    }

    public void definirPreco(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    private double calcularMaiorPreco() {
        double maiorPreco = precoAno1;

        if (precoAno2 > maiorPreco) {
            maiorPreco = precoAno2;
        }

        if (precoAno3 > maiorPreco) {
            maiorPreco = precoAno3;
        }

        return maiorPreco;
    }

    private double calcularMenorPreco() {
        double menorPreco = precoAno1;

        if (precoAno2 < menorPreco) {
            menorPreco = precoAno2;
        }

        if (precoAno3 < menorPreco) {
            menorPreco = precoAno3;
        }

        return menorPreco;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + nomeModelo);
        System.out.println("Preco no primeiro ano R$ " + precoAno1 + " reais");
        System.out.println("Preco no segundo ano R$ " + precoAno2 + " reais");
        System.out.println("Preco no terceiro ano R$ " + precoAno3 + " reais");
        System.out.println("Maior valor foi: " + calcularMaiorPreco());
        System.out.println("Menor valor foi: " + calcularMenorPreco());
    }
}

