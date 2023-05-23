import java.io.Serializable;

public class Funcinario  implements Serializable {

    private String nome;
    private int idade;
    private String sexo;
    private int horasTrabalhada;
    private double valorHora;
    private static final long serialVersionUID = 1l;

    public Funcinario(String nome, int idade, String sexo, int horasTrabalhada, double valorHora) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.horasTrabalhada = horasTrabalhada;
        this.valorHora = valorHora;
    }
    public Funcinario() {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getHorasTrabalhada() {
        return horasTrabalhada;
    }

    public void setHorasTrabalhada(int horasTrabalhada) {
        this.horasTrabalhada = horasTrabalhada;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSalario(){
        return horasTrabalhada * valorHora;
    }

    @Override
    public String toString() {
        return "Funcinario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", horasTrabalhada=" + horasTrabalhada +
                ", valorHora=" + valorHora +
                '}';
    }
}
