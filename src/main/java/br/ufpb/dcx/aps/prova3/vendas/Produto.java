package br.ufpb.dcx.aps.prova3.vendas;

public class Produto {
    private String nome;
    private String codigo;
    private double preco;
    private int estoque;

    public Produto(String nome, String codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.estoque = 0; // estoque inicial 0
    }


    public void adicionarEstoque(int quantidade) {
        this.estoque += quantidade;
    }

    public boolean retirarEstoque(int quantidade) {
        if (this.estoque >= quantidade) {
            this.estoque -= quantidade;
            return true;
        }
        return false; // não há estoque suficiente
    }

    public int getEstoque() {
        return estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}

