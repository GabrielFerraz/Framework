/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package framework;

/**
 *
 * @author gabriel_ferraz
 */
class Inimigo extends Entidade{

    @Override
    public void colidiu(Entidade e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public Inimigo clonar(){
        return this;
    }

}
