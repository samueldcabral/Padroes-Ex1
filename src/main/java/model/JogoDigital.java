package main.java.model;

public class JogoDigital extends Jogo {
    private int anoCriacao;
    private String produtora;

    public JogoDigital(){}

    public JogoDigital(int idJogo, String nome, int quantidadeDeJogos, float precoAluguel, int quantidadePessoas, int anoCriacao, String produtora) {
        super(idJogo, nome, quantidadeDeJogos, precoAluguel, quantidadePessoas);
        this.anoCriacao = anoCriacao;
        this.produtora = produtora;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    //// Methods
    public float calcularTotal() {
        return this.getPrecoAluguel() / this.getQuantidadePessoas();
    }

    @Override
    public String toString() {
        return "JogoDigital{" +
                "anoCriacao=" + anoCriacao +
                ", produtora='" + produtora + '\'' +
                "} " + super.toString();
    }
}
