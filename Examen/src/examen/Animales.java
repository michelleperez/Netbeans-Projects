/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author michelle
 */
abstract public class Animales {
    protected String nombre;
    protected int tamaño;
    protected String genero;
    protected int edad;
    public Animales(String nombre, String genero,int tamaño,int edad){
        this.nombre=nombre;
        this.genero=genero;
        this.edad=edad;
        this.tamaño=edad;
        
    }
    protected abstract void moverse();
    protected abstract void tipoReproduccion();
    protected abstract void TipoRespiracion();
    protected abstract void imprimir();

         public int gettamaño() {
		return tamaño;
	}

	public void settamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		nombre = nombre;
	}

	public String getgenero() {
		return genero;
	}

	public void setgenero(String genero) {
		genero = genero;
	}

	public int getedad() {
		return edad;
	}

	public void setedad(int edad) {
		edad = edad;
	}
    
}
