package main.java.model;

public class Funcionario {
    private int idFunc;
    private String nomeFunc;
    private String filial;

    public Funcionario() { }

    public Funcionario(int idFunc, String nomeFunc, String filial) {
        this.idFunc = idFunc;
        this.nomeFunc = nomeFunc;
        this.filial = filial;
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    //// Methods
    public String solicitarAluguel(Jogo idJogo) {
        Compra compra = new Compra();
        compra.setFuncionario(this);
        compra.addJogo(idJogo);

        return "Success e a compra gerada foi " + compra;
    }

    public float finalizarCompra(){
        return (float) 0.0;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "idFunc=" + idFunc +
                ", nomeFunc='" + nomeFunc + '\'' +
                ", filial='" + filial + '\'' +
                '}';
    }
}
