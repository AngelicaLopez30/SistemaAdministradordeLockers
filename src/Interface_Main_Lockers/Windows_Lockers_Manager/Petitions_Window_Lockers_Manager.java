/**
 * clase que permite la creacion  de una petiion o una queja de una anomalia
 * en el sistemas y guardando estas quejas en la base de datos
 */
package Interface_Main_Lockers.Windows_Lockers_Manager;

import Archive_File.Option_File;
import Source_File.Open_File;
import Source_File.Operation_File;
import Source_File.Save_File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Lopez Santiago Angelica
 */
@SuppressWarnings("serial")
public class Petitions_Window_Lockers_Manager extends javax.swing.JFrame {

	private final Option_File object1;
	private final Calendar calendar;
	private final boolean user;

	/**
	 * Constructor de la clase que construye la interfaz que se muestra en la
	 * ejecucion de las programa con metodos del swing
	 * 
	 * @param object1
	 *            variable para la lectura de los datos de la base de datos
	 */
	public Petitions_Window_Lockers_Manager(Option_File object1) {

		this.object1 = object1;
		this.user = true;

		// metodo que contiene la construccion de la clase
		initComponents();
		this.jTextField1.setEnabled(false);
		this.jComboBox1.setEnabled(false);
		this.jButton1.setVisible(false);
		this.jButton2.setText("Salir");
		this.data6.setEnabled(false);

		// lectura de la base de datos
		Operation_File object = new Open_File(object1.getPath("default", "sql").replace("default", "PETITION"));
		this.jTextArea1.setText(object.toString().replaceAll("\n", "#").replace("#", "\n"));

		// asigacnio de una fecha para el guerdado de las petitiones en tiempo
		// real
		this.calendar = new GregorianCalendar();
		this.data6.setCalendar(calendar);
		// linea de la asigacion de un icono del sistemas
		this.setIconImage(
				new ImageIcon(getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU.png"))
						.getImage());

	}

	/**
	 * Constructor de la clase que construye la interfaz que se muestra en la
	 * ejecucion de las programa con metodos del swing
	 * 
	 * @param object1
	 *            variable para la lectura de datos de la base de datos
	 * @param user
	 *            variable para la diferencia de las petiiones entre usuario y
	 *            administrador
	 */
	public Petitions_Window_Lockers_Manager(Option_File object1, boolean user) {

		this.object1 = object1;
		this.user = user;

		// contruccion de la interfaz por medio de los datos y variable ya
		// declarados
		initComponents();

		this.calendar = new GregorianCalendar();
		this.data6.setCalendar(calendar);
		// asignacion de un icono de para el sistemas
		this.setIconImage(
				new ImageIcon(getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU.png"))
						.getImage());

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initComponents() {

		// inicializacion de las varibles
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jTextField1 = new javax.swing.JTextField();
		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		data6 = new com.toedter.calendar.JDateChooser();

		// asignacion de las propiedades del jFrame
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Peticiones de Usuarios");
		setResizable(false);

		// asignacin de las propiedades de los componentes del jFrame del
		// sistema
		jLabel1.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel1.setText("Usuario: ");

		jLabel2.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel2.setText("Opción: ");

		jComboBox1.setFont(new java.awt.Font("Arial", 1, 12));
		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cambio de contraseÃ±a o usuario",
				"Cambio de Lockers", "Cambio de Datos", "Reporte de Daños" }));

		jTextField1.setFont(new java.awt.Font("Arial", 1, 12));

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Descripcion o Motivo",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

		jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
		jTextArea1.setColumns(20);
		jTextArea1.setFont(new java.awt.Font("Arial", 1, 12));
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE));

		jButton1.setFont(new java.awt.Font("Arial", 1, 12));
		jButton1.setText("Cancelar");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setFont(new java.awt.Font("Arial", 1, 12));
		jButton2.setText("Enviar");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		data6.setFont(new java.awt.Font("Arial", 1, 12));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(18, 18, 18)
										.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83,
												javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(53, 53, 53)
								.addComponent(data6, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGap(23, 23, 23))
						.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup().addGap(12, 12, 12).addComponent(jLabel1)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(10, 10, 10).addComponent(jComboBox1, 0, 1, Short.MAX_VALUE)))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(jLabel2)
								.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton1).addComponent(jButton2))
						.addComponent(data6, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

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
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		this.dispose();

	}

	/**
	 * Metodo de guardado de las peticiones del sistemas para cargarlas al
	 * administrador si el usuairo es asistente o usuairo normal
	 * 
	 * @param evt
	 */
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

		if (user) {

			// cerrado de la interfaz
			this.dispose();

		} else {

			// metodos de guardado de las actividades de al realizar uan
			// petitios
			String data = "#" + jTextField1.getText() + "#" + jComboBox1.getSelectedItem().toString() + "#"
					+ jTextArea1.getText().replaceAll("\n", " ") + "#" + data6.getCalendar().getTime();

			@SuppressWarnings("unused")
			Operation_File operation = new Save_File(
					object1.getPath("default", "sql").replace("default", "Bitacoras\\bitacoraPetitions"),
					jTextField1.getText() + " envio la peticion de " + jComboBox1.getSelectedItem().toString()
							+ " por motivo de " + jTextArea1.getText().replaceAll("\n", " ") + " en el dia: "
							+ data6.getCalendar().getTime(),
					true);
			operation = new Save_File(object1.getPath("default", "sql").replace("default", "PETITION"), data, true);
			this.dispose();

			// mensaje de confirmacion del guerdado de la peticion
			JOptionPane
					.showMessageDialog(
							null, "Usuario " + this.jTextField1.getText()
									+ " en enviado mensaje con exito.\nEn la fecha: " + data6.getCalendar().getTime(),
							"SADAL", JOptionPane.PLAIN_MESSAGE);

		}

	}

	// declarcion de las variebla para la construccion del jFrame
	private com.toedter.calendar.JDateChooser data6;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	@SuppressWarnings("rawtypes")
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextField jTextField1;

}
