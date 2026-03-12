
public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(100.0, TipoCliente.VIP);
        new PedidoFormatter().exibirResumo(pedido);
    }
}