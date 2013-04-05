/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package framework;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 *
 * @author gabriel_ferraz
 */
public class Game extends Observable{
    ArrayList<Fase> fases;
    ArrayList<Inimigo> inimigos;
    ArrayList<Tiro> tiros;
    int frameCount;
    InimigoFactory inimigoFactory;
    Jogador j;
    Graphics2D g;
    int[] botoes = new int[4];
    
    final static int CIMA = 0;
    final static int BAIXO = 1;
    final static int ESQUERDA = 2;
    final static int DIREITA = 3;
    
    
    public Game(){
    }
    
    public void rodarFase(){
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
    }
    
    @Override
    public void notifyObservers(){
        for(Observer o: observers){
            o.update(g);
        }
    }
    
    public void verificaColisoes(){
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
    
    void verTempo(Fase fase){
        Inimigo i = fase.verificaTempo(frameCount);
        if(i != null){
            inimigos.add(i);
            addObserver(i);
        }
    }
    
    private class MovimentacaoSetas extends KeyAdapter {
        
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {j.botaoAtirar(true);}
            if (e.getKeyCode() == KeyEvent.VK_UP) {botoes[CIMA] = 1; j.botaoMover(botoes);}
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {botoes[BAIXO] = 1; j.botaoMover(botoes);}
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {botoes[ESQUERDA] = 1; j.botaoMover(botoes);}
            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {botoes[DIREITA] = 1; j.botaoMover(botoes);}
        }
        @Override
        public void keyReleased(KeyEvent e){
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {j.botaoAtirar(false);}
            if (e.getKeyCode() == KeyEvent.VK_UP) {botoes[CIMA] = 0; j.botaoMover(botoes);}
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {botoes[BAIXO] = 0; j.botaoMover(botoes);}
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {botoes[ESQUERDA] = 0; j.botaoMover(botoes);}
            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {botoes[DIREITA] = 0; j.botaoMover(botoes);}
        }
    }
    
}
