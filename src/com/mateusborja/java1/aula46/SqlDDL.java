/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java1.aula46;

public interface SqlDDL {
	
	void create(String query);
	void drop(String query);
	void alter(String query);

}
