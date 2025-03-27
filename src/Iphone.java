public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{
    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public void ligar(int numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada");
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }
}