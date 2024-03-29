package practica04;
/*  Clase ArrayListCancionesApp.java
	Autor 1: <nombre alumno 1>  <matr�cula alumno 1>
	Autor 2: <nombre alumno 2>  <matr�cula alumno 2>
	Fecha:  <fecha de entrega>
	Pr�ctica # 4 - ArrayList*/
 import java.io.*;
import java.util.*;
 
public class ArrayListCancionesApp {
 	
	public static void main(String[] args){
 		 
 		ArrayList<Cancion> can = new ArrayList<Cancion>();
 		ArrayList<Cancion> filtro = new ArrayList<Cancion>();
 		Cancion cancion;
 		Cancion cancionComp = new Cancion("Medusa","a","g",0.0);
 		
 		
 		Scanner scan = null;
		String titulo, artista, genero;
		double precio;
		
		try {
			scan=new Scanner(new FileReader("Canciones.txt"));
			// COMPLETAR Lectura del archivo Canciones.txt y creacci�n del ArrayList de canciones: can
                        while(scan.hasNext()){
                            titulo = scan.next();
                            artista = scan.next();
                            genero = scan.next();
                            precio = scan.nextDouble();
                        
                            cancion = new Cancion(titulo,artista,genero,precio);
                            can.add(cancion);
                        }
                        
				
		} catch (FileNotFoundException e) {
			System.err.println(e);
		} catch (InputMismatchException e) {
			System.err.println(e);
		} catch (java.util.NoSuchElementException e) {
		 	System.err.println(e);
		}
		finally {
			scan.close();
		}
         
		System.out.println("\n\n*** Lista de canciones original ***");
		System.out.println(can);
		
      	filtraR(can, can.size()-1, "Romantica", filtro);
		
      	System.out.println("\n\n*** Lista de canciones Romanticas ***");
      	System.out.println(filtro);

      	filtro = mayoresA(can, cancionComp);

      	System.out.println("\n\n*** Lista de canciones con titulo mayor o igual a Medusa ***");
      	System.out.println(filtro);
 	}
 	
	
	// COMPLETAR
	public static void filtraR(List<Cancion> cancion, 
			int indice, String str, ArrayList<Cancion> filtro) {
        // caso base
            if(indice < 0)
                return;
            //calculo
            if(cancion.get(indice).getGenero().equalsIgnoreCase(str)){
                filtro.add(cancion.get(indice));
            }
            //llamada recursiva
            filtraR(cancion,indice-1,str,filtro);
	}

	
	// COMPLETAR
	public static ArrayList<Cancion> 
	mayoresA(List<Cancion> cancion, Cancion cancionComp){
            ArrayList<Cancion> filtro = new ArrayList<Cancion>();
            for(Cancion can:cancion)
                if(can.compareTo(cancionComp)>0)
                    filtro.add(can);
		
		return null;		
	}
 }