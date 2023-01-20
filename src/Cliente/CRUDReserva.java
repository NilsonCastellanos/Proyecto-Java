package Cliente;


import Cliente.DReserva;
import Metodos_sql.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CRUDReserva {

    private ConexionBD mysql = new ConexionBD();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {

        DefaultTableModel modelo;

        String[] titulos = {"ID", "idhabitacion", "numero", "idcliente", "cliente", "idempleado", "empleado", "tipo_reserva", "fecha_reserva", "fecha_ingreso", "fecha_salida","costo", "estado"};

        String[] registro = new String[13];

        totalregistros = 0;

        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select r.idreserva,r.idhabitacion,h.numero,r.idcliente,"+
                "(select nombre from persona where idpersona=r.idcliente)as clienten,"+
                 "(select apellido from persona where idpersona=r.idcliente)as clienteap,"+
                "r.idempleado,(select nombre from persona where idpersona=r.idempleado)as empleadon,"+
                 "(select apellido from persona where idpersona=r.idempleado)as empleadoap,"+
                "r.tipo_reserva,r.fecha_reserva,r.fec"+
                "ha_ingreso,r.fecha_salida,"+
                "r.costo_alojamiento,r.estado from reserva r inner join habitacion h on r.idhabitacion=h.idhabitacion where r.fecha_reserva like '%" + buscar + "%' order by idreserva desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idreserva");
                registro[1] = rs.getString("idhabitacion");
                registro[2] = rs.getString("numero");
                registro[3] = rs.getString("idcliente");
                registro[4] = rs.getString("clienten") + " " + rs.getString("clienteap");
                registro[5] = rs.getString("idempleado");
                registro[6] = rs.getString("empleadon") + " " + rs.getString("empleadoap");
                registro[7] = rs.getString("tipo_reserva");
                registro[8] = rs.getString("fecha_reserva");
                registro[9] = rs.getString("fecha_ingreso");
                registro[10] = rs.getString("fecha_salida");
                registro[11] = rs.getString("costo_alojamiento");
                registro[12] = rs.getString("estado");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar(DReserva dts) {
        sSQL = "insert into reserva (idhabitacion,idcliente,idempleado,tipo_reserva,fecha_reserva,fecha_ingreso,fecha_salida,costo_alojamiento,estado)"
                + "values (?,?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdhabitacion());
            pst.setInt(2, dts.getIdcliente());
            pst.setInt(3, dts.getIdempleado());
            pst.setString(4, dts.getTipo_reserva());
            pst.setDate(5, dts.getFecha_reserva());
            pst.setDate(6, dts.getFecha_ingreso());
            pst.setDate(7, dts.getFecha_salida());
            pst.setDouble(8, dts.getCosto_alojamiento());
            pst.setString(9, dts.getEstado());

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

    public boolean editar(DReserva dts) {
        sSQL = "update reserva set idhabitacion=?,idcliente=?,idtempleado=?,tipo_reserva=?,fecha_reserva=?,fecha_ingreso=?,fecha_salida=?,costo_alojamiento=?,estado=?"
                + " where idreserva=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdhabitacion());
            pst.setInt(2, dts.getIdcliente());
            pst.setInt(3, dts.getIdempleado());
            pst.setString(4, dts.getTipo_reserva());
            pst.setDate(5, dts.getFecha_reserva());
            pst.setDate(6, dts.getFecha_ingreso());
            pst.setDate(7, dts.getFecha_salida());
            pst.setDouble(8, dts.getCosto_alojamiento());
            pst.setString(9, dts.getEstado());

            pst.setInt(10, dts.getIdreserva());

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

    public boolean pagar(DReserva dts) {
        
        sSQL = "update reserva set estado='Pagada'"
                + " where idreserva=?";
        //alt + 39

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdreserva());

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

    public boolean eliminar(DReserva dts) {
        sSQL = "delete from reserva where idreserva=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdreserva());

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