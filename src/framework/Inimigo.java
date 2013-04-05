/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package framework;

import java.util.HashMap;

/**
 *
 * @author gabriel_ferraz
 */
abstract class Inimigo extends Entidade{
    
    public Inimigo(HashMap h){
        super(h);
    }
    
    @Override
    public void colidiu(Entidade e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public Inimigo clonar(){
        return this;
    }

}
