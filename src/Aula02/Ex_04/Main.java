package Aula02.Ex_04;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Aluno oAluno1 = new Aluno("Filipe", 8, 7.5, 9);
        Aluno oAluno2 = new Aluno("Charles", 8, 9, 6);

        System.out.println("Aluno: " + oAluno1.getNome());
        System.out.println("Nota 1: " + oAluno1.getNota1());
        System.out.println("Nota 2: " + oAluno1.getNota2());
        System.out.println("Nota 3: " + oAluno1.getNota3());
        System.out.println("Media = " + oAluno1.calcularMedia());

        System.out.println();

        System.out.println("Aluno: " + oAluno2.getNome());
        System.out.println("Nota 1: " + oAluno2.getNota1());
        System.out.println("Nota 2: " + oAluno2.getNota2());
        System.out.println("Nota 3: " + oAluno2.getNota3());
        System.out.println("Media = " + oAluno2.calcularMedia());
    }
}
