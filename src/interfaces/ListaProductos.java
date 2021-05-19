package interfaces;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import logica.LogicaProducto;
import gettersAndSettersTables.gysProducto;

/**
 *
 * @author Miguel Angel Ramirez Rodriguez
 */

public class ListaProductos extends javax.swing.JFrame {
    
    //Declaramos un objeto np de tipo LogicaProducto
    private LogicaProducto np = new LogicaProducto();

    //Constructor principal
    public ListaProductos() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/recursosGraficos/icon.png")).getImage());
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(213,159,15));
        this.setTitle("Lista de productos");
        //Llamamos al metodo que se encarga de mostrar la tabla
        llenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(213, 159, 15));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 61, 121));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de productos disponibles");

        tablaProductos.setAutoCreateRowSorter(true);
        tablaProductos.setBackground(new java.awt.Color(0, 61, 121));
        tablaProductos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaProductos.setForeground(new java.awt.Color(213, 159, 15));
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Cantidad", "Precio", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaProductos);
        if (tablaProductos.getColumnModel().getColumnCount() > 0) {
            tablaProductos.getColumnModel().getColumn(0).setMinWidth(30);
            tablaProductos.getColumnModel().getColumn(0).setMaxWidth(30);
            tablaProductos.getColumnModel().getColumn(2).setMinWidth(30);
            tablaProductos.getColumnModel().getColumn(2).setMaxWidth(65);
            tablaProductos.getColumnModel().getColumn(3).setResizable(false);
            tablaProductos.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodo encargado de llenar la tablaProductos del Jframe
    private void llenarTabla(){
        for (Object obj: np.desplegarProductos()){
            gysProducto mp = (gysProducto) obj;
            
            if(mp.getCategoria() == 1){
                String artEjercios = "Articulo de ejercicio";
                ((DefaultTableModel) tablaProductos.getModel()).addRow(new Object []{mp.getIdproducto(), mp.getNombre(),mp.getCantidad(), mp.getPrecio(), artEjercios});
            }else if (mp.getCategoria() == 2){
                String artProteina = "Proteinas";
                ((DefaultTableModel) tablaProductos.getModel()).addRow(new Object []{mp.getIdproducto(), mp.getNombre(),mp.getCantidad(), mp.getPrecio(), artProteina});
            }else if (mp.getCategoria() == 3){
                String artAmino = "Aminoácidos";
                ((DefaultTableModel) tablaProductos.getModel()).addRow(new Object []{mp.getIdproducto(), mp.getNombre(),mp.getCantidad(), mp.getPrecio(), artAmino});
            }else if (mp.getCategoria() == 4){
                String artTermo = "Termogenicos";
                ((DefaultTableModel) tablaProductos.getModel()).addRow(new Object []{mp.getIdproducto(), mp.getNombre(),mp.getCantidad(), mp.getPrecio(), artTermo});
            }
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(ListaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
