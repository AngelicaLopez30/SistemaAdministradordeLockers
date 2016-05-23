/**
 * Asigacnio de los registros del sistema como evento o tareas 
 * que se realizaron por un periodo largo
 */
package Interface_Main_Lockers.Windows_Lockers_Manager;

import Archive_File.Option_File;
import Source_File.Open_File;
import Source_File.Operation_File;
import Source_File.Save_File;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Lopez Santiago Angelica
 */
@SuppressWarnings("serial")
public class Registration_Lockers_Manager extends javax.swing.JFrame {

	private static boolean error;
	private final Calendar calendar;
	private final Option_File object1;
	private final Beginning_Window_Lockers_Manager object2;

	private ArrayList<String> data;

	// variables para la evaluacion de las fechas del periodo de lapso de cuanto
	// durara un evento o un registro del sistemas
	@SuppressWarnings("unused")
	private static String _YEAR1;
	private static String _MONTH1;
	private static String _DATE1;
	@SuppressWarnings("unused")
	private static String _DAY1;

	@SuppressWarnings("unused")
	private static String _YEAR2;
	@SuppressWarnings("unused")
	private static String _MONTH2;
	private static String _DATE2;
	@SuppressWarnings("unused")
	private static String _DAY2;

	/**
	 * Constructor de la clase que construye la interfaz que se muestra en la
	 * ejecucion de las programa con metodos del swing
	 * 
	 * @param object1
	 *            variable para la escritura de datos del la base de datos
	 * @param object2
	 *            variable instanciasda de la clase principal de la interfaz
	 */
	public Registration_Lockers_Manager(Option_File object1, Beginning_Window_Lockers_Manager object2) {

		this.object1 = object1;
		this.object2 = object2;

		// metodo que contiene la construccion de la clase
		initComponents();

		this.calendar = new GregorianCalendar();
		this.jDateChooser1.setCalendar(calendar);
		this.jDateChooser2.setCalendar(calendar);
		// linea de la asigacion de un icono del sistemas
		this.setIconImage(
				new ImageIcon(getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU.png"))
						.getImage());

	}

	private void initComponents() {

		jDateChooser1 = new com.toedter.calendar.JDateChooser();
		jDateChooser2 = new com.toedter.calendar.JDateChooser();
		jTextField2 = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jButton30 = new javax.swing.JButton();
		jButton31 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Ingresar Registro");

		jDateChooser1.setFont(new java.awt.Font("Arial", 1, 12));

		jDateChooser2.setFont(new java.awt.Font("Arial", 1, 12));

		jTextField2.setFont(new java.awt.Font("Arial", 1, 12));
		jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				jTextField2Error(evt);
				jTextField2letterLarger(evt);
			}
		});

		jLabel10.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel10.setText("Descripción:");

		jLabel11.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel11.setText("Fechas:");

		jButton30.setFont(new java.awt.Font("Arial", 1, 12));
		jButton30.setText("Cancelar");
		jButton30.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton30ActionPerformed(evt);
			}
		});

		jButton31.setFont(new java.awt.Font("Arial", 1, 12));
		jButton31.setText("Aceptar");
		jButton31.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton31ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jTextField2)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 83,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(jButton31))
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE,
														119, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE,
														119, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(layout.createSequentialGroup().addComponent(jLabel11)
														.addGap(96, 96, 96))
												.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup().addComponent(jLabel10)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
								.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel10)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel11)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton30)
						.addComponent(jButton31))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);

	}

	/**
	 * Metodo que contiene el evento sobre el caracter en especial del boton
	 * borra para no perder la secuencias da las cadenas en un jtext por el
	 * cambio de minusculas a muyusculas
	 * 
	 * @param evt
	 *            parametro eviado desde la clses actionperformed en su
	 *            contruccion de la clase
	 */
	private void jTextField2Error(java.awt.event.KeyEvent evt) {

		// validacion de si la tecla precionado por el teclado es borrapara
		// otrogar permisos de camibio de cadena a mayusculas
		if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {

			error = false;

		} else {

			error = true;

		}
	}

	/**
	 * metodo para le cambio de los caracteres de minusculas a mayusculas
	 * 
	 * @param evt
	 *            parametro eviado desde la clses actionperformed en su
	 *            contruccion de la clase
	 */
	private void jTextField2letterLarger(java.awt.event.KeyEvent evt) {

		// obtencion de los caracteres desde el evento realizado al precionar un
		// boton del teclado
		char c = evt.getKeyChar();
		int k = (int) evt.getKeyChar();

		// validacion de los caracteres que son letras munisculas para su
		// posterios cambio a mayusculas
		if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {

			// validacion del a convercion de la cadena a mayusculas
			if (error) {

				evt.setKeyChar(Character.toUpperCase(c));

			}

		}

	}

	/**
	 * Metodo de cancelar la operacion y eliminar la visibilidad del a interfaz
	 * 
	 * @param evt
	 *            parametro eviado desde la clses actionperformed en su
	 *            contruccion de la clase
	 */
	private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {

		this.dispose();

	}

	/**
	 * Metodo que meneja el evento del boton guardar de la interfaz asi como la
	 * realizacion del guardado del registro y su periodo del en el sistemas
	 * 
	 * @param evt
	 *            variable del evento del boton guardar
	 */
	private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {

		// conversio de la fecha optrenida a una fecha aceptable para le
		// sistemas
		String date1 = "" + jDateChooser1.getCalendar().getTime();
		boolean a = false;
		_DATE1 = date1.substring(8, 10);
		_MONTH1 = date1.substring(4, 7);
		_YEAR1 = date1.substring(date1.length() - 4, date1.length());
		_DAY1 = date1.substring(0, 3);

		// conversio de la fecha optrenida a una fecha aceptable para le
		// sistemas
		String date2 = "" + jDateChooser2.getCalendar().getTime();
		_DATE2 = date2.substring(8, 10);
		_MONTH2 = date2.substring(4, 7);
		_YEAR2 = date2.substring(date1.length() - 4, date1.length());
		_DAY2 = date2.substring(0, 3);

		String data1 = "";
		int count = 1;
		// lectura de datos de la base de adtos para suposterior guardao en el
		// base de datos
		Open_File object = new Open_File(object1.getPath("default", "sql").replace("default", _MONTH1));
		data = new ArrayList<String>(Arrays.asList(object.toString().split("\n")));

		// lentura y evalucion de los datos por medio de un for y modificando
		// los datos para el guardao del registro
		for (String x : data) {

			if (count >= Integer.parseInt(_DATE1.replaceAll(" ", ""))
					&& count <= Integer.parseInt(_DATE2.replaceAll(" ", ""))) {

				data1 += "#" + count + ":" + jTextField2.getText() + "\n";
				a = true;
				count++;

			} else {

				data1 += x + "\n";
				count++;

			}

		}

		if (a) {

			// guardado del regirtro en la base de datos provisional
			@SuppressWarnings("unused")
			Operation_File operation = new Save_File(object1.getPath("default", "sql").replace("default", _MONTH1),
					data1);
			operation = new Save_File(
					object1.getPath("default", "sql").replace("default", "Bitacoras\\bitacoraRegistration"),
					"Se ingreso un nuevo evento :" + jTextField2.getText() + " a las: " + new Date(), true);
			this.dispose();
			// confirmacion de la actividad echa
			JOptionPane.showMessageDialog(null, "Se a guardado correctamente el evento.", "SADAL",
					JOptionPane.PLAIN_MESSAGE);
			this.object2.reiniciar();

		} else {
			// mensaje de error por alguna anomalia
			JOptionPane.showMessageDialog(null, "No se pudo realizar la tarea el 100%.", "Error",
					JOptionPane.ERROR_MESSAGE);

		}

	}

	// declaracion de las variables de la interfaz de la clase del sistema
	private javax.swing.JButton jButton30;
	private javax.swing.JButton jButton31;
	private com.toedter.calendar.JDateChooser jDateChooser1;
	private com.toedter.calendar.JDateChooser jDateChooser2;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JTextField jTextField2;

}
