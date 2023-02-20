public class Matriz {
 String matriz[][];

    void desenhar(int num){
     matriz = new String[num][num];

     for(int i = 0; i<num; i++){
         for(int j = 0; j<num; j++){
             float dado = (float) num;
             float meio = (float) ((dado / 2) - 0.5);
             int inicio = 0;
             int fim = num - 1;

             if (inicio == j || inicio == i || fim == i || fim == j || (int)meio == i || (int)meio == j){
                 matriz[i][j] = "*";
             }
             else {
                 matriz[i][j] = " ";
             }


         }
     }
     for (int i = 0; i<num; i++){
         String retorno = "";
         for (int j = 0; j<num; j++){
             retorno += String.valueOf(matriz[i][j]) + "\t";

         }
         System.out.println(retorno);
     }

    }
}
