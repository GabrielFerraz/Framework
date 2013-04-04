/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package framework;

import java.util.ArrayList;

/**
 *
 * @author gabriel_ferraz
 */
class Fase {
    public ArrayList<Integer> inimigos;
    public ArrayList<Integer> tempos;
    
    public Inimigo verificaTempo(int frame){
        if (tempos.get(0) == frame){
            Inimigo inimigo = InimigoFactory.novoInimigo(inimigos.get(0));
            inimigos.remove(0);
            tempos.remove(0);
            return inimigo;
        }
        return null;
    }

    boolean fim() {
        return tempos.isEmpty();
    }
}
