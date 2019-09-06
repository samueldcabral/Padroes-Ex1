package main.java.model;

public class JogoRA extends JogoDigital{
    private String dispositivo;
    private String marcador;

    public JogoRA(){}

    public JogoRA(int idJogo, String nome, int quantidadeDeJogos, float precoAluguel, int quantidadePessoas, int anoCriacao, String produtora) {
        super(idJogo, nome, quantidadeDeJogos, precoAluguel, quantidadePessoas, anoCriacao, produtora);
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    @Override
    public String toString() {
        return "JogoRA{" +
                "dispositivo='" + dispositivo + '\'' +
                ", marcador='" + marcador + '\'' +
                "} " + super.toString();
    }
}

