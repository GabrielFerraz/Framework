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
public class MovimentacaoSetas extends KeyAdapter {
        
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {Game.j.botaoAtirar(true);}
            if (e.getKeyCode() == KeyEvent.VK_UP) {Game.botoes[Game.CIMA] = 1; Game.j.botaoMover(Game.botoes);}
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {Game.botoes[Game.BAIXO] = 1; Game.j.botaoMover(Game.botoes);}
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {Game.botoes[Game.ESQUERDA] = 1; Game.j.botaoMover(Game.botoes);}
            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {Game.botoes[Game.DIREITA] = 1; Game.j.botaoMover(Game.botoes);}
        }
        @Override
        public void keyReleased(KeyEvent e){
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {Game.j.botaoAtirar(true);}
            if (e.getKeyCode() == KeyEvent.VK_UP) {Game.botoes[Game.CIMA] = 0; Game.j.botaoMover(Game.botoes);}
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {Game.botoes[Game.BAIXO] = 0; Game.j.botaoMover(Game.botoes);}
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {Game.botoes[Game.ESQUERDA] = 0; Game.j.botaoMover(Game.botoes);}
            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {Game.botoes[Game.DIREITA] = 0; Game.j.botaoMover(Game.botoes);}
        }
    }
