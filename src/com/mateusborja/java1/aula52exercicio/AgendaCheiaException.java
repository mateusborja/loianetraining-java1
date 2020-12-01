/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 53 exercicio 
package com.mateusborja.java1.aula52exercicio;

public class AgendaCheiaException extends Exception{
	
	@Override
	public String getMessage() {
		return "Agenda está cheia!";
	}

}
