package misClases;

import java.util.Arrays;

public class Aplicacion {

	public static void main(String[] args) {
	
		//establecer un array bidimensional
		int [][] tabla= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		for(int i=0;i<tabla.length;i++) {
			for(int j=0;j<tabla[i].length;j++) {
				System.out.print(" "+ tabla[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<tabla.length;i++) {
			System.out.println(Arrays.toString(tabla[i]));
		}

	}

}
