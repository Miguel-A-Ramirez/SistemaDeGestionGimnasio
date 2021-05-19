package logica;

import BD_MySQL.tableEquipo;
import gettersAndSettersTables.gysEquipo;
import java.util.List;

/**
 *
 * @author Miguel Angel Ramirez Rodriguez
 */

//Clase que retorna valores relacionado con la logica del equipo del gimnasio
public class LogicaEquipo {
    tableEquipo de = new tableEquipo();
    public boolean addEquipo(gysEquipo eq){
        return de.agregar(eq);
    }
    
    public boolean delEquipo(gysEquipo eq){
        return de.eliminar(eq);
    }
    
    public boolean updEquipo(gysEquipo eq){
        return de.actualizar(eq);
    }
    
    public boolean buscarEquipo(gysEquipo eq){
        return de.buscar(eq);
    }
    
    public List desplegarEquipos(){
        return de.getAll();
    }
}
