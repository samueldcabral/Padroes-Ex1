package main.java.model;

public abstract class Jogo {
    private int idJogo;
    private String nome;
    private int quantidadeDeJogos;
    private float precoAluguel;
    private int quantidadePessoas;

    public Jogo() { }

    public Jogo(int idJogo, String nome, int quantidadeDeJogos, float precoAluguel, int quantidadePessoas) {
        this.idJogo = idJogo;
        this.nome = nome;
        this.quantidadeDeJogos = quantidadeDeJogos;
        this.precoAluguel = precoAluguel;
        this.quantidadePessoas = quantidadePessoas;
    }

    public int getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeJogos() {
        return quantidadeDeJogos;
    }

    public void setQuantidadeDeJogos(int quantidadeDeJogos) {
        this.quantidadeDeJogos = quantidadeDeJogos;
    }

    public float getPrecoAluguel() {
        return precoAluguel;
    }

    public void setPrecoAluguel(float precoAluguel) {
        this.precoAluguel = precoAluguel;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public abstract float calcularTotal();

    @Override
    public String toString() {
        return "Jogo{" +
                "idJogo=" + idJogo +
                ", nome='" + nome + '\'' +
                ", quantidadeDeJogos=" + quantidadeDeJogos +
                ", precoAluguel=" + precoAluguel +
                ", quantidadePessoas=" + quantidadePessoas +
                '}';
    }
}
