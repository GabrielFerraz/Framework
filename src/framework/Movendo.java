/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package framework;

/**
 *
 * @author gabriel_ferraz
 */
class Movendo implements Estado{


    public Estado botaoAtirar() {
        return new MovendoAtirando();
    }

    public Estado botaoMover(int[] b) {
        if (((((b[Game.BAIXO] == 1)&&(b[Game.CIMA] == 1))
                ||((b[Game.DIREITA] == 1)&&(b[Game.ESQUERDA] == 1))
                && ((b[0]+b[1]+b[2]+b[3]) != 3)))){
            return new Parado();
        }
        if((b[0]+b[1]+b[2]+b[3]) == 0){
            return new Parado();
        }
        return this;
    }

}
