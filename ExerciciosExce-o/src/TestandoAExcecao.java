public class TestandoAExcecao {
    public void metodoX() throws CriandoExcecao {
        throw new CriandoExcecao();
    }

    public void metodoY() throws CriandoExcecao {
        TestandoAExcecao testandoAExcecao = new TestandoAExcecao();
        testandoAExcecao.metodoX();
    }

    public static void main(String[] args) {
        try {
            TestandoAExcecao testandoAExcecao = new TestandoAExcecao();
            testandoAExcecao.metodoY();
        } catch (CriandoExcecao e) {
            System.out.println("Exceção tratada: " + e.getMessage());
        }
    }
}
