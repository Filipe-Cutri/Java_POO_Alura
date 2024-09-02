package Aula02.Ex_02;

public class Main {
    public static void main(String[] args) {
        IdadePessoa oPessoa1 = new IdadePessoa();
        oPessoa1.setNome("Filipe");
        oPessoa1.setIdade(21);

        IdadePessoa oPessoa2 = new IdadePessoa();
        oPessoa2.setNome("Rebeca");
        oPessoa2.setIdade(2);

        System.out.println(oPessoa1.getNome() + " tem " + oPessoa1.getIdade() + " anos de vida");
        oPessoa1.verificaIdade();



        System.out.println(oPessoa2.getNome() + " tem " + oPessoa2.getIdade() + " anos de vida");
        oPessoa2.verificaIdade();
    }
}
