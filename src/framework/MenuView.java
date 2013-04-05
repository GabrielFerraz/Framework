/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package framework;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.w3c.dom.css.Rect;

/**
 *
 * @author Erik
 */
public class MenuView extends javax.swing.JPanel{

    /**
     * Creates new form Menu
     */
    public MenuView(ArrayList<ComandoMenu> comandos) {
        initComponents();
        
        tituloLabel.setText("Navinhas"); //Game.getNome());

        menuItemButton.setVisible(false);
        Point location = new Point(20, 110);
        
        for(final ComandoMenu comando: comandos){
            String item = comando.getNome();
            JButton b = new JButton(item);
            b.setLocation(location);
            b.setSize(new Dimension(760, 80));
            b.setFont(menuItemButton.getFont());
            
            b.addMouseListener(new MouseListener() {
                final ComandoMenu c = comando;
                public void mouseClicked(MouseEvent e) {
                    c.acao();
                }
                public void mousePressed(MouseEvent e) {}

                public void mouseReleased(MouseEvent e) {}

                public void mouseEntered(MouseEvent e) {}

                public void mouseExited(MouseEvent e) {}
            });
            
            this.add(b);
//            menuItemButton.setLocation(menuItemButton.getLocation().x, menuItemButton.getLocation().y + menuItemButton.getHeight() + 10);
            location.y += 100;
        }
        this.invalidate();
        this.repaint();
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
                .addGap(41, 41, 41)
                .addComponent(menuItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(383, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton menuItemButton;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
