/**
 * Clase pirncipal del sistemas y la que contiene el metodo de ejecion principal MAIN
 */
package Interface_Main_Lockers.StartCode_Lockers_Manager;

import Interface_Main_Lockers.Windows_Lockers_Manager.Load_Window_Lockers_Manager;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author Lopez Santiago Angelica
 */
public class Start_Lockers_Manager {

	/**
	 * Metodo principal de ejecucion que realiza la ejejcion del sistema
	 * 
	 * @param args
	 *            argumento que cuenta el numeo o contiene el nuemo de variable
	 *            del sistema
	 */
	public static void main(String args[]) {

		try {

			// linea de aplicaiond e estito de tipo Windows al sistema y asi
			// poder contener una mejor apariencia
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

			// arranque de hilo para la simulacion de una ventanita de carga de
			// parametros y la posteriormente el funcionamiento del sistema
			new Thread(new Load_Window_Lockers_Manager()).start();

			// meotodo para cachar un error del tipo de objeto con el que se
			// tenga una complicacion
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {

			Logger.getLogger(Start_Lockers_Manager.class.getName()).log(Level.SEVERE, "Error de Ejecucion");

		}

	}

}
