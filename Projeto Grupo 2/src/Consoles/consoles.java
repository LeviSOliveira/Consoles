public abstract class Console {
    private String nome;
    private boolean ligado;

    public Console(String nome) {
        this.nome = nome;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println(nome + " ligado!");
    }

    public void desligar() {
        ligado = false;
        System.out.println(nome + " desligado!");
    }

    public String getNome() {
        return nome;
    }

    public boolean isLigado() {
        return ligado;
    }

    // Método abstrato para rodar aplicativos (Polimorfismo)
    public abstract void rodarAplicativo(String aplicativo);
}