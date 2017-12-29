package com.deibid;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Info {

	public static void main(String[] args) {
		
		Vector a = new Vector(2, 3, 6);
		//CODIGO PARA TRADUCIR UN OBJETO
		
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream salida = new ObjectOutputStream(baos);
			salida.writeObject(a);
			
			for (byte b: baos.toByteArray()) {
				
				System.out.print((char)b);
			}
		} catch (Exception e) {
			
		}
		
		//FIN
		
	}
}


class Vector implements Serializable{ //Olvidate de "implements Serializable" es necesario para traducir objetos
	
	static Vector UNIT_X = new Vector(1, 0, 0);
	static Vector UNIT_Y = new Vector(0, 1, 0);
	static Vector UNIT_Z = new Vector(0, 0, 1);
	static Vector ZERO = new Vector(0, 0, 0);
	
	int x,y,z;
	
	public Vector(int x,int y,int z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public float len() {
		
		return (float) Math.sqrt(x^2 + y^2 + z^2);
	}
	
	public float dst(Vector b) {
		
		return (float) Math.sqrt((b.x - x)^2 + (b.y - y)^2 + (b.z - z)^2);
	}
	
	public static Vector suma(Vector a, Vector b) {
		
		return new Vector(a.x + b.x, a.y + b.y, a.z + b.z);
	}
}