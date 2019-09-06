package main.java.model;

import java.util.ArrayList;
import java.util.List;

public class JogoTabuleiro extends Jogo {
    private String estilo;
    private List<String> adereco = new ArrayList();
    private int desconto = 10;

    public JogoTabuleiro(){}

    public JogoTabuleiro(int idJogo, String nome, int quantidadeDeJogos, float precoAluguel, int quantidadePessoas, String estilo) {
        super(idJogo, nome, quantidadeDeJogos, precoAluguel, quantidadePessoas);
        this.estilo = estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public List<String> getAdereco() {
        return adereco;
    }

    public void setAdereco(List<String> adereco) {
        this.adereco = adereco;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    //// Methods
    public float calcularTotal() {
        float totalPreDesconto = this.getPrecoAluguel() / this.getQuantidadePessoas();
        float descontoAplicado = (float) ( 1 - ((float) desconto / 100) );
        return totalPreDesconto * descontoAplicado;
    }

    @Override
    public String toString() {
        return "JogoTabuleiro{" +
                "estilo='" + estilo + '\'' +
                ", adereco=" + adereco +
                ", desconto=" + desconto +
                "} " + super.toString();
    }
}
