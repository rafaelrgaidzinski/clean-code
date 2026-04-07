public class Jogo {
    private int vidaJogador;
    private int vidaInimigo;

    public Jogo(int vidaJogador, int vidaInimigo) {
        this.vidaJogador = vidaJogador;
        this.vidaInimigo = vidaInimigo;
    }

    public void atacarJogador(int dano) {
        vidaJogador = aplicarDano(vidaJogador, dano, "Jogador");
    }

    public void atacarInimigo(int dano) {
        vidaInimigo = aplicarDano(vidaInimigo, dano, "Inimigo");
    }

    private int aplicarDano(int vidaAtual, int dano, String nome) {
        vidaAtual -= dano;

        if (vidaAtual <= 0) {
            System.out.println(nome + " perdeu!");
        } else {
            System.out.println("Vida do " + nome + ": " + vidaAtual);
        }

        return vidaAtual;
    }

    public int getVidaJogador() {
        return vidaJogador;
    }

    public int getVidaInimigo() {
        return vidaInimigo;
    }
}