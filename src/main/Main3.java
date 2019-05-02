package main;

import java.lang.reflect.Method;

public class Main3 {

	public static void main(String[] args) {
		//usar metodos y campos por reflection
		
		try {
			Class classGestorVideo = Class.forName("main.GestorVideo");
			Object instancia = classGestorVideo.newInstance();
			
			//invocar metodo sobre instancia
			Method borrarVideo = classGestorVideo.getDeclaredMethod("borrarVideo", int.class);
			borrarVideo.invoke(instancia, 55);
			//una gran ventaja que muestra este ejemplo, es que en ningun momento
			//dependemos de una clase concreta
			
			//podemos incluso llegar a usar metodos y atributos privados.
			
			Method obtenerMetodoPrivado = classGestorVideo.getDeclaredMethod("crearCarpeta", String.class);
			obtenerMetodoPrivado.setAccessible(true);
			obtenerMetodoPrivado.invoke(instancia, "carpeta-nueva");
			
			//invocar de nuevo el metodo privado de la forma tradicional
			GestorVideo gestorVideo = new GestorVideo();
			//lo siguiente nisiquiera te deja compilar
			//gestorVideo.crearCarpeta();
			
		} catch (Exception e) {
			System.out.println("error en reflection");
			e.printStackTrace();
		}
		
	}

}
