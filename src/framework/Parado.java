/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package framework;

/**
 *
 * @author gabriel_ferraz
 */
public class Parado implements Estado{

    public Estado botaoAtirar() {
        return new ParadoAtirando();
    }

    public Estado botaoMover(int[] botoes) {
        return new Movendo();
    }

}
