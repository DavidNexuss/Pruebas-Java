package com.inapow;

import javax.swing.*;
public class AutoFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalCasillas = 0;
		int disponer = 0;
		int v = 0;
		int muestreos = 0;
		do{totalCasillas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas casillas tendra la array?"));
		disponer = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas mostrar por cada linea?"));}
		while(totalCasillas <= 0 || disponer <=0 || disponer > totalCasillas);
		
		int[] array = new int[totalCasillas];
		
		for(int i = 0; i < totalCasillas; i++){
			array[i] = (int)(Math.round(Math.random()*1000));
		}
		
		System.out.print("Disponer de " + disponer + " en "+ disponer + "\n----------------------");
		
		for(int x = 0; x < totalCasillas; x += disponer){
			System.out.println("\nMostrando las casillas de " + x + " a " + (x+disponer));
			for(int b = 0; b < disponer; b++){
				try{
				System.out.print(array[v] + " "); 
				}catch(Exception ex){System.out.print("[VACÍO]");}
				v++;
			}
			System.out.println("");
			muestreos++;
		}
		
		System.out.println("\n------------------");
		if(totalCasillas == (disponer * muestreos)){
			System.out.println("Terminado! Comprueba las casillas arriba :D");
		}else{System.out.println("Error!\nEs posible que se hayan mostrado casillas vacias!! >:v +"
				+ "\nLa division " + totalCasillas + "/" + disponer + " no es exacta...");}
		
	}

}
