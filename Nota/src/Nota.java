import java.util.Scanner;
public class Nota {
    int item;
    String descricao;
    int qtdeItem;
    double preco;

    void inicializar(){
        Scanner input = new Scanner(System.in);

        System.out.println("Numero do item:");
        this.item = input.nextInt();
        System.out.println("Descricao do item:");
        this.descricao = input.next();
        System.out.println("Quantidade comprada do item:");
        this.qtdeItem = input.nextInt();
        System.out.println("preco unitario:");
        this.preco = input.nextDouble();
    }

    double obterValorNota(){
        double result = this.qtdeItem * this.preco;
        return result;
    }
}
