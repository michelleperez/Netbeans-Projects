/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacejava8;

/**
 *
 * @author michelle
 */
public interface IntegranteSeleccionFutbol {

	void concentrarse();

	void viajar();

	void entrenar();

	void jugarPartido();
	
	default void ruedaPrensa(){
		System.out.println(" da una rueda de prensa (desde la Interface)");
	}
	
	default void videoPublicitario (){
		System.out.println(" hacer un video publicitario (desde la Interface)");
	}

}
