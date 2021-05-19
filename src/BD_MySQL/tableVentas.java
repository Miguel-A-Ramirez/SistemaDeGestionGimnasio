package BD_MySQL;

import gettersAndSettersTables.gysVenta;
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

//Clase que nos permite agregar, modificar, eliminar y consultar ventas
public class tableVentas implements consultas{

    @Override
    public boolean agregar(Object obj) {
        ConexionBD c = new ConexionBD();
        Connection conn = c.connect();
        gysVenta venta = (gysVenta) obj;

        String query = "INSERT INTO venta(fecha, idproducto) VALUES(\'" + venta.getFechaventa() + "\',\'" + venta.getProducto().getIdproducto() + "\');";

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        List productos = new ArrayList<>();
        ConexionBD c = new ConexionBD();
        Connection conn = c.connect();

        try {
            Statement s = conn.createStatement();
            String query = "SELECT * FROM venta";
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                gysVenta prod = new gysVenta(rs.getString("idventa"), LocalDate.parse(rs.getString("fecha")), rs.getString("idproducto"));
                productos.add(prod);
            }
            conn.close();
        } catch (SQLException | NumberFormatException ex) {
            System.out.println(ex);
        }
        return productos;
    }
    
}
