/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package framework;

/**
 *
 * @author gabriel_ferraz
 */
public abstract class Inimigo extends Entidade{

    public abstract void colidiu(Entidade e);
    
    public abstract Inimigo clonar();

}
