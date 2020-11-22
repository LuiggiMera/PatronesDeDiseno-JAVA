/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronflyweight_java;

/**
 *
 */

import java.util.ArrayList;
import java.util.List;

public class FabLineas {
      private List<ILightLine> lineas;

      
      public FabLineas()
    {
         this.lineas = new ArrayList<ILightLine>();
    }
      
      
      public ILightLine getLine( String color )
    {
      
        // Comprobar si hemos creado una línea con el color solicitado, y devolverla en tal caso
        
        for(ILightLine linea : this.lineas)
        {
             if( linea.getColor().equals(color) )
            {
                System.out.println("Línea de color [" + color + "] encontrada, la devolvemos");
                return linea;
            }
        }
        
    // Si no ha sido creada la creamos ahora, la agregamos a la lista y la devolvemos
    
         System.out.println("Creando una línea de color [" + color + "]");
         ILightLine linea = new Linea( color );
         this.lineas.add( linea );
        return linea;
    }
}
