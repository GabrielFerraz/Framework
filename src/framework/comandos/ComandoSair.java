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
public class ComandoSair extends ComandoMenu{

    @Override
    public void acao() {
        System.out.println("Pressionou sair!");
    }

    @Override
    public String getNome() {
        return "Sair";
    }
    
}
