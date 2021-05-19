package interfaces;

import gettersAndSettersTables.gysCliente;
import gettersAndSettersTables.gysMembresia;
import logica.LogicaCliente;
import logica.LogicaMembresia;
import java.awt.Color;
import java.time.LocalDate;
import java.util.UUID;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Miguel Angel Ramirez Rodriguez
 */

public class ModificarCliente extends javax.swing.JFrame {

    String accion = "modificar";
    double precio = 0;
    LogicaCliente clientes = new LogicaCliente();
    LogicaMembresia membresias = new LogicaMembresia();
    MainPrincipal main;

    public ModificarCliente(String accion, MainPrincipal main) {
        this.main = main;
        this.accion = accion;
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/recursosGraficos/icon.png")).getImage());
        this.getContentPane().setBackground(new Color(213,159,15));
        this.setLocationRelativeTo(null);
        if (accion == "registrar") {
            this.setTitle("Registrar Membresia");

            areaTxtID.setEnabled(false);
            btnModificar.setText("Registrar");
        } else if (accion == "renovar") {
            this.setTitle("Renovar Membresia");
            areaTxtID.setEditable(false);
            btnModificar.setText("Renovar");
        }

    }

    public ModificarCliente() {
        initComponents();
        this.setTitle("Modificar Membresia");
        areaTxtID.setEditable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(213,159,15));
    }

    public ModificarCliente(MainPrincipal main) {
        initComponents();
        this.main = main;
        this.setTitle("Modificar Membresia");
        areaTxtID.setEditable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(213,159,15));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        areaTxtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JLabel();
        areaTxtDireccion = new javax.swing.JTextField();
        txtId = new javax.swing.JLabel();
        areaTxtID = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        txtTelefono = new javax.swing.JLabel();
        areaTxtTelefono = new javax.swing.JTextField();
        txtMembresia = new javax.swing.JLabel();
        scrollMembresia = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(213, 159, 15));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 61, 121));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosGraficos/gymPumaAragon.jpg"))); // NOI18N

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 61, 121));
        txtNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombre.setText("Nombre");

        areaTxtNombre.setBackground(new java.awt.Color(0, 61, 121));
        areaTxtNombre.setForeground(new java.awt.Color(213, 159, 15));

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(0, 61, 121));
        txtDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDireccion.setText("Direccion");

        areaTxtDireccion.setBackground(new java.awt.Color(0, 61, 121));
        areaTxtDireccion.setForeground(new java.awt.Color(213, 159, 15));

        txtId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtId.setForeground(new java.awt.Color(0, 61, 121));
        txtId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtId.setText("ID");

        areaTxtID.setEditable(false);
        areaTxtID.setBackground(new java.awt.Color(0, 61, 121));
        areaTxtID.setForeground(new java.awt.Color(213, 159, 15));
        areaTxtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaTxtIDActionPerformed(evt);
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

        btnModificar.setBackground(new java.awt.Color(213, 159, 15));
        btnModificar.setForeground(new java.awt.Color(0, 61, 121));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 61, 121));
        txtTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTelefono.setText("Telefono");

        areaTxtTelefono.setBackground(new java.awt.Color(0, 61, 121));
        areaTxtTelefono.setForeground(new java.awt.Color(213, 159, 15));

        txtMembresia.setForeground(new java.awt.Color(0, 61, 121));
        txtMembresia.setText("Tipo de Membresia");

        scrollMembresia.setBackground(new java.awt.Color(0, 61, 121));
        scrollMembresia.setForeground(new java.awt.Color(213, 159, 15));
        scrollMembresia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semanal", "Mensual", "Dia" }));
        scrollMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrollMembresiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre)
                    .addComponent(txtMembresia)
                    .addComponent(txtTelefono)
                    .addComponent(txtDireccion)
                    .addComponent(txtId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(areaTxtID)
                    .addComponent(areaTxtTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(areaTxtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(scrollMembresia, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(areaTxtDireccion, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(72, 72, 72))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre)
                    .addComponent(areaTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono)
                    .addComponent(areaTxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scrollMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMembresia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaTxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaTxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnCancelar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        //validarEntrada(); No funca todavía
        if (validarEntrada()) {
            switch (accion) {
                case "registrar":
                    registrarMembresia();
                    break;
                case "renovar":
                    renovarMembresia();
                    break;
                case "modificar":
                    modificarCliente();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Esta ventana no se inicializó correctamente");
                    this.dispose();
                    break;
            }
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void renovarMembresia() {
        String nombre = areaTxtNombre.getText();
        String direccion = areaTxtDireccion.getText();
        String telefono = areaTxtTelefono.getText();
        LocalDate hoy = LocalDate.now();
        String anio = Integer.toString(hoy.getYear());
        String mes = Integer.toString(hoy.getMonthValue());
        String dia = Integer.toString(hoy.getDayOfMonth());

        LocalDate fin = getFechaFin();
        String tipo = scrollMembresia.getSelectedItem().toString();
        int id = Integer.parseInt(areaTxtID.getText());

        gysCliente cte = new gysCliente(id, nombre, telefono, direccion);
        gysMembresia mem = new gysMembresia(cte, hoy, fin);

        if (!membresias.isMembresiaVigente(Integer.toString(id))) {
            boolean exitomem = membresias.renovarFechaVenc(mem, fin);

            if (!exitomem) {
                JOptionPane.showMessageDialog(new JPanel(), "No se pudo renovar: Revise la consola", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Se renovó la membresia de: " + cte.getNombre() + "\n El precio es de: " + precio);
                try {
                    main.llenarTabla();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        } else {
            JOptionPane.showMessageDialog(new JPanel(), "No se pudo renovar: La membresia aun está vigente", "Error", JOptionPane.ERROR_MESSAGE);
        }

        this.dispose();
    }

    private void modificarCliente() {
        String nombre = areaTxtNombre.getText();
        String direccion = areaTxtDireccion.getText();
        String telefono = areaTxtTelefono.getText();

        int id = Integer.parseInt(areaTxtID.getText());

        gysCliente cte = new gysCliente(id, nombre, telefono, direccion);
        boolean exitocte = clientes.updCliente(cte);

        if (!exitocte) {
            JOptionPane.showMessageDialog(new JPanel(), "No se pudo renovar: Revise la consola", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Se actualizó la información del cliente: " + cte.getId());
            try {
                main.llenarTabla();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        this.dispose();
    }

    private void registrarMembresia() {
        String nombre = areaTxtNombre.getText();
        String direccion = areaTxtDireccion.getText();
        String telefono = areaTxtTelefono.getText();
        LocalDate hoy = LocalDate.now();
        String anio = Integer.toString(hoy.getYear());
        String mes = Integer.toString(hoy.getMonthValue());
        String dia = Integer.toString(hoy.getDayOfMonth());

        LocalDate fin = getFechaFin();
        String tipo = scrollMembresia.getSelectedItem().toString();
        gysCliente cte = new gysCliente(generateUniqueId(), nombre, telefono, direccion);
        gysMembresia mem = new gysMembresia(cte, hoy, fin);
        boolean exitocte = clientes.addCliente(cte);
        boolean exitomem = membresias.addMembresia(mem);

        if (!exitocte || !exitomem) {
            JOptionPane.showMessageDialog(new JPanel(), "No se pudo renovar: Revise la consola", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Se registró la membresia con el ID: " + cte.getId() + "\n El precio es de: " + precio);
            main.llenarTabla();
        }

        this.dispose();
    }

    private LocalDate getFechaFin() {
        LocalDate hoy = LocalDate.now(); //Fecha de hoy
        //260 mes, 80 semana y 20 el día

        //Aquí se determina cuanto hay que sumarle a la fecha de hoy
        if (scrollMembresia.getSelectedItem().toString().equals("Mensual")) {
            LocalDate fin = hoy.plusMonths(1);
            precio = 260;
            return fin;
        } else if (scrollMembresia.getSelectedItem().toString().equals("Semanal")) {
            LocalDate fin = hoy.plusWeeks(1);
            precio = 80;
            return fin;
        } else {
            LocalDate fin = hoy.plusDays(1);
            precio = 20;
            return fin;
        }
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void scrollMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrollMembresiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scrollMembresiaActionPerformed

    private void areaTxtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaTxtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaTxtIDActionPerformed

    public int generateUniqueId() {
        UUID idOne = UUID.randomUUID();
        String str = "" + idOne;
        int uid = str.hashCode();
        String filterStr = "" + uid;
        System.out.println(filterStr);
        str = filterStr.replaceAll("-", "").substring(3, 9);
        return Integer.parseInt(str);
    }

    private boolean validarEntrada() {

        if (!areaTxtNombre.getText().equals("") && !areaTxtTelefono.getText().equals("") && !areaTxtDireccion.getText().equals("")) {
            if (!areaTxtNombre.getText().matches("[ A-Za-zñÑáéíóúÁÉÍÓÚ]{1,45}")) {
                JOptionPane.showMessageDialog(new JPanel(), "El nombre no es válido\n No debe contener símbolos", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("Nombre invalido");
                return false;
            } else if (areaTxtNombre.getText().length() > 45) {
                JOptionPane.showMessageDialog(new JPanel(), "El nombre excedió el límite de caracteres (45)", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } else if (areaTxtDireccion.getText().length() > 50) {
                JOptionPane.showMessageDialog(new JPanel(), "La dirección excedió el límite de caracteres (50)", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } else if (!areaTxtDireccion.getText().matches("[ 0-9A-Za-zñÑáéíóúÁÉÍÓÚ#-]{1,50}")) {
                JOptionPane.showMessageDialog(new JPanel(), "La dirección contiene caracteres inválidos", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } else if (!areaTxtTelefono.getText().matches("[0-9]+")) {
                JOptionPane.showMessageDialog(new JPanel(), "El número de telefono contiene caracteres no válidos", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("El telefono no puede contener caracteres que no sean numeros");
                return false;
            } else if (areaTxtTelefono.getText().length() != 10) {
                JOptionPane.showMessageDialog(new JPanel(), "El número de telefono debe ser de 10 números", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("El telefono debe tener 10 digitos");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(new JPanel(), "Al menos un campo está vacío, favor de llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
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
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarCliente().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField areaTxtDireccion;
    public javax.swing.JTextField areaTxtID;
    public javax.swing.JTextField areaTxtNombre;
    public javax.swing.JTextField areaTxtTelefono;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JComboBox<String> scrollMembresia;
    private javax.swing.JLabel txtDireccion;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtMembresia;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtTelefono;
    // End of variables declaration//GEN-END:variables
}
