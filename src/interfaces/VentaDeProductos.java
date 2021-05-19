//Paquete principal
package interfaces;

//Importacion de librerias
import gettersAndSettersTables.gysProducto;
import gettersAndSettersTables.gysVenta;
import logica.LogicaProducto;
import logica.LogicaVenta;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Miguel Angel Ramirez Rodriguez
 */

public class VentaDeProductos extends javax.swing.JFrame {

    private String accion = "Venta Productos";
    private LogicaVenta nv = new LogicaVenta();
    private LogicaProducto np = new LogicaProducto();
    public boolean noserequiere = false;

    public VentaDeProductos(String accion) {
        this.accion = accion;
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/recursosGraficos/icon.png")).getImage());
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(213,159,15));
        if (accion == "Venta Productos") {
            this.setTitle("Venta de Productos");
            LabelTitulo.setText("Venta de productos");
            txtProductos.setText("Producto a Vender");
            txtIngresar.setText("Precio :");
            botonVender.setText("Vender");
            areaTxt.setEditable(false);
            crearEventoCombo();
            if (!noserequiere) {
                llenarComboVenta();
            }
        } else if (accion == "Actualizar cantidad de productos") {
            this.setTitle("Actualizar cantidad de productos");
            //this.setSize(507, 190);
            LabelTitulo.setText("Actualizar cantidad de producto");
            txtProductos.setText("Seleccione el producto a actualizar");
            txtIngresar.setText("Ingrese la cantidad de producto en almacen");
            areaTxt.setText("");
            botonVender.setText("Actualizar");
            llenarComboInv();
        }

    }

    private void crearEventoCombo() {
        scrollProductos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ponerPrecio();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTitulo = new javax.swing.JLabel();
        txtProductos = new javax.swing.JLabel();
        scrollProductos = new javax.swing.JComboBox<>();
        txtIngresar = new javax.swing.JLabel();
        areaTxt = new javax.swing.JTextField();
        botonVender = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(373, 218));

        LabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(0, 61, 121));
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosGraficos/gymPumaAragon.jpg"))); // NOI18N

        txtProductos.setForeground(new java.awt.Color(0, 61, 121));

        scrollProductos.setBackground(new java.awt.Color(0, 61, 121));
        scrollProductos.setForeground(new java.awt.Color(213, 159, 15));
        scrollProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtIngresar.setForeground(new java.awt.Color(0, 61, 121));

        areaTxt.setBackground(new java.awt.Color(0, 61, 121));
        areaTxt.setForeground(new java.awt.Color(213, 159, 15));

        botonVender.setBackground(new java.awt.Color(213, 159, 15));
        botonVender.setForeground(new java.awt.Color(0, 61, 121));
        botonVender.setText("Vender");
        botonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVenderActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(213, 159, 15));
        btnCancelar.setForeground(new java.awt.Color(0, 61, 121));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(botonVender)
                                .addGap(38, 38, 38)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(scrollProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(areaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVender)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVenderActionPerformed
        if (accion.equals("Venta Productos")) {
            gysVenta venta = obtenerVentaDelCombobox();
            if (realizarVenta(venta)) {
                this.dispose();
            }

        } else {
            if (validarCantidad()) {
                gysVenta venta = obtenerVentaDelCombobox();
                int cantidad = Integer.parseInt(areaTxt.getText());
                if (np.inventariarProducto(venta.getProducto(), cantidad)) {
                    JOptionPane.showMessageDialog(null, "Inventariado completado!");
                } else {
                    JOptionPane.showMessageDialog(new JPanel(), "No se pudo registrar el inventario: Revise la consola", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(new JPanel(), "La cantidad ingresada no es válida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_botonVenderActionPerformed

    private boolean validarCantidad() {
        return areaTxt.getText().matches("[0-9]+") && Integer.parseInt(areaTxt.getText()) > 0;
    }

    private gysVenta obtenerVentaDelCombobox() {
        List productos = np.desplegarProductos();
        gysVenta venta;
        String nombre = scrollProductos.getItemAt(scrollProductos.getSelectedIndex());
        for (int i = 0; i < productos.size(); i++) {
            gysProducto prod = (gysProducto) productos.get(i);
            if (prod.getNombre().equals(nombre)) {
                venta = new gysVenta();
                venta.setProducto(prod);
                venta.setFechaventa(LocalDate.now());

                return venta;
            }
        }
        return null;
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private boolean realizarVenta(gysVenta venta) {
        boolean inv = np.desinventariarProducto(venta.getProducto(), 1);
        boolean regventa = nv.addVenta(venta);
        if (regventa && inv) {
            JOptionPane.showMessageDialog(null, "Se registró la venta \n El precio es de: " + venta.getProducto().getPrecio());
            return true;
        } else {
            JOptionPane.showMessageDialog(new JPanel(), "No se pudo registrar la venta: Revise la consola", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public boolean llenarComboVenta() {
        List productos = np.desplegarProductos();
        if (!productos.isEmpty()) {
            DefaultComboBoxModel dml = new DefaultComboBoxModel();
            boolean hayInventario = false;
            for (int i = 0; i < productos.size(); i++) {
                gysProducto prod = (gysProducto) productos.get(i);
                if (prod.getCantidad() != 0) {
                    dml.addElement(prod.getNombre());
                    hayInventario = true;
                }
            }

            if (hayInventario) {
                scrollProductos.setModel(dml);
                ponerPrecio();
            } else {                
                return false;
            }

        } else {
            return false;
        }
        return true;
    }

    private void llenarComboInv() {
        List productos = np.desplegarProductos();
        DefaultComboBoxModel dml = new DefaultComboBoxModel();
        for (int i = 0; i < productos.size(); i++) {
            gysProducto prod = (gysProducto) productos.get(i);
            dml.addElement(prod.getNombre());
        }
        scrollProductos.setModel(dml);
    }

    private void ponerPrecio() {
        String nombre = scrollProductos.getItemAt(scrollProductos.getSelectedIndex());
        List productos = np.desplegarProductos();

        for (int i = 0; i < productos.size(); i++) {
            gysProducto prod = (gysProducto) productos.get(i);
            if (prod.getNombre().equals(nombre)) {
                areaTxt.setText("" + prod.getPrecio());
                break;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JTextField areaTxt;
    private javax.swing.JButton botonVender;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> scrollProductos;
    private javax.swing.JLabel txtIngresar;
    private javax.swing.JLabel txtProductos;
    // End of variables declaration//GEN-END:variables
}
