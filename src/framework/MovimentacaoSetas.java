/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package framework;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author gabriel_ferraz
 */
class MovimentacaoSetas extends KeyAdapter {
    
    public MovimentacaoSetas(Jogador jogador){
        
    }
        
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
        }
    }
    @Override
    public void keyReleased(KeyEvent e){
        if (e.getKeyCode() == KeyEvent.VK_UP) {
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
        }
    }
}
