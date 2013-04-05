/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package framework;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author gabriel_ferraz
 */
public class Game extends Observable{
    static ArrayList<Fase> fases;
    static ArrayList<Inimigo> inimigos;
    static ArrayList<Tiro> tiros;
    static int frameCount;
    static InimigoFactory inimigoFactory;
    static Jogador j;
    static Graphics2D g;
    static int[] botoes = new int[4];
    static Canvas c;
    static JFrame jframe = new JFrame("SpaceShip Game");
    static JPanel tela;
    static BufferStrategy strategy;
    
    final static int CIMA = 0;
    final static int BAIXO = 1;
    final static int ESQUERDA = 2;
    final static int DIREITA = 3;
    
    public static void initGame(ArrayList<Fase> f){
        ArrayList<String> itens = new ArrayList<String>();
        itens.add("Novo jogo!");
        itens.add("Options!");
        itens.add("Sair");
        MenuView menu = new MenuView(itens);
//        c.setBounds(0, 0, 810, 610);
//        tela.setPreferredSize(new Dimension(800, 600));
//        tela.setLayout(null);
//        tela.add(c);
//        c.setIgnoreRepaint(true);
//        c.addKeyListener(new MovimentacaoSetas());
//        c.createBufferStrategy(2);
//        strategy = c.getBufferStrategy();
//        c.requestFocus();
        jframe.pack();
        jframe.setResizable(false);
        jframe.setVisible(true);
        jframe.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        fases = f;
        //TODO: chamar menu
    }
    
    public static void rodarFase(){
        Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
        g.setColor(Color.black);
        g.fillRect(0, 0, 800, 600);
        Fase fase = fases.get(0);
        while((!fase.fim()) || (!inimigos.isEmpty()) || j.perdeu()){
            
            notifyObservers();
            verificaColisoes();
            verTempo(fase);
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
        fases.remove(0);
    }
    
    public static void verificaColisoes(){
        for(Inimigo i : inimigos){
            Rectangle iBounds = new Rectangle(i.getPosX(),i.getPosY(),i.getWidth(),i.getHeight());
            Rectangle jBounds = new Rectangle(j.getPosX(),j.getPosY(),j.getWidth(),j.getHeight());
            if(iBounds.intersects(jBounds)){
                i.colidiu(j);
                j.colidiu(i);
            }
            for(Tiro t : tiros){
                Rectangle tBounds = new Rectangle(t.getPosX(),t.getPosY(),t.getWidth(),t.getHeight());
                if(iBounds.intersects(jBounds)){
                    i.colidiu(t);
                    t.colidiu(i);
                    tiros.remove(t);
                }
            }
        }
    }
    
    static void verTempo(Fase fase){
        Inimigo i = fase.verificaTempo(frameCount);
        if(i != null){
            inimigos.add(i);
            addObserver(i);
        }
    }
    
}
