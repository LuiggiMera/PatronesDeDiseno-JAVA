/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_chainofresponsability;

/**
 *
 * @author soni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Handler m1 = new HandlerPositivo();
        Handler m2 = new HandlerNegativo();
        Handler m3 = new HandlerRangoPositivo();
        
         m1.setSiguiente( m2 );
         m2.setSiguiente( m3 );
         m1.procesar(60);
        
        m1.procesar(-30);
        m1.procesar(40);
        
    }   
}
