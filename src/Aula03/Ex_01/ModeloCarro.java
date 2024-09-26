package Aula03.Ex_01;

public class ModeloCarro extends Carro {
    private int qtdPortas;
    private int cavalos;
    private double consumoUrbano;
    private double consumoRodoviario;

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    public void setConsumoUrbano(double consumoUrbano) {
        this.consumoUrbano = consumoUrbano;
    }

    public void setConsumoRodoviario(double consumoRodoviario) {
        this.consumoRodoviario = consumoRodoviario;
    }

    public void exibirInformacoesDoModelo() {
        System.out.println("Esse carro tem: " + qtdPortas + " portas");
        System.out.println("Esse carro tem " + cavalos + " cavalos de potência");
        System.out.println("Esse carro faz: " + consumoUrbano + " Km/l na cidade");
        System.out.println("Esse carro faz: " + consumoRodoviario + " Km/l na estrada");
    }
}
