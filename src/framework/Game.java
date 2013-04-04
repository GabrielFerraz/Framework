/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package framework;

import java.util.ArrayList;

/**
 *
 * @author gabriel_ferraz
 */
public class Game extends Observable{
    ArrayList<Fase> fases;
    ArrayList<Inimigo> inimigos;
    int frameCount;
    InimigoFactory inimigoFactory;
    Jogador jogador;
    
    public Game(){
    }
    
    public void rodarFase(){
        Fase fase = fases.get(0);
        while((!fase.fim()) && (!inimigos.isEmpty())){
            
        }
    }
    
    
}
