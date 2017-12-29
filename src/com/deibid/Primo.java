package com.deibid;

import java.util.ArrayList;

public class Primo {
	
	public static void main(String[] args) {
		
		System.out.println(probability(50)); //en la mayoria de los casos solo se hacen menos de 10 iteraciones
	}
	
	public static float probability(int target) { // Probabilidad de que un numero al azar del 1 a target sea primo
		
		ArrayList<Integer> ns = new ArrayList<>();
		for (int i = 1; i < target + 1; i++) {
			
			if(isPrime(i)) ns.add(i);
		}
		
		return ns.size()/(float)target;
	}
	public static boolean isPrime(int target) {return isPrime(2, target);}
	public static boolean isPrime(int n,int target) {
		
		if(n == 1 || n == target || target == 1) return true;
		if(target % n == 0) return false;
		else return isPrime(n % 2 == 0 ? n + 1: n +2, target); //Nunca compruebes si target es divisble por un par
	}
}
