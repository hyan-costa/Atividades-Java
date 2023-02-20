public class Piramide {
    private int tamanho;

    String vector[][];

    void desenhar(int line){
        this.tamanho = line;

        vector = new String[this.tamanho][this.tamanho];
        for (int x = 0; x < this.tamanho; x++){

            for (int y = 0; y < this.tamanho; y++){
                if(x >= y)
                    vector[x][y] = "*";
            }
        }
        for (int x = 0; x < this.tamanho; x++){
            String saida = "";
            for (int y = 0; y < this.tamanho; y++){
                if(vector[x][y] == null){
                    vector[x][y] = " ";

                }
                saida += vector[x][y];

            }
            System.out.println(saida);
        }


    }


}
