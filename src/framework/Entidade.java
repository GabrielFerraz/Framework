/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package framework;

import java.awt.Graphics;
import java.util.HashMap;

/**
 *
 * @author gabriel_ferraz
 */
public abstract class Entidade extends Observer {
    Sprite sprite;
    int velocidadeX, velocidadeY, posX, posY;
    
    public Entidade(HashMap h){
        this.posX = (Integer) h.get('x');
        this.posY = (Integer) h.get('y');
        this.velocidadeX = (Integer) h.get("velX");
        this.velocidadeY = (Integer) h.get("velY");
        this.sprite = SpriteManager.get().getSprite(String.valueOf(h.get("caminho")));
    }
    
    public abstract void colidiu(Entidade e);
    
    public void update(){ }

    public void draw(Graphics g){
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
