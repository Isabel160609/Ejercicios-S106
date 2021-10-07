package s106Nivell1Exercici1;

import java.util.ArrayList;
import java.util.Arrays;

public class ContenedorClass {
	Persona persona1;
	Persona persona2;
	Persona persona3;
	private Persona[] personas=new Persona[3];
	
	public ContenedorClass (Persona persona1,Persona persona2,Persona persona3) {
		this.persona1=persona1;
		this.persona2=persona2;
		this.persona3=persona3;
		
		
		personas[0]=this.persona1;
		personas[1]=this.persona2;
		personas[2]=this.persona3;
		
		
	}

	public Persona getPersona1() {
		return persona1;
	}

	public void setPersona1(Persona persona1) {
		this.persona1 = persona1;
	}

	public Persona getPersona2() {
		return persona2;
	}

	public void setPersona2(Persona persona2) {
		this.persona2 = persona2;
	}

	public Persona getPersona3() {
		return persona3;
	}

	public void setPersona3(Persona persona3) {
		this.persona3 = persona3;
	}

	public Persona[] getPersonas() {
		return personas;
	}

	public void setPersonas(Persona[] personas) {
		this.personas = personas;
	}

	@Override
	public String toString() {
		return "ContenedorClass [personas=" + Arrays.toString(personas) + "]";
	}
	
	
}
