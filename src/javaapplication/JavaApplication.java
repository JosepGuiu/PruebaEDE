/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * El programador A rellenará el main para hacer un programa que pregunte la
 * edad y el nombre a una persona por teclado y calcule su tiempo de vida en
 * dias, horas , minutos y segundos con la frase:
 *
 * Felicidades [nombre] has vivido: x dias xx horas xxxx minutos xxxxxxxxx
 * segundos
 *
 * @author Pon tu nombre programador A
 */
public class JavaApplication {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		/*Inicializamos las variables necesarias*/
		//
		//
		int age;
		String name;
		Scanner sc = new Scanner(System.in);
		int dias;
		int horas;
		int minutos;
		int segundos;

		/* Preguntamos el nombre del usuario*/
		// nombre=
		System.out.print("Buenas, puede introducir su nombre por favor? ");
		name = sc.next();
		/* Preguntamos la edad en años usuario*/
		// edad=
		do {
			System.out.print("A continuación inserte su edad: ");
			age = sc.nextInt();
		} while (age < 0 || age > 100);
		/*Aqui calculamos los dias*/
		//dias=
		dias=age*365;
		/*Aqui calculamos las horas*/
		//horas=
		horas=dias*24;
		/*Aqui calculamos los minutos*/
		//minutos=
		minutos=horas*60;
		/*Aqui calculamos los segundos*/
		//segundos=
		segundos=minutos*60;
		/*Salida por pantalla*/
		//System.out.println();
		System.out.println("Felicidades "+name+" has vivido: "+dias+" dias, "
				+horas+" horas, "+minutos+" minutos, "+segundos+" segundos.");
                
                //holaaaa:)
	}

}
