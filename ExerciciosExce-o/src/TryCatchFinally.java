public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Executando o bloco try...");
            // Lançando uma exceção
            throw new RuntimeException("Exemplo de exceção sendo lançada");
            // Esta linha não será executada devido à exceção lançada acima
            // System.out.println("Esta linha não será executada");
        } catch (RuntimeException e) {
            System.out.println("Capturando a exceção no bloco catch: " + e.getMessage());
        } finally {
            System.out.println("Executando o bloco finally...");
        }

        System.out.println("Continuando após o bloco try-catch-finally...");
    }
}
