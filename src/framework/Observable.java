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
public abstract class Observable {
    static ArrayList<Observer> observers = new ArrayList<Observer>();

    public static void addObserver(Observer o){
        observers.add(o);
    }
    public static void notifyObservers(){
        for(Observer o: observers){
            o.update(Game.g);
        }
    }
}
