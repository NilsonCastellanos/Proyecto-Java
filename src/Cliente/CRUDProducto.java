package Cliente;

import Empleado.*;
import Metodos_sql.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carolina
 */
public class CRUDProducto {

    private ConexionBD mysql = new ConexionBD();
    private Connection cn = mysql.conectar();

    private String sSQL = "";
    public Integer totalregistros;
    private Object tablalistadoconsumo;
    private Object tablalistadoproducto;

    //mostrar registros de la base de datos en este caso habitación
    public DefaultTableModel mostrar(String buscar) {

        DefaultTableModel modelo;

        String[] titulos = {"ID", "Producto", "Descripcion", "unidad_medida", "stock", "Precio_venta"};//almacenar el nombre de las columnas

        String[] registro = new String[6];//almacenar los registros de cada uno de esos titulos con 8 índices

        totalregistros = 0;//incializar en 0
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from producto where nombre like '%" + buscar + "%' order by idproducto";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);//ejecuta la consulta

            while (rs.next()) {
                registro[0] = rs.getString("idproducto");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("descripcion");
                registro[3] = rs.getString("unidad_medida");
                registro[4] = rs.getString("stock");
                registro[5] = rs.getString("precio_venta");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public DefaultTableModel mostrarvista(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Numero", "Piso", "Descripcion", "Caracteristicas", "Precio", "Estado", "Tipo habitación"};

        String[] registro = new String[8];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from habitacion where piso like '%" + buscar + "%' and estado='Disponible' order by idhabitacion";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idhabitacion");
                registro[1] = rs.getString("numero");
                registro[2] = rs.getString("piso");
                registro[3] = rs.getString("descripcion");
                registro[4] = rs.getString("caracteristicas");
                registro[5] = rs.getString("precio_diario");
                registro[6] = rs.getString("estado");
                registro[7] = rs.getString("tipo_habitacion");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public boolean insertar(DProducto dts) {

        sSQL = "insert into producto (nombre,descripcion,unidad_medida,stock,precio_venta )"
                + "values (?,?,?,?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getDescripcion());
            pst.setString(3, dts.getUnidad_medida());
            pst.setInt(4, dts.getStock());
            pst.setDouble(5, dts.getPrecio_venta());

            int n = pst.executeUpdate();

            if (n != 0) {//si se insertó registros es true caso contrario false
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editar(DProducto dts) {

        sSQL = "update producto set nombre=?,descripcion=?,unidad_medida=?,stock=?,precio_venta=?"
                + " where idproducto=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getDescripcion());
            pst.setString(3, dts.getUnidad_medida());
            pst.setInt(4, dts.getStock());
            pst.setDouble(5, dts.getPrecio_venta());

            pst.setDouble(6, dts.getIdproducto());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean desocupar(DHabitacion dts) {
        sSQL = "update habitacion set estado='Disponible'"
                + " where idhabitacion=?";
        //alt + 39

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdhabitacion());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean ocupar(DHabitacion dts) {
        sSQL = "update habitacion set estado='Ocupado'"
                + " where idhabitacion=?";
        //alt + 39

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdhabitacion());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(DProducto dts) {

        sSQL = "delete from producto where idproducto=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdproducto());
            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean actualizarStock(DProducto dts) {

        sSQL = "update producto set nombre=?,descripcion=?,unidad_medida=?,stock=?,precio_venta=?"
                + " where idproducto=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getDescripcion());
            pst.setString(3, dts.getUnidad_medida());
            pst.setInt(4, dts.getStock());
            pst.setDouble(5, dts.getPrecio_venta());

            pst.setDouble(6, dts.getIdproducto());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

}
