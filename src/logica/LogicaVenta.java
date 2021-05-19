package logica;

import BD_MySQL.tableVentas;
import gettersAndSettersTables.gysProducto;
import gettersAndSettersTables.gysVenta;
import java.util.List;

/**
 *
 * @author Miguel Angel Ramirez Rodriguez
 */

//Clase que implementa la logica relacionada con las ventas de productos
public class LogicaVenta {
    
    tableVentas dv = new tableVentas();    
    
    public boolean addVenta(gysVenta venta){
        return dv.agregar(venta);
    }
    
    public boolean delVenta(gysVenta venta){
        return dv.eliminar(venta);
    }
    
    public boolean updVenta(gysVenta venta){
        return dv.actualizar(venta);
    }
    
    public List desplegarVentas(){
        LogicaProducto np = new LogicaProducto();
        List ventas = dv.getAll();
        List productos = np.desplegarProductos();
        
        for (int i = 0; i < ventas.size(); i++) {
            gysVenta venta = (gysVenta) ventas.get(i);
            for (int j = 0; j < productos.size(); j++) {
                gysProducto prod = (gysProducto) productos.get(j);
                if (venta.getProducto().getIdproducto().equals(prod.getIdproducto())) {
                    venta.setProducto(prod);
                }
            }
        }
        
        return ventas;
    }
    
    
}
