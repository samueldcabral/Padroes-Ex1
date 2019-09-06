package main.java.model;

import main.java.model.Cliente;
import main.java.model.Funcionario;
import main.java.model.Jogo;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private List<Jogo> jogos = new ArrayList();
    private int tempo;
    private List<Cliente> clientes = new ArrayList();
    private Cliente cliente;
    private Funcionario funcionario;

    public Compra() { }

    public Compra(Funcionario funcionario, int tempo) {
        this.funcionario = funcionario;
        this.tempo = tempo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public void addJogo(Jogo jogo) {
        this.jogos.add(jogo);
    }

    public void setJogos(List<Jogo> jogos) {
        this.jogos = jogos;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    //// Methods
    public float calcularCompra() {
        if(tempo == 0) return 0;

        float total = 0;
        for(Jogo jogo  : jogos){
            total += ( (jogo.calcularTotal() * jogo.getQuantidadePessoas()) * tempo);
        }


        return total;
    };

    @Override
    public String toString() {
        return "Compra{" +
                "jogos=" + jogos +
                ", tempo=" + tempo +
                ", clientes=" + clientes +
                ", cliente=" + cliente +
                ", funcionario=" + funcionario +
                '}';
    }
}
