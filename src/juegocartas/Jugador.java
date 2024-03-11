package juegocartas;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Jugador {
    public int puntaje_grupo = 0;
    private int TOTAL_CARTAS = 10;
    private int MARGEN = 20;
    private int DISTANCIA = 50;
    private ArrayList<Integer> list = new ArrayList<Integer>();

    private Carta[] cartasOrdenadas = new Carta[TOTAL_CARTAS];
    private Carta[] cartasBrutas = new Carta[TOTAL_CARTAS];

    private Random r = new Random();

    public void repartir() {
        //llenamos mano
        list.clear();

        for (int i = 0; i < TOTAL_CARTAS; i++) {
            list.add(r.nextInt(52) + 1);
        }
        Collections.sort(list);
        for (int i = 0; i < TOTAL_CARTAS; i++) {
            cartasOrdenadas[i] = new Carta(list.get(i));
        }
    }

    public void mostrar(JPanel pnl) {
        pnl.removeAll();
        int x = MARGEN;
        //recorrido objetual por una lista de objetos
        for (Carta c : cartasOrdenadas) {
            c.mostrar(pnl, x, MARGEN);
            x += DISTANCIA;
        }

        pnl.repaint();
    }

    public String getGrupos() {
        String mensaje = "No se encontraron grupos";
        
        int[] contadores = new int[NombreCarta.values().length];
        for (Carta c : cartasOrdenadas) {
            contadores[c.getNombre().ordinal()]++;
        }
        int grupo = 0;
        int tipo = 0;
        int totalGrupos = 0;
        for (int c : contadores) {
            if (c >= 2) {
                totalGrupos++;
            }
        }
        if (totalGrupos > 0) {
            mensaje = "Los grupos encontrados fueron:\n";
            for (int i = 0; i < contadores.length; i++) {
                if (contadores[i] >= 2) {
                    mensaje += Grupo.values()[contadores[i]] + " de " + NombreCarta.values()[i] + "\n";
                    if (Grupo.values().equals("TERNA")) {
                        grupo = 3;
                    } else if (Grupo.values().equals("CUARTA")) {
                        grupo = 4;
                    } else if (Grupo.values().equals("QUINTA")) {
                        grupo = 5;
                    } else if (Grupo.values().equals("SEXTA")) {
                        grupo = 6;
                    } else if (Grupo.values().equals("SEPTIMA")) {
                        grupo = 7;
                    } else if (Grupo.values().equals("OCTAVA")) {
                        grupo = 8;
                    } else if (Grupo.values().equals("NOVENA")) {
                        grupo = 9;
                    } else if (Grupo.values().equals("DECIMA")) {
                        grupo = 10;
                    }

                    
                    if (NombreCarta.values().equals("AS")) {
                        tipo = 10;
                        JOptionPane.showMessageDialog(null, "uno");
                    } else  if (NombreCarta.values().equals("UNO")) {
                        tipo = 1;
                        
                    } else if (NombreCarta.values().equals("DOS")) {
                        tipo = 2;
                        JOptionPane.showMessageDialog(null, "Dos");
                    } else if (NombreCarta.values().equals("TRES")) {
                        tipo = 3;
                    } else if (NombreCarta.values().equals("CUATRO")) {
                        tipo = 4;
                    } else if (NombreCarta.values().equals("CINCO")) {
                        tipo = 5;
                    } else if (NombreCarta.values().equals("SEIS")) {
                        tipo = 6;
                    } else if (NombreCarta.values().equals("SIETE")) {
                        tipo = 7;
                    } else if (NombreCarta.values().equals("OCHO")) {
                        tipo = 8;
                    } else if (NombreCarta.values().equals("NUEVE")) {
                        tipo = 9;
                    } else if (NombreCarta.values().equals("DIEZ")) {
                        tipo = 10;
                    } else if (NombreCarta.values().equals("JACK")) {
                        tipo = 10;
                    } else if (NombreCarta.values().equals("QUEEN")) {
                        tipo = 10;
                    } else if (NombreCarta.values().equals("KING")) {
                        tipo = 10;
                    }
                    puntaje_grupo = puntaje_grupo + (tipo*grupo);
                }
            }
        }
        return mensaje;
    }
     public String getPuntaje() {
        String mensaje = "No se encontraron grupos";
        
        int[] contadores = new int[NombreCarta.values().length];
        for (Carta c : cartasOrdenadas) {
            contadores[c.getNombre().ordinal()]++;
        }
        int grupo = 0;
        int tipo = 0;
        int totalGrupos = 0;
        for (int c : contadores) {
            if (c >= 2) {
                totalGrupos++;
            }
        }
        if (totalGrupos > 0) {
            for (int i = 0; i < contadores.length; i++) {
                if (contadores[i] >= 2) {
                    mensaje += Grupo.values()[contadores[i]] + " de " + NombreCarta.values()[i] + "\n";
                    if (Grupo.values().equals("TERNA")) {
                        grupo = 3;
                    } else if (Grupo.values().equals("CUARTA")) {
                        grupo = 4;
                    } else if (Grupo.values().equals("QUINTA")) {
                        grupo = 5;
                    } else if (Grupo.values().equals("SEXTA")) {
                        grupo = 6;
                    } else if (Grupo.values().equals("SEPTIMA")) {
                        grupo = 7;
                    } else if (Grupo.values().equals("OCTAVA")) {
                        grupo = 8;
                    } else if (Grupo.values().equals("NOVENA")) {
                        grupo = 9;
                    } else if (Grupo.values().equals("DECIMA")) {
                        grupo = 10;
                    }

                    
                    if (NombreCarta.values().equals("AS")) {
                        tipo = 10;
                        JOptionPane.showMessageDialog(null, "uno");
                    } else  if (NombreCarta.values().equals("UNO")) {
                        tipo = 1;
                        
                    } else if (NombreCarta.values().equals("DOS")) {
                        tipo = 2;
                        JOptionPane.showMessageDialog(null, "Dos");
                    } else if (NombreCarta.values().equals("TRES")) {
                        tipo = 3;
                    } else if (NombreCarta.values().equals("CUATRO")) {
                        tipo = 4;
                    } else if (NombreCarta.values().equals("CINCO")) {
                        tipo = 5;
                    } else if (NombreCarta.values().equals("SEIS")) {
                        tipo = 6;
                    } else if (NombreCarta.values().equals("SIETE")) {
                        tipo = 7;
                    } else if (NombreCarta.values().equals("OCHO")) {
                        tipo = 8;
                    } else if (NombreCarta.values().equals("NUEVE")) {
                        tipo = 9;
                    } else if (NombreCarta.values().equals("DIEZ")) {
                        tipo = 10;
                    } else if (NombreCarta.values().equals("JACK")) {
                        tipo = 10;
                    } else if (NombreCarta.values().equals("QUEEN")) {
                        tipo = 10;
                    } else if (NombreCarta.values().equals("KING")) {
                        tipo = 10;
                    }
                    puntaje_grupo = puntaje_grupo + (tipo*grupo);
                }
            }
        }
        mensaje = Integer.toString(puntaje_grupo);
        return mensaje;
    }

    public int getConteo() {
        int puntaje = 0;
        int residuo = 0;
        for (int i = 0; i < TOTAL_CARTAS; i++) {
            residuo = list.get(i) % 13;
            if (residuo == 0 || residuo == 11 || residuo == 12 || residuo == 1) {
                residuo = 10;
            }
            puntaje += residuo;
        }
        return puntaje_grupo;
    }
}
