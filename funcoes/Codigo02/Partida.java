package refatoracao_de_funcoes.Codigo02;

public class Partida {
    private final EstatisticasTime casa;
    private final EstatisticasTime visitante;

    public Partida(EstatisticasTime casa, EstatisticasTime visitante) {
        this.casa = casa;
        this.visitante = visitante;
    }

    public EstatisticasTime getCasa() { return casa; }
    public EstatisticasTime getVisitante() { return visitante; }

    public String determinarVencedor() {
        if (casa.getGols() > visitante.getGols()) return casa.getNome();
        if (casa.getGols() < visitante.getGols()) return visitante.getNome();
        return "Empate";
    }
}

