package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.webspring.models.Persona;

class PersonaTest {

	@Test
	void mayorEdadTest() {
		Persona p = new Persona("Borja", 28);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}

}
