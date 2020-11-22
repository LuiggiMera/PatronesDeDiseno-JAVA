/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability_java;

/**
 *
 * @author soni
 */
public class ChainOfResponsability_JAVA {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args)
    {
        Handler h1 = new HandlerPositivo();
        Handler h2 = new HandlerNegativo();
        Handler h3 = new HandlerRangoPositivo();
         
         h1.setSiguiente( h2 );
         h2.setSiguiente( h3 );
         
        h1.procesar(60);
        h1.procesar(-30);
        h1.procesar(40);
    }
}
    

