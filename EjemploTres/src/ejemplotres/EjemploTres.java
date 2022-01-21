/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotres;

import org.apache.commons.lang3.math.NumberUtils;

/**
 *
 * @author reroes
 */
public class EjemploTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        int a = 10;
        int b = 20;
        int r = (NumberUtils.compare(a, b));
        // System.out.println(NumberUtils.compare(a, b));
        if (r == 1){
            System.out.printf("El numero %s es mayor a %s", a, b);
        }else{
            if (r==0){
                System.out.printf("El numero %s es igual a %s", a, b);
            }else{
                if(r==-1){
                    System.out.printf("El numero %s es menor a %s", a, b);
                }
            }
        }
        
        // System.out.println( obtenerDecimal("10.2") + 20 );
        // System.out.printf("El número mayor es: %.2f\n", 
        //        NumberUtils.max(10.2, 1.1, 4.2) );
    }
    
    public static double obtenerDecimal(String cadena){
        double d = NumberUtils.createDouble(cadena);
        return d;
    }
    
}
