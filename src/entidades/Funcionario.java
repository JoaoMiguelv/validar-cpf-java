package entidades;

public class Funcionario {

    private double salario;
    private String matricula;

    public Funcionario(double salario, String matricula) {
        this.setSalario(salario);
        this.setMatricula(matricula);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "\"funcionario\": { \"salario\": " + getSalario() + ", \"matricula\": \"" + getMatricula() + "\" }";
    }

}