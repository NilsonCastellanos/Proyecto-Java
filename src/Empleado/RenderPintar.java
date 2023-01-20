package Empleado;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class RenderPintar extends JTable {

    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int rowIndex, int ColumnIndex) {
        Component componente = super.prepareRenderer(renderer, rowIndex, ColumnIndex);
        if (getValueAt(rowIndex, ColumnIndex).getClass().equals(Integer.class)) {
            int valor = Integer.parseInt(this.getValueAt(rowIndex, ColumnIndex).toString());
            if (valor <= 15) {
                componente.setBackground(Color.red);
                componente.setForeground(Color.white);
            }
        } else {
            componente.setBackground(Color.white);
            componente.setForeground(Color.black);
        }
        return componente;
    }

}
