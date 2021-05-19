package logica;

import BD_MySQL.tableMembresias;
import gettersAndSettersTables.gysCliente;
import gettersAndSettersTables.gysMembresia;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Miguel Angel Ramirez Rodriguez
 */

//Clase que implementa la logica relacionada con las membresias
public class LogicaMembresia {
    
    tableMembresias membs = new tableMembresias();
    LogicaCliente ctes = new LogicaCliente();    
    
    public LogicaMembresia(){
        
    }
    
    public boolean addMembresia(gysMembresia mem) {
        return membs.agregar(mem);
    }

    //Hay que ver si se va ocupar en el futuro
    public boolean delMembresia(gysMembresia mem) {
        return membs.eliminar(mem) && ctes.delCliente(mem.getCliente());
    }
    
    public boolean delMembresia(String id) {
        LogicaAsistencia asis = new LogicaAsistencia();
        gysMembresia mem = obtenerMembresia(id);
        asis.delAsistencias(id);
        return membs.eliminar(mem) && ctes.delCliente(mem.getCliente());
    }
    
    public boolean updMembresia(gysMembresia mem) {
        return membs.actualizar(mem);
    }
    
    public boolean buscarMembresia(String id) {
        throw new UnsupportedOperationException("lol nope");
    }
    
    public gysMembresia obtenerMembresia(String id) {
        List mems = desplegarMembresias();
        for (int i = 0; i < mems.size(); i++) {
            gysMembresia mm = (gysMembresia) mems.get(i);
            if (Integer.toString(mm.getCliente().getId()).equals(id)){
                return mm;
            }
        }
        return null;
    }
    
    public List desplegarMembresias() {
        List membresias = membs.getAll();
        List clientes = ctes.desplegarClientes();
        for (int i = 0; i < membresias.size(); i++) {
            gysMembresia mem = (gysMembresia) membresias.get(i);
            for (int j = 0; j < clientes.size(); j++) {
                gysCliente cte = (gysCliente) clientes.get(j);
                if (mem.getCliente().getId() == cte.getId()) {
                    mem.setCliente(cte);
                }
            }
        }
        
        return membresias;
    }
    
    public boolean existeMembresiaIdCliente(int id) {
        return membs.existeMembresiaIdCliente(id);
    }
    
    public boolean isMembresiaVigente(String id) {
        LocalDate hoy = LocalDate.now();
        gysMembresia ms = (gysMembresia) membs.get(id);
        
        if (ms == null) {
            System.out.println("No existe una membresia con ese id");
            return false;
        } else if (ms.getFechaFin().isAfter(hoy)) {
            System.out.println("La membresia es vigente");
            return true;
        }
        
        System.out.println("La membresía no es vigente");
        return false;
    }
    
    public boolean renovarFechaVenc(gysMembresia mem, LocalDate fecha) {
        mem.setFechaFin(fecha);
        return updMembresia(mem);
    }
}
