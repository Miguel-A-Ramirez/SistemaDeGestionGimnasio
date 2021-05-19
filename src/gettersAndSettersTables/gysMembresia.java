package gettersAndSettersTables;

import java.time.LocalDate;

/**
 *
 * @author Miguel Angel Ramirez Rodriguez
 */

public class gysMembresia {

    int id;
    gysCliente cliente;
    LocalDate fechaIn, fechaFin;

    public int getId() {
        return id;
    }

    public gysMembresia() {

    }

    public gysMembresia(int id, gysCliente cliente, LocalDate fechaIn, LocalDate fechaFin) {
        this.id = id;
        this.cliente = cliente;
        this.fechaIn = fechaIn;
        this.fechaFin = fechaFin;
    }

    public gysMembresia(int id, String fechaIn, String fechaFin, int idcliente) {
        this.id = id;
        this.cliente = new gysCliente();
        this.cliente.setId(idcliente);
        if (fechaFin == null || fechaIn == null) {
            System.out.println("Fecha inválida para la membresia del cliente: " + id);
            this.fechaIn = LocalDate.parse("0000-01-01");
            this.fechaFin = LocalDate.parse("0000-01-01");
        } else {
            this.fechaIn = LocalDate.parse(fechaIn);
            this.fechaFin = LocalDate.parse(fechaFin);
        }

    }

    public gysMembresia(gysCliente cliente, LocalDate fechaIn, LocalDate fechaFin) {
        this.cliente = cliente;
        this.fechaIn = fechaIn;
        this.fechaFin = fechaFin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public gysCliente getCliente() {
        return cliente;
    }

    public void setCliente(gysCliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(LocalDate fechaIn) {
        this.fechaIn = fechaIn;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "ModeloMembresia{" + "id=" + id + ", cliente=" + cliente + ", fechaIn=" + fechaIn + ", fechaFin=" + fechaFin + '}';
    }

}
