package com.elorrieta;

import java.util.Scanner;

public class biblios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicio de protyecto");
		
		System.out.println("por favor, introduzca que operacion quiere realizar");
		System.out.println("A: sacar libro");
		System.out.println("B: devolver libro");
		System.out.println("S: Salir");
		System.out.println("");
		System.out.println("Seleccione una opcion valida");
		
		Scanner sc= new Scanner(System.in);
		char opcion=sc.nextLine()..toUpperCase().charAt(0);
		
		switch (opcion) {
		case 'A':
			
			break;
		case 'B':
			
			break;
		case 'S':
			
			break;
			
		default:
			break;
		}
	}

}
