package main;

public class GestorVideo {
	
	public String tipo;
	private int version;
	
	public GestorVideo() {
		System.out.println("constructor que no pide nada");
	}
	

	public GestorVideo(int MaxVideos) {
		System.out.println("constructor que pide entero");
	}
	
	public void borrarVideo(int id) {
		System.out.println("borrando video id: " + id);
	}

	public boolean existeVideo(int id) {
		System.out.println("comprobando si hay un archivo de video para "
					+ "video de id: " + id);
		return true;
	}
	
	private void crearCarpeta(String carpeta) {
		System.out.println("creando carpeta: " + carpeta);
	}
}
