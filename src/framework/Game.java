/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package framework;

import java.awt.Graphics2D;
import java.awt.Rectangle;
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
    
    
}
