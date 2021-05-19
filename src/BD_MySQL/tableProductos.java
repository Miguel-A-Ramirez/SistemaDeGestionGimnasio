package BD_MySQL;

import gettersAndSettersTables.gysProducto;
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

//Clase que nos permite agregar, modificar, eliminar y consultar productos para su venta
public class tableProductos implements consultas {

    @Override
    public boolean agregar(Object obj) {
        ConexionBD c = new ConexionBD();
        Connection conn = c.connect();
        gysProducto prod = (gysProducto) obj;

        String query = "INSERT INTO producto(nombre, cantidad, precio, categoria) VALUES(\'" + prod.getNombre() + "\',\'" + prod.getCantidad() + "\',\'" + prod.getPrecio() + "\',\'" + prod.getCategoria() + "\');";

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
        gysProducto prod = (gysProducto) obj;

        String query = "DELETE FROM producto WHERE idproducto=" + prod.getIdproducto() + ";";

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
        gysProducto prod = (gysProducto) obj;

        String query = "UPDATE producto SET nombre=\'" + prod.getNombre() + "\',cantidad=\'" + prod.getCantidad() + "\',precio=\'" + prod.getPrecio() + "\' WHERE idproducto=" + prod.getIdproducto() + ";";

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

        for (Object prods : lista) {
            if (prods.toString().equals(obj.toString())) {
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
        List productos = new ArrayList<>();
        ConexionBD c = new ConexionBD();
        Connection conn = c.connect();

        try {
            Statement s = conn.createStatement();
            String query = "SELECT * FROM producto";
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                gysProducto prod = new gysProducto ((rs.getString("idproducto")), rs.getString("nombre"), Integer.parseInt(rs.getString("cantidad")), Double.parseDouble(rs.getString("precio")), Integer.parseInt(rs.getString("categoria")));
                productos.add(prod);
            }
            conn.close();
        } catch (SQLException | NumberFormatException ex) {
            System.out.println(ex);
        }
        return productos;
    
    }
    
}
