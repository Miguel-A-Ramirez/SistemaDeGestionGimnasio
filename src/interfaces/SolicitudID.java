package interfaces;

import gettersAndSettersTables.gysCliente;
import gettersAndSettersTables.gysMembresia;
import logica.LogicaCliente;
import logica.LogicaMembresia;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Miguel Angel Ramirez Rodriguez
 */

public class SolicitudID extends javax.swing.JFrame {

    private String Accion;
    private gysCliente cte;
    private LogicaCliente clientes = new LogicaCliente();
    private LogicaMembresia membresias = new LogicaMembresia();
    private MainPrincipal main;

    public SolicitudID(String accion, MainPrincipal main) {
        this.main = main;
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/recursosGraficos/icon.png")).getImage());
        this.Accion = accion;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(213,159,15));
        this.setResizable(false);
        this.setTitle("Solicitud de ID");
    }

    public SolicitudID() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        areaTxtId = new javax.swing.JTextField();
        btnContinuar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 61, 121));
        jLabel1.setText("Ingresar ID del cliente");

        areaTxtId.setBackground(new java.awt.Color(0, 61, 121));
        areaTxtId.setForeground(new java.awt.Color(213, 159, 15));
        areaTxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaTxtIdActionPerformed(evt);
            }
        });

        btnContinuar.setBackground(new java.awt.Color(213, 159, 15));
        btnContinuar.setForeground(new java.awt.Color(0, 61, 121));
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(213, 159, 15));
        btnRegresar.setForeground(new java.awt.Color(0, 61, 121));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosGraficos/gymPumaAragon.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnContinuar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(68, 68, 68))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(areaTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(areaTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContinuar)
                    .addComponent(btnRegresar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        String id = areaTxtId.getText();
        if (validarCteID(id)) {
            desplegarFormulario();
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void areaTxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaTxtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaTxtIdActionPerformed

    private void desplegarFormulario() {
        if ("Modificar".equals(Accion)) {
            ModificarCliente modificar = new ModificarCliente(main);
            modificar.scrollMembresia.setEnabled(false);
            llenarFormulario(modificar);
        } else if ("Renovar".equals(Accion)) {
            ModificarCliente modificar = new ModificarCliente("renovar", main);
            llenarFormulario(modificar);

        }

        this.dispose();
    }

    private void llenarFormulario(ModificarCliente modificar) {
        gysMembresia mem = membresias.obtenerMembresia(areaTxtId.getText());
        modificar.areaTxtNombre.setText(mem.getCliente().getNombre());
        modificar.areaTxtDireccion.setText(mem.getCliente().getDireccion());
        modificar.areaTxtTelefono.setText(mem.getCliente().getTelefono());
        modificar.areaTxtID.setText(Integer.toString(mem.getCliente().getId()));

        if ("Renovar".equals(Accion)) {
            modificar.areaTxtNombre.setEnabled(false);
            modificar.areaTxtID.setEnabled(false);
            modificar.areaTxtDireccion.setEnabled(false);
            modificar.areaTxtTelefono.setEnabled(false);
        }
        modificar.setVisible(true);
    }

    private boolean validarCteID(String id) {
        if (clientes.validarCliente(id)) {
            System.out.println("El cliente existe!");

            if (Accion.equals("Renovar") && membresias.isMembresiaVigente(id)) {
                System.out.println("La membresia todavía está vigente, no se puede renovar!");
                JOptionPane.showMessageDialog(new JPanel(), "La membresia del cliente todavía está vigente, no se puede renovar!", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            return true;
        }
        System.out.println("El cliente no existe!");
        JOptionPane.showMessageDialog(new JPanel(), "El cliente no existe", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
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
            java.util.logging.Logger.getLogger(SolicitudID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolicitudID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolicitudID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolicitudID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new solicitaId().setVisible(true);
//            }
//        });
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new IdModificarCliente().setVisible(true);
//            }
//        });
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new solicitaId().setVisible(true);
//            }
//        });
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SolicitudID().setVisible(true);
//            }
//        });
    }
    /**
     * public boolean esIdValido(String id){ if(id.length()== 6){ for(int i=0;
     * i<id.length(); i++){
     *
     * }
     * }
     * }
     *
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaTxtId;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
