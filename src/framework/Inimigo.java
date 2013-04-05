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
<<<<<<< HEAD
abstract class Inimigo extends Entidade{
    
    public Inimigo(HashMap h){
        super(h);
    }
    
    @Override
    public void colidiu(Entidade e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
=======
public abstract class Inimigo extends Entidade{

    public abstract void colidiu(Entidade e);
>>>>>>> 44ea123c47dc4e0546768a2a648b2d474c66da60
    
    public abstract Inimigo clonar();

}
