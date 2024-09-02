package Aula02.Ex_01;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(911);
        conta.setSaldo(1918);
        conta.titular = "Filipe";

        System.out.println("Seja bem vindo: " + conta.titular);
        System.out.println("O seu saldo é de R$: " + conta.getSaldo());
        System.out.println("Com o número conta: " + conta.getNumeroConta());
    }
}

