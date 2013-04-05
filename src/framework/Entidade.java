/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package framework;

import java.awt.Graphics;

/**
 *
 * @author gabriel_ferraz
 */
public abstract class Entidade extends Observer {
    Sprite sprite;
    int velocidadeX, velocidadeY, posX, posY;
    
    public Entidade(){
        
    }
    
    public void colidiu(Entidade e){
        
    }
    public void update(Graphics g){ 
        sprite.draw(g, posX, posX);
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getHeight() {
        return sprite.getHeight();
    }
    
    public int getWidth(){
        return sprite.getWidth();
    }
    
    
    
    
}
