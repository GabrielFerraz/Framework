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
class InimigoFactory {
    static ArrayList<Inimigo> inimigos;
    public static void setInimigos(ArrayList<Inimigo> inimigos){
        InimigoFactory.inimigos = inimigos;
    }
    public static Inimigo novoInimigo(int codigo){
        return ((Inimigo) inimigos.get(codigo)).clonar();
    }
}
