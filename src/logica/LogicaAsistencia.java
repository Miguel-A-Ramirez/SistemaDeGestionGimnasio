package logica;

import BD_MySQL.tableAsistencias;
import gettersAndSettersTables.gysAsistencia;
import gettersAndSettersTables.gysCliente;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Miguel Angel Ramirez Rodriguez
 */

//Clase que implementa la logica relacionada con las asistencias
public class LogicaAsistencia {

    tableAsistencias asis = new tableAsistencias();
    
    LogicaCliente ctes = new LogicaCliente();

    public boolean addAsistencia(gysAsistencia asi) {
        LogicaMembresia mem = new LogicaMembresia();
        List asistencias = desplegarAsistencias();
        if (mem.existeMembresiaIdCliente(asi.getCliente().getId())) {
            if (mem.isMembresiaVigente(Integer.toString(asi.getCliente().getId()))) {
                for (int i = 0; i < asistencias.size(); i++) {
                    gysAsistencia m = (gysAsistencia) asistencias.get(i);
                    LocalDate ld = m.getFecha();
                    int id = m.getCliente().getId();
                    if (asi.getFecha().equals(ld) && asi.getCliente().getId() == id) {
                        System.out.println("NegocioAsistencia: Ya está registrada la asistencia el dia de hoy");
                        return false;
                    }
                }
                return asis.agregar(asi);
            } else {
                System.out.println("NegocioAsistencia: La membresia no está vigente");
            }
        } else {
            System.out.println("NegocioAsistencia: No existe una membresia con ese ID cliente");
        }

        return false;
    }

    public boolean delAsistencias(String id) {
        gysAsistencia as = obtenerAsistencia(id);
        if (as != null) {
            return asis.eliminar(as);
        }
        System.out.println("NegocioAsistencia: No hay niguna asistencia con ese cliente");
        return false;
    }

    public gysAsistencia obtenerAsistencia(String id){
        List as = desplegarAsistencias();
        for (int i = 0; i < as.size(); i++) {
            gysAsistencia mm = (gysAsistencia) as.get(i);
            if (Integer.toString(mm.getCliente().getId()).equals(id)){
                return mm;
            }
        }
        return null;
    }
    
    public List desplegarAsistencias() {
        List asistencias = asis.getAll();
        List clientes = ctes.desplegarClientes();
        for (int i = 0; i < asistencias.size(); i++) {
            gysAsistencia as = (gysAsistencia) asistencias.get(i);
            for (int j = 0; j < clientes.size(); j++) {
                gysCliente cte = (gysCliente) clientes.get(j);
                if (as.getCliente().getId() == cte.getId()) {
                    as.setCte(cte);
                }
            }
        }
        
        return asistencias;

    }
}
