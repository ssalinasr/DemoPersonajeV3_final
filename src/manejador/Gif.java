/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejador;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import strategy.animateGif;

/**
 *
 * @author USUARIO
 */
public class Gif implements Manejador {

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
        animateGif g = new animateGif();
        if(f[1].equalsIgnoreCase("gif")){
            JOptionPane.showMessageDialog(null,"Leido como gif","Leido",1);
            try{
            g.animate(lbl);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"archivo no encontrado","Error",0);
                lbl.setIcon(null);
            }
            
        }else{
            System.out.println("No se reconoce como formato gif");
            lbl.setIcon(null);
            this.next.leerImagen(lbl,cad);
        }
    }
    
}
