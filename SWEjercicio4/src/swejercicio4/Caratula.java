/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swejercicio4;

/**
 *
 * @author labctr
 */
public class Caratula {
    private String titulo;
    private String autor;
    private int unidad;
    private int deber;
    private String descripcion;

    public Caratula(String titulo, String autor, int unidad, int deber, String descripcion) {
        this.titulo = titulo;
        this.autor = autor;
        this.unidad = unidad;
        this.deber = deber;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(byte unidad) {
        this.unidad = unidad;
    }

    public int getDeber() {
        return deber;
    }

    public void setDeber(byte deber) {
        this.deber = deber;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void mostrarCaratula(){
    System.out.println("----------------------------------------------------------------------");
    System.out.println("                 "+this.titulo);
    System.out.println("                         "+this.autor);
    System.out.println("                           UNIDAD "+this.unidad);
    System.out.println("Deber#"+this.deber);
    System.out.println("Descripción: "+this.descripcion);
    System.out.println("----------------------------------------------------------------------");
    System.out.println();    
    }
    
}
