/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.comandos;

import framework.ComandoMenu;

/**
 *
 * @author Erik
 */
public class ComandoOpcoes extends ComandoMenu{

    @Override
    public void acao() {
        System.out.println("Comando Opções pressionado");
    }

    @Override
    public String getNome() {
        return "Opções";
    }
    
}
