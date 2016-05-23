/**
 *  Clase diseñada pora la creacion de una conexion con la base de datos MySQL 
 *  asi como la prension de los aprecion de SQL que se puden realizar a nivel de DML
 *  y sus funciones para la optencion de datos de la base de datos
 */
package Interface_Main_Lockers.Windows_Lockers_Manager.DataBase;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.Connection;

/**
 * @author Lopez Santiago Angelica
 */
public class Connection_DataBases {

	// Variables para el intanciamiento de la base de datos, y el objeto que la
	// crea
	private static Connection connection;
	private static Connection_DataBases INSTANCE = null;
	private String connectionURL;
	// Variables parala coneccion de las base deatos
	private String host = "localhost";
	private String user = "root";
	private String password = "ducati11000";
	private String database = "SOFTWARE_LOCKERS_MANAGER";

	/**
	 * Constructor de la clase
	 */
	private Connection_DataBases() {

		connectionDB();

	}

	/**
	 * metodo sincronizado con patron siglenton con el fin de no poder crear dos
	 * instancias del mismo objeto
	 */
	private synchronized static void createInstance() {

		if (INSTANCE == null) {

			INSTANCE = new Connection_DataBases();

		}

	}

	/**
	 * metodo de verificaion de la creacio de un objeto nuevo encaso de ser nulo
	 * 
	 * @return objeto de la clase Connection_DataBases para mantener estabre la
	 *         conexion en tiempod ejecucion
	 */
	public static Connection_DataBases getInstance() {

		if (INSTANCE == null) {

			createInstance();

		}

		return INSTANCE;

	}

	/**
	 * limpieza de las conexiones de base de datos MySQL y la anulacion de la
	 * creacion del objeto Connection_DataBases
	 */
	public static void clearInstance() {

		INSTANCE = null;
		closeConnection();

	}

	/**
	 * coneccion del a base de datos por medio del controlar de MySQL
	 */
	public void connectionDB() {

		try {

			// Decracion del a clase del controlador
			Class.forName("com.mysql.jdbc.Driver");
			// Direccion que permitira la conexion con la base de datos
			connectionURL = "jdbc:mysql://" + host + ":3306/" + database + "?user=" + user + "&password=" + password;
			connection = DriverManager.getConnection(connectionURL);
			System.out.println("Conexion abierta.");

		} catch (Exception e) {

			Logger.getLogger(Connection_DataBases.class.getName()).log(Level.SEVERE, "Error al abrir la conexión.");

		}

	}

	/**
	 * cerrar la coneccion del variable Connection la que permite la conexion
	 * del MySQL
	 */
	public static void closeConnection() {

		try {

			// variable de Conexion MySQL pero en modeo de cerrado
			connection.close();
			System.out.println("Conexion cerrada.");

		} catch (Exception e) {

			Logger.getLogger(Connection_DataBases.class.getName()).log(Level.SEVERE, "Error al cerrar la conexión.");

		}

	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Metodo de obtencion de los datos desde MySQL, de acceso al sistema a los
	 * usuario
	 * 
	 * @return valor ArratList el cual contendra los datos de los usuairo del
	 *         sistema para su entrada al mismo
	 * @throws SQLException
	 *             de la ejecucion de un comando de SQL de MySQL
	 */
	public ArrayList<String> listDataAcceso() throws SQLException {

		ArrayList<String> data = new ArrayList<String>();

		// comando para la ejecucion de uan sentencia SELECT de MySQL con las
		// cueles se ejecuta y
		// se obtiene los datos de dicha opercion
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery("SELECT * FROM tblAcceso");

		// ciclo infinito par ala recopilacin de los datos de la ejecucion de un
		// comando de MySQL
		while (result.next()) {

			// linea de ingresion de datos al arreglo del metodo
			data.add(result.getString("Usuario") + "-" + result.getString("Contraseña") + "-" + result.getInt(4));

		}

		System.out.println(data);
		
		result.close();
		statement.close();

		return data;

	}

	/**
	 * Metodo de obtencio de los datos de lso lockers con el fin d cargar todo
	 * en gener y para su posterior evaluacion
	 * 
	 * @param operation
	 *            variable que cacha la sentencia SQL para su ejecucion
	 * @return retor de un valor de tipo ArrayList el cual contiene los datos de
	 *         los lockers asigandos en el sistemas
	 * @throws SQLException
	 *             de la ejecucion de un comando de SQL de MySQL
	 */
	public ArrayList<String> dataLockers(String operation) throws SQLException {

		ArrayList<String> data = new ArrayList<String>();

		// comando para la ejecucion de uan sentencia SELECT de MySQL con las
		// cueles se ejecuta y
		// se obtiene los datos de dicha opercion
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(operation);

		// ciclo infinito par ala recopilacin de los datos de la ejecucion de un
		// comando de MySQL
		while (result.next()) {

			// linea donde se cagar los dato al ArrayList del metodo con algunos
			// caracteres
			// para su identificaion por bloques
			data.add(result.getString(1) + "-" + result.getString(2) + "%" + result.getString(3) + "&"
					+ result.getString(4) + "#" + result.getString(5));

		}

		result.close();
		statement.close();

		return data;

	}

	/**
	 * Metod para la optencion de una numero de tipo Strig elcual servira de
	 * apoyo para ingresar nuevos regristos en al base de datos
	 * 
	 * @param table
	 *            nombre de la tabla donde se realizara la opercion
	 * @param column
	 *            nombre de la columna de la tabla para realizar el conteo
	 * @return valos string el cual contine el numero maximo de un id una tabla
	 *         de la base de datos
	 * @throws SQLException
	 *             de la ejecucion de un comando de SQL de MySQL
	 */
	public String numberTable(String table, String column) throws SQLException {

		int number = 0;

		// comando para la ejecucion de uan sentencia SELECT de MySQL con las
		// cueles se ejecuta y
		// se obtiene los datos de dicha opercion
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery("SELECT max(" + column + ") FROM " + table);

		// ciclo infinito par ala recopilacin de los datos de la ejecucion de un
		// comando de MySQL
		while (result.next()) {

			number = result.getInt(1) + 1;

		}

		result.close();
		statement.close();

		return "" + number;

	}

	/**
	 * Metod la optencion exacta de registros que contiene una tabla de la base
	 * de datos de MySQL
	 * 
	 * @param operation
	 *            variable que cacha la sentencia SQL para su ejecucion
	 * @return valor intero que contiene el numero de registros que contiene uns
	 *         table de la base de datos
	 * @throws SQLException
	 *             de la ejecucion de un comando de SQL de MySQL
	 */
	public int dataSearch(String operation) throws SQLException {

		int number = 0;

		// comando para la ejecucion de uan sentencia SELECT de MySQL con las
		// cueles se ejecuta y
		// se obtiene los datos de dicha opercion
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(operation);

		// ciclo infinito par ala recopilacin de los datos de la ejecucion de un
		// comando de MySQL
		while (result.next()) {

			number = result.getInt(1);

		}

		result.close();
		statement.close();

		return number;

	}

	/**
	 * Metodo para insercion de dartos por medio de MySQL y su comando INSERT
	 * cuando la operacion es corecta se devuelve un valos TRUE
	 * 
	 * @param operation
	 *            variable que cacha la sentencia SQL para su ejecucion
	 * @return retornara un valor verdadero si se completa la opercicion de la
	 *         funcion
	 * @throws SQLException
	 *             de la ejecucion de un comando de SQL de MySQL
	 */
	public boolean insertData(String operation) throws SQLException {

		Statement statement = connection.createStatement();
		// linea de codigo que ejecuta las fucnioes de MySQL como UPDATE, DELETE
		// y INSERT
		int count = statement.executeUpdate(operation);

		// validacion de que se realizo al operacion correctamente
		if (count != 1) {

			return false;

		}

		statement.close();

		return true;

	}

}
