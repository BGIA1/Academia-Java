package com.poli;

public class Gato extends Animal {
	
	private int edad;
	private String nombre;
	
    public Gato(String nombre, int edad) {
    	this.nombre = nombre;
    	this.edad = edad;
	}
	@Override
    public void hacerSonido() {
        System.out.println("Miau");
    }

    public void arañarMuebles() {
        System.out.println("Arañando los muebles");
    }
    
    public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
}