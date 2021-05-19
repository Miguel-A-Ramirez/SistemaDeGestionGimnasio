package gettersAndSettersTables;

/**
 *
 * @author Miguel Angel Ramirez Rodriguez
 */

public class gysEquipo {
    String idequipo;
    String nombre;

    public gysEquipo() {
    }

    public gysEquipo(String idequipo, String nombre) {
        this.idequipo = idequipo;
        this.nombre = nombre;
    }

    public String getIdequipo() {
        return idequipo;
    }

    public void setIdequipo(String idequipo) {
        this.idequipo = idequipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
