public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Laptop", 1500.00);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(produto1);

        Produto produto2 = new Produto("Smartphone", 1200.00);
        carrinho.adicionarProdutoAoCarrinho(produto2);

        carrinho.finalizarCompra();
        carrinho.mostrarDetalhes();
    }
}