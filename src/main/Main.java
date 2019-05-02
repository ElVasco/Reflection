package main;

public class Main {

	public static void main(String[] args) {
		//reflection tiene muchos usos, uno muy importante
		//es inspeccionar otros elementos para saber que elementos tiene
		//y de esta forma poder actuar en consecuencia
		
		//Reflection se basa en el uso de la calse Class
		//puedo obtener un elemento de tipo Class de tres formas
		
		Class<GestorVideo> miClass1 = GestorVideo.class;
		//.class es una propiedad static public que tienen todas las 
		//clases de java por heredar de la clase Object
		
		System.out.println("uso del primer class: " + miClass1.getSimpleName());
		
		GestorVideo gestorVideo = new GestorVideo();
		Class miCass2 = gestorVideo.getClass();
		//getClass es un metodo publico que tiene todas las clases de java
		//por heredar de a clase Object
		
		System.out.println("uso del segundo class: " + miCass2.getSimpleName());
		
		try {
			Class miClass3 = Class.forName("main.GestorVideos");
			System.out.println("uso del tercer class: " + miClass3.getSimpleName());
		} catch (ClassNotFoundException e) {
			System.out.println("No he encontrado la clase");
			e.printStackTrace();
		}
	}

}
