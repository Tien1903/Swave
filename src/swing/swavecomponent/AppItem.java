/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing.swavecomponent;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class AppItem extends javax.swing.JPanel {

    /**
     * Creates new form AppItem
     */
    public AppItem() {
        initComponents();
        init();
    }

    public JLabel getLblIcon() {
        return lblIcon;
    }

    public void setLblIcon(JLabel lblIcon) {
        this.lblIcon = lblIcon;
    }

    public JLabel getLblName() {
        return lblName;
    }

    public void setLblName(JLabel lblName) {
        this.lblName = lblName;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcon = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(249, 35));
        setMinimumSize(new java.awt.Dimension(249, 35));
        setPreferredSize(new java.awt.Dimension(249, 35));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 20, 5));
        add(lblIcon);
        add(lblName);
    }// </editor-fold>//GEN-END:initComponents

    public void init(){
        setBackground(new Color(0,0,0,1));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
