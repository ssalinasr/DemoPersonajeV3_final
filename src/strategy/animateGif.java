/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author FliaSalinasRodriguez
 */
public class animateGif implements animateStrategy{

    @Override
    public void animate(JLabel lbl){
        lbl.setIcon(new ImageIcon(getClass().getResource("/dead/Dead.gif")));
    }
    
}
