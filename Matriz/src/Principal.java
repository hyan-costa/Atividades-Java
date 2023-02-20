public class Principal {
    public static void main(String[] args) {
        Auxilia auxilia = new Auxilia();
        Matriz  matriz = new Matriz();
        int entrada;

        entrada = auxilia.obterNumero();
        matriz.desenhar(entrada);

    }
}