package main.java.view;

import main.java.model.*;

public class Teste {

    public Teste() {
        JogoTabuleiro jogo1 = new JogoTabuleiro(1, "Dungeons and Dragons",3, (float)10, 6, "RPG" );
        JogoDigital jogo2 = new JogoDigital(1, "GTA", 2, (float) 15, 1, 2006, "Rockstar");
        JogoRV jogo3 = new JogoRV(2, "Prince of Persia", 2, (float) 19.99, 1, 2015, "Odin Tricks");

        Cliente cliente1 = new Cliente(1, "samuel");
        Cliente cliente2 = new Cliente(2, "maria");

        Funcionario funcionario1 = new Funcionario(1, "cristina", "Joao pessoa");
        funcionario1.solicitarAluguel(jogo3);

        Compra compra1 = new Compra();
        compra1.addJogo(jogo1);
        compra1.addJogo(jogo2);
        compra1.setTempo(2);
        System.out.println("O total desta compra foi: ");
        System.out.println(compra1.calcularCompra());
        System.out.println(compra1);
        System.out.println("-------FIM compra 1 ----------");

        System.out.println("--------------------------------------------");
        System.out.println("Jogos");
        System.out.println(jogo1);
        System.out.println(jogo2);
        System.out.println(jogo3);

        System.out.println("--------------------------------------------");
        System.out.println("Clientes");
        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println("--------------------------------------------");
        System.out.println("Funcionarios");
        System.out.println(funcionario1);

        System.out.println("--------------------------------------------");
        System.out.println("Compras");
        System.out.println(compra1);
    }

    public static void main(String[] args) { new Teste(); }
}
