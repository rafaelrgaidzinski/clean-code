public class PedidoFormatter {
    public void exibirResumo(Pedido pedido) {
        System.out.println("Tipo de Cliente: " + pedido.getTipoCliente());
        System.out.printf("Valor Original:   R$%.2f%n", pedido.getValorTotal());
        System.out.printf("Valor com Desconto: R$%.2f%n", pedido.calcularTotal());
    }
}