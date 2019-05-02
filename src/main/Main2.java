package main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main2 {

	public static void main(String[] args) {
		//Inspeccionar elementos con reflection
		
		try {
			Class classGestorVideo = Class.forName("main.GestorVideo");
			Object instancia  = classGestorVideo.newInstance();
			Constructor constructorQuePideUnInt = 
					classGestorVideo.getConstructor(int.class); 
			Object instanciaConstructorPideInt = 
					constructorQuePideUnInt.newInstance(5);
			//puedo obtener metodos, campos y cualquier elemento d eun class
			
			Method[] metodos = classGestorVideo.getMethods();
			
			for (Method method : metodos) {
				//asi obtengo los metodos publicos de la clase y de las que heredas
				System.out.println("method name :" + method.getName());
			}
			
			 System.out.println("\n");
			metodos = classGestorVideo.getDeclaredMethods();
			
			for (Method method : metodos) {
				//asi obtengo los metodos publico, privados y protectet de la clase unicamente.
				System.out.println("method name :" + method.getName());
			}
			
			System.out.println("\n");
			//puedo hacer lo mismo con campos
			Field[] camposDeLaClase = classGestorVideo.getDeclaredFields();
			
			for (Field field : camposDeLaClase) {
				System.out.println("atributo : " + field);
			}
			
		} catch (Exception e) {
			System.out.println("Exepcion usando reflection");
			e.printStackTrace();
		}
		
	}

}
