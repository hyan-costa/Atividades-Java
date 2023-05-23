//Obtenha a informação de 5 pessoas;
//        Crie um classe chamada Funcionário com os seguintes atributos (nome, idade, sexo, horas trabalhadas e valor da hora);
//        Crie um ARQUIVO e salve cada objeto funcionário;
//        Após salvar o arquivo, chame um método para mostrar os seguintes dados:
//        - o nome do funcionário do sexo masculino que tem maior idade.
//        - os dados do funcionário que ganha maior salário.
//        -a porcentagem de funcionários entre 18 a 35 anos.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcinario> list = new ArrayList<>();
        Funcinario func1 = new Funcinario("Caio", 50, "M", 8, 90);
        list.add(func1);
        Funcinario func2 = new Funcinario("Joao", 20, "M", 4, 200);
        list.add(func2);
        Funcinario func3 = new Funcinario("Fulano", 40, "M", 5, 90);
        list.add(func3);
        Funcinario func4 = new Funcinario("Luane", 25, "F", 12, 200);
        list.add(func4);
        Funcinario func5 = new Funcinario("Janaina", 22, "F", 6, 60);
        list.add(func5);

        FileIOFuncionario fileIOFuncionario = new FileIOFuncionario(list,"arqObj.byte");
        fileIOFuncionario.writeFile();
        fileIOFuncionario.getDataFile();



    }
}