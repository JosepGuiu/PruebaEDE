/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * El programador B creará los metodos necesarios para: (seguir instrucciones)
 *kkkkk
 * @author  Pon tu nombre Programador B
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
        
        /* Definir un scanner para poder leer por teclado*/
        
        //Scanner teclado = .......
        
        Scanner teclado = new Scanner (System.in);
       
        try {
            /*Leer por teclado y asigar a aux*/
            //aux=
            aux = teclado.nextInt();
            
            /*Si el usuario introduce un numero mayor menor de 100 lanzar
              un throw de tipo IllegalArgumentException */
            if(aux<100){
                throw new IllegalArgumentException("El numero es menor a 100");
            }
           
            //Aqui va el throw
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
        return aux;
    }
    
    /**
     * Crear a continuación un metodo parecida a la anterior
     * que pida una cadena de caracteres. (sin Throw)
     */
    
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
