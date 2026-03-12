package refatoracao_de_funcoes.Codigo02;

public class Main {
    public static void main(String[] args) {
        EstatisticasTime timeA = new EstatisticasTime("Time A", 2, 55, 10, 15, 3, 1);
        EstatisticasTime timeB = new EstatisticasTime("Time B", 1, 45,  8, 12, 2, 0);

        Partida partida = new Partida(timeA, timeB);

        GerenciadorPartida gerenciador = new GerenciadorPartida();
        gerenciador.registrarPartida(partida);
        gerenciador.gerarRelatorio(partida);
    }
}

