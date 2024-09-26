package Aula03.Ex_01;

public class Main {
    public static void main(String[] args) {
        ModeloCarro oModelo = new ModeloCarro();

        oModelo.definirModelo("Sedan");
        oModelo.definirPreco(30000, 35000, 40000);
        oModelo.setQtdPortas(4);
        oModelo.setCavalos(120);
        oModelo.setConsumoUrbano(7.0);
        oModelo.setConsumoRodoviario(14.5);
        oModelo.exibirInformacoes();
        oModelo.exibirInformacoesDoModelo();
    }
}
