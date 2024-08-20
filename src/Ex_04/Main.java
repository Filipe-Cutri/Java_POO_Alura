package Ex_04;

public class Main {
    public static void main(String[] args) {
        Carro oCarro = new Carro();

        oCarro.modelo = "Voyage";
        oCarro.anoModelo = 2019;
        oCarro.cor = "Branco";

        oCarro.exibirFichaTecnica();

        System.out.println("A idade do seu carro é: " + oCarro.calcularIdadeCarro() + " anos");

    }
}
