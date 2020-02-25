/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejador;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import strategy.animatePng;

/**
 *
 * @author USUARIO
 */
public class Png implements Manejador {

    private Manejador next;
    
    @Override
    public void setNext(Manejador pManejador) {
       this.next = pManejador;
    }

    @Override
    public Manejador getManejador() {
        return this.next;
    }

    @Override
    public void leerImagen(JLabel lbl, String cad) {       
        String[] f = cad.split("\\.");
        animatePng p = new animatePng();
        if(f[1].equalsIgnoreCase("png")){
            JOptionPane.showMessageDialog(null,"Leido como png","Leido",1);
            try{
            p.animate(lbl);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"archivo no encontrado","Error",0);
                lbl.setIcon(null);
            }          
        }else{
            JOptionPane.showMessageDialog(null,"No se reconoce xd","Error",0);
            lbl.setIcon(null);
        }
    }
    
}
