package main.java.model;

public class Jogo3D extends JogoDigital {
    private String console;
    private int tipoControle;

    public Jogo3D(){}

    public Jogo3D(int idJogo, String nome, int quantidadeDeJogos, float precoAluguel, int quantidadePessoas, int anoCriacao, String produtora) {
        super(idJogo, nome, quantidadeDeJogos, precoAluguel, quantidadePessoas, anoCriacao, produtora);
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public int getTipoControle() {
        return tipoControle;
    }

    public void setTipoControle(int tipoControle) {
        this.tipoControle = tipoControle;
    }

    @Override
    public String toString() {
        return "Jogo3D{" +
                "console='" + console + '\'' +
                ", tipoControle=" + tipoControle +
                "} " + super.toString();
    }

}
