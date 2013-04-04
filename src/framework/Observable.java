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
    ArrayList<Observer> observers;
    public Observable(){
        this.observers = new ArrayList<Observer>();
    }
    public void addObserver(Observer o){
        observers.add(o);
    }
    public void notifyObservers(){
        for(Observer o: observers){
            o.update();
        }
    }
}
