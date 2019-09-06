package main.java.model;

public class JogoRV extends JogoDigital{
    private String tipoCapacete;
    private String estereoscopia;
    private int bonus = 20;

    public JogoRV(){}

    public JogoRV(int idJogo, String nome, int quantidadeDeJogos, float precoAluguel, int quantidadePessoas, int anoCriacao, String produtora) {
        super(idJogo, nome, quantidadeDeJogos, precoAluguel, quantidadePessoas, anoCriacao, produtora);
    }

    public String getTipoCapacete() {
        return tipoCapacete;
    }

    public void setTipoCapacete(String tipoCapacete) {
        this.tipoCapacete = tipoCapacete;
    }

    public String getEstereoscopia() {
        return estereoscopia;
    }

    public void setEstereoscopia(String estereoscopia) {
        this.estereoscopia = estereoscopia;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    //// Methods
    public float calcularTotal() {
        float totalPosBonus = this.getPrecoAluguel() / this.getQuantidadePessoas();
        return totalPosBonus * (1 + (bonus / 100));
    }

    @Override
    public String toString() {
        return "JogoRV{" +
                "tipoCapacete='" + tipoCapacete + '\'' +
                ", estereoscopia='" + estereoscopia + '\'' +
                ", bonus=" + bonus +
                "} " + super.toString();
    }
}
