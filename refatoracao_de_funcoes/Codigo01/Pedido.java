public class Pedido {
    private final double valorTotal;
    private final TipoCliente tipoCliente;

    public Pedido(double valorTotal, TipoCliente tipoCliente) {
        this.valorTotal = valorTotal;
        this.tipoCliente = tipoCliente;
    }

    public double calcularTotal() {
        return valorTotal * (1 - tipoCliente.getDesconto());
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }
}
    

