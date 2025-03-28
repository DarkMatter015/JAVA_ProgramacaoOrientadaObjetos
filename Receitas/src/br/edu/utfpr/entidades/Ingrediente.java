package br.edu.utfpr.entidades;

public class Ingrediente {
    private String nome;
    private String quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\n" + "- " + this.nome + ": " + this.quantidade + "unidades";
    }
}
