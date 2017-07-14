/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swejercicio2;

/**
 *
 * @author labctr
 */
public class caratula {
    private String titulo;
    private String materia;
    private String autor;
    private String fecha;
    private byte n_ejercicio;
    private unidad unidad;
    private String descripcion;

    //1.Constructor.
    public caratula() {
    }

    //2.Generar getter & getter.

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public byte getN_ejercicio() {
        return n_ejercicio;
    }

    public void setN_ejercicio(byte n_ejercicio) {
        this.n_ejercicio = n_ejercicio;
    }

    public unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(unidad unidad ) {
        this.unidad = unidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void mostrar(){
        System.out.println(this.getTitulo());
        System.out.println(this.getMateria() );
        System.out.println("Autor:"+this.getAutor());
        System.out.println("Fecha:" + this.getFecha());
        System.out.println("Ejecicio # "+ this.getN_ejercicio());
        System.out.println("Unidad:" +this.getUnidad());
        System.out.println("Descripción::" +this.getDescripcion());
        
    }
    
}
