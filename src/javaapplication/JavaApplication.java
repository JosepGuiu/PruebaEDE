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
		int age;
		String name;
		Scanner sc = new Scanner(System.in);
		int dias;
		int horas;
		int minutos;
		int segundos;

		// nombre=
		System.out.print("Buenas, puede introducir su nombre por favor? ");
		name = sc.next();
		// edad=
		do {
			System.out.print("A continuación inserte su edad: ");
			age = sc.nextInt();
		} while (age < 0 || age > 100);
		//dias=
		dias=age*365;
		//horas=
		horas=dias*24;
		//minutos=
		minutos=horas*60;		
		//segundos=
		segundos=minutos*60;
		
		System.out.println("Felicidades "+name+" has vivido: "+dias+" dias, "
				+horas+" horas, "+minutos+" minutos, "+segundos+" segundos.");
                
                
	}

}
