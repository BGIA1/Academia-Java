package com.poli;

public class Perro extends Animal {
    
	private int edad;
	private String nombre;
	
    public Perro(String nombre, int edad) {
    	this.nombre = nombre;
    	this.edad = edad;
	}
	@Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }
	
    public void perseguirCola() {
        System.out.println("Persiguiendo la cola");
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
