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
public class HandlerRangoPositivo extends Handler
{
    public HandlerRangoPositivo() {
    }
    // --------------------------------------------------
    @Override
     public void comprobar(int numero)
    {
        if( numero>0 && numero<=50 ) {
           System.out.println("El número está entre 1 y 50");
        }
    }
}