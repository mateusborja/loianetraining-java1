/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java1.aula45;

public class Teste {

	public static void main(String[] args) {

		Object obj1 = obterString();
		String s1 = (String) obj1; // downcasting
		
		Object obj2 = "Minha String";
		String s2 = (String) obj2;
		
		Object obj3 = new Object();
		String s3 = (String) obj3; // erro class cast

	}

	public static String obterString() {
		return "Minha string";
	}

	public static int obterInteiro() {
		return 1;
	}

}
