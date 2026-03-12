public enum TipoCliente {
    COMUM(0.05),
    VIP(0.10),
    FUNCIONARIO(0.20);

    private final double desconto;

    TipoCliente(double desconto) {
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }
}