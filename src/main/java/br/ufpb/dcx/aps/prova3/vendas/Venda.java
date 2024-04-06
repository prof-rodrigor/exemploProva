package br.ufpb.dcx.aps.prova3.vendas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private LocalDateTime data;
    private List<Produto> produtos;

    public Venda() {
        this.data = LocalDateTime.now();
        this.produtos = new ArrayList<>();
    }

    public boolean adicionarProduto(Produto produto, int quantidade) {
        if (produto.retirarEstoque(quantidade)) {
            this.produtos.add(produto);
            return true;
        }
        return false; // não foi possível adicionar o produto devido à falta de estoque
    }


}
