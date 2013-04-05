/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.static 
 */

package framework;

import java.util.HashMap;

/**
 *
 * @author gabriel_ferraz
 */
abstract class AbstractJogador extends Entidade{

    Estado estado;  
    
    public AbstractJogador (HashMap h){
        super(h);
    }
    
    boolean perdeu(){return false; }
    
    public void colidiu(Entidade e){  }
    
    public final void botaoAtirar(boolean pressionado){ }
    
    public final void botaoMover(int[] botoes){  }

}
