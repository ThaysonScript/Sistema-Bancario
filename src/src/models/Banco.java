package models;

import java.util.List;

public class Banco {
    private int id;
    private String nome;
    private List<Agencia> agencias;

//    construtor
    public Banco(String nome) {
        setNome(nome);
    }

//    metodos
    public void adicionarAgencia(Agencia agencia) {

    }

    public void removerAgencia(Agencia agencia) {

    }

    public void adicionarBanco(String nome) {
        setNome(nome);
    }

    public void removerBanco(String nome) {
        if (getNome() == nome) {
            setNome(null);
        }
    }

//    getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(List<Agencia> agencias) {
        this.agencias = agencias;
    }
}
