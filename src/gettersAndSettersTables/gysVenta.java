package gettersAndSettersTables;

import java.time.LocalDate;

/**
 *
 * @author Miguel Angel Ramirez Rodriguez
 */

public class gysVenta {
    String idventa;
    gysProducto producto;
    LocalDate fechaventa;

    public gysVenta() {
    }

    public gysVenta(String idventa, gysProducto producto, LocalDate fechaventa) {
        this.idventa = idventa;
        this.producto = producto;
        this.fechaventa = fechaventa;
    }

    public gysVenta(String idventa, LocalDate fechaventa, String idproducto) {
        this.idventa = idventa;
        producto = new gysProducto();
        producto.setIdproducto(idproducto);
        this.fechaventa = fechaventa;
    }

    public String getIdventa() {
        return idventa;
    }

    public void setIdventa(String idventa) {
        this.idventa = idventa;
    }

    public gysProducto getProducto() {
        return producto;
    }

    public void setProducto(gysProducto producto) {
        this.producto = producto;
    }

    public LocalDate getFechaventa() {
        return fechaventa;
    }

    public void setFechaventa(LocalDate fechaventa) {
        this.fechaventa = fechaventa;
    }
    
    
}
