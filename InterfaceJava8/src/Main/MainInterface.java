/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import interfacejava8.Entrenador;
import interfacejava8.Futbolista;
import interfacejava8.Masajista;
import interfacejava8.SeleccionFutbol;
import java.util.ArrayList;

/**
 *
 * @author michelle
 */

public class MainInterface {

	// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {

		SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, 28489);
		SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
		SeleccionFutbol raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

		// RUEDA DE PRENSA CON EL MÉTODO DEFAULT
		System.out.println("Todos los integrantes dan una rueda de prensa. (Todos ejecutan el mismo método)");
                integrantes.stream().map((integrante) -> {
                    System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
                return integrante;
            }).forEachOrdered((integrante) -> {
                integrante.ruedaPrensa();
            });
		
		// VIDEO PUBLICITARIO CON EL MÉTODO STATIC
		System.out.println("\nTodos los integrantes graban un video publicitario. (Todos ejecutan el mismo método)");
                integrantes.stream().map((integrante) -> {
                    System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
                return integrante;
            }).forEachOrdered((integrante) -> {
                integrante.videoPublicitario();
            });
				
		// CONCENTRACION
		System.out.println("\nTodos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
                integrantes.stream().map((integrante) -> {
                    System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
                return integrante;
            }).forEachOrdered((integrante) -> {
                integrante.concentrarse();
            });

		// VIAJE
		System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
                integrantes.stream().map((integrante) -> {
                    System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
                return integrante;
            }).forEachOrdered((integrante) -> {
                integrante.viajar();
            });

		// ENTRENAMIENTO
		System.out.println("\nEntrenamiento: Todos los integrantes tienen su función en un entrenamiento (Especialización)");
                integrantes.stream().map((integrante) -> {
                    System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
                return integrante;
            }).forEachOrdered((integrante) -> {
                integrante.entrenar();
            });

		// PARTIDO DE FUTBOL
		System.out.println("\nPartido de Fútbol: Todos los integrantes tienen su función en un partido (Especialización)");
                integrantes.stream().map((integrante) -> {
                    System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
                return integrante;
            }).forEachOrdered((integrante) -> {
                integrante.jugarPartido();
            });

	}
}