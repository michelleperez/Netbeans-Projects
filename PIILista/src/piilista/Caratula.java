/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piilista;

/**
 *
 * @author labctr
 */
public class Caratula {
    private String titulo;
    private String materia;
    private String autor;
    private String fecha;
    private byte ejercicio;
    private Unidad unidad;
    private String descripcion;
    //1. Constructor
    public Caratula() {
        
    }
    //2.Geetter nand Setter 
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

    public byte getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(byte ejercicio) {
        this.ejercicio = ejercicio;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    // 3.Metodo personalizado
    public void Mostrar(){
        System.out.println("================================================================================");
        System.out.println("\t\t\t\t" + materia);
        System.out.println("================================================================================");
        System.out.println("\tAutor: " + autor + "\t\t\tFecha: " + fecha);
        System.out.println("================================================================================");
        System.out.println("\tTítulo: " + titulo);
        if(this.ejercicio != 0)
            System.out.println("\tEjercicio: "+ ejercicio);
        System.out.println("\tUnidad: "+ unidad);
        System.out.println("\tDescripcion: "+ descripcion);
        System.out.println("================================================================================");
        
        
    }
}