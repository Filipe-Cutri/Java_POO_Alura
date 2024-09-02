package Aula02.Ex_03;

public class Produto {
    private String nome;
    private double preco;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double aplicarDesconto(double percentual){
        percentual = (preco * percentual) / 100;
        return preco -= percentual;
    }
}
