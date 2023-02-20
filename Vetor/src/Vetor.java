import java.util.Random;
public class Vetor {
    private int valor;
    int vector[][];

    void criar(int tamanho){
        this.valor = tamanho;
        Random gerador = new Random();
        vector = new int[this.valor][this.valor];

        for(int i = 0; i<this.valor; i++){
            for (int j = 0; j<this.valor; j++){

                // OBS: coloquei limite de 99 para ficar mais fácil a leitura da matiz
                vector[i][j] = gerador.nextInt(99);
            }
        }

        for (int i = 0; i<this.valor; i++){
            String retorno = "";
            for (int j = 0; j<this.valor; j++){
                retorno += String.valueOf(vector[i][j]) + "\t";

            }
            System.out.println(retorno);
        }
    }

    void inverter(){
        for (int i = (this.valor - 1); i>=0; i--){
            for (int j = (this.valor - 1); j>=0; j--){

                System.out.print(vector[i][j] + "\t");

            }
            System.out.print("\n");
        }
    }

    void ordenar(){
        for (int i = 0; i < this.valor; i++){
            for (int j = 0; j < this.valor; j++) {

                for (int p = 0; p < this.valor; p++) {
                    for (int k = 0; k < this.valor; k++) {

                        if (vector[i][j] < vector[p][k]){
                            int aux = vector[i][j];
                            vector[i][j] = vector[p][k];
                            vector[p][k] = aux;
                        }
                    }
                }
            }
        }
        for (int i = 0; i<this.valor; i++){
            String retorno = "";
            for (int j = 0; j<this.valor; j++){
                retorno += String.valueOf(vector[i][j]) + "\t";
            }
            System.out.println(retorno);
        }

    }
}

