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
public class Linea implements ILightLine {
    
      private String color;
    // --------------------
    public Linea( String color )
    {
        this.color = color;
    }
    // --------------------
    @Override
    public String getColor()
    {
        return this.color;
    }
    // --------------------
    @Override
     public void dibujar( int col, int fila )
    {
        System.out.println( "Dibujando línea de color [" + this.color + "] en [" + col + ", " + fila + "]" );
    }
}
