package Interface_Main_Lockers.Windows_Lockers_Manager;

import Archive_File.Option_File;
import Source_File.Open_File;
import Source_File.Operation_File;
import Source_File.Save_File;
import Windows_File.File_Chooser;
import Interface_Main_Lockers.Windows_Lockers_Manager.Code.Calendar_Event_Lockers_Manager;
import Interface_Main_Lockers.Windows_Lockers_Manager.DataBase.Connection_DataBases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
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
public class Beginning_Window_Lockers_Manager extends javax.swing.JFrame {

	private final Calendar calendar;

	@SuppressWarnings("unused")
	private final File_Chooser object1;
	private final Option_File object2;
	private final Calendar_Event_Lockers_Manager object3;
	private final Connection_DataBases connectionBD;

	private static String _YEAR;
	private static String _MONTH;
	private static String _DATE;
	private static String _DAY;

	public static ArrayList<String> data;
	public static ArrayList<String> data1;

	/**
	 * Constructor de la clase que construye la interfaz que se muestra en la
	 * ejecucion de las programa con metodos del swin
	 */
	public Beginning_Window_Lockers_Manager() {

		// metodo que contiene la construccion de la clase
		initComponents();

		this.connectionBD = Connection_DataBases.getInstance();

		this.object1 = new File_Chooser();
		this.object2 = new Option_File();
		this.object3 = new Calendar_Event_Lockers_Manager();
		this.object2.setPath("default", "sql");
		this.calendar = new GregorianCalendar();
		this.date.setCalendar(calendar);
		this.sessionT(false);
		// linea de la asigacion de un icono del sistemas;
		this.setIconImage(
				new ImageIcon(getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU.png"))
						.getImage());

		// cargadno la disponibilidad de los datos de la base de datos
		try {

			this.getDisponibilidad("" + (140
					- connectionBD.dataSearch("SELECT COUNT(`tblasignacion`.`idAsignacion`) FROM `tblasignacion`;")));

		} catch (SQLException e) {

			Logger.getLogger(Beginning_Window_Lockers_Manager.class.getName()).log(Level.SEVERE,
					"Error con la base de datos.");

		}

	}

	private void initComponents() {

		date = new com.toedter.calendar.JDateChooser();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jPanel2 = new javax.swing.JPanel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		calendar1 = new javax.swing.JButton();
		calendar2 = new javax.swing.JButton();
		calendar3 = new javax.swing.JButton();
		calendar4 = new javax.swing.JButton();
		calendar5 = new javax.swing.JButton();
		calendar6 = new javax.swing.JButton();
		calendar7 = new javax.swing.JButton();
		calendar8 = new javax.swing.JButton();
		calendar9 = new javax.swing.JButton();
		calendar10 = new javax.swing.JButton();
		calendar11 = new javax.swing.JButton();
		calendar12 = new javax.swing.JButton();
		calendar13 = new javax.swing.JButton();
		calendar14 = new javax.swing.JButton();
		calendar15 = new javax.swing.JButton();
		calendar17 = new javax.swing.JButton();
		calendar21 = new javax.swing.JButton();
		calendar18 = new javax.swing.JButton();
		calendar16 = new javax.swing.JButton();
		calendar20 = new javax.swing.JButton();
		calendar19 = new javax.swing.JButton();
		calendar23 = new javax.swing.JButton();
		calendar28 = new javax.swing.JButton();
		calendar22 = new javax.swing.JButton();
		calendar26 = new javax.swing.JButton();
		calendar25 = new javax.swing.JButton();
		calendar24 = new javax.swing.JButton();
		calendar27 = new javax.swing.JButton();
		calendar29 = new javax.swing.JButton();
		calendar30 = new javax.swing.JButton();
		calendar31 = new javax.swing.JButton();
		calendar32 = new javax.swing.JButton();
		calendar33 = new javax.swing.JButton();
		calendar34 = new javax.swing.JButton();
		calendar35 = new javax.swing.JButton();
		calendar36 = new javax.swing.JButton();
		calendar37 = new javax.swing.JButton();
		calendar38 = new javax.swing.JButton();
		calendar39 = new javax.swing.JButton();
		calendar40 = new javax.swing.JButton();
		calendar41 = new javax.swing.JButton();
		calendar42 = new javax.swing.JButton();
		loginPresentation = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jToolBar1 = new javax.swing.JToolBar();
		session = new javax.swing.JButton();
		users = new javax.swing.JButton();
		lockers = new javax.swing.JButton();
		bitacoras = new javax.swing.JButton();
		jButton40 = new javax.swing.JButton();
		records = new javax.swing.JButton();
		settings = new javax.swing.JButton();
		petitions = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		setTitle("SADAL - Sistemas Administrador de Asignacion de Lockers");
		setBackground(new java.awt.Color(0, 0, 0));
		setResizable(false);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}
		});

		date.setFont(new java.awt.Font("Arial", 1, 12));
		date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
			public void propertyChange(java.beans.PropertyChangeEvent evt) {
				datePropertyChange(evt);
			}
		});

		jLabel1.setText("jLabel1");

		jLabel2.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel2.setText("Día Libre");

		jLabel3.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel3.setText("Horas Libres");

		jLabel4.setText("jLabel1");

		jLabel5.setText("jLabel1");

		jLabel6.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel6.setText("Día Ocupado");

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Comentarios del Día",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Arial", 1, 14)));

		jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		jScrollPane1.setEnabled(false);
		jScrollPane1.setFont(new java.awt.Font("Arial", 0, 12));

		jTextArea1.setEditable(false);
		jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
		jTextArea1.setFont(new java.awt.Font("Arial", 1, 12));
		jTextArea1.setRows(5);
		jTextArea1.setText("Bienvenido al Sistema SADAL");
		jTextArea1.setBorder(null);
		jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
		jScrollPane1.setViewportView(jTextArea1);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE));

		jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jLabel8.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel8.setText("Lunes");
		jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, -1));

		jLabel9.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel9.setText("Martes");
		jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 90, -1));

		jLabel10.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel10.setText("Miércoles");
		jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 90, -1));

		jLabel11.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel11.setText("Jueves");
		jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 90, -1));

		jLabel12.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel12.setText("Domingo");
		jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 90, -1));

		jLabel13.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel13.setText("Sábado");
		jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 90, -1));

		jLabel14.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel14.setText("Viernes");
		jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 90, -1));

		calendar1.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar1.setName("e");
		calendar1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 21, 90, 70));

		calendar2.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 90, 70));

		calendar3.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 90, 70));

		calendar4.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 90, 70));

		calendar5.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 90, 70));

		calendar6.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 90, 70));

		calendar7.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 90, 70));

		calendar8.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, 70));

		calendar9.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 90, 70));

		calendar10.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 90, 70));

		calendar11.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 90, 70));

		calendar12.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 90, 70));

		calendar13.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 90, 70));

		calendar14.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 90, 70));

		calendar15.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, 70));

		calendar17.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 90, 70));

		calendar21.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar21.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar21, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 90, 70));

		calendar18.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar18.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 90, 70));

		calendar16.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 90, 70));

		calendar20.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar20.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar20, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 90, 70));

		calendar19.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar19.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 90, 70));

		calendar23.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar23.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar23, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 90, 70));

		calendar28.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar28.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar28, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 90, 70));

		calendar22.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar22.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 90, 70));

		calendar26.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar26.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar26, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 90, 70));

		calendar25.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar25.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar25, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 90, 70));

		calendar24.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar24.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar24, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 90, 70));

		calendar27.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar27.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar27, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 90, 70));

		calendar29.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar29.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 90, 70));

		calendar30.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar30.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar30, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 90, 70));

		calendar31.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar31.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar31, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 90, 70));

		calendar32.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar32.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar32, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 90, 70));

		calendar33.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar33.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar33, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 90, 70));

		calendar34.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar34.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar34, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 90, 70));

		calendar35.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar35.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar35, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 90, 70));

		calendar36.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar36.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 90, 70));

		calendar37.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar37.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar37, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 90, 70));

		calendar38.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		calendar38.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionDay(evt);
			}
		});
		jPanel2.add(calendar38, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 90, 70));

		calendar39.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jPanel2.add(calendar39, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 90, 70));

		calendar40.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jPanel2.add(calendar40, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 90, 70));

		calendar41.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jPanel2.add(calendar41, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 90, 70));

		calendar42.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/0.png")));
		calendar42.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jPanel2.add(calendar42, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 90, 70));

		loginPresentation.setBackground(new java.awt.Color(102, 102, 102));
		loginPresentation.setFont(new java.awt.Font("Arial", 1, 12));
		loginPresentation.setText("Bienvenido ");

		jLabel15.setFont(new java.awt.Font("Arial", 1, 12));
		jLabel15.setText("Lockers Disponibles 0");

		jToolBar1.setBackground(new java.awt.Color(102, 102, 102));
		jToolBar1.setFloatable(false);
		jToolBar1.setRollover(true);

		session.setBackground(new java.awt.Color(102, 102, 102));
		session.setFont(new java.awt.Font("Arial", 1, 12));
		session.setText(" Sesión ");
		session.setFocusable(false);
		session.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		session.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		session.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sessionActionPerformed(evt);
			}
		});
		jToolBar1.add(session);

		users.setBackground(new java.awt.Color(102, 102, 102));
		users.setFont(new java.awt.Font("Arial", 1, 12));
		users.setText(" Usuario ");
		users.setFocusable(false);
		users.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		users.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		users.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				usersActionPerformed(evt);
			}
		});
		jToolBar1.add(users);

		lockers.setBackground(new java.awt.Color(102, 102, 102));
		lockers.setFont(new java.awt.Font("Arial", 1, 12));
		lockers.setText(" Lockers ");
		lockers.setFocusable(false);
		lockers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		lockers.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		lockers.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				lockersActionPerformed(evt);
			}
		});
		jToolBar1.add(lockers);

		bitacoras.setBackground(new java.awt.Color(102, 102, 102));
		bitacoras.setFont(new java.awt.Font("Arial", 1, 12));
		bitacoras.setText(" Bitacoras ");
		bitacoras.setFocusable(false);
		bitacoras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		bitacoras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		bitacoras.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bitacorasActionPerformed(evt);
			}
		});
		jToolBar1.add(bitacoras);

		jButton40.setBackground(new java.awt.Color(102, 102, 102));
		jButton40.setFont(new java.awt.Font("Arial", 1, 12));
		jButton40.setText(
				"                                                                                                                                                             ");
		jButton40.setEnabled(false);
		jButton40.setFocusable(false);
		jButton40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jButton40.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		jToolBar1.add(jButton40);

		records.setBackground(new java.awt.Color(102, 102, 102));
		records.setFont(new java.awt.Font("Arial", 1, 12));
		records.setText(" Registros ");
		records.setFocusable(false);
		records.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		records.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		records.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				recordsActionPerformed(evt);
			}
		});
		jToolBar1.add(records);

		settings.setBackground(new java.awt.Color(102, 102, 102));
		settings.setFont(new java.awt.Font("Arial", 1, 12));
		settings.setText("Borrar");
		settings.setFocusable(false);
		settings.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		settings.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		settings.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				settingsActionPerformed(evt);
			}
		});
		jToolBar1.add(settings);

		petitions.setBackground(new java.awt.Color(102, 102, 102));
		petitions.setFont(new java.awt.Font("Arial", 1, 12));
		petitions.setText(" Peticiones ");
		petitions.setFocusable(false);
		petitions.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		petitions.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		petitions.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				petitionsActionPerformed(evt);
			}
		});
		jToolBar1.add(petitions);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 920,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(10, 10, 10)
										.addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 140,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(50, 50, 50).addComponent(jLabel1).addGap(6, 6, 6).addComponent(jLabel2)
										.addGap(40, 40, 40).addComponent(jLabel4).addGap(6, 6, 6).addComponent(jLabel3)
										.addGap(27, 27, 27).addComponent(jLabel5).addGap(6, 6, 6).addComponent(jLabel6))
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 710,
								javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(jLabel15,
										javax.swing.GroupLayout.PREFERRED_SIZE, 179,
										javax.swing.GroupLayout.PREFERRED_SIZE))))
				.addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(loginPresentation,
						javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(10, 10, 10)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(layout.createSequentialGroup().addGap(10, 10, 10)
														.addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(jLabel1).addComponent(jLabel2)
																.addComponent(jLabel4).addComponent(jLabel3)
																.addComponent(jLabel5).addComponent(jLabel6))))
										.addGap(5, 5, 5).addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
												500, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
										.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(10, 10, 10).addComponent(jLabel15,
												javax.swing.GroupLayout.PREFERRED_SIZE, 20,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addComponent(loginPresentation, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
						javax.swing.GroupLayout.PREFERRED_SIZE)));

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
	private void formWindowClosing(java.awt.event.WindowEvent evt) {

		programExit();

	}

	/**
	 * @param evt
	 */
	private void sessionActionPerformed(java.awt.event.ActionEvent evt) {

		if (session.getText().equals("Cerrar")) {

			try {

				if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea cerrar su sesión?", "Cerrar Sesión",
						JOptionPane.YES_NO_OPTION) == 0) {

					@SuppressWarnings("unused")
					Operation_File operation = new Save_File(
							object2.getPath("default", "sql").replace("default", "Bitacoras\\bitacoraUser"),
							"Salida de "
									+ loginPresentation.getText().substring(11, loginPresentation.getText().length())
									+ " a las " + this.getDate(),
							true);
					clearLoginPresentation();
					this.sessionT(false);

				}

			} catch (Throwable ex) {

				Logger.getLogger(Beginning_Window_Lockers_Manager.class.getName()).log(Level.SEVERE,
						"Error de Confirmacion para Salir del Programa");

			}

		} else {

			new Login_Window_Lockers_Manager(this, connectionBD).setVisible(true);

		}

	}

	/**
	 * @param evt
	 */
	private void bitacorasActionPerformed(java.awt.event.ActionEvent evt) {

		new Bitacoras_Window_Lockers_Manager(object2).setVisible(true);

	}

	/**
	 * @param evt
	 */
	private void usersActionPerformed(java.awt.event.ActionEvent evt) {

		new Username_Window_Lockers_Manager(object2, this, connectionBD).setVisible(true);

	}

	/**
	 * @param evt
	 */
	private void petitionsActionPerformed(java.awt.event.ActionEvent evt) {

		if (loginPresentation.getText().indexOf("ADMIN") != -1) {

			new Petitions_Window_Lockers_Manager(object2).setVisible(true);

		} else {

			new Petitions_Window_Lockers_Manager(object2, false).setVisible(true);

		}

	}

	/**
	 * @param evt
	 */
	private void lockersActionPerformed(java.awt.event.ActionEvent evt) {

		new Lockers_Window_Lockers_Manager(this, connectionBD).setVisible(true);

	}

	/**
	 * @param evt
	 */
	private void datePropertyChange(java.beans.PropertyChangeEvent evt) {

		if ("date".equals(evt.getPropertyName())) {

			String date1 = "" + date.getCalendar().getTime();

			_DATE = date1.substring(8, 10);
			_MONTH = date1.substring(4, 7);
			_YEAR = date1.substring(date1.length() - 4, date1.length());
			_DAY = date1.substring(0, 3);

			Operation_File object4 = new Open_File(object2.getPath("default", "sql").replace("default", _MONTH));
			jTextArea1.setText("Bienvenido al Sistemas SADAL\n" + object4.toString());
			data = new ArrayList<String>(Arrays.asList(object4.toString().split("\n")));

			object3.getDayCalendar(_DATE, _DAY, _MONTH, _YEAR, data);

		}

	}

	/**
	 * @param evt
	 */
	private void actionDay(java.awt.event.ActionEvent evt) {

		switch (evt.getActionCommand()) {

		case "1":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 1 del " + _MONTH + "\nSe tiene las actividades :\n"
					+ data.get(0).replace("#1:", ""));

			break;

		case "2":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 2 del " + _MONTH + "\nSe tiene las actividades :\n"
					+ data.get(1).replace("#2:", ""));

			break;

		case "3":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 3 del " + _MONTH + "\nSe tiene las actividades :\n"
					+ data.get(2).replace("#3:", ""));

			break;

		case "4":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 4 del " + _MONTH + "\nSe tiene las actividades :\n"
					+ data.get(3).replace("#4:", ""));

			break;

		case "5":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 5 del " + _MONTH + "\nSe tiene las actividades :\n"
					+ data.get(4).replace("#5:", ""));

			break;

		case "6":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 6 del " + _MONTH + "\nSe tiene las actividades :\n"
					+ data.get(5).replace("#6:", ""));

			break;

		case "7":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 7 del " + _MONTH + "\nSe tiene las actividades :\n"
					+ data.get(6).replace("#7:", ""));

			break;

		case "8":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 8 del " + _MONTH + "\nSe tiene las actividades :\n"
					+ data.get(7).replace("#8:", ""));

			break;

		case "9":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 9 del " + _MONTH + "\nSe tiene las actividades :\n"
					+ data.get(8).replace("#9:", ""));

			break;

		case "10":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 10 del " + _MONTH
					+ "\nSe tiene las actividades :\n" + data.get(9).replace("#10:", ""));
			break;

		case "11":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 11 del " + _MONTH
					+ "\nSe tiene las actividades :\n" + data.get(10).replace("#11:", ""));

			break;

		case "12":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 12 del " + _MONTH
					+ "\nSe tiene las actividades :\n" + data.get(11).replace("#12:", ""));

			break;

		case "13":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 13 del " + _MONTH
					+ "\nSe tiene las actividades :\n" + data.get(12).replace("#13:", ""));

			break;

		case "14":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 14 del " + _MONTH
					+ "\nSe tiene las actividades :\n" + data.get(13).replace("#14:", ""));

			break;

		case "15":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 15 del " + _MONTH
					+ "\nSe tiene las actividades :\n" + data.get(14).replace("#15:", ""));

			break;

		case "16":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 16 del " + _MONTH
					+ "\nSe tiene las actividades :\n" + data.get(15).replace("#16:", ""));

			break;

		case "17":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 17 del " + _MONTH
					+ "\nSe tiene las actividades :\n" + data.get(16).replace("#17:", ""));

			break;

		case "18":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 18 del " + _MONTH
					+ "\nSe tiene las actividades :\n" + data.get(17).replace("#18:", ""));

			break;

		case "19":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 19 del " + _MONTH
					+ "\nSe tiene las actividades :\n" + data.get(18).replace("#19:", ""));

			break;

		case "20":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 20 del " + _MONTH
					+ "\nSe tiene las actividades :\n" + data.get(19).replace("#20:", ""));

			break;

		case "21":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 21 del " + _MONTH
					+ "\nSe tiene las actividades :\n" + data.get(20).replace("#21:", ""));

			break;

		case "22":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 22 del " + _MONTH
					+ "\nSe tiene las actividades :\n" + data.get(21).replace("#22:", ""));

			break;

		case "23":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 23 del " + _MONTH
					+ "\nSe tiene las actividades :\n" + data.get(22).replace("#23:", ""));

			break;

		case "24":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 24 del " + _MONTH
					+ "\nSe tiene las actividades :\n" + data.get(23).replace("#24:", ""));

			break;

		case "25":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 25 del " + _MONTH
					+ "\nSe tiene las actividades :\n" + data.get(24).replace("#25:", ""));

			break;

		case "26":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 26 del " + _MONTH
					+ "\nSe tiene las actividades :\n" + data.get(25).replace("#26:", ""));

			break;

		case "27":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 27 del " + _MONTH
					+ "\nSe tiene las actividades :\n" + data.get(26).replace("#27:", ""));

			break;

		case "28":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 28 del " + _MONTH
					+ "\nSe tiene las actividades :\n" + data.get(27).replace("#28:", ""));

			break;

		case "29":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 29 del " + _MONTH
					+ "\nSe tiene las actividades :\n" + data.get(28).replace("#29:", ""));

			break;

		case "30":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 30 del " + _MONTH
					+ "\nSe tiene las actividades :\n" + data.get(29).replace("#30:", ""));

			break;

		case "31":
			jTextArea1.setText("Bienvenido al Sistemas SADAL\nEl dia 31 del " + _MONTH
					+ "\nSe tiene las actividades :\n" + data.get(30).replace("#31:", ""));

			break;

		}

	}

	/**
	 * @param evt
	 */
	private void settingsActionPerformed(java.awt.event.ActionEvent evt) {

		new Delete_User_Lockers_Manager(connectionBD).setVisible(true);

	}

	/**
	 * @param evt
	 */
	private void recordsActionPerformed(java.awt.event.ActionEvent evt) {

		new Registration_Lockers_Manager(object2, this).setVisible(true);

	}

	/**
	 * 
	 */
	@SuppressWarnings("static-access")
	private void programExit() {

		try {

			if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?", "Salir",
					JOptionPane.YES_NO_OPTION) == 0) {

				connectionBD.closeConnection();
				System.exit(0);

			}

		} catch (Throwable ex) {

			Logger.getLogger(Beginning_Window_Lockers_Manager.class.getName()).log(Level.SEVERE,
					"Error de Confirmacion para Salir del Programa");

		}

	}

	/**
	 * @param login
	 */
	public void getLoginPresentation(String login) {

		session.setText("Cerrar");
		this.loginPresentation.setText("Bienvenido " + login);

	}

	/**
	 * @return
	 */
	public String setLoginPresentation() {

		return this.loginPresentation.getText();

	}

	/**
	 * 
	 */
	public void clearLoginPresentation() {

		session.setText("Sesión");
		this.loginPresentation.setText("Bienvenido ");

	}

	/**
	 * @return
	 */
	public String getDate() {

		Date fecha = new Date();

		return "" + fecha;

	}

	/**
	 * @param dat1
	 */
	public void getDisponibilidad(String dat1) {

		this.jLabel15.setText("Lockers Disponibles " + dat1);

	}

	/**
	 * @param x
	 */
	public void sessionT(boolean x) {

		this.users.setEnabled(x);
		this.lockers.setEnabled(x);
		this.bitacoras.setEnabled(x);
		this.records.setEnabled(x);
		this.settings.setEnabled(x);
		this.petitions.setEnabled(x);

	}

	/**
	 * 
	 */
	public void sessionA() {

		this.users.setEnabled(true);
		this.lockers.setEnabled(true);
		this.bitacoras.setEnabled(false);
		this.records.setEnabled(false);
		this.settings.setEnabled(false);
		this.petitions.setEnabled(true);

	}

	/**
	 * 
	 */
	public void sessionU() {

		this.users.setEnabled(false);
		this.lockers.setEnabled(false);
		this.bitacoras.setEnabled(false);
		this.records.setEnabled(false);
		this.settings.setEnabled(false);
		this.petitions.setEnabled(true);

	}

	/**
	 * 
	 */
	public void reiniciar() {

		String date1 = "" + date.getCalendar().getTime();

		_DATE = date1.substring(8, 10);
		_MONTH = date1.substring(4, 7);
		_YEAR = date1.substring(date1.length() - 4, date1.length());
		_DAY = date1.substring(0, 3);

		Operation_File object4 = new Open_File(object2.getPath("default", "sql").replace("default", _MONTH));
		jTextArea1.setText("Bienvenido al Sistemas SADAL\n" + object4.toString());
		data = new ArrayList<String>(Arrays.asList(object4.toString().split("\n")));

		object3.getDayCalendar(_DATE, _DAY, _MONTH, _YEAR, data);

	}

	// declaracion de las variables del sistema
	private javax.swing.JButton bitacoras;
	public static javax.swing.JButton calendar1;
	public static javax.swing.JButton calendar10;
	public static javax.swing.JButton calendar11;
	public static javax.swing.JButton calendar12;
	public static javax.swing.JButton calendar13;
	public static javax.swing.JButton calendar14;
	public static javax.swing.JButton calendar15;
	public static javax.swing.JButton calendar16;
	public static javax.swing.JButton calendar17;
	public static javax.swing.JButton calendar18;
	public static javax.swing.JButton calendar19;
	public static javax.swing.JButton calendar2;
	public static javax.swing.JButton calendar20;
	public static javax.swing.JButton calendar21;
	public static javax.swing.JButton calendar22;
	public static javax.swing.JButton calendar23;
	public static javax.swing.JButton calendar24;
	public static javax.swing.JButton calendar25;
	public static javax.swing.JButton calendar26;
	public static javax.swing.JButton calendar27;
	public static javax.swing.JButton calendar28;
	public static javax.swing.JButton calendar29;
	public static javax.swing.JButton calendar3;
	public static javax.swing.JButton calendar30;
	public static javax.swing.JButton calendar31;
	public static javax.swing.JButton calendar32;
	public static javax.swing.JButton calendar33;
	public static javax.swing.JButton calendar34;
	public static javax.swing.JButton calendar35;
	public static javax.swing.JButton calendar36;
	public static javax.swing.JButton calendar37;
	public static javax.swing.JButton calendar38;
	public static javax.swing.JButton calendar39;
	public static javax.swing.JButton calendar4;
	public static javax.swing.JButton calendar40;
	public static javax.swing.JButton calendar41;
	public static javax.swing.JButton calendar42;
	public static javax.swing.JButton calendar5;
	public static javax.swing.JButton calendar6;
	public static javax.swing.JButton calendar7;
	public static javax.swing.JButton calendar8;
	public static javax.swing.JButton calendar9;
	private com.toedter.calendar.JDateChooser date;
	private javax.swing.JButton jButton40;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JToolBar jToolBar1;
	private javax.swing.JButton lockers;
	private javax.swing.JLabel loginPresentation;
	private javax.swing.JButton petitions;
	private javax.swing.JButton records;
	private javax.swing.JButton session;
	private javax.swing.JButton settings;
	private javax.swing.JButton users;

}
