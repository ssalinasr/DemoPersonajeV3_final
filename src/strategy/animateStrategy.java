/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import javax.swing.JLabel;

/**
 *
 * @author FliaSalinasRodriguez
 */
public interface animateStrategy {
    
    public void animate(JLabel lbl) throws InterruptedException;
    
}
