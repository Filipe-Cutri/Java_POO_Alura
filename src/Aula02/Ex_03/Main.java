package Aula02.Ex_03;

public class Main {
    public static void main(String[] args) {
        Produto oProduto = new Produto();

        oProduto.setNome("Sorvete Nestle");
        oProduto.setPreco(25.0);

        System.out.println("O produto: " + oProduto.getNome() + " tinha o preço de " + oProduto.getPreco());
        System.out.println("Esse produto com o desconto de 15% irá custa R$: " + oProduto.aplicarDesconto(15));
    }
}
