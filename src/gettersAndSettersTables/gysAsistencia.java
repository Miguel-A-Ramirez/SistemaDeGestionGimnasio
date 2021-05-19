package gettersAndSettersTables;

import java.time.LocalDate;

/**
 *
 * @author Miguel Angel Ramirez Rodriguez
 */

public class gysAsistencia {
    gysCliente cte;
    LocalDate fecha;

    public gysAsistencia(int id, LocalDate fecha){
        cte = new gysCliente();
        cte.setId(id);       
        this.fecha = fecha;
    }
    
    public gysAsistencia(int id, String fecha){
        cte = new gysCliente();
        cte.setId(id);       
        this.fecha = LocalDate.parse(fecha);
    }
    
    public gysCliente getCliente() {
        return cte;
    }

    public void setCte(gysCliente cte) {
        this.cte = cte;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "ModeloAsistencia{" + "cte=" + cte + ", fecha=" + fecha + '}';
    }
    
    
}
