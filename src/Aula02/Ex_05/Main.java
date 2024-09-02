package Aula02.Ex_05;

public class Main {
    public static void main(String[] args) {
        Livro oLivro = new Livro();

        oLivro.setAutor("Walter Isaacson");
        oLivro.setTitulo("Steve Jobs");

        System.out.println("Informações desse livro");
        oLivro.ExibirDetalhes();
    }
}
