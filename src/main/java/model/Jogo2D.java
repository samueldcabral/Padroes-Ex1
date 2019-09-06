package main.java.model;

public class Jogo2D extends JogoDigital {
    private String dispositivo;
    private int tipoControle;

    public Jogo2D(){}

    public Jogo2D(int idJogo, String nome, int quantidadeDeJogos, float precoAluguel, int quantidadePessoas, int anoCriacao, String produtora) {
        super(idJogo, nome, quantidadeDeJogos, precoAluguel, quantidadePessoas, anoCriacao, produtora);
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public int getTipoControle() {
        return tipoControle;
    }

    public void setTipoControle(int tipoControle) {
        this.tipoControle = tipoControle;
    }

    @Override
    public String toString() {
        return "Jogo2D{" +
                "dispositivo='" + dispositivo + '\'' +
                ", tipoControle=" + tipoControle +
                "} " + super.toString();
    }
}
