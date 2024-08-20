package Ex_04;

public class Carro {
    String modelo;
    int anoModelo;
    String cor;


    void exibirFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano do modelo: " + anoModelo);
        System.out.println("Cor do carro: " + cor);
    }

    public int calcularIdadeCarro() {
        return 2024 - anoModelo;
    }
}
