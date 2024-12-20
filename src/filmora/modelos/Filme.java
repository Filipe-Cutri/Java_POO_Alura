package filmora.modelos;

import filmora.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    public Filme (String nome) {
        this.setNome(nome);
    }
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int)retornarMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
