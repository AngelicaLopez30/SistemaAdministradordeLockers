/**
 * Interfaza para la leliminacin de un usuario del sistemS asi como
 * su relacion con la base datos par no deajr rastro de un usuario 
 */
package Interface_Main_Lockers.Windows_Lockers_Manager;

import Interface_Main_Lockers.Windows_Lockers_Manager.DataBase.Connection_DataBases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Lopez Santiago Angelica
 */
@SuppressWarnings("serial")
public class Delete_User_Lockers_Manager extends javax.swing.JFrame {

	// variable globales necesarias como al cneccion a la base de datso y
	// arreglo para los datos de la base de datos
	public static boolean error;
	private final Connection_DataBases connectionBD;
	private ArrayList<String> data;

	/**
	 * Constructor de la clase que construye la interfaz que se muestra en la
	 * ejecucion de las programa con metodos del swing
	 * 
	 * @param connectionBD
	 *            variable de instalcin del a coneccion de la base de datos
	 */
	public Delete_User_Lockers_Manager(Connection_DataBases connectionBD) {

		this.connectionBD = connectionBD;

		// metodo que contiene la construccion de la clase
		initComponents();
		// linea de la asigacion de un icono del sistemas
		this.setIconImage(
				new ImageIcon(getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU.png"))
						.getImage());

	}

	private void initComponents() {

		cancel = new javax.swing.JButton();
		save = new javax.swing.JButton();
		data7 = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Borrar Usuario");

		cancel.setFont(new java.awt.Font("Arial", 1, 12));
		cancel.setText("Cancelar");
		cancel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cancelActionPerformed(evt);
			}
		});

		save.setFont(new java.awt.Font("Arial", 1, 12));
		save.setText("OK");
		save.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				saveActionPerformed(evt);
			}
		});

		data7.setFont(new java.awt.Font("Arial", 1, 12));
		data7.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				data7noLetter(evt);
			}
		});

		jLabel6.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel6.setText("Usuario:");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(23, 23, 23)
								.addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(17, 17, 17).addComponent(cancel))
						.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel6)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(data7, javax.swing.GroupLayout.PREFERRED_SIZE, 156,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6).addComponent(data7, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(save)
						.addComponent(cancel)).addContainerGap()));

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
	 * Metodo para eliminar los datos de un usuario dentor de la base de dato
	 * 
	 * @param evt
	 *            evento de acctionperformed pcon respecto al boton aceptar
	 */
	private void saveActionPerformed(java.awt.event.ActionEvent evt) {

		// inicializacion de las variables
		boolean permission = true;
		boolean existe = true;
		data = new ArrayList<String>();

		// Cargar los datos de las base de datso para la verificion de la
		// ecistencia del usuario que se desea borrar
		try {

			data = connectionBD.listDataAcceso();

		} catch (SQLException e) {

			Logger.getLogger(Connection_DataBases.class.getName()).log(Level.SEVERE, "Error con la base de datos.");

		}

		// validacion delos datos de la base de datos cargador en el arrayList y
		// vericar si exite y asignacion de error o ejecucion de una accion
		for (String x : data) {

			if (x.indexOf(data7.getText()) != -1) {

				existe = true;
				break;

			} else {

				existe = false;

			}

		}

		// si en la variable existe en true se realiza actividades de
		// eliminacion y sino se mando un mensaje de error
		if (existe) {

			// cargando datos y la ejecucion del comando SQL DELETE para la
			// eliminacion de los datos
			try {

				int numberUser = connectionBD
						.dataSearch("SELECT `idAcceso` FROM `tblacceso` WHERE `Usuario` = " + data7.getText() + ";");
				permission = connectionBD.insertData(
						"DELETE FROM `software_lockers_manager`.`tblusuario` WHERE `tblusuario`.`idUsuario` = "
								+ numberUser + ";");
				permission = connectionBD
						.insertData("DELETE FROM `software_lockers_manager`.`tblacceso` WHERE `tblacceso`.`idAcceso` = "
								+ numberUser + ";");

			} catch (SQLException e) {

				Logger.getLogger(Connection_DataBases.class.getName()).log(Level.SEVERE, "Error con la base de datos.");

			}

			// verificaion de las tareas realizadas si se realizaron con exito
			if (permission) {

				this.dispose();
				JOptionPane.showMessageDialog(null, "El usuario " + data7.getText() + " se a borrado.", "SADAL",
						JOptionPane.PLAIN_MESSAGE);

			} else {

				JOptionPane.showMessageDialog(null, "No se pudo realizar la tarea al 100%.", "Error",
						JOptionPane.ERROR_MESSAGE);

			}

		} else {

			JOptionPane.showMessageDialog(null, "El usuario no existe.", "Error", JOptionPane.ERROR_MESSAGE);

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
	private void data7noLetter(java.awt.event.KeyEvent evt) {

		char y = evt.getKeyChar();

		// validadcion de si el texto es parte del abecedario
		if (Character.isLetter(y)) {

			// eliminaicon del evento y sonido beep
			getToolkit().beep();
			evt.consume();

		}

	}

	// variables de la interfaz
	private javax.swing.JButton cancel;
	private javax.swing.JTextField data7;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JButton save;

}
