import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Piramide piramide = new Piramide();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o Tamanho: ");
        int tamanho = input.nextInt();
        piramide.desenhar(tamanho);
    }
}