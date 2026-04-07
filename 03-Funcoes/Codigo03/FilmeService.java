public class FilmeService {

    public void listarApenasDisponiveis() {
        System.out.println("Listando apenas filmes disponíveis para locação...");
    }

    public void listarTodos() {
        System.out.println("Listando todos os filmes do catálogo...");
    }

    public void marcarComoDisponivel(String titulo) {
        System.out.println("O filme \"" + titulo + "\" agora está disponível para locação.");
    }

    public void marcarComoIndisponivel(String titulo) {
        System.out.println("O filme \"" + titulo + "\" foi marcado como indisponível.");
    }

    public static void main(String[] args) {
        FilmeService service = new FilmeService();

        service.listarApenasDisponiveis();
        service.listarTodos();

        service.marcarComoDisponivel("Inception");
        service.marcarComoIndisponivel("Matrix");
    }
}