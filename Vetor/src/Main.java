public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();

        System.out.println("\nMatriz:");
        vetor.criar(6);
        System.out.println("\nMatriz Invertida:");
        vetor.inverter();
        System.out.println("\nMatriz Ordenada:");
        vetor.ordenar();
    }
}