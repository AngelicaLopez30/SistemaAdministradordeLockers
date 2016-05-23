package Inteface_User_Lockers.Windows_Lockers_Manager;

import java.util.logging.Logger;
import javax.swing.ImageIcon;
import Archive_File.Option_File;
import Interface_Main_Lockers.Windows_Lockers_Manager.DataBase.Connection_DataBases;
import Source_File.Operation_File;
import Source_File.Save_File;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author FL-AndruAnnohomy
 */
@SuppressWarnings("serial")
public class Login_Window_Lockers_Manager extends javax.swing.JFrame {

	private final Option_File object1;
	private final Connection_DataBases connectionBD;
	private boolean error;

	/**
	 * 
	 */
	public Login_Window_Lockers_Manager() {

		this.object1 = new Option_File();
		this.object1.setPath("default", "sql");
		this.error = true;

		this.connectionBD = Connection_DataBases.getInstance();
		initComponents();

		this.jButton1.setActionCommand("1");
		this.jButton2.setActionCommand("2");
		this.jButton3.setActionCommand("3");
		this.jButton4.setActionCommand("4");
		this.jButton5.setActionCommand("5");
		this.jButton6.setActionCommand("6");
		this.jButton7.setActionCommand("7");
		this.jButton8.setActionCommand("8");
		this.jButton9.setActionCommand("9");
		this.jButton11.setActionCommand("#");
		this.jButton10.setActionCommand("0");
		this.jButton12.setActionCommand("*");

		// aisgancio de un logotipo para la clase
		this.setIconImage(
				new ImageIcon(getClass().getResource("/Inteface_User_Lockers/Image_Lockers_Manager/ANDRU.png"))
						.getImage());

	}

	/**
	 * 
	 */
	private void initComponents() {

		cancel = new javax.swing.JButton();
		accept = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		user = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jButton11 = new javax.swing.JButton();
		jButton12 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		cancel.setFont(new java.awt.Font("Arial", 1, 12));
		cancel.setText("Cerrar");
		cancel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cancelActionPerformed(evt);
			}
		});

		accept.setFont(new java.awt.Font("Arial", 1, 12));
		accept.setText("Abrir");
		accept.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				acceptActionPerformed(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Corbel", 1, 48));
		jLabel3.setForeground(new java.awt.Color(51, 51, 51));
		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel3.setText("SADAL");

		user.setFont(new java.awt.Font("Arial", 1, 36));
		user.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				Error(evt);
				letterLarge(evt);
				noLetter(evt);
			}
		});

		jButton1.setFont(new java.awt.Font("Arial", 1, 12));
		jButton1.setText("1");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				numeros(evt);
			}
		});

		jButton2.setFont(new java.awt.Font("Arial", 1, 12));
		jButton2.setText("2");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				numeros(evt);
			}
		});

		jButton3.setFont(new java.awt.Font("Arial", 1, 12));
		jButton3.setText("3");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				numeros(evt);
			}
		});

		jButton4.setFont(new java.awt.Font("Arial", 1, 12));
		jButton4.setText("4");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				numeros(evt);
			}
		});

		jButton5.setFont(new java.awt.Font("Arial", 1, 12));
		jButton5.setText("5");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				numeros(evt);
			}
		});

		jButton6.setFont(new java.awt.Font("Arial", 1, 12));
		jButton6.setText("6");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				numeros(evt);
			}
		});

		jButton7.setFont(new java.awt.Font("Arial", 1, 12));
		jButton7.setText("8");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				numeros(evt);
			}
		});

		jButton8.setFont(new java.awt.Font("Arial", 1, 12));
		jButton8.setText("7");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				numeros(evt);
			}
		});

		jButton9.setFont(new java.awt.Font("Arial", 1, 12));
		jButton9.setText("9");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				numeros(evt);
			}
		});

		jButton10.setFont(new java.awt.Font("Arial", 1, 12));
		jButton10.setText("0");
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				numeros(evt);
			}
		});

		jButton11.setFont(new java.awt.Font("Arial", 1, 12));
		jButton11.setText("#");
		jButton11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				numeros(evt);
			}
		});

		jButton12.setFont(new java.awt.Font("Arial", 1, 12));
		jButton12.setText("*");
		jButton12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				numeros(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
												javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup()
								.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup()
								.addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addComponent(user, javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 84,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(accept, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton1).addComponent(jButton2).addComponent(jButton3))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton4).addComponent(jButton5).addComponent(jButton6))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton8).addComponent(jButton7).addComponent(jButton9))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton12).addComponent(jButton10).addComponent(jButton11))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(cancel).addComponent(accept))
						.addContainerGap()));

		pack();
		setLocationRelativeTo(null);
	}

	/**
	 * @param evt
	 */
	private void cancelActionPerformed(java.awt.event.ActionEvent evt) {

		@SuppressWarnings("unused")
		Operation_File operation = new Save_File(
				object1.getPath("default", "sql").replace("default", "Bitacoras\\bitacoraUser"),
				"El usuario: " + user.getText() + " cerro su locker a las " + new Date(), true);

		JOptionPane.showMessageDialog(null, "El usuario ha salido del lockers.", "SADAL", JOptionPane.PLAIN_MESSAGE);
		System.exit(0);

	}

	/**
	 * @param evt
	 */
	private void acceptActionPerformed(java.awt.event.ActionEvent evt) {

		int numberUser = 0;

		try {
			numberUser = connectionBD.dataSearch(
					"SELECT `tblacceso`.`idAcceso` FROM `tblacceso`, `tblusuario`, `tblasignacion`, `tbllocker`, `tbldescripcion`, `tbledificio` WHERE `tblacceso`.`idAcceso` = `tblusuario`.`idAcceso` AND `tblusuario`.`idUsuario` = `tblasignacion`.`idUsuario` AND       `tblasignacion`.`idLocker` = `tbllocker`.`idLocker` AND `tbllocker`.`idDescripcion` = `tbldescripcion`.`idDescripcion` AND `tbllocker`.`idEdificio` = `tbledificio`.`idEdificio` AND `tblacceso`.`Usuario` = '"
							+ user.getText() + "';");

			if (numberUser > 0) {

				JOptionPane.showMessageDialog(null, "El usuario ha entrado al lockers.", "SADAL",
						JOptionPane.PLAIN_MESSAGE);

			} else {

				JOptionPane.showMessageDialog(null, "El usuario no existe en el sistema.", "Error",
						JOptionPane.ERROR_MESSAGE);

			}

		} catch (SQLException e) {

			Logger.getLogger(Login_Window_Lockers_Manager.class.getName()).log(Level.SEVERE,
					"Error con la base de datos.");

		}

	}

	/**
	 * @param evt
	 */
	private void Error(java.awt.event.KeyEvent evt) {

		if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {

			error = false;

		} else {

			error = true;

		}
	}

	/**
	 * @param evt
	 */
	private void letterLarge(java.awt.event.KeyEvent evt) {

		char c = evt.getKeyChar();
		int k = (int) evt.getKeyChar();

		if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {

			if (error) {

				evt.setKeyChar(Character.toUpperCase(c));

			}

		}
	}

	/**
	 * @param evt
	 */
	private void noLetter(java.awt.event.KeyEvent evt) {

		char y = evt.getKeyChar();

		if (Character.isLetter(y)) {

			getToolkit().beep();
			evt.consume();

		}
	}

	/**
	 * @param evt
	 */
	private void numeros(java.awt.event.ActionEvent evt) {

		switch (evt.getActionCommand()) {

		case "1":
			user.setText(user.getText() + "1");
			break;

		case "2":
			user.setText(user.getText() + "2");
			break;

		case "3":
			user.setText(user.getText() + "3");
			break;

		case "4":
			user.setText(user.getText() + "4");
			break;

		case "5":
			user.setText(user.getText() + "5");
			break;

		case "6":
			user.setText(user.getText() + "6");
			break;

		case "7":
			user.setText(user.getText() + "7");
			break;

		case "8":
			user.setText(user.getText() + "8");
			break;

		case "9":
			user.setText(user.getText() + "9");
			break;

		case "0":
			user.setText(user.getText() + "0");
			break;

		case "*":
			user.setText(user.getText() + "*");
			break;

		case "#":
			user.setText(user.getText() + "#");
			break;

		}

	}

	/**
	 * @param arg
	 */
	public static void main(String arg[]) {

		try {

			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

			new Login_Window_Lockers_Manager().setVisible(true);

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {

			Logger.getLogger(Login_Window_Lockers_Manager.class.getName()).log(Level.SEVERE, "Error de Ejecucion");

		}

	}

	private javax.swing.JButton accept;
	private javax.swing.JButton cancel;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JTextField user;

}
