package logica;

import BD_MySQL.tableClientes;
import gettersAndSettersTables.gysCliente;
import java.util.List;

/**
 *
 * @author Miguel Angel Ramirez Rodriguez
 */

//Clase que implementa la logica relacionada con los clientes
public class LogicaCliente {
    tableClientes ctes = new tableClientes();
    
    public boolean addCliente(gysCliente cte) {
        if(validarCliente(cte)){
            System.out.println("No se encontró el cliente en la BD... Agregando...");
            return ctes.agregar((gysCliente) cte);
        }
        System.out.println("Error! Saliendo..");
        return false;
    }
    
    public boolean delCliente(gysCliente cte) {
        return ctes.eliminar(cte);
    }
    
    public boolean updCliente(gysCliente cte) {
        System.out.println("NegocioCliente: Buscando ID " + cte.getId());
        if(validarCliente(Integer.toString(cte.getId()))){
            System.out.println("Se encontró el cliente! Llamando a actualizar()..");
            return ctes.actualizar(cte);
        }
        
        System.out.println("El cliente no existe... No hay nada que actualizar.");
        return false;
    }
    
    public gysCliente obtenerCliente(String id) {
        List clientes = desplegarClientes();
        if (validarCliente(id)) {
            for (Object obj : clientes) {
                gysCliente res = (gysCliente) obj;
                if (res.getId() == Integer.parseInt(id)) {
                    return res;
                }
            }
        } else {
            System.out.println("NegocioCliente: No se encontró ese cliente!");
        }
        return null;
    }
    
    public List desplegarClientes() {
        return ctes.getAll();
    }
    
    /*Este método valida que no exista un cliente en la BD que se da como parametro*/
    private boolean validarCliente(gysCliente cte) {
                
        if(ctes.buscar(cte)){
            System.out.println("El cliente ya está agregado en la BD");
            return false;
        } else if (ctes.buscarID(Integer.toString(cte.getId()))) {
            System.out.println("Ya hay un cliente en la BD con el mismo ID!");
            return false;
        } else if (ctes.buscarPorNombre(cte.getNombre())){ //Puede que se elimine esta parte más adelante...
            System.out.println("Ya hay un cliente en la BD con exactamente ese mismo nombre!");
            return false;
        }
        return true;
    }
    
     /*Este método busca un ID en la base de datos*/
    public boolean validarCliente(String id) {
        return ctes.buscarID(id);
    }
    
}
