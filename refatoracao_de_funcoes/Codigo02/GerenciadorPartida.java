package refatoracao_de_funcoes.Codigo02;

public class GerenciadorPartida {

    public void registrarPartida(Partida partida) {
        EstatisticasTime casa = partida.getCasa();
        EstatisticasTime visitante = partida.getVisitante();

        System.out.println("Partida Registrada:");
        System.out.println(casa.getNome() + " " + casa.getGols() + " x " + visitante.getGols() + " " + visitante.getNome());
        System.out.println("Posse de Bola: " + casa.getPosseBola() + "% - " + visitante.getPosseBola() + "%");
        System.out.println("Chutes: " + casa.getChutes() + " - " + visitante.getChutes());
        System.out.println("Faltas: " + casa.getFaltas() + " - " + visitante.getFaltas());
        System.out.println("Cartões Amarelos: " + casa.getCartoesAmarelos() + " - " + visitante.getCartoesAmarelos());
        System.out.println("Cartões Vermelhos: " + casa.getCartoesVermelhos() + " - " + visitante.getCartoesVermelhos());
    }

    public void gerarRelatorio(Partida partida) {
        EstatisticasTime casa = partida.getCasa();
        EstatisticasTime visitante = partida.getVisitante();

        System.out.println("=== Relatório da Partida ===");
        System.out.println("Vencedor: " + partida.determinarVencedor());
        System.out.println("Posse de Bola: " + casa.getPosseBola() + "% - " + visitante.getPosseBola() + "%");
        System.out.println("Total de Chutes: " + (casa.getChutes() + visitante.getChutes()));
        System.out.println("Total de Faltas: " + (casa.getFaltas() + visitante.getFaltas()));
        System.out.println("Total de Cartões: " + (casa.getCartoesAmarelos() + visitante.getCartoesAmarelos()
                                                  + casa.getCartoesVermelhos() + visitante.getCartoesVermelhos()));
    }
}
