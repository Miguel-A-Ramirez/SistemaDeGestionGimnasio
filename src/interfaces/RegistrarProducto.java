package interfaces;

import gettersAndSettersTables.gysProducto;
import logica.LogicaProducto;
import java.awt.Color;
import java.util.UUID;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Miguel Angel Ramirez Rodriguez
 */

public class RegistrarProducto extends javax.swing.JFrame {

    LogicaProducto productos = new LogicaProducto();
    String accion = "reg";
    gysProducto prod;

    public RegistrarProducto() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/recursosGraficos/icon.png")).getImage());
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(213,159,15));
        this.setResizable(false);
        this.setTitle("Registrar Producto");
    }

    public RegistrarProducto(String accion, gysProducto prod) {
        this.prod = prod;
        this.accion = accion;
        initComponents();
        this.setTitle("Editar Producto");
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(213,159,15));
        this.setResizable(false);
        areaTxtNombre.setText(prod.getNombre());
        areaTxtPrecio.setText(prod.getPrecio() + "");
        areaTxtCantidad.setText(prod.getCantidad() + "");
        areaTxtCantidad.setEnabled(false);
        categorizarProducto(prod.getCategoria());
        System.out.println(prod.getCategoria());
        btnAgregar.setText("Actualizar");
        jLabel6.setText("Actualizar Producto");
    }

    private void registrarProducto() {
        if (accion == "reg") {
            if (validarEntrada()) {
                String nombre = areaTxtNombre.getText();
                String precio = areaTxtPrecio.getText();
                String cantidad = areaTxtCantidad.getText();
                int categoria = obtenerCategoria();
                try{
                    double test = Double.parseDouble(precio);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(new JPanel(), "Cantidad Inválida", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                gysProducto prod = new gysProducto(nombre, Integer.parseInt(cantidad), Double.parseDouble(precio), categoria);
                if (productos.addProducto(prod)) {
                    JOptionPane.showMessageDialog(new JPanel(), "Se registró el producto correctamente");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(new JPanel(), "Ocurrió un error interno, verifica la consola para mas detalles", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        } else if (accion == "ed") {
            if (validarEntrada()) {
                prod.setNombre(areaTxtNombre.getText());
                try{
                    double test = Double.parseDouble(areaTxtPrecio.getText());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(new JPanel(), "Cantidad Inválida", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                prod.setPrecio(Double.parseDouble(areaTxtPrecio.getText()));
                prod.setCategoria(obtenerCategoria());                
                //ModeloProducto prod = new gysProducto(nombre, Integer.parseInt(cantidad), Double.parseDouble(precio), categoria);
                if (productos.updProducto(prod)) {
                    JOptionPane.showMessageDialog(new JPanel(), "Se actualizó el producto correctamente");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(new JPanel(), "Ocurrió un error interno, verifica la consola para mas detalles", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        }

    }

    private void categorizarProducto(int cat) {
        switch (cat) {
            case 1:
                scrollCategorias.setSelectedIndex(0);
                break;
            case 2:
                scrollCategorias.setSelectedIndex(1);
                break;
            case 3:
                scrollCategorias.setSelectedIndex(2);
                break;
            case 4:
                scrollCategorias.setSelectedIndex(3);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    private int obtenerCategoria() {
        String categoria = scrollCategorias.getSelectedItem().toString();
        switch (categoria) {
            case "Articulos para Ejercicio":
                return 1;
            case "Proteina":
                return 2;
            case "Aminoácidos":
                return 3;
            case "Termogenico":
                return 4;
        }

        return -1;
    }

    private boolean validarEntrada() {
        String nombre = areaTxtNombre.getText();
        String precio = areaTxtPrecio.getText();
        String cantidad = areaTxtCantidad.getText();
        if (!nombre.matches("[ 0-9A-Za-zñÑáéíóúÁÉÍÓÚ]{1,45}")) {
            JOptionPane.showMessageDialog(new JPanel(), "El nombre no es válido\n No debe contener símbolos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (nombre.length() > 45) {
            JOptionPane.showMessageDialog(new JPanel(), "El nombre no es válido\n Excede 45 caracteres", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!cantidad.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(new JPanel(), "Cantidad inválida", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!precio.matches("[0-9]+(.[0-9]+)?")) {
            JOptionPane.showMessageDialog(new JPanel(), "Precio inválido", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JLabel();
        areaTxtNombre = new javax.swing.JTextField();
        areaTxtPrecio = new javax.swing.JTextField();
        scrollCategorias = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JLabel();
        areaTxtCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 61, 121));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosGraficos/gymPumaAragon.jpg"))); // NOI18N

        txtNombre.setForeground(new java.awt.Color(0, 61, 121));
        txtNombre.setText("Nombre:");

        txtPrecio.setForeground(new java.awt.Color(0, 61, 121));
        txtPrecio.setText("Precio:");

        txtCategoria.setForeground(new java.awt.Color(0, 61, 121));
        txtCategoria.setText("Categoria:");

        areaTxtNombre.setBackground(new java.awt.Color(0, 61, 121));
        areaTxtNombre.setForeground(new java.awt.Color(212, 175, 55));

        areaTxtPrecio.setBackground(new java.awt.Color(0, 61, 121));
        areaTxtPrecio.setForeground(new java.awt.Color(212, 175, 55));

        scrollCategorias.setBackground(new java.awt.Color(0, 61, 121));
        scrollCategorias.setForeground(new java.awt.Color(212, 175, 55));
        scrollCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Articulos para Ejercicio", "Proteina", "Aminoácidos", "Termogenico" }));
        scrollCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrollCategoriasActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 61, 121));
        jLabel6.setText("Registrar Producto");

        txtCantidad.setForeground(new java.awt.Color(0, 61, 121));
        txtCantidad.setText("Cantidad:");

        areaTxtCantidad.setBackground(new java.awt.Color(0, 61, 121));
        areaTxtCantidad.setForeground(new java.awt.Color(212, 175, 55));

        btnAgregar.setBackground(new java.awt.Color(212, 175, 55));
        btnAgregar.setForeground(new java.awt.Color(0, 61, 121));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(212, 175, 55));
        btnSalir.setForeground(new java.awt.Color(0, 61, 121));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecio)
                    .addComponent(txtCategoria)
                    .addComponent(txtCantidad)
                    .addComponent(txtNombre))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir))
                    .addComponent(areaTxtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollCategorias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(areaTxtCantidad)
                    .addComponent(areaTxtPrecio))
                .addGap(63, 63, 63))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre)
                            .addComponent(areaTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio)
                            .addComponent(areaTxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(areaTxtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCategoria)
                            .addComponent(scrollCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(78, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnSalir))
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scrollCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrollCategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scrollCategoriasActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        registrarProducto();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public String generateUniqueId() {
        UUID idOne = UUID.randomUUID();
        String str = "" + idOne;
        int uid = str.hashCode();
        String filterStr = "" + uid;
        System.out.println(filterStr);
        str = filterStr.replaceAll("-", "").substring(3, 9);
        return str;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaTxtCantidad;
    private javax.swing.JTextField areaTxtNombre;
    private javax.swing.JTextField areaTxtPrecio;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> scrollCategorias;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtCategoria;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtPrecio;
    // End of variables declaration//GEN-END:variables
}
