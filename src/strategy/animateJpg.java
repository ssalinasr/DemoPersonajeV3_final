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
public class animateJpg implements animateStrategy {
    
        @Override
    public void animate(JLabel lbl) throws InterruptedException{
            int cont = 0;
            ImageIcon[] k = new ImageIcon[6];
            while(cont < 4){
                cont++;
                k[0] = new ImageIcon(getClass().getResource("/move/Move1.jpg"));
                k[1] = new ImageIcon(getClass().getResource("/move/Move2.jpg"));
                k[2] = new ImageIcon(getClass().getResource("/move/Move3.jpg"));
                k[3] = new ImageIcon(getClass().getResource("/move/Move4.jpg"));
                k[4] = new ImageIcon(getClass().getResource("/move/Move5.jpg"));
                k[5] = new ImageIcon(getClass().getResource("/move/Move6.jpg"));
                lbl.setIcon(k[cont]);
                Thread.sleep(325);
            }

    }
}
