/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceHerenciaMultiple;

/**
 *
 * @author michelle
 */
public interface DeportistaInterface {

	default void entrenar() {
		System.out.println("Entrenar (Interface DeportistaInterface)");
	}

	default void jugarPartido() {
		System.out.println("Jugar Partido (Interface DeportistaInterface)");
	}
}