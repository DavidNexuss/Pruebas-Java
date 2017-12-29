package com.deibid;

public class Primo {
	
	public static void main(String[] args) {
		
		System.out.println(isPrime(5212)); //en la mayoria de los casos solo se hacen menos de 10 iteraciones
	}
	
	public static boolean isPrime(int target) {return isPrime(2, target);}
	public static boolean isPrime(int n,int target) {
		
		System.out.println(n);
		if(n == 1 || n == target) return true;
		if(target % n == 0) return false;
		else return isPrime(n % 2 == 0 ? n + 1: n +2, target); //Nunca compruebes si target es divisble por un par
	}
}
