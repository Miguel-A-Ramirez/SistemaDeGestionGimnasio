package logica;

import BD_MySQL.tableProductos;
import gettersAndSettersTables.gysProducto;
import java.util.List;

/**
 *
 * @author Miguel Angel Ramirez Rodriguez
 */

//Clase que implementa la logica relacionada con los productos para venta
public class LogicaProducto {

    tableProductos dp = new tableProductos();

    public boolean addProducto(gysProducto prod) {
        if (productoExiste(prod.getNombre())) {
            System.out.println("Ya hay un producto con el mismo nombre!");
            return false;
        } else {
            return dp.agregar(prod);
        }
    }

    public boolean delProducto(gysProducto prod) {
        return dp.eliminar(prod);
    }

    public boolean updProducto(gysProducto prod) {
        return dp.actualizar(prod);
    }

    public boolean productoExiste(String nombre) {
        List productos = desplegarProductos();

        for (Object o : productos) {
            gysProducto mp = (gysProducto) o;
            if (mp.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public boolean inventariarProducto(gysProducto prod, int cantidad) {
        if (cantidad > 0) {
            prod.setCantidad(prod.getCantidad() + cantidad);
            return updProducto(prod);
        }
        System.out.println("Se ingresó una cantidad inválida!");
        return false;
    }

    public boolean desinventariarProducto(gysProducto prod, int cantidad) {
        if (cantidad > 0) {
            if (prod.getCantidad() < cantidad) {
                System.out.println("La cantidad a desinventariar excede el numero disponible del producto, poniendo 0...");
                prod.setCantidad(0);
                return updProducto(prod);
            } else {
                prod.setCantidad(prod.getCantidad() - cantidad);
                return updProducto(prod);
            }
        }
        System.out.println("Se ingresó una cantidad invalida!");
        return false;
    }

    public List desplegarProductos() {
        List productos = dp.getAll();
        //System.out.println(productos.subList(0, 5));
        return productos;
    }
}
