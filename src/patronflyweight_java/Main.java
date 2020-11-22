/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronflyweight_java;

/**
 *
 * @author soni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
         FabLineas fabrica = new FabLineas();
         ILightLine linea1 = fabrica.getLine( "NARANJA" );
         ILightLine linea2 = fabrica.getLine( "VERDE" );
         ILightLine linea3 = fabrica.getLine( "ROSA" );
         ILightLine linea4 = fabrica.getLine( "AMARILLO" );
        System.out.println("-------------------");
        //can use the lines independently
        linea1.dibujar( 200, 300 ) ;
        linea2.dibujar( 150, 600 );
        linea3.dibujar( 250, 556 );
        linea4.dibujar( 100, 400 );
    }
    
}
