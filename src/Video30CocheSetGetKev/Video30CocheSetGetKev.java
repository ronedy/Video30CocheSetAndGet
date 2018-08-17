/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video30CocheSetGetKev;

import javax.swing.JOptionPane;

/**
 *
 * @author HP ENVY
 */
public class Video30CocheSetGetKev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Coche p = new Coche();
        
        p.establecer_color();
        
        JOptionPane.showMessageDialog(null,"Caracteristicas de un coche");
        
        System.out.println(p.dimelargo());
        
        System.out.println(p.dime_color());
        
    }
    
}
