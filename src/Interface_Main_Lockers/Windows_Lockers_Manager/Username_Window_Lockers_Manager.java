/**
 * clase para la creacion de los nuevos usuarios del sistema
 * asi como la validadcion de los datos que se ingresaran en el mismo
 */
package Interface_Main_Lockers.Windows_Lockers_Manager;

import Interface_Main_Lockers.Windows_Lockers_Manager.DataBase.Connection_DataBases;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import Archive_File.Option_File;
import Source_File.Operation_File;
import Source_File.Save_File;

/**
 *
 * @author Lopez Santiago Angelica
 */
@SuppressWarnings("serial")
public class Username_Window_Lockers_Manager extends javax.swing.JFrame {

	private final Calendar calendar;
	private final Connection_DataBases connectionBD;
	private boolean error;
	private final Option_File object1;
	private final Beginning_Window_Lockers_Manager object2;
	private String _DATE;

	/**
	 * Constructor de la clase que construye la interfaz que se muestra en la
	 * ejecucion de las programa con metodos del swing
	 * 
	 * @param object1
	 *            variable para la lectura de archivos
	 * @param object2
	 *            variable creada por la clase principal
	 * @param connectionBD
	 *            variable que contiene la instancia de la conexion de la base
	 *            de datos
	 */
	public Username_Window_Lockers_Manager(Option_File object1, Beginning_Window_Lockers_Manager object2,
			Connection_DataBases connectionBD) {

		this.object1 = object1;
		this.object2 = object2;
		this.error = true;
		this.connectionBD = connectionBD;

		// contrucciond de la interfaz del la clase
		initComponents();

		this.calendar = new GregorianCalendar();
		this.data5.setCalendar(calendar);
		// asigancio de un icono en la interfaza
		this.setIconImage(
				new ImageIcon(getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU.png"))
						.getImage());

	}

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initComponents() {

		// inicicializaicon de las variables de la interfaz
		jLabel2 = new javax.swing.JLabel();
		data2 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		data3 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		data4 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		data5 = new com.toedter.calendar.JDateChooser();
		jLabel6 = new javax.swing.JLabel();
		data7 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		data9 = new javax.swing.JTextField();
		data6 = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		save = new javax.swing.JButton();
		cancel = new javax.swing.JButton();
		data8 = new javax.swing.JComboBox();
		jLabel10 = new javax.swing.JLabel();
		data10 = new javax.swing.JComboBox();

		// aignacion de las propiedades del jFrame
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Ingresar Usuario");
		setResizable(false);

		// asignacion de las propiedades alos componetes del jFrame
		jLabel2.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel2.setText("Nombre: ");

		data2.setFont(new java.awt.Font("Arial", 1, 12));
		data2.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				noDigit(evt);
				letterLarge(evt);
				Error(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel3.setText("Apellido Paterno:");

		data3.setFont(new java.awt.Font("Arial", 1, 12));
		data3.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				noDigit(evt);
				Error(evt);
				letterLarge(evt);
			}
		});

		jLabel4.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel4.setText("Apellido Materno: ");

		data4.setFont(new java.awt.Font("Arial", 1, 12));
		data4.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				Error(evt);
				noDigit(evt);
				letterLarge(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel5.setText("Fecha de Nacimiento: ");

		data5.setFont(new java.awt.Font("Arial", 1, 12));

		jLabel6.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel6.setText("Telefono: ");

		data7.setFont(new java.awt.Font("Arial", 1, 12));
		data7.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				noLetter(evt);
			}
		});

		jLabel7.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel7.setText("Email: ");

		data9.setFont(new java.awt.Font("Arial", 1, 12));

		data6.setFont(new java.awt.Font("Arial", 1, 12));
		data6.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				letterLarge(evt);
				Error(evt);
			}
		});

		jLabel8.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel8.setText("Dirección: ");

		jLabel9.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel9.setText("Sexo: ");

		save.setFont(new java.awt.Font("Arial", 1, 12));
		save.setText("Guardar");
		save.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				saveActionPerformed(evt);
			}
		});

		cancel.setFont(new java.awt.Font("Arial", 1, 12));
		cancel.setText("Cancelar");
		cancel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cancelActionPerformed(evt);
			}
		});

		data8.setFont(new java.awt.Font("Arial", 1, 12));
		data8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));

		jLabel10.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel10.setText("Privilegios: ");

		data10.setFont(new java.awt.Font("Arial", 1, 12));
		data10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Asistente", "Usuario" }));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout.createSequentialGroup().addContainerGap()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup().addComponent(jLabel5)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(data5, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup().addComponent(jLabel6)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(data6, javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(layout.createSequentialGroup()
												.addComponent(data7, javax.swing.GroupLayout.PREFERRED_SIZE, 81,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jLabel9)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(data8, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(0, 0, Short.MAX_VALUE))))
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel4).addComponent(jLabel3))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(data3).addComponent(data4)))
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addComponent(jLabel2)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(data2))
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel8)
												.addGroup(layout.createSequentialGroup().addGap(18, 18, 18)
														.addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING)
																.addComponent(jLabel10).addComponent(save,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 87,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(layout.createSequentialGroup().addGap(36, 36, 36)
																.addComponent(cancel))
														.addGroup(layout.createSequentialGroup()
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(data10,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addGroup(layout.createSequentialGroup().addComponent(jLabel7)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(data9, javax.swing.GroupLayout.PREFERRED_SIZE, 209,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(0, 0, Short.MAX_VALUE)))).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(14, 14, 14)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(data2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3)
						.addComponent(data3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel4)
						.addComponent(data4, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel5)
						.addComponent(data5, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel8)
						.addComponent(data6, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel6)
						.addComponent(data7, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel9).addComponent(data8, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel7)
						.addComponent(data9, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel10)
						.addComponent(data10, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(save)
						.addComponent(cancel)).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);

	}

	/**
	 * Metodo de cancelar la operacion y eliminar la visibilidad del a interfaz
	 * 
	 * @param evt
	 *            parametro eviado desde la clses actionperformed en su
	 *            contruccion de la clase
	 */
	private void cancelActionPerformed(java.awt.event.ActionEvent evt) {

		this.dispose();

	}

	/**
	 * Metodo para guardar datos del nuevo usuario del sistema
	 * 
	 * @param evt
	 *            que se crea por el boton aceptar de la interfaz
	 */
	private void saveActionPerformed(java.awt.event.ActionEvent evt) {

		// evaluacion de algunos campos sobre si estan bien escritos o no tiene
		// datos nulos
		if (!data2.getText().equals("") && !data3.getText().equals("") && !data4.getText().equals("")) {

			try {

				// confirmacion delprocedimiento de guardado del nuevo usuario
				if (JOptionPane.showConfirmDialog(null, "Estas seguro de guardar al nuevo usuario.", "Cerrar Sesión",
						JOptionPane.YES_NO_OPTION) == 0) {

					boolean permission = true;
					String user = getUser(object2.getDate());
					String number = "";
					String number1 = "";
					int privileges = getPrivileges(data10.getSelectedItem().toString());
					String date = getDate("" + this.data5.getCalendar().get(Calendar.YEAR),
							"" + this.data5.getCalendar().get(Calendar.MONTH),
							"" + this.data5.getCalendar().get(Calendar.DATE));

					try {

						// actividades de para el guardado de los datos en la
						// base de datos, asi como la ejecucion de algunas de
						// las actividades de DML para la ralizacin de
						// operaciones de actividades del sistema

						number = connectionBD.numberTable("tblacceso", "idAcceso");
						permission = connectionBD.insertData(
								"INSERT INTO `tblAcceso` (`idAcceso`, `Usuario`, `Contraseña`, `idTipoPrivilegio`) VALUES ("
										+ number + ", '" + user + "', '" + date + "', " + privileges + ");");

						number = connectionBD.numberTable("tblacceso", "idAcceso");
						number1 = connectionBD.numberTable("tblUsuario", "idUsuario");

						permission = connectionBD.insertData(
								"INSERT INTO `tblUsuario` (`idUsuario`, `Nombre`, `ApellidoP`, `ApellidoM`, `Direccion`, `FechaNacimiento`, `Phone`, `Email`, `Genero`, `idAcceso`) VALUES ("
										+ number1 + ", '" + this.data2.getText() + "', '" + this.data3.getText()
										+ "', '" + this.data4.getText() + "', '" + this.data6.getText() + "', '" + _DATE
										+ "', '" + this.data7.getText() + "', '" + this.data9.getText() + "', "
										+ this.data8.getSelectedIndex() + ", " + (Integer.parseInt(number) - 1) + ");");

						// verificacion de la tarea realizada como el guardado
						// de los datos
						if (permission) {

							/////////////////////////////////////////////////////////////////////////////////

							String data = this.data2.getText() + "#" + this.data3.getText() + "#" + this.data4.getText()
									+ "#" + date + "#" + this.data6.getText() + "#" + this.data7.getText() + "#"
									+ this.data8.getSelectedItem().toString() + "#" + this.data9.getText() + "#" + user
									+ "#" + privileges;

							String userNew = user + "," + date + "#" + privileges;

							@SuppressWarnings("unused")
							Operation_File operation = new Save_File(
									object1.getPath("default", "sql").replace("default", "DATAUSER"), data, true);
							operation = new Save_File(object1.getPath("default", "sql").replace("default", "USER"),
									userNew, true);
							operation = new Save_File(object1.getPath("default", "sql").replace("default",
									"Bitacoras\\bitacoraRegistration"), "El "
											+ object2.setLoginPresentation().substring(11,
													object2.setLoginPresentation().length())
											+ " ingreso un usuario nuevo " + data.replaceAll("#", " ") + " a las "
											+ object2.getDate(),
									true);

							/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

							this.dispose();
							JOptionPane.showMessageDialog(null,
									"Usuario " + this.data2.getText()
											+ " guardado con exito.\nCon usurio en el sistemas " + user,
									"SADAL", JOptionPane.PLAIN_MESSAGE);

							// Mensajes de error por si ocurre alguna de las
							// onomalias en el sistema

						} else {

							JOptionPane.showMessageDialog(null,
									"Usuario " + this.data2.getText()
											+ " no se a podido guardar con exito.\nCon usurio en el sistemas " + user,
									"SADAL", JOptionPane.ERROR_MESSAGE);

						}

					} catch (SQLException e) {

						Logger.getLogger(Connection_DataBases.class.getName()).log(Level.SEVERE,
								"Error con la base de datos.");

					}

				}

			} catch (Throwable ex) {

				Logger.getLogger(Username_Window_Lockers_Manager.class.getName()).log(Level.SEVERE,
						"Error algurdar el usuario");

			}

		} else {

			JOptionPane.showMessageDialog(null, "Falta ingresar un dato importante como el nombre o apellidos.",
					"Error", JOptionPane.ERROR_MESSAGE);

		}

	}

	/**
	 * metodo para le cambio de los caracteres de minusculas a mayusculas
	 * 
	 * @param evt
	 *            parametro eviado desde la clses actionperformed en su
	 *            contruccion de la clase
	 */
	private void letterLarge(java.awt.event.KeyEvent evt) {

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
	 * Metodo que contiene el evento sobre el caracter en especial del boton
	 * borra para no perder la secuencias da las cadenas en un jtext por el
	 * cambio de minusculas a muyusculas
	 * 
	 * @param evt
	 *            parametro eviado desde la clses actionperformed en su
	 *            contruccion de la clase
	 */
	private void Error(java.awt.event.KeyEvent evt) {

		// validacion de si la tecla precionado por el teclado es borrapara
		// otrogar permisos de camibio de cadena a mayusculas
		if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {

			error = false;

		} else {

			error = true;

		}

	}

	/**
	 * Metodo que maneja el evento action para la verificion de que una variable
	 * de tipo jtext no tenga letras
	 * 
	 * @param evt
	 *            parametro eviado desde la clses actionperformed en su
	 *            contruccion de la clase
	 */
	private void noLetter(java.awt.event.KeyEvent evt) {

		char y = evt.getKeyChar();

		// validadcion de si el texto es parte del abecedario
		if (Character.isLetter(y)) {

			// eliminaicon del evento y sonido beep
			getToolkit().beep();
			evt.consume();

		}

	}

	/**
	 * @param evt
	 */
	private void noDigit(java.awt.event.KeyEvent evt) {

		char y = evt.getKeyChar();

		if (Character.isDigit(y)) {

			getToolkit().beep();
			evt.consume();

		}

	}

	/**
	 * Metod de asigacion del usuario por medio de la un funcios que determina
	 * que hora se creo el usuario y se toman eso valores para la creacion del
	 * nuevo usuario
	 * 
	 * @param x
	 *            variable que contiene la hora actual
	 * @return el metodo retorna el usuario nuevo del sistema
	 */
	private String getUser(String x) {

		String user = "";
		String temporary = x;

		user += temporary.substring(temporary.length() - 4, temporary.length());
		user += temporary.substring(temporary.indexOf(":") - 2, temporary.indexOf(":") + 4);

		return user.replaceAll(":", "");

	}

	/**
	 * Funcion que determina los privilegio del usuaairo y lo hace precente con
	 * un valor entero
	 * 
	 * @param privileges
	 *            varible para la evaluacion de los privilegios
	 * @return la funcion retorna un valor entero
	 */
	private int getPrivileges(String privileges) {

		int provilegesNumber = 0;

		// evalucion de los privilegios
		switch (privileges) {

		case "Administrador":

			provilegesNumber = 1;
			break;

		case "Asistente":

			provilegesNumber = 2;
			break;

		case "Usuario":

			provilegesNumber = 3;
			break;

		}

		return provilegesNumber;

	}

	/**
	 * Metodo para la asigancio de la fecha en formato de puero numero para
	 * poder servir como apoyo de contraseña o mostrar el dato para guardarlo en
	 * la base de datos
	 * 
	 * @param year
	 *            variable que con tiene los años
	 * @param month
	 *            variable que contiene el mes del año
	 * @param date
	 *            variable que tiene el numero del dia del mes
	 * @return
	 */
	public String getDate(String year, String month, String date) {

		switch (month) {

		case "0":
			month = "01";
			break;

		case "1":
			month = "02";
			break;

		case "2":
			month = "03";
			break;

		case "3":
			month = "04";
			break;

		case "4":
			month = "05";
			break;

		case "5":
			month = "06";
			break;

		case "6":
			month = "07";
			break;

		case "7":
			month = "08";
			break;

		case "8":
			month = "09";
			break;

		case "9":
			month = "10";
			break;

		case "10":
			month = "11";
			break;

		case "11":
			month = "12";
			break;

		default:

		}

		switch (date) {

		case "1":
			date = "01";
			break;

		case "2":
			date = "02";
			break;

		case "3":
			date = "03";
			break;

		case "4":
			date = "04";
			break;

		case "5":
			date = "05";
			break;

		case "6":
			date = "06";
			break;

		case "7":
			date = "07";
			break;

		case "8":
			date = "08";
			break;

		case "9":
			date = "09";
			break;

		default:

		}

		_DATE = year + "-" + month + "-" + date;

		return date + month + year;

	}

	// declaracion de las variable de la interfaz jFrame
	private javax.swing.JButton cancel;
	@SuppressWarnings("rawtypes")
	private javax.swing.JComboBox data10;
	private javax.swing.JTextField data2;
	private javax.swing.JTextField data3;
	private javax.swing.JTextField data4;
	private com.toedter.calendar.JDateChooser data5;
	private javax.swing.JTextField data6;
	private javax.swing.JTextField data7;
	@SuppressWarnings("rawtypes")
	private javax.swing.JComboBox data8;
	private javax.swing.JTextField data9;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JButton save;

}
