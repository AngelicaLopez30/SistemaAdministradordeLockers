/**
 * Clase para la evaluacion de las peticioens y eventos del calendario
 * del sistema asi como como el control de las funcioens de cambio de cada 
 * mes con respecto a los dias reales del cada mes que transcurran tembien 
 * se determina le color en caso de estar ocupado el dia con al gun evento 
 * o otro color en caso de no tener nada
 */
package Interface_Main_Lockers.Windows_Lockers_Manager.Code;

import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar1;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar2;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar3;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar4;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar5;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar6;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar7;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar8;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar9;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar10;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar11;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar12;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar13;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar14;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar15;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar16;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar17;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar18;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar19;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar20;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar21;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar22;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar23;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar24;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar25;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar26;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar27;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar28;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar29;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar30;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar31;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar32;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar33;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar34;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar35;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar36;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar37;
import static Interface_Main_Lockers.Windows_Lockers_Manager.Beginning_Window_Lockers_Manager.calendar38;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;

/**
 *
 * @author Lopez Santiago Angelica
 */
public class Calendar_Event_Lockers_Manager {

	// Arreglos principale de la clse para la determinaicon de los eventos y cad
	// uno de los botones del programa
	private final ArrayList<JButton> button;
	private final ArrayList<String> _day;
	private ArrayList<String> data;

	// Variable gloabl de la fecha par la evalucino de lso datos que se
	// requierean obtner
	@SuppressWarnings("unused")
	private final Date fecha = new Date();
	private String Year;

	/**
	 * Constructor que carga low datos qeru tenga el arreglo button lo que nos
	 * indica que el contendra el control de los evento de los botones dle
	 * sistema
	 */
	public Calendar_Event_Lockers_Manager() {

		this.button = new ArrayList<JButton>();
		this._day = new ArrayList<String>();
		this.button.add(calendar1);
		this.button.add(calendar2);
		this.button.add(calendar3);
		this.button.add(calendar4);
		this.button.add(calendar5);
		this.button.add(calendar6);
		this.button.add(calendar7);
		this.button.add(calendar8);
		this.button.add(calendar9);
		this.button.add(calendar10);
		this.button.add(calendar11);
		this.button.add(calendar12);
		this.button.add(calendar13);
		this.button.add(calendar14);
		this.button.add(calendar15);
		this.button.add(calendar16);
		this.button.add(calendar17);
		this.button.add(calendar18);
		this.button.add(calendar19);
		this.button.add(calendar20);
		this.button.add(calendar21);
		this.button.add(calendar22);
		this.button.add(calendar23);
		this.button.add(calendar24);
		this.button.add(calendar25);
		this.button.add(calendar26);
		this.button.add(calendar27);
		this.button.add(calendar28);
		this.button.add(calendar29);
		this.button.add(calendar30);
		this.button.add(calendar31);
		this.button.add(calendar32);
		this.button.add(calendar33);
		this.button.add(calendar34);
		this.button.add(calendar35);
		this.button.add(calendar36);
		this.button.add(calendar37);
		this.button.add(calendar38);
		this._day.add("Mon");
		this._day.add("Tue");
		this._day.add("Wed");
		this._day.add("Thu");
		this._day.add("Fri");
		this._day.add("Sat");
		this._day.add("Sun");

	}

	/**
	 * Extraccion de los datos de las evento de los botones de todo el
	 * calendario del sistema con respecto a cada uno de los meses del año y la
	 * determinacio de la pocision de los datos de cada calendario con respecto
	 * al seguimiento real de un calendario de forma grafica
	 * 
	 * @param date
	 *            variable que contiene la fecha
	 * @param day
	 *            variblae que contiene el dia actual
	 * @param month
	 *            variable que contiene el mes actual
	 * @param year
	 *            varible que contiene el año actual
	 * @param dataq
	 *            variable de tipo arreglo que contiene los datos de cada dia
	 *            del mes actual para la reprecnetacion de los eventos en el
	 *            sistema
	 */
	public void getDayCalendar(String date, String day, String month, String year, ArrayList<String> dataq) {

		Year = year;
		data = dataq;
		int day1 = _day.indexOf(day);

		int date1 = Integer.parseInt(date);

		// Valuacion por medio de un for de cadauno de los dias del mes par la
		// verificaion de que es loq eu se tiene planeado apra ese dia
		// y no solo eso sino para la colocacion de los numeor de cada dia con
		// su respespectivo calendario
		for (int i = date1; 1 < i; i--) {

			if (day1 != 0) {

				day1--;

			} else {

				day1 = 6;

			}

		}

		// determinacio de los dias de mes que seran lunes, martes, miercoles,
		// jueves, viernes, sabado y domingo esto se realiza por medio de un
		// arreglo
		switch (_day.get(day1)) {

		case "Mon":
			this.setIconButton(0, getMonth(month));
			break;

		case "Tue":
			this.setIconButton(1, getMonth(month));
			break;

		case "Wed":
			this.setIconButton(2, getMonth(month));
			break;

		case "Thu":
			this.setIconButton(3, getMonth(month));
			break;

		case "Fri":
			this.setIconButton(4, getMonth(month));
			break;

		case "Sat":
			this.setIconButton(5, getMonth(month));
			break;

		case "Sun":
			this.setIconButton(6, getMonth(month));
			break;

		}

	}

	/**
	 * Funcio para la determinacin de los dias que se tiene en cada uno de los
	 * mese
	 * 
	 * @param month
	 *            varible que contiene el mes
	 * @return valor de retorno de tipo de entero el cual es los dias de un mes
	 */
	public int getMonth(String month) {

		int _month = 0;

		// evaluacion de cada uno de los mese para la obtencin de los dias
		// exatos con respecto a cada año
		switch (month) {

		case "Jan":
			_month = 31;
			break;

		case "Feb":
			if (Integer.parseInt(Year) % 4 == 0) {

				_month = 29;

			} else {

				_month = 28;

			}

			break;

		case "Mar":
			_month = 31;
			break;

		case "Apr":
			_month = 30;
			break;

		case "May":
			_month = 31;
			break;

		case "Jun":
			_month = 30;
			break;

		case "Jul":
			_month = 31;
			break;

		case "Aug":
			_month = 31;
			break;

		case "Sep":
			_month = 30;
			break;

		case "Oct":
			_month = 31;
			break;

		case "Nov":
			_month = 30;
			break;

		case "Dec":
			_month = 31;
			break;

		default:

		}

		return _month;

	}

	/**
	 * Metodo que determina cual boton es cual en el calendario de sistema
	 * tambien con ello se pude aplicar el evento que tendra a cada uno de los
	 * botones y asi relizar un evento loi mas hacercao a la realizadad
	 * 
	 * @param numberDay
	 *            variable que contiene el numero de dias de un mes
	 * @param numberMonth
	 *            variable euq contiene el mes con el que se raaliza el evento
	 */
	private void setIconButton(int numberDay, int numberMonth) {

		int x = 0;

		for (int i = 0; i < 38; i++) {

			// asigancion de evento a botones que no esten dentro de los
			// parametros del calendario o no cubran un dia del mes
			if (i < numberDay) {

				button.get(i).setIcon(new javax.swing.ImageIcon(
						getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
				button.get(i).setActionCommand("0");

			}

			if (i < (numberDay + numberMonth) && i >= numberDay) {

				if (data.get(x).indexOf("DISPONIBLE") != -1) {

					// asignacion de un color al boton con respecto al evento
					// del calendario
					x++;
					button.get(i).setIcon(new javax.swing.ImageIcon(getClass()
							.getResource("/Interface_Main_Lockers/Image_Lockers_Manager/Clear/" + x + ".png")));

				} else {

					// asignacion de un color al boton con respecto al evento
					// del calendario
					x++;
					button.get(i).setIcon(new javax.swing.ImageIcon(getClass()
							.getResource("/Interface_Main_Lockers/Image_Lockers_Manager/Dark/" + x + ".png")));

				}

				button.get(i).setActionCommand("" + x);

			}

			// asigancion de evento a botones que no esten dentro de los
			// parametros del calendario o no cubran un dia del mes
			if (i >= (numberDay + numberMonth)) {

				button.get(i).setIcon(new javax.swing.ImageIcon(
						getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
				button.get(i).setActionCommand("0");

			}

		}

	}

}
