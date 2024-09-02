package Aula02.Ex_05;

public class Livro {
    public String titulo;
    public String autor;


    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void ExibirDetalhes(){
        System.out.println("O título do livro é: " + titulo);
        System.out.println("O nome do autor é: " + autor);
    }
}
