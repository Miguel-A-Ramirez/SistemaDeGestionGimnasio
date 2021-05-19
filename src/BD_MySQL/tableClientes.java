package BD_MySQL;

import gettersAndSettersTables.gysCliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Miguel Angel Ramirez Rodriguez
 */

//Clase que nos permite agregar, modificar, bucar,eliminar y consultar a los clientes
public class tableClientes implements consultas {
 boolean testing = true;
    @Override
    public boolean agregar(Object obj) {
        ConexionBD c = new ConexionBD();
        Connection conn = c.connect();
        gysCliente cte = (gysCliente) obj;
        int id = cte.getId(), control=0;
        
        String query = "INSERT INTO cliente VALUES(\'" + id + "\',\'" + cte.getNombre() + "\',\'" + cte.getTelefono() + "\',\'"+ cte.getDireccion() +"\');";
        
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
        gysCliente mc = (gysCliente) obj;

        String query = "DELETE FROM cliente WHERE idcliente=" + mc.getId() + ";";

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
        gysCliente cte = (gysCliente) obj;
        int id = cte.getId();
        
        String query = "UPDATE cliente SET nombre=\'"+ cte.getNombre() + "\',telefono=\'"+ cte.getTelefono()+ "\',direccion=\'"+ cte.getDireccion() +"\' WHERE idcliente=" + id+";";
        
        try {
            Statement s = conn.createStatement();
            s.execute(query);
            conn.close();
            return true; //Redundante? execute devuelve boolean
            //Nope, hay que cerrar la conexion(?
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } 

    }

    @Override
    public boolean buscar(Object obj) {
        List lista = getAll();

        for (Object cli : lista) {
            if (cli.toString().equals(obj.toString())) {
                return true;
            }
        }
        return false;
    }

    public boolean buscarID(String id) {
        List lista = getAll();

        for (Object cli : lista) {
            gysCliente m = (gysCliente) cli;
            if (Integer.toString(m.getId()).equals(String.valueOf(id))) {
                return true;
            }
        }
        return false;
    }
    
    public boolean buscarPorNombre(String nombre) {
        List lista = getAll();

        for (Object cli : lista) {
            gysCliente m = (gysCliente) cli;
            if (m.getNombre().equals(nombre)) {
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
        List clientes = new ArrayList<>();
        ConexionBD c = new ConexionBD();
        Connection conn = c.connect();

        try {
            Statement s = conn.createStatement();
            String query = "SELECT * FROM cliente";
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                gysCliente cte = new gysCliente(Integer.parseInt(rs.getString("idcliente")),rs.getString("nombre"), rs.getString("telefono"), rs.getString("direccion"));
                clientes.add(cte);
            }
            conn.close();
        } catch (SQLException | NumberFormatException ex) {  //rs.getString("idproducto")
            System.out.println(ex);
        }

        return clientes;
    }

    /**
     * Con este método se van a generar los IDs unicos de los clientes. *
     */
    public int generateUniqueId() {
        UUID idOne = UUID.randomUUID();
        String str = "" + idOne;
        int uid = str.hashCode();
        String filterStr = "" + uid;
        str = filterStr.replaceAll("-", "").substring(3,9);
        return Integer.parseInt(str);
    }
    
    
}
