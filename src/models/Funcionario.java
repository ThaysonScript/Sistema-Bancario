package models;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cpf, String endereco, String telefone, String cargo, double salario) {
        super(nome, cpf, endereco, telefone);
        setCargo(cargo);
        setSalario(salario);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
