/**
 * interfaz para la asignacion de los eventos de los lockers asi 
 * como la validacion de su disponibilidad y mostrar los datos de 
 * su dueno actual ya sea el caso 
 * 
 */
package Interface_Main_Lockers.Windows_Lockers_Manager;

import Interface_Main_Lockers.Windows_Lockers_Manager.Code.Locker_Event_Lockers_Manager;
import Interface_Main_Lockers.Windows_Lockers_Manager.DataBase.Connection_DataBases;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Lopez Santiago Angelica
 */
@SuppressWarnings("serial")
public class Lockers_Window_Lockers_Manager extends javax.swing.JFrame {

	// declarcaiond de las variables principales del la clase pra su
	// identificiaon
	// del edificio dedonde se localiza el locker el nuemro del locker,
	// la conexion de la base de datos,
	public static ArrayList<String> data;
	private static String Building;
	private final Locker_Event_Lockers_Manager object2;
	private final Beginning_Window_Lockers_Manager object3;
	private final Connection_DataBases connectionBD;
	private final Calendar calendar;
	public static boolean error;

	/**
	 * Constructor de la clase que construye la interfaz que se muestra en la
	 * ejecucion de las programa con metodos del swing
	 * 
	 * @param object3
	 *            variable de la clase interfaz del sistemas
	 * @param connectionBD
	 *            varibale que contiene el instanciamiento de la conexion de la
	 *            base de datos
	 */
	@SuppressWarnings("static-access")
	public Lockers_Window_Lockers_Manager(Beginning_Window_Lockers_Manager object3, Connection_DataBases connectionBD) {

		this.object3 = object3;
		this.connectionBD = connectionBD;
		// metodo que contiene la construccion de la clase
		initComponents();

		this.locker1.setActionCommand("1");
		this.locker2.setActionCommand("2");
		this.locker3.setActionCommand("3");
		this.locker4.setActionCommand("4");
		this.locker5.setActionCommand("5");
		this.locker6.setActionCommand("6");
		this.locker7.setActionCommand("7");
		this.locker8.setActionCommand("8");
		this.locker9.setActionCommand("9");
		this.locker10.setActionCommand("10");
		this.locker11.setActionCommand("11");
		this.locker12.setActionCommand("12");
		this.locker13.setActionCommand("13");
		this.locker14.setActionCommand("14");
		this.locker15.setActionCommand("15");
		this.locker16.setActionCommand("16");
		this.locker17.setActionCommand("17");
		this.locker18.setActionCommand("18");
		this.locker19.setActionCommand("19");
		this.locker20.setActionCommand("20");
		this.locker21.setActionCommand("21");
		this.locker22.setActionCommand("22");
		this.locker23.setActionCommand("23");
		this.locker24.setActionCommand("24");
		this.locker25.setActionCommand("25");
		this.locker26.setActionCommand("26");
		this.locker27.setActionCommand("27");
		this.locker28.setActionCommand("28");

		this.calendar = new GregorianCalendar();
		this.jDateChooser1.setCalendar(calendar);
		this.jDateChooser2.setCalendar(calendar);
		this.object2 = new Locker_Event_Lockers_Manager();
		data = new ArrayList<String>();

		// cargando los datos de la base de datos para la asigancio de eventos
		// iniciales asi como su ejecucion enrelacion con cada locker vacio y
		// ocupado
		try {

			this.Building = "A";
			data = connectionBD.dataLockers(
					"SELECT `tblacceso`.`Usuario`, `tblusuario`.`Nombre`, `tblasignacion`.`Periodo`, `tbldescripcion`.`Numero`, `tbledificio`.`Letra` FROM `tblacceso`, `tblusuario`, `tblasignacion`, `tbllocker`, `tbldescripcion`, `tbledificio` WHERE `tblacceso`.`idAcceso` = `tblusuario`.`idAcceso` AND `tblusuario`.`idUsuario` = `tblasignacion`.`idUsuario` AND `tblasignacion`.`idLocker` = `tbllocker`.`idLocker` AND `tbllocker`.`idDescripcion` = `tbldescripcion`.`idDescripcion` AND `tbllocker`.`idEdificio` = `tbledificio`.`idEdificio`;");
			this.object2.getAvailability(data, Building);
			data = this.object2.selectionEvent(data, Building);

		} catch (SQLException e) {

			Logger.getLogger(Lockers_Window_Lockers_Manager.class.getName()).log(Level.SEVERE,
					"Error con la base de datos.");

		}
		// linea de la asigacion de un icono del sistemas
		this.setIconImage(
				new ImageIcon(getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU.png"))
						.getImage());

	}

	private void initComponents() {

		// inicializacion de las variables de la interfaz
		jButton1 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jPanel1 = new javax.swing.JPanel();
		locker1 = new javax.swing.JButton();
		locker2 = new javax.swing.JButton();
		locker3 = new javax.swing.JButton();
		locker4 = new javax.swing.JButton();
		locker5 = new javax.swing.JButton();
		locker6 = new javax.swing.JButton();
		locker7 = new javax.swing.JButton();
		locker8 = new javax.swing.JButton();
		locker9 = new javax.swing.JButton();
		locker10 = new javax.swing.JButton();
		locker11 = new javax.swing.JButton();
		locker12 = new javax.swing.JButton();
		locker13 = new javax.swing.JButton();
		locker14 = new javax.swing.JButton();
		locker21 = new javax.swing.JButton();
		locker15 = new javax.swing.JButton();
		locker17 = new javax.swing.JButton();
		locker19 = new javax.swing.JButton();
		locker18 = new javax.swing.JButton();
		locker20 = new javax.swing.JButton();
		locker16 = new javax.swing.JButton();
		locker28 = new javax.swing.JButton();
		locker26 = new javax.swing.JButton();
		locker23 = new javax.swing.JButton();
		locker24 = new javax.swing.JButton();
		locker25 = new javax.swing.JButton();
		locker22 = new javax.swing.JButton();
		locker27 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jSlider1 = new javax.swing.JSlider();
		jLabel2 = new javax.swing.JLabel();
		B = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		building = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jPanel3 = new javax.swing.JPanel();
		jLabel10 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		jDateChooser1 = new com.toedter.calendar.JDateChooser();
		jDateChooser2 = new com.toedter.calendar.JDateChooser();
		jButton30 = new javax.swing.JButton();
		jButton31 = new javax.swing.JButton();

		// asignacion de los propiedades del jFrame
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Asignación de Lockers");
		setResizable(false);

		// asignaicon de las propiedades a los componetes del sistema de la
		// interfaz de la clase
		jButton1.setFont(new java.awt.Font("Arial", 1, 12));
		jButton1.setText("Buscar");

		jTextField1.setFont(new java.awt.Font("Arial", 1, 12));

		jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		locker1.setFont(new java.awt.Font("Arial", 1, 12));
		locker1.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker1.setRequestFocusEnabled(false);
		locker1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 80, 98));

		locker2.setFont(new java.awt.Font("Arial", 1, 12));
		locker2.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker2.setRequestFocusEnabled(false);
		locker2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 11, 80, 98));

		locker3.setFont(new java.awt.Font("Arial", 1, 12));
		locker3.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker3.setRequestFocusEnabled(false);
		locker3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 11, 80, 98));

		locker4.setFont(new java.awt.Font("Arial", 1, 12));
		locker4.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker4.setRequestFocusEnabled(false);
		locker4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker4, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 11, 80, 98));

		locker5.setFont(new java.awt.Font("Arial", 1, 12));
		locker5.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker5.setRequestFocusEnabled(false);
		locker5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 11, 80, 98));

		locker6.setFont(new java.awt.Font("Arial", 1, 12));
		locker6.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker6.setRequestFocusEnabled(false);
		locker6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker6, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 11, 80, 98));

		locker7.setFont(new java.awt.Font("Arial", 1, 12));
		locker7.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker7.setRequestFocusEnabled(false);
		locker7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 11, 80, 98));

		locker8.setFont(new java.awt.Font("Arial", 1, 12));
		locker8.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker8.setRequestFocusEnabled(false);
		locker8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, 80, 98));

		locker9.setFont(new java.awt.Font("Arial", 1, 12));
		locker9.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker9.setRequestFocusEnabled(false);
		locker9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker9, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 115, 80, 98));

		locker10.setFont(new java.awt.Font("Arial", 1, 12));
		locker10.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker10.setRequestFocusEnabled(false);
		locker10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 115, 80, 98));

		locker11.setFont(new java.awt.Font("Arial", 1, 12));
		locker11.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker11.setRequestFocusEnabled(false);
		locker11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker11, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 115, 80, 98));

		locker12.setFont(new java.awt.Font("Arial", 1, 12));
		locker12.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker12.setRequestFocusEnabled(false);
		locker12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 115, 80, 98));

		locker13.setFont(new java.awt.Font("Arial", 1, 12));
		locker13.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker13.setRequestFocusEnabled(false);
		locker13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker13, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 115, 80, 98));

		locker14.setFont(new java.awt.Font("Arial", 1, 12));
		locker14.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker14.setRequestFocusEnabled(false);
		locker14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 115, 80, 98));

		locker21.setFont(new java.awt.Font("Arial", 1, 12));
		locker21.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker21.setRequestFocusEnabled(false);
		locker21.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker21, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 219, 80, 98));

		locker15.setFont(new java.awt.Font("Arial", 1, 12));
		locker15.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker15.setRequestFocusEnabled(false);
		locker15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 219, 80, 98));

		locker17.setFont(new java.awt.Font("Arial", 1, 12));
		locker17.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker17.setRequestFocusEnabled(false);
		locker17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 219, 80, 98));

		locker19.setFont(new java.awt.Font("Arial", 1, 12));
		locker19.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker19.setRequestFocusEnabled(false);
		locker19.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 219, 80, 98));

		locker18.setFont(new java.awt.Font("Arial", 1, 12));
		locker18.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker18.setRequestFocusEnabled(false);
		locker18.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker18, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 219, 80, 98));

		locker20.setFont(new java.awt.Font("Arial", 1, 12));
		locker20.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker20.setRequestFocusEnabled(false);
		locker20.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker20, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 219, 80, 98));

		locker16.setFont(new java.awt.Font("Arial", 1, 12));
		locker16.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker16.setRequestFocusEnabled(false);
		locker16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker16, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 219, 80, 98));

		locker28.setFont(new java.awt.Font("Arial", 1, 12));
		locker28.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker28.setRequestFocusEnabled(false);
		locker28.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker28, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 323, 80, 98));

		locker26.setFont(new java.awt.Font("Arial", 1, 12));
		locker26.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker26.setRequestFocusEnabled(false);
		locker26.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker26, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 323, 80, 98));

		locker23.setFont(new java.awt.Font("Arial", 1, 12));
		locker23.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker23.setRequestFocusEnabled(false);
		locker23.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker23, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 323, 80, 98));

		locker24.setFont(new java.awt.Font("Arial", 1, 12));
		locker24.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker24.setRequestFocusEnabled(false);
		locker24.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker24, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 323, 80, 98));

		locker25.setFont(new java.awt.Font("Arial", 1, 12));
		locker25.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker25.setRequestFocusEnabled(false);
		locker25.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker25, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 323, 80, 98));

		locker22.setFont(new java.awt.Font("Arial", 1, 12));
		locker22.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker22.setRequestFocusEnabled(false);
		locker22.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 323, 80, 98));

		locker27.setFont(new java.awt.Font("Arial", 1, 12));
		locker27.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (2).png")));
		locker27.setRequestFocusEnabled(false);
		locker27.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionLocker(evt);
			}
		});
		jPanel1.add(locker27, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 323, 80, 98));

		jLabel1.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel1.setText("Edificio");
		jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 432, -1, -1));

		jSlider1.setMajorTickSpacing(4);
		jSlider1.setMaximum(20);
		jSlider1.setMinorTickSpacing(1);
		jSlider1.setPaintTicks(true);
		jSlider1.setValue(0);
		jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				jSlider1StateChanged(evt);
			}
		});
		jPanel1.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 432, 468, -1));

		jLabel2.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel2.setText(" A");
		jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 20, -1));

		B.setFont(new java.awt.Font("Arial", 1, 12));
		B.setText("  B");
		jPanel1.add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 20, -1));

		jLabel5.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel5.setText("C");
		jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, -1));

		jLabel6.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel6.setText("  D");
		jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 460, 20, -1));

		jLabel8.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel8.setText("  E");
		jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 20, -1));

		building.setFont(new java.awt.Font("Arial", 1, 36));
		building.setText("Edificio A");

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Descripción",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

		jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
		jTextArea1.setColumns(20);
		jTextArea1.setFont(new java.awt.Font("Arial", 1, 12));
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE));

		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Asignación",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 0, 0)));

		jLabel10.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel10.setText("Usuario:");

		jTextField2.setFont(new java.awt.Font("Arial", 1, 12));
		jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				Error(evt);
				letterLarger(evt);
			}
		});

		jLabel11.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel11.setText("Fechas:");

		jDateChooser1.setFont(new java.awt.Font("Arial", 1, 12));

		jDateChooser2.setFont(new java.awt.Font("Arial", 1, 12));

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

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 119,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 119,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(
						jPanel3Layout.createSequentialGroup().addContainerGap()
								.addGroup(
										jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel10)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
														javax.swing.GroupLayout.PREFERRED_SIZE))
						.addComponent(jLabel11)
						.addGroup(jPanel3Layout.createSequentialGroup()
								.addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 83,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jButton31)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel10).addComponent(jTextField2,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel11)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton30).addComponent(jButton31))
						.addContainerGap(12, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createSequentialGroup().addGap(11, 11, 11).addComponent(building,
								javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(jButton1)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(0, 10, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1,
						javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup()
						.addComponent(building, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jButton1)
								.addGroup(layout.createSequentialGroup().addGap(1, 1, 1).addComponent(jTextField1,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(0, 10, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}

	/**
	 * Metod que demuestra el cambio de cada edifico del sistema para ibservar
	 * la disponibilidad de los lockers y su usuario qeu acrual mente en dueño
	 * de el
	 * 
	 * @param evt
	 *            variable del evento del boton aceptar de la interfaz
	 */
	@SuppressWarnings("static-access")
	private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {

		try {

			// validacion de que edificio se encuentra actualmente el slider
			// para demostrar los datos y la congruencia de la disponibilidad de
			// los lockers
			switch (jSlider1.getValue()) {

			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				this.Building = "A";
				data = connectionBD.dataLockers(
						"SELECT `tblacceso`.`Usuario`, `tblusuario`.`Nombre`, `tblasignacion`.`Periodo`, `tbldescripcion`.`Numero`, `tbledificio`.`Letra` FROM `tblacceso`, `tblusuario`, `tblasignacion`, `tbllocker`, `tbldescripcion`, `tbledificio` WHERE `tblacceso`.`idAcceso` = `tblusuario`.`idAcceso` AND `tblusuario`.`idUsuario` = `tblasignacion`.`idUsuario` AND `tblasignacion`.`idLocker` = `tbllocker`.`idLocker` AND `tbllocker`.`idDescripcion` = `tbldescripcion`.`idDescripcion` AND `tbllocker`.`idEdificio` = `tbledificio`.`idEdificio`;");
				this.object2.getAvailability(data, Building);
				data = this.object2.selectionEvent(data, Building);

				break;

			case 5:
			case 6:
			case 7:
			case 8:
				this.Building = "B";
				data = connectionBD.dataLockers(
						"SELECT `tblacceso`.`Usuario`, `tblusuario`.`Nombre`, `tblasignacion`.`Periodo`, `tbldescripcion`.`Numero`, `tbledificio`.`Letra` FROM `tblacceso`, `tblusuario`, `tblasignacion`, `tbllocker`, `tbldescripcion`, `tbledificio` WHERE `tblacceso`.`idAcceso` = `tblusuario`.`idAcceso` AND `tblusuario`.`idUsuario` = `tblasignacion`.`idUsuario` AND `tblasignacion`.`idLocker` = `tbllocker`.`idLocker` AND `tbllocker`.`idDescripcion` = `tbldescripcion`.`idDescripcion` AND `tbllocker`.`idEdificio` = `tbledificio`.`idEdificio`;");
				this.object2.getAvailability(data, Building);
				data = this.object2.selectionEvent(data, Building);

				break;

			case 9:
			case 10:
			case 11:
			case 12:
				this.Building = "C";
				data = connectionBD.dataLockers(
						"SELECT `tblacceso`.`Usuario`, `tblusuario`.`Nombre`, `tblasignacion`.`Periodo`, `tbldescripcion`.`Numero`, `tbledificio`.`Letra` FROM `tblacceso`, `tblusuario`, `tblasignacion`, `tbllocker`, `tbldescripcion`, `tbledificio` WHERE `tblacceso`.`idAcceso` = `tblusuario`.`idAcceso` AND `tblusuario`.`idUsuario` = `tblasignacion`.`idUsuario` AND `tblasignacion`.`idLocker` = `tbllocker`.`idLocker` AND `tbllocker`.`idDescripcion` = `tbldescripcion`.`idDescripcion` AND `tbllocker`.`idEdificio` = `tbledificio`.`idEdificio`;");
				this.object2.getAvailability(data, Building);
				data = this.object2.selectionEvent(data, Building);

				break;

			case 13:
			case 14:
			case 15:
			case 16:
				this.Building = "D";
				data = connectionBD.dataLockers(
						"SELECT `tblacceso`.`Usuario`, `tblusuario`.`Nombre`, `tblasignacion`.`Periodo`, `tbldescripcion`.`Numero`, `tbledificio`.`Letra` FROM `tblacceso`, `tblusuario`, `tblasignacion`, `tbllocker`, `tbldescripcion`, `tbledificio` WHERE `tblacceso`.`idAcceso` = `tblusuario`.`idAcceso` AND `tblusuario`.`idUsuario` = `tblasignacion`.`idUsuario` AND `tblasignacion`.`idLocker` = `tbllocker`.`idLocker` AND `tbllocker`.`idDescripcion` = `tbldescripcion`.`idDescripcion` AND `tbllocker`.`idEdificio` = `tbledificio`.`idEdificio`;");
				this.object2.getAvailability(data, Building);
				data = this.object2.selectionEvent(data, Building);

				break;

			case 17:
			case 18:
			case 19:
			case 20:
				this.Building = "E";
				data = connectionBD.dataLockers(
						"SELECT `tblacceso`.`Usuario`, `tblusuario`.`Nombre`, `tblasignacion`.`Periodo`, `tbldescripcion`.`Numero`, `tbledificio`.`Letra` FROM `tblacceso`, `tblusuario`, `tblasignacion`, `tbllocker`, `tbldescripcion`, `tbledificio` WHERE `tblacceso`.`idAcceso` = `tblusuario`.`idAcceso` AND `tblusuario`.`idUsuario` = `tblasignacion`.`idUsuario` AND `tblasignacion`.`idLocker` = `tbllocker`.`idLocker` AND `tbllocker`.`idDescripcion` = `tbldescripcion`.`idDescripcion` AND `tbllocker`.`idEdificio` = `tbledificio`.`idEdificio`;");
				this.object2.getAvailability(data, Building);
				data = this.object2.selectionEvent(data, Building);

				break;

			}

		} catch (SQLException e) {

			Logger.getLogger(Lockers_Window_Lockers_Manager.class.getName()).log(Level.SEVERE,
					"Error con la base de datos.");

		}

	}

	/**
	 * metodo que contiene toda los evetos de los botones de la interfaz
	 * 
	 * @param evt
	 *            varieble que contiene el evento de los 28 botones de la
	 *            interfaz
	 */
	private void actionLocker(java.awt.event.ActionEvent evt) {

		// realizacion del evento con respecto a cada boton y asi aigancion con
		// respecto a que aedificio pertenesca
		switch (evt.getActionCommand()) {

		case "1":
			jTextArea1.setText("El locker Numero 1 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(0).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "2":
			jTextArea1.setText("El locker Numero 2 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(1).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "3":
			jTextArea1.setText("El locker Numero 3 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(2).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "4":
			jTextArea1.setText("El locker Numero 4 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(3).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "5":
			jTextArea1.setText("El locker Numero 5 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(4).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "6":
			jTextArea1.setText("El locker Numero 6 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(5).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "7":
			jTextArea1.setText("El locker Numero 7 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(6).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "8":
			jTextArea1.setText("El locker Numero 8 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(7).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "9":
			jTextArea1.setText("El locker Numero 9 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(8).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "10":
			jTextArea1.setText("El locker Numero 10 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(9).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "11":
			jTextArea1.setText("El locker Numero 11 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(10).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "12":
			jTextArea1.setText("El locker Numero 12 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(11).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "13":
			jTextArea1.setText("El locker Numero 13 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(12).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "14":
			jTextArea1.setText("El locker Numero 14 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(13).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "15":
			jTextArea1.setText("El locker Numero 15 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(14).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "16":
			jTextArea1.setText("El locker Numero 16 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(15).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "17":
			jTextArea1.setText("El locker Numero 17 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(16).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "18":
			jTextArea1.setText("El locker Numero 18 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(17).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "19":
			jTextArea1.setText("El locker Numero 19 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(18).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "20":
			jTextArea1.setText("El locker Numero 20 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(19).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "21":
			jTextArea1.setText("El locker Numero 21 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(20).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "22":
			jTextArea1.setText("El locker Numero 22 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(21).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "23":
			jTextArea1.setText("El locker Numero 23 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(22).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "24":
			jTextArea1.setText("El locker Numero 24 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(23).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "25":
			jTextArea1.setText("El locker Numero 25 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(24).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "26":
			jTextArea1.setText("El locker Numero 26 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(25).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "27":
			jTextArea1.setText("El locker Numero 27 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(26).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		case "28":
			jTextArea1.setText("El locker Numero 28 del " + Building + "\nse encuentra temporalmente\n"
					+ data.get(27).replaceAll("&", "\n").replaceAll("#", "\n"));

			break;

		}

	}

	/**
	 * @param evt
	 */
	private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {

		this.jTextField2.setText("");
		this.jDateChooser1.setCalendar(calendar);
		this.jDateChooser2.setCalendar(calendar);

	}

	/**
	 * @param evt
	 */
	private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {

		int numberUser = 0;

		try {

			numberUser = connectionBD.dataSearch(
					"SELECT `tblacceso`.`idAcceso` FROM `tblacceso`, `tblusuario`, `tblasignacion`, `tbllocker`, `tbldescripcion`, `tbledificio` WHERE `tblacceso`.`idAcceso` = `tblusuario`.`idAcceso` AND `tblusuario`.`idUsuario` = `tblasignacion`.`idUsuario` AND `tblasignacion`.`idLocker` = `tbllocker`.`idLocker` AND `tbllocker`.`idDescripcion` = `tbldescripcion`.`idDescripcion` AND `tbllocker`.`idEdificio` = `tbledificio`.`idEdificio` AND `tblacceso`.`Usuario` = '"
							+ jTextField2.getText() + "';");

			if (numberUser > 0) {

				JOptionPane.showMessageDialog(null, "El usuario ya cuenta con un locker.", "Error",
						JOptionPane.ERROR_MESSAGE);

			} else {

				numberUser = connectionBD
						.dataSearch("SELECT `tblacceso`.`idAcceso` FROM `tblacceso` WHERE `tblacceso`.`Usuario` = '"
								+ jTextField2.getText() + "';");

				if (numberUser > 0) {

					if (jTextArea1.getText().equals("")) {

						JOptionPane.showMessageDialog(null, "Es necesario seleccionar un locker.", "Error",
								JOptionPane.ERROR_MESSAGE);

					} else {

						if (jTextArea1.getText().indexOf("Libre") != -1) {

							String number = connectionBD.numberTable("tblasignacion", "idAsignacion");
							numberUser = connectionBD.dataSearch(
									"SELECT `tblusuario`.`idUsuario` FROM `tblacceso`, `tblusuario` WHERE `tblacceso`.`idAcceso` = `tblusuario`.`idAcceso` AND `tblacceso`.`Usuario` = '"
											+ jTextField2.getText() + "';");
							int locker = connectionBD
									.dataSearch(
											"SELECT `tbllocker`.`idLocker` FROM `tbllocker`, `tbldescripcion`, `tbledificio` WHERE `tbllocker`.`idDescripcion` = `tbldescripcion`.`idDescripcion` AND `tbllocker`.`idEdificio` = `tbledificio`.`idEdificio` AND `tbledificio`.`Letra` = '"
													+ Building + "' AND `tbldescripcion`.`Numero` = 'LOCKER"
													+ jTextArea1.getText().substring(
															jTextArea1.getText().lastIndexOf(" ") + 1,
															jTextArea1.getText().length())
													+ "';");

							boolean permission = connectionBD.insertData(
									"INSERT INTO `software_lockers_manager`.`tblasignacion`(`idAsignacion`,`Periodo`,`idLocker`,`idUsuario`) VALUES ("
											+ number + ",'" + jDateChooser1.getCalendar().getTime() + " a "
											+ jDateChooser2.getCalendar().getTime() + "'," + locker + "," + numberUser
											+ ");");

							if (permission) {

								JOptionPane.showMessageDialog(null,
										"Asigancion de locker a usuario: " + jTextField2.getText(), "SADAL",
										JOptionPane.PLAIN_MESSAGE);
								data = connectionBD.dataLockers(
										"SELECT `tblacceso`.`Usuario`, `tblusuario`.`Nombre`, `tblasignacion`.`Periodo`, `tbldescripcion`.`Numero`, `tbledificio`.`Letra` FROM `tblacceso`, `tblusuario`, `tblasignacion`, `tbllocker`, `tbldescripcion`, `tbledificio` WHERE `tblacceso`.`idAcceso` = `tblusuario`.`idAcceso` AND `tblusuario`.`idUsuario` = `tblasignacion`.`idUsuario` AND `tblasignacion`.`idLocker` = `tbllocker`.`idLocker` AND `tbllocker`.`idDescripcion` = `tbldescripcion`.`idDescripcion` AND `tbllocker`.`idEdificio` = `tbledificio`.`idEdificio`;");
								this.object2.getAvailability(data, Building);
								data = this.object2.selectionEvent(data, Building);

							}

							object3.getDisponibilidad("" + (140 - connectionBD
									.dataSearch("SELECT COUNT(`tblasignacion`.`idAsignacion`) FROM `tblasignacion`;")));

						} else {

							JOptionPane.showMessageDialog(null, "Locker no disponible para los usuarios.", "Error",
									JOptionPane.ERROR_MESSAGE);

						}

					}

				} else {

					JOptionPane.showMessageDialog(null, "El usuario no existe en el sistema.", "Error",
							JOptionPane.ERROR_MESSAGE);

				}

			}

		} catch (SQLException e) {

			Logger.getLogger(Lockers_Window_Lockers_Manager.class.getName()).log(Level.SEVERE,
					"Error con la base de datos.");

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
	 * metodo para le cambio de los caracteres de minusculas a mayusculas
	 * 
	 * @param evt
	 *            parametro eviado desde la clses actionperformed en su
	 *            contruccion de la clase
	 */
	private void letterLarger(java.awt.event.KeyEvent evt) {

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

	//decalaracion de las variables de la interfaz 
	private javax.swing.JLabel B;
	private javax.swing.JLabel building;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton30;
	private javax.swing.JButton jButton31;
	private com.toedter.calendar.JDateChooser jDateChooser1;
	private com.toedter.calendar.JDateChooser jDateChooser2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JSlider jSlider1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	public static javax.swing.JButton locker1;
	public static javax.swing.JButton locker10;
	public static javax.swing.JButton locker11;
	public static javax.swing.JButton locker12;
	public static javax.swing.JButton locker13;
	public static javax.swing.JButton locker14;
	public static javax.swing.JButton locker15;
	public static javax.swing.JButton locker16;
	public static javax.swing.JButton locker17;
	public static javax.swing.JButton locker18;
	public static javax.swing.JButton locker19;
	public static javax.swing.JButton locker2;
	public static javax.swing.JButton locker20;
	public static javax.swing.JButton locker21;
	public static javax.swing.JButton locker22;
	public static javax.swing.JButton locker23;
	public static javax.swing.JButton locker24;
	public static javax.swing.JButton locker25;
	public static javax.swing.JButton locker26;
	public static javax.swing.JButton locker27;
	public static javax.swing.JButton locker28;
	public static javax.swing.JButton locker3;
	public static javax.swing.JButton locker4;
	public static javax.swing.JButton locker5;
	public static javax.swing.JButton locker6;
	public static javax.swing.JButton locker7;
	public static javax.swing.JButton locker8;
	public static javax.swing.JButton locker9;

}
