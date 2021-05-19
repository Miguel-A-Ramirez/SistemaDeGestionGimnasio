//Paquete principal
package interfaces;

//Importacion de librerias
import gettersAndSettersTables.gysAsistencia;
import logica.LogicaAsistencia;
import logica.LogicaMembresia;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import javax.swing.ImageIcon;

/**
 *
 * @author Miguel Angel Ramirez Rodriguez
 */

//Clase principal de nuestro JFrame
public class Asistencias extends javax.swing.JFrame {

    //Creacion de objetos privados
    LogicaAsistencia asis = new LogicaAsistencia();
    LogicaMembresia mems = new LogicaMembresia();

    //Constructor principal donde se inicializan componentes
    //Se inserta un color y se pone un titulo
    public Asistencias() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/recursosGraficos/icon.png")).getImage());
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(213,159,15));
        this.setResizable(false);
        this.setTitle("Asistencias");
        msgSalida.setText("Esperando...");
        msgSalida.setForeground(new Color(0,61,121));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        asistenciaPri = new javax.swing.JLabel();
        areaTexto = new javax.swing.JTextField();
        msgSalida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setForeground(new java.awt.Color(0, 0, 204));

        asistenciaPri.setBackground(new java.awt.Color(213, 159, 15));
        asistenciaPri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        asistenciaPri.setForeground(new java.awt.Color(0, 61, 121));
        asistenciaPri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asistenciaPri.setText("Ingrese su ID y presione Enter");

        areaTexto.setBackground(new java.awt.Color(0, 61, 121));
        areaTexto.setForeground(new java.awt.Color(213, 159, 15));
        areaTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaTextoActionPerformed(evt);
            }
        });
        areaTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                areaTextoKeyPressed(evt);
            }
        });

        msgSalida.setText("Mensaje");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosGraficos/gymPumaAragon.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(areaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(msgSalida))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(asistenciaPri, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(asistenciaPri)
                .addGap(18, 18, 18)
                .addComponent(areaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(msgSalida)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodo donde recibiremos lo escrito en la caja de texto
    private void areaTextoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaTextoKeyPressed

        //Entra en el ciclo solo si ponemos ENTER
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //Lo que se haya escrito se guarda en una lista 
            if (registrarAsistencia()) {
                msgSalida.setText("Bienvenido " + mems.obtenerMembresia(areaTexto.getText()).getCliente().getNombre());
                this.getContentPane().setBackground(new Color(0, 128, 0));
            }

            areaTexto.setText("");
        }
    }//GEN-LAST:event_areaTextoKeyPressed

    //Metodo que validara lo ingresado en la caja de texto
    private boolean validarCte(String id) {
        if (id.matches("[0-9]+")) {
            boolean memVigente = mems.isMembresiaVigente(id);
            boolean cteExiste = mems.existeMembresiaIdCliente(Integer.parseInt(id));   
            // si no existe un id en la BD entra en el ciclo
            if (!cteExiste) {
                msgSalida.setText("No hay una membresía con ese ID");
                this.getContentPane().setBackground(Color.RED);
                return false;
            // Si existe pero la membresia vencio entra en en ciclo
            } else if (!memVigente) {
                msgSalida.setText("Su membresía ha expirado!");
                this.getContentPane().setBackground(Color.RED);
                return false;
            }
        //Si lo ingresado tiene caracteres alfabeticos entra en el ciclo
        } else {
            msgSalida.setText("El id debe contener solo números!");
            return false;
        }

        return true;
    }

    //Metodo privado para registrar asistencias
    private boolean registrarAsistencia() {

        if (validarCte(areaTexto.getText())) {
            int id = Integer.parseInt(areaTexto.getText());
            LocalDate hoy = LocalDate.now();
            gysAsistencia as = new gysAsistencia(id, hoy);

            boolean stat = asis.addAsistencia(as);

            if (!stat) {
                msgSalida.setText("Usted ya está registrado el día de hoy");
                this.getContentPane().setBackground(Color.ORANGE);
            } else {
                
            }

            return stat;
        }

        return false;
    }

    private void areaTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaTextoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Asistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Asistencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaTexto;
    private javax.swing.JLabel asistenciaPri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel msgSalida;
    // End of variables declaration//GEN-END:variables
}
