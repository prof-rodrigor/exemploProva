package br.ufpb.dcx.aps.prova3;

import br.ufpb.dcx.aps.prova3.vendas.Loja;
import br.ufpb.dcx.aps.prova3.vendas.Produto;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class LojaTest {
    private Loja loja;
    private Produto produto;
    private Fornecedor fornecedor;

    @BeforeEach
    void setUp() {
        loja = new Loja();
        produto = new Produto("Produto Teste", "123", 10.0);
        fornecedor = new Fornecedor("Fornecedor Teste", "456", "789");
    }

    @Test
    void adicionarProduto() {
        loja.adicionarProduto(produto);
        assertEquals(1, loja.getProdutos().size());
        assertTrue(loja.getProdutos().contains(produto));
    }

    @Test
    void adicionarFornecedor() {
        loja.adicionarFornecedor(fornecedor);
        assertEquals(1, loja.getFornecedores().size());
        assertTrue(loja.getFornecedores().contains(fornecedor));
    }

    @Test
    void venderProdutoComEstoque() {
        produto.adicionarEstoque(5);
        loja.adicionarProduto(produto);
        assertTrue(loja.venderProduto(produto, 3));
        assertEquals(2, produto.getEstoque());
    }

    @Test
    void venderProdutoSemEstoque() {
        produto.adicionarEstoque(1);
        loja.adicionarProduto(produto);
        assertFalse(loja.venderProduto(produto, 3));
        assertEquals(1, produto.getEstoque());
    }
}
