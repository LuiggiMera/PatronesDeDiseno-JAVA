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
public class HandlerPositivo extends Handler{
    
    public HandlerPositivo(){
    
    }
    
    @Override
    
   public void comprobar(int numero)

    {
        if( numero>0 ) {
           System.out.println("El número es positivo");
        }
    }       
           
           
           
}
