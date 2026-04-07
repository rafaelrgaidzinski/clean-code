public class Produto {
    private final String nome;
    private final double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto comDesconto(double desconto) {
        return new Produto(this.nome, this.preco - desconto);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}