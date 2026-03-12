package refatoracao_de_funcoes.Codigo02;

public class EstatisticasTime {
    private final String nome;
    private final int gols;
    private final int posseBola;
    private final int chutes;
    private final int faltas;
    private final int cartoesAmarelos;
    private final int cartoesVermelhos;

    public EstatisticasTime(String nome, int gols, int posseBola, int chutes,
                            int faltas, int cartoesAmarelos, int cartoesVermelhos) {
        this.nome = nome;
        this.gols = gols;
        this.posseBola = posseBola;
        this.chutes = chutes;
        this.faltas = faltas;
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartoesVermelhos = cartoesVermelhos;
    }

    // Getters
    public String getNome() { return nome; }
    public int getGols() { return gols; }
    public int getPosseBola() { return posseBola; }
    public int getChutes() { return chutes; }
    public int getFaltas() { return faltas; }
    public int getCartoesAmarelos() { return cartoesAmarelos; }
    public int getCartoesVermelhos() { return cartoesVermelhos; }
}

