package Aula03.Ex_03;

public class ContaCorrente extends ContaBancaria {
    protected double valorTarifa;

    public void cobrarTarifaMensal(double valorTarifa) {
        saldo -= valorTarifa;
        System.out.println("Tarifa mensal de " + valorTarifa + " cobrada. Saldo atual: " + saldo);
    }
}
