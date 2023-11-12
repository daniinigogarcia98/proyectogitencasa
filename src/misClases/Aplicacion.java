package misClases;

import java.util.Arrays;

public class Aplicacion {

	public static void main(String[] args) {
	
		//establecer un array bidimensional
		int [][] tabla= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int[] sumaColumnas = sumarColumnas(tabla);
		int[] sumaFilas = sumarFilas(tabla);
		for(int i=0;i<tabla.length;i++) {
			for(int j=0;j<tabla[i].length;j++) {
				System.out.print(" "+tabla[i][j]+ " "+"|");
			}
			System.out.println();
		}
		for(int i=0;i<tabla.length;i++) {
				System.out.println(Arrays.toString(tabla[i]));
		}
		System.out.println(Arrays.toString(sumaColumnas));
		System.out.println(Arrays.toString(sumaFilas));
	}
	//metodo dado el array tabla sume sus columnas y 
	// la devuelva como un array unidimensional
	public static int[] sumarColumnas(int[][] tabla) {
		// Inicializar un array unidimensional de enteros 
		//con la longitud de la primera fila del array tabla
		int[] sumaColumnas = new int[tabla[0].length];
		 
	    // Recorremos cada fila del array
		for(int i=0;i<tabla.length;i++) {
		// Recorremos cada columna de la fila actual
			for(int j=0;j<tabla[i].length;j++) {
		// Obtenemos la suma actual de la columna j
				int[] suma=sumaColumnas;
	 // Agregar el valor actual del array tabla 
	//a la suma actual de la columna j		
				suma[j]=suma[j]+ tabla[i][j];
			}
		}
		// Devolver el array sumaColumnas 
		//que contiene la suma de cada columna del array de tabla
		return sumaColumnas;
	}
	//metodo que devuelva un array unidimensional a partir de la suma
	//de las filas del array tabla
	public static int[] sumarFilas(int[][] tabla) {
		// Inicializar un array unidimensional de enteros 
		//con la longitud de la primera columna del array tabla
		int[] sumaFilas = new int[tabla.length];
		// Recorrer cada fila del array tabla
		  for(int i=0;i<tabla.length;i++) {
		// Recorrer cada columna de la fila actual
			  for(int j=0;j<tabla[i].length;j++) {
		// Obtener la suma actual de la fila i
				  int[] suma=sumaFilas;
		// Agregar el valor actual del array tabla 
		//a la suma actual de la fila i
				  suma[i]=suma[i]+ tabla[i][j];  
			  }
		  }
		// Devolver el array sumaFilas  que contiene 
		  //la suma de cada fila del array tabla
		return sumaFilas;
		
	}
	
}
