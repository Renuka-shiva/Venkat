package com.Java;
/* Type Casting
 * 1) Implicit 
 * 2) Explicit 
 * 
 */



public class TypeCasting {
	public static void main(String[] args) {
		
		int i='x'; // 'x'---char
		System.out.println(i); // Internally casting is called Implicit typecasting
		
		
		int x=130;
		byte b= (byte)x;
		System.out.println(b);
		
	}

}
