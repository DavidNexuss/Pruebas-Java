package com.inapow;

import javax.swing.JOptionPane;
public class BuscarRandom {

	public static void main(String[] args) {
			// Iniciar variables
			int target = 0;
			int numeroMin = 0;
			int numeroMax = 0;
			//
			int numeroGenerado = 0;
			int intentos = 0;
			int subIntentos = 0;
			
			do{try{
					target = Integer.parseInt(JOptionPane.showInputDialog("¿Qué número quieres que encuentre?"));
					numeroMax = 	Integer.parseInt(JOptionPane.showInputDialog("¿Dónde está ese número? Entre 0 y..."));
				}catch(Exception ex){}
			}while(!(target >= numeroMin) || !(target <= numeroMax) || !(target >= 0)); // Continuar el spam cuando los datos no sean correctos
			
			do{		
					// Buscar un numero todo el rato hasta que deje de estar fuera del intervalo
					do{numeroGenerado = (int)Math.round(Math.random()*numeroMax); subIntentos++;	}
					while(numeroGenerado < numeroMin || numeroGenerado > numeroMax); 	
					
					System.out.println("Probando con numero: " + numeroGenerado +
							" | El número menor mas cercano hasta el momento: " + numeroMin + " y el mayor mas cercano: " + numeroMax);
							intentos++;
				
						if(numeroGenerado < target){ // Te quedas corto
						if(Math.abs(numeroGenerado - target) < Math.abs(numeroMin - target)){
							//[NOTA] El valor absoluto de la diferencia del numero generado y el target es menor que el valor
							// absoluto de la diferencia del numero limite menor y el target
							// Resumiendo, que el numero generado esta mas cerca del target que el otro
							// Por tanto, actualizar el limite para que el intervalo sea mas pequeño
								numeroMin = numeroGenerado;
							}
						}else if(numeroGenerado > target){ // Te pasas
							if(Math.abs(numeroGenerado - target) < Math.abs(numeroMax - target)){
								// Guardar, porque este numero es mayor y esta mas cerca del target que el limite actual
								numeroMax = numeroGenerado;}
							}
			}while(numeroGenerado != target);
			System.out.println("------------------------------\nListo!! :D "+
			"Terminado en " + intentos + " intentos"+
			" | (" + subIntentos + " subintentos)");
	}
}