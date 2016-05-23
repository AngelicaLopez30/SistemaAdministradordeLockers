/**
 * interfaz que evalua el acceos de cada uno de los datos como usuario 
 * y contraseña para el acceos sibre en el sistema y su funcionamiento 
 */
package Interface_Main_Lockers.Windows_Lockers_Manager;

import javax.swing.ImageIcon;
import Interface_Main_Lockers.Windows_Lockers_Manager.DataBase.Connection_DataBases;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 *
 * @author Lopez Santiago Angelica
 */
@SuppressWarnings("serial")
public class Login_Window_Lockers_Manager extends javax.swing.JFrame {

	// variables de coneeccion e interfaz principal para cachar los datos
	// enviados por su instancioamiento de las clase
	private final Beginning_Window_Lockers_Manager object1;
	private final Connection_DataBases connectionBD;
	private boolean error;

	/**
	 * Constructor de la clase que construye la interfaz que se muestra en la
	 * ejecucion de las programa con metodos del swing
	 *
	 * @param object1
	 *            variable para la lectura de archivos
	 * @param connectionBD
	 *            variable instanciada de con la coneccion de la base de datos
	 */
	public Login_Window_Lockers_Manager(Beginning_Window_Lockers_Manager object1, Connection_DataBases connectionBD) {

		// variable finales que se inicializan desde que la clase se construye
		this.object1 = object1;
		this.error = true;
		this.connectionBD = connectionBD;

		// metodo que contiene la construccion de la clase
		initComponents();
		// linea de la asigacion de un icono del sistemas
		this.setIconImage(
				new ImageIcon(getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU.png"))
						.getImage());

	}

	private void initComponents() {

		// inicializacion de las variables de la interfaz
		cancel = new javax.swing.JButton();
		accept = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		password = new javax.swing.JPasswordField();
		user = new javax.swing.JTextField();

		// asigancio de propiedasdes al jFrame
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Inicio de Sesión");
		setResizable(false);

		// asigancion de propiedades a los componentes extras de la interfaz
		cancel.setFont(new java.awt.Font("Arial", 1, 12));
		cancel.setText("Cancelar");
		cancel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cancelActionPerformed(evt);
			}
		});

		accept.setFont(new java.awt.Font("Arial", 1, 12));
		accept.setText("Aceptar");
		accept.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				acceptActionPerformed(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Corbel", 1, 48));
		jLabel3.setForeground(new java.awt.Color(51, 51, 51));
		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel3.setText("SADAL");

		jLabel1.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel1.setText("Usuario:");

		jLabel2.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel2.setText("Contraseña:");

		password.setFont(new java.awt.Font("Arial", 1, 12));
		password.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				noLetter(evt);
			}
		});

		user.setFont(new java.awt.Font("Arial", 1, 12));
		user.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				letterLarge(evt);
				Error(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(
						layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(user)
								.addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
				.addContainerGap(18, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addGap(42, 42, 42).addComponent(cancel).addGap(18, 18, 18)
								.addComponent(accept, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(33, 33, 33))
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel3,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(cancel).addComponent(accept))
						.addContainerGap()));

		pack();
		// posicion central de la interfaz
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
	 * Metodo que realiza la evalucaion de los usuario y su contraseña para el
	 * acceso al sistemas
	 * 
	 * @param evt
	 *            parametro eviado desde la clses actionperformed en su
	 *            contruccion de la clase
	 */
	@SuppressWarnings("deprecation")
	private void acceptActionPerformed(java.awt.event.ActionEvent evt) {

		ArrayList<String> list = new ArrayList<String>();

		// validacioens de que los datos son correctos y de que no se evaluaran
		// datos nulos o datos sin u norden

		if (!user.getText().equals("") && !password.getText().equals("")) {

			if (!user.getText().equals("")) {

				if (!password.getText().equals("")) {

					// carga de datos de la base de datos con respecto a la
					// tabla acceso
					try {

						list = connectionBD.listDataAcceso();

					} catch (SQLException e) {

						Logger.getLogger(Connection_DataBases.class.getName()).log(Level.SEVERE,
								"Error con la base de datos.");

					}

					// Validacion de los privilegios del usuairo si es
					// administrador, asistente o un usuairo simple
					if (list.indexOf(user.getText() + "-" + password.getText() + "-1") != -1) {

						object1.getLoginPresentation(user.getText());
						object1.sessionT(true);
						this.dispose();
						JOptionPane.showMessageDialog(null, "Bienvenido al Sistema SADAL.", "SADAL",
								JOptionPane.PLAIN_MESSAGE);

					} else {

						if (list.indexOf(user.getText() + "-" + password.getText() + "-2") != -1) {

							object1.getLoginPresentation(user.getText());
							object1.sessionA();
							this.dispose();
							JOptionPane.showMessageDialog(null, "Bienvenido al Sistema SADAL.", "SADAL",
									JOptionPane.PLAIN_MESSAGE);

						} else {

							if (list.indexOf(user.getText() + "-" + password.getText() + "-3") != -1) {

								object1.getLoginPresentation(user.getText());
								object1.sessionU();
								this.dispose();
								JOptionPane.showMessageDialog(null, "Bienvenido al Sistema SADAL.", "SADAL",
										JOptionPane.PLAIN_MESSAGE);

							} else {

								this.password.setText("");
								JOptionPane.showMessageDialog(null, "Usuario y contraseña no valida.", "Error",
										JOptionPane.ERROR_MESSAGE);

							}

						}

					}

					// mensajes de error por alguan falta en el sistema

				} else {

					JOptionPane.showMessageDialog(null,
							"Es necesario ingresar una contraseña para su validacion al sistema.", "Error",
							JOptionPane.ERROR_MESSAGE);

				}

			} else {

				JOptionPane.showMessageDialog(null, "No existen un usuario para verificar su existencia.", "Error",
						JOptionPane.ERROR_MESSAGE);

			}

		} else {

			JOptionPane.showMessageDialog(null, "No existen datos para la comparacion de un usuario.", "Error",
					JOptionPane.ERROR_MESSAGE);

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

	// variables de la interfaz
	private javax.swing.JButton accept;
	private javax.swing.JButton cancel;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPasswordField password;
	private javax.swing.JTextField user;

}
