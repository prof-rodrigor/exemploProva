package br.ufpb.dcx.aps.prova3.vendas;

import java.util.*;

public class Loja {
    private List<Produto> produtos;

    private List<Venda> vendas;

    public Loja() {
        this.produtos = new ArrayList<>();
        this.vendas = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }


    public void registrarVenda(Venda venda) {
        this.vendas.add(venda);
    }

    public boolean venderProduto(Produto produto, int quantidade) {
        Venda venda = new Venda();
        if (venda.adicionarProduto(produto, quantidade)) {
            registrarVenda(venda);
            return true;
        }
        return false;
    }


    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }


    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }
}

