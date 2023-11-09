package models;

import java.util.List;

public class Agencia {
    private int id;
    private String numero;
    private String endereco;
    private List<Funcionario> gerentes;
    private List<Funcionario> funcionarios;
    private List<Conta> contas;
    private List<Conta> clientes;

    Agencia(String numero, String endereco, List<Funcionario> gerentes, List<Funcionario> funcionarios) {
        setNumero(numero);
        setEndereco(endereco);
        setGerentes(gerentes);
        setFuncionarios(funcionarios);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Funcionario> getGerentes() {
        return gerentes;
    }

    public void setGerentes(List<Funcionario> gerentes) {
        this.gerentes = gerentes;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Conta> getClientes() {
        return clientes;
    }

    public void setClientes(List<Conta> clientes) {
        this.clientes = clientes;
    }
}
