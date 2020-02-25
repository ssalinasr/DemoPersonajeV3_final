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
public class animatePng implements animateStrategy {

    @Override
    public void animate(JLabel lbl) throws InterruptedException {
            ImageIcon[] k = new ImageIcon[14];
            int cont = 0;
            while(cont < 12){
                cont++;
                k[0] = new ImageIcon(getClass().getResource("/attack/Attack1.png"));
                k[1] = new ImageIcon(getClass().getResource("/attack/Attack2.png"));
                k[2] = new ImageIcon(getClass().getResource("/attack/Attack3.png"));
                k[3] = new ImageIcon(getClass().getResource("/attack/Attack4.png"));
                k[4] = new ImageIcon(getClass().getResource("/attack/Attack5.png"));
                k[5] = new ImageIcon(getClass().getResource("/attack/Attack6.png"));
                k[6] = new ImageIcon(getClass().getResource("/attack/Attack7.png"));
                k[7] = new ImageIcon(getClass().getResource("/attack/Attack8.png"));
                k[8] = new ImageIcon(getClass().getResource("/attack/Attack9.png"));
                k[9] = new ImageIcon(getClass().getResource("/attack/Attack10.png"));
                k[10] = new ImageIcon(getClass().getResource("/attack/Attack11.png"));
                k[11] = new ImageIcon(getClass().getResource("/attack/Attack12.png"));
                k[12] = new ImageIcon(getClass().getResource("/attack/Attack13.png"));
                lbl.setIcon(k[cont]);
                Thread.sleep(125);
            }
    }
    
}
