/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejador;

import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class Imagen implements Manejador {
    
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
        Jpg jpg = new Jpg();
        Gif gif = new Gif();
        Png png = new Png();
        
        this.next = jpg;
        
        jpg.setNext(gif);
        gif.setNext(png);
        
        this.next.leerImagen(lbl,cad);
    }
    
}
