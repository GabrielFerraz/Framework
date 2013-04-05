/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package framework;

import java.awt.Button;
import java.util.ArrayList;


/**
 *
 * @author Erik
 */
public class MenuView extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    public MenuView(ArrayList<String> itens) {
        initComponents();
        
        tituloLabel.setText("Navinhas"); //Game.getNome());

        menuItemButton.setVisible(false);
        for(String item: itens){
            Button b = new Button(item);
            b.setLocation(menuItemButton.getLocation());
            b.setSize(menuItemButton.getSize());
            b.setFont(menuItemButton.getFont());
            b.setVisible(true);
            this.add(b);
            menuItemButton.setLocation(menuItemButton.getLocation().x, menuItemButton.getLocation().y + menuItemButton.getHeight() + 10);
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        menuItemButton = new javax.swing.JButton();

        tituloLabel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 48)); // NOI18N
        tituloLabel.setText("Nome Jogo");

        menuItemButton.setFont(new java.awt.Font("Tunga", 0, 24)); // NOI18N
        menuItemButton.setText("Item Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tituloLabel)
                        .addGap(0, 538, Short.MAX_VALUE))
                    .addComponent(menuItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuItemButton)
                .addContainerGap(433, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton menuItemButton;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
