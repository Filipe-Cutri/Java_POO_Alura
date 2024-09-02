package Aula02.Ex_02;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificaIdade() {
        if (idade >= 18) {
            System.out.println("Você já atingiu a maioridae");
        } else
            System.out.println("Você ainda não atingiu a maioridade");
    }
}
