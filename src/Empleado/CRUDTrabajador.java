
package Empleado;

import Metodos_sql.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 *
 */
public class CRUDTrabajador {


    private ConexionBD mysql = new ConexionBD();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Nombre", "Apellido", "tipo", "Número Documento", "Dirección", "Teléfono", "Email", "Cargo","Sueldo"};

        String[] registro = new String[10];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.idpersona,p.nombre,p.apellido,p.tipo_documento,p.numero_documento,"
                + "p.direccion,p.telefono,p.email,e.cargo,e.sueldo from persona p inner join empleado e "
                + "on p.idpersona=e.idpersona where numero_documento like '%"
                + buscar + "%' order by idpersona desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idpersona");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("apellido");
                registro[3] = rs.getString("tipo_documento");
                registro[4] = rs.getString("numero_documento");
                registro[5] = rs.getString("direccion");
                registro[6] = rs.getString("telefono");
                registro[7] = rs.getString("email");
                registro[8] = rs.getString("cargo");
                registro[9] = rs.getString("sueldo");
                
                
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar(DTrabajador dts) {
        sSQL = "insert into persona (nombre,apellido,tipo_documento,numero_documento,direccion,telefono,email)"
                + "values (?,?,?,?,?,?,?)";
        sSQL2 = "insert into empleado (idpersona,cargo,sueldo)"
                + "values ((select idpersona from persona order by idpersona desc limit 1),?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getApellido());
       
            pst.setString(3, dts.getTipo_documento());
            pst.setString(4, dts.getNum_documento());
            pst.setString(5, dts.getDireccion());
            pst.setString(6, dts.getTelefono());
            pst.setString(7, dts.getEmail());

            
             pst2.setString(1, dts.getCargo());
            pst2.setDouble(2, dts.getSueldo());
           
            
            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editar(DTrabajador dts) {
        sSQL = "update persona set nombre=?,apellido=?,tipo_documento=?,numero_documento=?,"
                + " direccion=?,telefono=?,email=? where idpersona=?";
        
        sSQL2 = "update empleado set cargo=?,sueldo=?"
                + " where idpersona=?";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getApellido());
            pst.setString(3, dts.getTipo_documento());
            pst.setString(4, dts.getNum_documento());
            pst.setString(5, dts.getDireccion());
            pst.setString(6, dts.getTelefono());
            pst.setString(7, dts.getEmail());
            pst.setInt(8, dts.getIdpersona());

            
            pst2.setString(1, dts.getCargo());
            pst2.setDouble(2, dts.getSueldo());
           
            
            pst2.setInt(3, dts.getIdpersona());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(DTrabajador dts) {
        sSQL = "delete from empleado where idpersona=?";
        sSQL2 = "delete from persona where idpersona=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            
            pst.setInt(1, dts.getIdpersona());

            
            pst2.setInt(1, dts.getIdpersona());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    
    public DefaultTableModel login(String login,String password) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Nombre", "Apellido","Acceso","Login","Password","Estado"};

        String[] registro = new String[7];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.idpersona,p.nombre,p.apellido,"
                + "e.acceso,e.login,e.password,e.estado from persona p inner join empleado e "
                + "on p.idpersona=e.idpersona where e.login='"
                + login + "' and e.password='" + password + "' and e.estado='A'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idpersona");
                registro[1] = rs.getString("nombre"); 
                registro[2] = rs.getString("apellido");
                registro[3] = rs.getString("acceso");
                registro[4] = rs.getString("login");
                registro[5] = rs.getString("password");
                registro[6] = rs.getString("estado");
                
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }
}
    

