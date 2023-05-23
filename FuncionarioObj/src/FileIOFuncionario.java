import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FileIOFuncionario {
    private List<Funcinario> funcinarios;
    private String path;

    public FileIOFuncionario(List<Funcinario> funcinarios, String path) {
        this.funcinarios = funcinarios;
        this.path = path;
    }
    public FileIOFuncionario() {
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    public List<Funcinario> getFuncinarios() {
        return funcinarios;
    }
    public void setFuncinarios(List<Funcinario> funcinarios) {
        this.funcinarios = funcinarios;
    }



    public  void writeFile(){
        try {
            ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream(path));

            for (Funcinario funcinario : funcinarios){
                object.writeObject(funcinario);
            }
            object.close();
            System.out.println("Objetos Gravados!");
        } catch (IOException e) {
            System.out.println("Erro ao tentar gravar arquivo: " + e);
        }
    }

    public void getDataFile(){
        try {
            ObjectInputStream object = new ObjectInputStream(new FileInputStream(path));
            Funcinario funcMaiorSalario = new Funcinario();
            int counter = 0;
            int idade  = 0;
            String MaisVelho = "";
            for (Funcinario funcinario : funcinarios) {
                funcinario = (Funcinario) object.readObject();
                if (funcinario.getIdade() > idade && Objects.equals(funcinario.getSexo(), "M")) {
                    idade = funcinario.getIdade();
                    MaisVelho = funcinario.getNome();
                }
                if (funcinario.getSalario() > funcMaiorSalario.getSalario())
                    funcMaiorSalario = funcinario;
                if(funcinario.getIdade() >= 18 && funcinario.getIdade() <= 35)
                    counter++;

            }

            System.out.println("Homem Mais velho: " + MaisVelho);
            System.out.println("Maior Salario: " + funcMaiorSalario.toString());
            System.out.println("Porcentagem de funcionarios entre 18 e 35: " + (
                    (counter * 100) / funcinarios.size()
                    ));

        } catch (IOException e) {
            System.out.println("erro ao tentar ler o arquivo:" + e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
