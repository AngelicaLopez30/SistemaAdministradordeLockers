/**
 * Clase que creado con el fin de obtener un formato en eascalas
 * de grises para las tabals del sistema y mejorar su bonita precentacion
 * Esto se logra gracias la implementaciond e TableCellRenderer para mejora 
 * el estilo de las tablas
 * 
 */
package Interface_Main_Lockers.Windows_Lockers_Manager.Code;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Lopez Santiago Angelica
 */
@SuppressWarnings("serial")
public class StyleTable_Lockers_Manager extends DefaultTableCellRenderer implements TableCellRenderer {

	/*
	 * Metodo abstaracto de las librerias de muestro podria jdk, con el fin de
	 * poder darle una buena presentacion a los datos de que se encuentren
	 * dentor de una tabla en el sistema
	 * 
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.swing.table.DefaultTableCellRenderer#getTableCellRendererComponent(
	 * javax.swing.JTable, java.lang.Object, boolean, boolean, int, int)
	 */
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {

		setBackground(null);
		super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		// line de evaluacion que evalua a las lineas de la tabla que son pares
		// para que sean de color diferente en el sistemas y buena presentecion
		boolean oddRow = (row % 2 == 0);

		// Asignacion del color del gris a las lineas pares de la tabla
		Color c = new Color(200, 200, 200);

		if (oddRow)
		{

			setBackground(c);

		}

		return this;

	}

}
