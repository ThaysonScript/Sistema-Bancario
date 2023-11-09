package models;

import java.util.ArrayList;

public class Agencia {
    private int id;
    private String numero;
    private String endereco;
    private ArrayList<Funcionario> gerentes;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Conta> contas;
    private ArrayList<Conta> clientes;

    Agencia(String numero, String endereco, ArrayList<Funcionario> gerentes, ArrayList<Funcionario> funcionarios) {
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

    public ArrayList<Funcionario> getGerentes() {
        return gerentes;
    }

    public void setGerentes(ArrayList<Funcionario> gerentes) {
        this.gerentes = gerentes;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public ArrayList<Conta> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Conta> clientes) {
        this.clientes = clientes;
    }
}
