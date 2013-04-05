/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package framework;

/**
 *
 * @author gabriel_ferraz
 */
class ParadoAtirando implements Estado {


    public Estado botaoAtirar() {
        return new Parado();
    }

    public Estado botaoMover(int[] botoes) {
        return new MovendoAtirando();
    }

}
