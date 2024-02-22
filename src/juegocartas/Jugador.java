package juegocartas;

import java.util.Random;
import javax.swing.JPanel;

public class Jugador {

    private int TOTAL_CARTAS = 10;
    private int MARGEN = 20;
    private int DISTANCIA = 50;

    private Carta[] cartas = new Carta[TOTAL_CARTAS];

    private Random r = new Random();

    public void repartir() {
        for (int i = 0; i < TOTAL_CARTAS; i++) {
            cartas[i] = new Carta(r);
        }
    }

    public void mostrar(JPanel pnl) {
        pnl.removeAll();
        int x = MARGEN;
        //recorrido objetual por una lista de objetos
        for (Carta c : cartas) {
            c.mostrar(pnl, x, MARGEN);
            x += DISTANCIA;
        }

        pnl.repaint();
    }

}
