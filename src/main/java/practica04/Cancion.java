package practica04;
/*
 * Clase Cancion
 * Autor: Angeles Junco
 */
 
 public class Cancion implements Comparable<Cancion> {
 	
 	private String titulo;
 	private String artista;
 	private String genero;
 	private double precio;
 	
 	public Cancion(String titulo, String artista, String genero, double precio) {
 		this.titulo = titulo;
 		this.artista = artista;
 		this.genero = genero;
 		if (precio >= 0.0)
 			this.precio = precio;
 		else
 			this.precio = 0.0;
 	}
 	
 	public void setPrecio(double precio) {
 		if (precio >= 0.0)
 			this.precio = precio;
 	}
 	
 	public double getPrecio() {
 		return this.precio;
 	}
 	
 	public String getTitulo() {
 		return this.titulo;
 	}
 	
 	public String getArtista() {
 		return this.artista;
 	}
 	
 	public String getGenero() {
 		return this.genero;
 	}
 	
 	public String toString() {
 		
 		return "\nTitulo: " + this.titulo + "\tArtista: " + this.artista + "\tGenero: " +
 			this.genero + "\tPrecio: " + this.precio; 
 	}
 	 	
 	public int compareTo(Cancion c) {
 		if(this.titulo.compareTo(c.titulo)==0)
 			return 0;
 		if(this.titulo.compareTo(c.titulo)>0)
 			return 1;
 		return -1;
 	}

 }