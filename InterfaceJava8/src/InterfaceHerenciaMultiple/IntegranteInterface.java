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
public interface IntegranteInterface {

	default void concentrarse() {
		System.out.println("Concentrarse (Interface IntegranteInterface)");
	}

	default void viajar() {
		System.out.println("Viajar (Interface IntegranteInterface)");
	}

}