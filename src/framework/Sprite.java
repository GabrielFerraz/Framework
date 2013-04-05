/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package framework;

import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author gabriel_ferraz
 */
class Sprite {
    Image imagem;
    
    public Sprite(Image imagem) {
        this.imagem = imagem;
    }
    
    public void draw(Graphics g,int x,int y) {
        g.drawImage(imagem,x,y,null);
    }
    
    public int getHeight(){
        return imagem.getHeight(null);
    }
    
    public int getWidth() {
        return imagem.getWidth(null);
    }
}
