package misClases;

import javax.swing.JOptionPane;

public class HolaPersona {

	public static void main(String[] args) {
		//JOptionPane sirve para darnos cuadros de dialogo en interfaz grafica en lugar de consola
		String nombre = JOptionPane.showInputDialog("Dame tu Nombre: ");
        String apellidos=JOptionPane.showInputDialog("Dame tus Apellidos: ");
		JOptionPane.showMessageDialog(null, "Hola ¿Que tal? " + nombre + " " + apellidos);
		
	}

}
