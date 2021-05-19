package BD_MySQL;

import gettersAndSettersTables.gysAsistencia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel Angel Ramirez Rodriguez
 */

//Clase que nos permite agregar, modificar, eliminar y consultar asistencias
public class tableAsistencias implements consultas{

    @Override
    public boolean agregar(Object obj) {
        ConexionBD c = new ConexionBD();
        Connection conn = c.connect();
        gysAsistencia as = (gysAsistencia) obj;
        LocalDate hoy = LocalDate.now();

        System.out.println(as.getCliente().getId());
        String query = "INSERT IGNORE INTO asistencia(fecha, idcliente) VALUES(\'" + hoy.toString() + "\',\'"  + as.getCliente().getId() + "\');";

        try {
            Statement s = conn.createStatement();
            s.execute(query);
            conn.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean eliminar(Object obj) {
        ConexionBD c = new ConexionBD();
        Connection conn = c.connect();
        gysAsistencia mm = (gysAsistencia) obj;

        String query = "DELETE FROM asistencia WHERE idcliente=" + mm.getCliente().getId() + ";";

        try {
            Statement s = conn.createStatement();
            s.execute(query);
            conn.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean actualizar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean buscar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getAll() {
        List asists = new ArrayList<>();
        ConexionBD c = new ConexionBD();
        Connection conn = c.connect();

        try {
            Statement s = conn.createStatement();
            String query = "SELECT * FROM asistencia";
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                gysAsistencia as = new gysAsistencia(Integer.parseInt(rs.getString("idcliente")), rs.getString("fecha"));
                asists.add(as);
            }
            conn.close();
        } catch (SQLException | NumberFormatException ex) {
            System.out.println(ex);
        }

        return asists;
    }
    
}
