package BD_MySQL;

import gettersAndSettersTables.gysMembresia;
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

//Clase que nos permite agregar, modificar, eliminar y consultar membresias
public class tableMembresias implements consultas {

    @Override
    public boolean agregar(Object obj) {
        ConexionBD c = new ConexionBD();
        Connection conn = c.connect();
        gysMembresia mem = (gysMembresia) obj;

        System.out.println(mem.getCliente().getId());
        String query = "INSERT INTO membresia(fecha_inicial, fecha_fin, idcliente) VALUES(\'" + mem.getFechaIn().toString() + "\',\'" + mem.getFechaFin().toString() + "\',\'" + mem.getCliente().getId() + "\');";

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
        gysMembresia mm = (gysMembresia) obj;

        String query = "DELETE FROM membresia WHERE idcliente=" + mm.getCliente().getId() + ";";

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
        gysMembresia mm = (gysMembresia) obj;

        String query = "UPDATE membresia SET fecha_inicial=\'" + mm.getFechaIn().toString() + "\',fecha_fin=\'" + mm.getFechaFin().toString() + "\' WHERE idcliente=" + mm.getCliente().getId() + ";";

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

        for (Object mem : lista) {
            if (mem.toString().equals(obj.toString())) {
                return true;
            }
        }
        return false;
    }

    public boolean existeMembresiaIdCliente(int id) {
        List lista = getAll();

        for (Object lis : lista) {
            gysMembresia mem = (gysMembresia) lis;
            if (mem.getCliente().getId() == id) {
                return true;
            }
        }
        return false;
    }

    /*Este método devuelve una membresía en base a un id de un cliente*/
    @Override
    public Object get(Object obj) {

        int id = Integer.parseInt(obj.toString());
        if (existeMembresiaIdCliente(id)) {
            List lista = getAll();

            for (Object ob : lista) {
                gysMembresia mm = (gysMembresia) ob;
                if (mm.getCliente().getId() == id) {
                    System.out.println("Se encontró la membresía");
                    return mm;
                }
            }
        }
        System.out.println("No hay una membresía con ese idcliente");

        return null;
    }

    @Override
    public List getAll() {
        List membresias = new ArrayList<>();
        ConexionBD c = new ConexionBD();
        Connection conn = c.connect();

        try {
            Statement s = conn.createStatement();
            String query = "SELECT * FROM membresia";
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                gysMembresia cte = new gysMembresia(Integer.parseInt(rs.getString("idmembresia")), rs.getString("fecha_inicial"), rs.getString("fecha_fin"), Integer.parseInt(rs.getString("idcliente")));
                membresias.add(cte);
            }
            conn.close();
        } catch (SQLException | NumberFormatException ex) {
            System.out.println(ex);
        }
        return membresias;
    }
}
