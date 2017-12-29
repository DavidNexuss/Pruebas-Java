package com.inapow;

import javax.swing.*;
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean fallido = false;
		int numero = 0;
		do{ // Spammear esto hasta que el dato introducido sea valido
			try{ // Introducir un dato
					System.out.println("Esperando para un numero");
					numero = Integer.parseInt(JOptionPane.showInputDialog("Numero a factorizar"));
					break; // Si ha llegado hasta aqui, el dato es correcto, asi que a romper el bucle
				}catch(Exception ex){ // Si introducen un dato incorrecto...
					System.out.println("No se pudo factorizar: entrada invalida (¿Has puesto letras o un numero muy grande/bajo?)");
				} // (Uso catch porque finally muestra en consola la excepcion de java y no quiero eso)
			}while(true);
		
		final int numeroFijo = numero;
		System.out.println("Ahora calculando...\n--------------------------------------");
		for(int i = (numeroFijo - 1); i > 0; i--){ // Inicia el bucle			
			// Cada vez que inicie, comprobar si el numero es igual a 0 o negativo
			// En ese caso, romper el bucle y decir que el calculo es fallido
			if(numero == 0 || numero < 0){			
				fallido = true;
				break; // A tomar por culo
			}
			// Si todo va bien, continua
			numero = numero * i; // numero por el valor que ira incrementando sin llegar al numero fijp
			System.out.println((numero/i) + "*" + i + "=" + numero); // imprimir el calculo
		}
		
			
		
			if(!fallido){ // Todo termino bien :D
				System.out.println("--------------------------------------\nTerminado!");
				System.out.println("\n"+ numeroFijo + "! = "+numero);
			}else{ // fallido esta en true, algo paso -_-
				System.out.println("--------------------------------------\nInterrumpido!");
				System.out.println("\nParece que hubo un error. Quizas el numero es demasiado grande.");
				
			}
		}
	}
