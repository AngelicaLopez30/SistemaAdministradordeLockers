/**
 * Interfaz que simula la venta de carga de un sistema con el fin de dar una presentacion comfiable del mismo
 */
package Interface_Main_Lockers.Windows_Lockers_Manager;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Lopez Santiago Angelica
 */
@SuppressWarnings("serial")
public class Load_Window_Lockers_Manager extends javax.swing.JFrame implements Runnable {

	// variable que contiene los datos para la simulacion de la carga de los
	// datos de un sitemas ficticio
	private Thread loading;
	private static String a[] = { "Inicioando Librerias", "Cargando Imagen", "Localizando Perfil", "Verificado Memoria",
			"Estructurando Algoritmo", "Instalando Algoritmos ", "Creacion de Pantalla", "Manejo se Pizarra",
			"Verificando Hadwared", "Hadwared Verificados", "Lidrerias Actualizadas", "Imagen Previa",
			"Pefiles de Inicio Cargados", "Memoria Establecida", "Algoritmos Listos", "Pizarra Completa y Lista",
			"Iniciando Programa", "Ultima Verificacion", "Verificando", "Iniciado Ventana Principal",
			"Inicio Terminado", "Bienvenido" };
	private static String b[] = { "Cargando...", "Cargando..", "Cargando.", "Cargando..", "Cargando...", "Cargando..",
			"Cargando.", "Cargando..", "Cargando...", "Cargando..", "Cargando.", "Cargando..", "Cargando...",
			"Cargando..", "Cargando.", "Cargando..", "Cargando...", "Cargando..", "Cargando.", "Cargando..",
			"Cargando...", "Cargando.." };

	public Load_Window_Lockers_Manager() {

		// metodo que contiene la construccion de la clase
		initComponents();
		// linea de la asigacion de un icono del sistemas
		this.setIconImage(
				new ImageIcon(getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU.png"))
						.getImage());

	}

	/*
	 * Metodo que hace la ejecucion de la animacion por medio de un hilo en el
	 * cual se puede observa la carga del sistema la construccion de un barra de
	 * progreso y esta es pintada por cada uno de los tiempos que se ejecutan
	 * con el hilo
	 * 
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@SuppressWarnings("static-access")
	@Override
	public void run() {

		int num = 0, num1 = 0;

		// ciclo while que temina en la carga llena de la barra de porgreso
		while (num < 2000) {

			try {

				// lineas que pintan la barra de progreso y muestran a los
				// mensajes de cada uno delos arreglos de la clase
				this.setVisible(true);
				loadingBar.setValue(num);
				loadingBar.repaint();
				text2.setText(a[num1]);
				text1.setText(b[num1]);
				// tiempo estimado para cada opercion
				loading.sleep(300);

			} catch (InterruptedException ex) {

				Logger.getLogger(Load_Window_Lockers_Manager.class.getName()).log(Level.SEVERE,
						"Error de Ejeccion de la ventana de Carga");

			}

			// cotadores para la el aumento de la carga de la barra
			num += 95;
			num1++;

		}

		this.dispose();

		// intancia para la visibilidad de la interfaz principal
		new Beginning_Window_Lockers_Manager().setVisible(true);

	}

	private void initComponents() {

		// inicializacion de las variables de la interfaz
		loadingBar = new javax.swing.JProgressBar(0, 2000);
		jLabel2 = new javax.swing.JLabel();
		text2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		text1 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();

		// asigancio de propiedasdes al jFrame
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);
		setResizable(false);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		// asigancion de propiedades a los componentes extras de la interfaz
		loadingBar.setBackground(new java.awt.Color(0, 0, 0));
		loadingBar.setFont(new java.awt.Font("Tahoma", 0, 14));
		loadingBar.setForeground(new java.awt.Color(0, 0, 0));
		loadingBar.setToolTipText("");
		loadingBar.setStringPainted(true);
		getContentPane().add(loadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 510, 20));

		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel2.setForeground(new java.awt.Color(51, 51, 51));
		jLabel2.setText("Sistemas Administrador de Asignacion de Lockers");
		getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 350, -1));

		text2.setFont(new java.awt.Font("Tahoma", 1, 12));
		text2.setText("y");
		getContentPane().add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 280, -1));

		jLabel3.setFont(new java.awt.Font("Corbel", 1, 90));
		jLabel3.setForeground(new java.awt.Color(51, 51, 51));
		jLabel3.setText("SADAL");
		getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 380, 80));

		text1.setFont(new java.awt.Font("Tahoma", 1, 12));
		text1.setText("Cargando..");
		getContentPane().add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 80, -1));

		jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel4.setForeground(new java.awt.Color(51, 51, 51));
		jLabel4.setText("Proyecto SADAL 1.1 BETA TESCo");
		getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 240, -1));

		jLabel1.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/Interface_Main_Lockers/Image_Lockers_Manager/ANDRU - (1).png"))); // NOI18N
		getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, -1));

		pack();

		// posicion central de la interfaz
		setLocationRelativeTo(null);
	}

	// variables de la interfaz
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	public static javax.swing.JProgressBar loadingBar;
	private javax.swing.JLabel text1;
	private javax.swing.JLabel text2;

}
