public class Xbox extends Console {
    public Xbox(String nome) {
        super(nome);
    }

    @Override
    public void rodarAplicativo(String aplicativo) {
        if (isLigado()) {
            System.out.println(getNome() + " rodando " + aplicativo);
        } else {
            System.out.println(getNome() + " está desligado!");
        }
    }
}