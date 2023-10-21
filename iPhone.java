interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica();
}

interface AparelhoTelefonico {
    void ligar();
    void atender();
    void iniciarCorreioVoz();
}

interface NavegadorInternet {
    void exibirPagina();
    void adicionarNovaAba();
    void atualizarPagina();
}

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada.");
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("iPhone ligado.");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina() {
        System.out.println("Página exibida.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        iphone.ligar();
        iphone.tocar();
        iphone.exibirPagina();
        iphone.pausar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.selecionarMusica();
    }
}
