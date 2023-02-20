import java.util.Scanner;
public class IMC {

    // CONSTS com valores iniciais das classificacoes
    private static float MAGREZA = 18.5f;           // abaixo de 18.5f
    private static float PESO_NORMAL = 18.6f;       // entre de 18.6f e 24,9f
    private static float SOBREPESO = 25f;           // entre 25 e 29,9f
    private static float OBSGRAU_I = 30f;           // entre 30 e 34,9f
    private static float OBSGRAU_II = 35f;          // entre 35 e 39,9f
    private static float OBSGRAU_III = 40f;         // acima de 40f
    private float imc;
    float altura;
    float peso;
    String nome;


    void calcula(){


        this.imc = ((this.peso / (this.altura * this.altura)));

        if( this.imc < MAGREZA){
            System.out.printf("Nome: " + this.nome + "\nIMC: %.1f \nClassificacao: MAGREZA\n", this.imc);

        } else if (this.imc >= PESO_NORMAL && this.imc < SOBREPESO) {
            //System.out.print("Nome: " + this.nome);
            System.out.printf("Nome: " + this.nome + "\nIMC: %.1f \nClassificacao: PESO NORMAL\n",this.imc);

        } else if (this.imc >= SOBREPESO && this.imc < OBSGRAU_I) {
            System.out.printf("Nome: " + this.nome + "\nIMC: %.1f \nClassificacao: SOBREPESO\n", this.imc);

        } else if (this.imc >= OBSGRAU_I && this.imc < OBSGRAU_II) {
            System.out.printf("Nome: " + this.nome + "\nIMC: %.1f \nClassificacao: OBESIDADE DE GRAU I\n", this.imc);

        } else if (this.imc >= OBSGRAU_II && this.imc < OBSGRAU_III) {
            System.out.printf("Nome: " + this.nome + "\nIMC: %.1f \nClassificacao: OBESIDADE DE GRAU II\n", this.imc);

        } else if (this.imc >= OBSGRAU_III) {
            System.out.printf("Nome: " + this.nome + "\nIMC: %.1f \nClassificacao: OBESIDADE DE GRAU III\n", this.imc);
        }
    }

}
