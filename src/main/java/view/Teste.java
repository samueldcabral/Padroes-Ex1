package main.java.view;

import main.java.model.JogoTabuleiro;

public class Teste {

    public Teste() {
        JogoTabuleiro jogo1 = new JogoTabuleiro(1, "Dungeons and Dragons",3, (float)10, 6, "RPG" );
        System.out.println(jogo1);
    }

    public static void main(String[] args) { new Teste(); }
}
