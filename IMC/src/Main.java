import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IMC pessoa01 = new IMC();

        System.out.print("\n-----------------Calculo de IMC-----------------\n");

        System.out.print("Digite Seu Nome: ");
        pessoa01.nome = input.next();

        System.out.print("Digite Seu Peso: ");
        pessoa01.peso = input.nextFloat();

        System.out.print("Digite Sua Altura: ");
        pessoa01.altura = input.nextFloat();

        pessoa01.calcula();
    }
}