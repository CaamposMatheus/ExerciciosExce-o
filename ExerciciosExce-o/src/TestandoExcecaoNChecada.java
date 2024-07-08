public class TestandoExcecaoNChecada {
    public void metodoX() {
        throw new CriandoExcecaoNaoChecada();
    }

    public void metodoY() {
        metodoX();
    }

    public static void main(String[] args) {
        TestandoExcecaoNChecada testando = new TestandoExcecaoNChecada();
        testando.metodoY();
    }
}
