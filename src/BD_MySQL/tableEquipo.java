package BD_MySQL;

import gettersAndSettersTables.gysEquipo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel Angel Ramirez Rodriguez
 */

//Clase que nos permite agregar, modificar, eliminar y consultar equipo de la BD
public class tableEquipo implements consultas{

    @Override
    public boolean agregar(Object obj) {
        ConexionBD c = new ConexionBD();
        Connection conn = c.connect();
        gysEquipo eq = (gysEquipo) obj;
        
        String query = "INSERT INTO equipo(nombre) VALUES(\'" + eq.getNombre() + "\');";

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
        gysEquipo eq = (gysEquipo) obj;

        String query = "DELETE FROM equipo WHERE idequipo=" + eq.getIdequipo()+";";

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
        ConexionBD c = new ConexionBD();
        Connection conn = c.connect();
        gysEquipo eq = (gysEquipo) obj;

        String query = "UPDATE equipo SET nombre=\'"+eq.getNombre()+"\' WHERE idequipo="+eq.getIdequipo()+";";

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
    public boolean buscar(Object obj) {
        List lista = getAll();

        for (Object eqs : lista) {
            if (eqs.toString().equals(obj.toString())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object get(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getAll() {
        List equipos = new ArrayList<>();
        ConexionBD c = new ConexionBD();
        Connection conn = c.connect();

        try {
            Statement s = conn.createStatement();
            String query = "SELECT * FROM equipo";
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                gysEquipo eq = new gysEquipo(rs.getString("idequipo"),rs.getString("nombre"));
                equipos.add(eq);
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return equipos;
    }
    
}
