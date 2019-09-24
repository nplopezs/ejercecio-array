package practica04;
/*  Clase ArrayListUtilApp.java
	Autor 1: <nombre alumno 1>  <matr�cula alumno 1>
	Autor 2: <nombre alumno 2>  <matr�cula alumno 2>
	Fecha:  <fecha de entrega>
	Pr�ctica # 4 - ArrayList

*/
 
import java.util.*;

public class ArrayListUtilApp {

	
	public static void main (String args[]) {
    
    	Integer[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 2, 3, 8, 2, 1, 7, 7, 7, 9, 2, 4, 5};
    	String [] arrStr = {"hola", "adios", "computadora", "zoila", "zocalo", "anillo", "camion", "flores", "raton"};
    	Integer[] arrInt2 = {22, 34, 3, 46, 5, 6, 73, 8, 2, 3, 8, 2, 11, 7, 7, 7, 9, 2, 4, 55, 96, 73, 99, 9};
    	int pos;
    
    	ArrayList <Integer> c = new ArrayList <Integer>(arrInt.length);
    	ArrayList <String> d = new ArrayList <String>(arrStr.length);
    	ArrayList <Integer> a = new ArrayList <Integer>(arrInt2.length);
    	      
      	for (int i = 0; i < arrInt.length; i++) 
			c.add(arrInt[i]);

	   	for (int i = 0; i < arrStr.length; i++) 
			d.add(arrStr[i]);
		
		for (int i = 0; i < arrInt2.length; i++) 
			a.add(arrInt2[i]);
	

      	System.out.println("\n\n***  Probando metodo Ocurrencias  ***");
      	System.out.println("\nArrayList original: " + c);
      	int tot = ArrayListUtilApp.ocurrencias(c, 7);
      	if (tot > 0)
      		System.out.println("\nEl dato 7 se encuentra un total de : " + tot + " veces");
		else
      		System.out.println("\nEl dato 7 NO se encuentra");

 		tot = ArrayListUtilApp.ocurrencias(c, 23);
      	if (tot > 0)
      		System.out.println("\nEl dato 23 se encuentra un total de : " + tot + " veces");
		else
      		System.out.println("\nEl dato 23 NO se encuentra");
			
			
			
     	System.out.println("\n\n***  Probando metodo Cadena Mas Larga  ***");
      	System.out.println("\nArrayList original: " + d);
      	System.out.println("\nLa cadena mas larga es: " + ArrayListUtilApp.cadenaMasLarga(d));
   
      	
     	System.out.println("\n\n***  Probando metodo Cadena Mayor  ***");
      	System.out.println("\nArrayList original: " + d);
      	System.out.println("\nLa cadena mas larga es: " + ArrayListUtilApp.cadenaMayor(d));
   
			
			
      	System.out.println("\n\n***  Probando metodo Elimina Duplicados  ***");
      	System.out.println("\nArrayList original: " + c);
      	ArrayListUtilApp.eliminaDuplicados(c);
      	System.out.println("\nArrayList sin duplicados: " + c);
      
      	System.out.println("\n\n***  Probando metodo Elimina Mayores a 6  ***");
      	System.out.println("\nArrayList original: " + c);
      	ArrayListUtilApp.eliminaMayores(c, 6);
      	System.out.println("\nArrayList sin mayores a 6 : " + c);
      
      	System.out.println("\n\n***  Probando elimina mayores a \"mama\"  ***");
      	System.out.println("\nArrayList original: " + d);
      	ArrayListUtilApp.eliminaMayores(d, "mama");
      	System.out.println("\nArrayList sin mayores a \"mama\" : " + d);
      
      
      
      	// AQUI COLOCA LA PRUEBA DE COLECCIONES
      	System.out.println("\n\n***  Probando la clase Collections sobre el ArrayList a  ***");
     	
        Collections.sort(a);
      	System.out.println("\nArrayList de enteros ordenado: " + a);
      	
        Collections.reverse(a);
      	System.out.println("\nArrayList de enteros invertido: " + a);
      	
        Collections.shuffle(a);
      	System.out.println("\nArrayList de enteros desordenado: " + a);
	
        Collections.sort(a);
	System.out.println("\nArrayList de enteros ordenado: " + a);
      
      
      	
      	System.out.println("\n\n");
	}
  
  
  

	public static<T> void eliminaDuplicados(List<T> lista){
	
	}
	

 
	public static<T extends Comparable<? super T>> void eliminaMayores(List<T> lista, T target){
            for(int i=0;i< lista.size();i++){
            if(lista.get(i).compareTo(target)>0){
                lista.remove(lista.get(i));
                        i--;
                }
            }
	}
    
    
    
   	public static int ocurrencias(List <?> lista, Object target){
	
	
		return 0;
   	}
   
   
   
   	public static<T> String cadenaMasLarga(List<String> lista){
		
		
		return null;
	}
   
   
   
   	public static<T> String cadenaMayor(List<String> lista){
	
	
		return null;
	}
 
}