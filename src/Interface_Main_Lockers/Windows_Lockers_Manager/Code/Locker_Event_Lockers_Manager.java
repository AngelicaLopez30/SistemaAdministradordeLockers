/**
 * clase que maneja las operaciones y lso eventos de interfaz lockres
 * tambie nes aquella que determina cual del os lockeers eta disponible 
 * y ocupado por algun usuario 
 */
package Interface_Main_Lockers.Windows_Lockers_Manager.Code;

import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker1;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker10;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker11;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker12;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker13;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker14;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker15;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker16;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker17;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker18;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker19;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker2;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker20;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker21;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker22;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker23;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker24;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker25;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker26;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker27;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker28;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker3;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker4;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker5;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker6;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker7;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker8;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Lockers_Window_Lockers_Manager.locker9;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;

/**
 *
 * @author Lopez Santiago Angelica
 */
public class Locker_Event_Lockers_Manager {

	// Arreglos que cargan lo eventon y las propiedades de los boton de la
	// interfaz Lockers
	public final ArrayList<JButton> button;
	public ArrayList<String> event;

	// Constructor que inicializa los lugares que se ocuparane en los arreglos
	public Locker_Event_Lockers_Manager() {

		this.button = new ArrayList<JButton>();
		this.button.add(locker1);
		this.button.add(locker2);
		this.button.add(locker3);
		this.button.add(locker4);
		this.button.add(locker5);
		this.button.add(locker6);
		this.button.add(locker7);
		this.button.add(locker8);
		this.button.add(locker9);
		this.button.add(locker10);
		this.button.add(locker11);
		this.button.add(locker12);
		this.button.add(locker13);
		this.button.add(locker14);
		this.button.add(locker15);
		this.button.add(locker16);
		this.button.add(locker17);
		this.button.add(locker18);
		this.button.add(locker19);
		this.button.add(locker20);
		this.button.add(locker21);
		this.button.add(locker22);
		this.button.add(locker23);
		this.button.add(locker24);
		this.button.add(locker25);
		this.button.add(locker26);
		this.button.add(locker27);
		this.button.add(locker28);

	}

	/**
	 * Metodo que evalua que botno de la interfaz debe de estar en oscuro o
	 * claro con ayuda de los datos que se han obtenid opor el sistema
	 * 
	 * @param data
	 *            arreglo que contiene los datos de una consulta realizada a al
	 *            base de datos MySQL
	 * @param building
	 *            variable que contiene el edificion con cual se estan buscando
	 *            los datos del sistema
	 */
	public void getAvailability(ArrayList<String> data, String building) {

		// ejecuciond el metodo de para la seleccion de los datos de un solo
		// edificion
		data = selectionBuilding(data, building);

		int y = 0;
		// ciclo que for que realizac la lectura del arreglo que contiene los
		// botones del sistema y la asi poder realizar la evalicion de los
		// mismos
		for (JButton x : button) {

			// evalucion de si un lockers esta disponible o no
			if (data.indexOf("LOCKER" + (y + 1) + "#" + building) == -1) {

				// Asiugancion de un nuevo color por medio de una imagen
				y++;
				x.setIcon(new javax.swing.ImageIcon(getClass()
						.getResource("/Interface_Main_Lockers/Image_Lockers_Manager/Clear/CasC" + y + ".jpg")));

			} else {

				// Asiugancion de un nuevo color por medio de una imagen
				y++;
				x.setIcon(new javax.swing.ImageIcon(getClass()
						.getResource("/Interface_Main_Lockers/Image_Lockers_Manager/Dark/CasO" + y + ".jpg")));

			}

		}

	}

	/**
	 * Metodo para fijar el evento que contendra cada uno de los botones del
	 * sistema a que es donde se determina si esta disponible y si no cuales con
	 * los datos de su usuario
	 * 
	 * @param data
	 *            datos de la base de datos en tipo de ArrayList par su
	 *            evaluacion
	 * @param building
	 *            variable que determina si la evalucin sera para un edificon en
	 *            especial
	 * @return el valor que se retornara es de tipo ArrayList
	 */
	public ArrayList<String> selectionBuilding(ArrayList<String> data, String building) {

		ArrayList<String> dataNew = new ArrayList<String>();

		// lectura de los daros obtenedos por la base de datos en cun ciclo for
		// para su evalucion posteriro
		for (String x : data) {

			// Evaluacion de la existencia de un locker en el edificio
			// especifico por la variable building en el sistema
			if (x.indexOf("#" + building) != -1) {

				// Obtencion de la posision del locker que es ocupado por un
				// usuario
				dataNew.add(x.substring(x.indexOf("&") + 1, x.length()));

			}

		}

		return dataNew;

	}

	/**
	 * Metodo de seleccion de los eventos los cuales seran por cada uno de los
	 * datos que se optengan de la base de datos y asi como la deteminacion de
	 * su dispocicion en el sistema de cad uno de los lockers
	 * 
	 * @param data
	 *            datos de la base de datos en tipo de ArrayList par su
	 *            evaluacion
	 * @param building
	 *            variable que determina si la evalucin sera para un edificon en
	 *            especial
	 * @return el valor que se retornara es de tipo ArrayList
	 */
	public ArrayList<String> selectionEvent(ArrayList<String> data, String building) {

		// arreglo de que marca a todos los eventos de las botones de la
		// interfaz
		// como si estuvieran libre y no tuvieran un usuario que les ocupara
		String array[] = new String[] { "Libre 1", "Libre 2", "Libre 3", "Libre 4", "Libre 5", "Libre 6", "Libre 7",
				"Libre 8", "Libre 9", "Libre 10", "Libre 11", "Libre 12", "Libre 13", "Libre 14", "Libre 15",
				"Libre 16", "Libre 17", "Libre 18", "Libre 19", "Libre 20", "Libre 21", "Libre 22", "Libre 23",
				"Libre 24", "Libre 25", "Libre 26", "Libre 27", "Libre 28" };

		// ciclo for que lee los datos de la tabla lockers de la base de datos
		// MySQL
		for (String x : data) {

			// Evaluacion de la que los datos evalucdos existan a un solo
			// edifico del sistema a la vez y no mas de uno
			if (x.indexOf("#" + building) != -1) {

				// Obtencion de la posision del locker que es ocupado por un
				// usuario
				int y = Integer.parseInt(x.substring(x.indexOf("&") + 7, x.indexOf("#")));
				array[y - 1] = x.replace("-", " con nombre ").replace("%", "\nen el periodo\n");
			}

		}

		// converciond de un arreglo a ArrayList
		this.event = new ArrayList<String>(Arrays.asList(array));

		return event;

	}

}
