/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import TDA.Sprite;
import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author ferol
 */
public class customLabel {
    
    public Color color = new Color(25, 10, 51);
    public JLabel label;
    private boolean empty = false;
    Sprite sprite;
    public int x,y;
    
    public customLabel() {
        
        label = new JLabel();
        label.setOpaque(true);
        label.setBackground(color);
        label.setText("");
        label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));      
    }
    
    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public void setColor(Color color) {
        this.color = color;
        this.label.setBackground(color);
    }

    public Color getColor() {
        return color;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    
    
    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }
    
    
}
