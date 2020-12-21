
package javaapplication;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *kkkkk
 * @author  Alejandro
 */
public class Entrada {

    /**
     * Metodo que pide un numero entero al usuario
     * y lo devuelve con un return
     *
     * @throws InputMismatchException error de argumentos
     * @return int Devuelve el numero
     *
     */
    public static int entero() {
        int aux = 0;
        
        
        Scanner teclado = new Scanner (System.in);
       
        try {
            aux = teclado.nextInt();
            if(aux<100){
                throw new IllegalArgumentException("El numero es menor a 100");
            }
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
        return aux;
    }
    
  
    
   /**
     * Metodo que pide un numero entero al usuario
     * y lo devuelve con un return
     *
     * @return int Devuelve el numero
     *f
     */
    
    
    
    public static String caracteres() {
        String cadena = null ;
        
        Scanner teclado = new Scanner (System.in);
       
        try {

            cadena = teclado.nextLine();
            

        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
        return cadena;
    }
    
}
