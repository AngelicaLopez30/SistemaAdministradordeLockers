/**
 * clase para mostrar lo datos de las bitacoras de las actividades 
 * de cada uno los eventos del sistemas por medio de tablas detalladas
 */
package Interface_Main_Lockers.Windows_Lockers_Manager;

import Archive_File.Option_File;
import Source_File.Open_File;
import Source_File.Operation_File;
import Interface_Main_Lockers.Windows_Lockers_Manager.Code.StyleTable_Lockers_Manager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Lopez Santiago Angelica
 */
@SuppressWarnings("serial")
public final class Bitacoras_Window_Lockers_Manager extends javax.swing.JFrame {

	private final Calendar calendar;
	private final DefaultTableModel table1;
	private final DefaultTableModel table2;
	private final DefaultTableModel table3;
	private final DefaultTableModel table4;
	private final Option_File object1;
	public static ArrayList<String> data;

	/**
	 * Constructor de la clase que construye la interfaz que se muestra en la
	 * ejecucion de las programa con metodos del swing
	 * 
	 * @param object1
	 */
	public Bitacoras_Window_Lockers_Manager(Option_File object1) {

		// metodo que contiene la construccion de la clase
		initComponents();

		// inicializacion de las tablas de la interfaz por medio de una estilo
		// por el parametro defaulttablemodel
		this.object1 = object1;
		this.table1 = new DefaultTableModel();
		this.table1.addColumn("Numero");
		this.table1.addColumn("Evento");
		this.Table1.setModel(table1);
		this.Table1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		this.setStyleTable(Table1);
		this.printUser("bitacoraUser", table1, Table1);

		// inicializacion de las tablas de la interfaz por medio de una estilo
		// por el parametro defaulttablemodel
		this.table2 = new DefaultTableModel();
		this.table2.addColumn("Numero");
		this.table2.addColumn("Evento");
		this.Table2.setModel(table2);
		this.Table2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		this.setStyleTable(Table2);
		this.printUser("bitacoralockers", table2, Table2);

		// inicializacion de las tablas de la interfaz por medio de una estilo
		// por el parametro defaulttablemodel
		this.table3 = new DefaultTableModel();
		this.table3.addColumn("Numero");
		this.table3.addColumn("Registro");
		this.Table3.setModel(table3);
		this.Table3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		this.setStyleTable(Table3);
		this.printUser("bitacoraRegistration", table3, Table3);

		// inicializacion de las tablas de la interfaz por medio de una estilo
		// por el parametro defaulttablemodel
		this.table4 = new DefaultTableModel();
		this.table4.addColumn("Numero");
		this.table4.addColumn("Peticiones");
		this.Table4.setModel(table4);
		this.Table4.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		this.setStyleTable(Table4);
		this.printUser("bitacoraPetitions", table4, Table4);

		this.calendar = new GregorianCalendar();
		this.jDateChooser1.setCalendar(calendar);
		// linea de la asigacion de un icono del sistemas
		this.setIconImage(
				new ImageIcon(getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU.png"))
						.getImage());

	}

	/**
	 * Asignacion de tipo de estilo y elementos a las tablas para la interfaz
	 * por medio de un enumerator
	 * 
	 * @param table
	 *            variable de la tabla que se decea ver un tipo de estilo asi
	 *            ella
	 */
	public void setStyleTable(JTable table) {

		// arreglo para la creacion de las presentaciones de los datos de las
		// tablas por emdio de un arreglo
		Enumeration<TableColumn> en = table.getColumnModel().getColumns();

		// ciclo infinito para la lectura de los elementos de la tabla para su
		// presentacion con eun tipo de formato
		while (en.hasMoreElements()) {

			// lectura de las columnas una por una
			TableColumn tc = en.nextElement();
			tc.setCellRenderer(new StyleTable_Lockers_Manager());

		}

	}

	/**
	 * Metodo de como se debe de realizar la escritura de los datos de la tabla
	 * 
	 * @param archive
	 *            variable del nombre del archivo que se leera
	 * @param table
	 *            varieble del estit de la tabla y formato
	 * @param Table
	 *            variable de la table que se editara
	 */
	public void printUser(String archive, DefaultTableModel table, JTable Table) {

		// nueva lectura de las columnas y ancho de la tabla
		TableColumnModel columnModel = Table.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(50);
		columnModel.getColumn(1).setPreferredWidth(460);

		String data1[] = new String[2];

		// lectura de los datos de la base de datos
		Operation_File object = new Open_File(
				object1.getPath("default", "sql").replace("default", "Bitacoras\\" + archive));
		data = new ArrayList<String>(Arrays.asList(object.toString().split("\n")));

		// lectura por medio deun for y evalucion de los mismo pra la su
		// colocacion exacta en las tabals
		int y = 0;
		for (String x : data) {

			y++;
			data1[0] = "" + y;
			data1[1] = x;

			table.addRow(data1);

		}

	}

	private void initComponents() {

		jDateChooser1 = new com.toedter.calendar.JDateChooser();
		jLabel1 = new javax.swing.JLabel();
		jpanel1 = new javax.swing.JTabbedPane();
		jScrollPane2 = new javax.swing.JScrollPane();
		Table1 = new javax.swing.JTable();
		jScrollPane3 = new javax.swing.JScrollPane();
		Table2 = new javax.swing.JTable();
		jScrollPane4 = new javax.swing.JScrollPane();
		Table3 = new javax.swing.JTable();
		jScrollPane1 = new javax.swing.JScrollPane();
		Table4 = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Bit√°coras");
		setResizable(false);

		jDateChooser1.setFont(new java.awt.Font("Arial", 1, 12));

		jLabel1.setText("Buscar");

		jpanel1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

		Table1.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jScrollPane2.setViewportView(Table1);

		jpanel1.addTab("Bit·cora Usuarios", jScrollPane2);

		Table2.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jScrollPane3.setViewportView(Table2);

		jpanel1.addTab("Bit·cora Lockers", jScrollPane3);

		Table3.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jScrollPane4.setViewportView(Table3);

		jpanel1.addTab("Bit·cora Resgitros", jScrollPane4);

		Table4.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(Table4);

		jpanel1.addTab("Bit·cora Peticiones", jScrollPane1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(34, 34, 34).addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(11, 11, 11).addComponent(jDateChooser1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jpanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(224, 224, 224).addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(250, 250, 250).addComponent(jDateChooser1,
								javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(7, 7, 7).addComponent(jpanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}

	// vaariables de la interfaz
	private javax.swing.JTable Table1;
	private javax.swing.JTable Table2;
	private javax.swing.JTable Table3;
	private javax.swing.JTable Table4;
	private com.toedter.calendar.JDateChooser jDateChooser1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JTabbedPane jpanel1;

}
