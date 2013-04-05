/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.static 
 */

package framework;

/**
 *
 * @author gabriel_ferraz
 */
abstract class Jogador extends Entidade{

    Estado estado;  
    
    boolean perdeu(){return false; }
    
    public void colidiu(Entidade e){  }
    
    public final void botaoAtirar(boolean pressionado){ }
    
    public final void botaoMover(int[] botoes){  }

}
