package com.inapow;

import javax.swing.JOptionPane;

public class NumeroMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int numeroObjetivo = Integer.parseInt(JOptionPane.showInputDialog("Numero objetivo"));;
			int numeroA = Integer.parseInt(JOptionPane.showInputDialog("Numero A"));
			int numeroB = Integer.parseInt(JOptionPane.showInputDialog("Numero B"));
			
			if(Math.abs(numeroObjetivo - numeroA) >Math.abs(numeroObjetivo - numeroB)){
				System.out.println("B esta mas cerca");
			}else if(Math.abs(numeroObjetivo - numeroA) <Math.abs(numeroObjetivo - numeroB)){
				System.out.println("A esta mas cerca");
			}else if(Math.abs(numeroObjetivo - numeroA) == Math.abs(numeroObjetivo - numeroB)){
				System.out.println("Linse, los numeros estan en la misma distancia");
			}
			
	}

}
