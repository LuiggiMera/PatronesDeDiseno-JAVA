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
public abstract class Handler {
    
    protected Handler siguienteHandler;

 
  public Handler getSiguiente() {
        return this.siguienteHandler;
    } 

   public void setSiguiente(Handler m) {
        this.siguienteHandler = m;
    }


    public void procesar(int numero)
    {
         if( numero>=-100 && numero<=100) {
             this.comprobar(numero);
         }

     if (this.getSiguiente() != null) {
             this.getSiguiente().procesar( numero );
         }
     
     
    }
    
     public abstract void comprobar(int numero);
    
  
    }