package BD_MySQL;

import java.util.List;

/**
 *
 * @author Miguel Angel Ramirez Rodriguez
 */

//Metodo principal que recibe objetos para mandar a llamar a metodos dentro de el objeto
public interface consultas {
    public boolean agregar(Object obj);
    public boolean eliminar(Object obj);
    public boolean actualizar(Object obj);
    public boolean buscar(Object obj);
    public Object get(Object obj);
    public List getAll();
}
