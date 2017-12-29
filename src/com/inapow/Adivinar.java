package com.inapow;

import java.util.*;
public class Adivinar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int numero = 0;
			int intento = 0;
			int veces = 0;
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Ok, tienes que averiguar un numero aleatorio en un intervalo o.O \nNo te pases con los numeros, ni tampoco pongas letras o me petaras xd\n");
			
			// Establecer la dificultad del juego
			System.out.println("Escoge una dificultad:  \n1: Facil (0-10) \n2: Normal (0-100) \n3: Dificil (0-1000) \n4: Muy xungo D: (0-Integer.MAX_VALUE)");
			
			int dificultad = entrada.nextInt();
			
			switch(dificultad){
			case 1:
				numero = (int)(Math.random()*10);
				System.out.println("Eres un pu$$y");
				break;
			case 2:
				numero = (int)(Math.random()*100);
				System.out.println("Suerte :)");
				break;
			case 3:
				numero = (int)(Math.random()*1000);
				System.out.println("Que valiente xd");
				break;
			case 4:
				numero = (int)(Math.random()*Integer.MAX_VALUE);
				System.out.println("Buena suerte 7u7 \nSolo para que lo sepas: Integer.MAX_VALUE es " + Integer.MAX_VALUE);
				break;
			default:
				System.out.println("Has escogido una opción que no existe. Pondre la dificil e.e ...");
				numero = ((int)(Math.random()*1000));
				break;
			}
			
			intento = numero;
			do{
				System.out.println("\nEscribe un numero...");
				intento = entrada.nextInt();
				if(intento > numero){
					System.out.println("El numero que buscas es mas pequeño | Intento " + veces);
					veces++;
					}
				else if(intento < numero){
					System.out.println("El numero que buscas es mas grande | Intento " + veces);
					veces++;
				}
			}while(intento != numero);
			
			System.out.println("¡Enhorabuena! Has encontrado el número " + numero + " :D | Lo has intentado " + veces + " veces");
			if(veces == 0){
				System.out.println("Menuda potra has tenido XD");
			}
			
	}
}