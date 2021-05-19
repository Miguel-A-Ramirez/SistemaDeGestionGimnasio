//Paquete principal
package interfaces;

//Importacion de librerias
import logica.LogicaProducto;
import logica.LogicaCliente;
import logica.LogicaEquipo;
import logica.LogicaMembresia;
import gettersAndSettersTables.gysMembresia;
import gettersAndSettersTables.gysCliente;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miguel Angel Ramirez Rodriguez
 */

//Clase principal de nuestro JFrame
public class MainPrincipal extends javax.swing.JFrame {

    //Creacion de objetos privados
    LogicaMembresia membs = new LogicaMembresia();
    LogicaCliente ctes = new LogicaCliente();
    LogicaProducto np = new LogicaProducto();
    LogicaEquipo ne = new LogicaEquipo();

    //Constructor principal donde se inicializan componentes
    //Se inserta un color y se pone un titulo
    //Se llaman los metodos para consultar las tablas y hacer registros
    public MainPrincipal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/recursosGraficos/icon.png")).getImage());
        this.setTitle("GYM PUMA ARAGON");
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(213,159,15));
        rellenarTabla(membs.desplegarMembresias());
        this.panelInformacion.setVisible(true);
        crearEventoTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escudoUnam = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPrincipal = new javax.swing.JTable();
        btnActualizarTabla = new javax.swing.JButton();
        panelInformacion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        menuMain = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        registrarUsuario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        modificarUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        renovarMembresia = new javax.swing.JMenuItem();
        menuProductos = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        listaProductos = new javax.swing.JMenuItem();
        registrarProductos = new javax.swing.JMenuItem();
        actualizarCantidad = new javax.swing.JMenuItem();
        editarProducto = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        venderProducto = new javax.swing.JMenuItem();
        menuReporteVentas = new javax.swing.JMenu();
        reporteVentas = new javax.swing.JMenuItem();
        registrarEquipos = new javax.swing.JMenu();
        objMenuRegistrarEquipo = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        menuAsistencia = new javax.swing.JMenu();
        menuAsistencias = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(212, 175, 55));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Agency FB", 1, 10)); // NOI18N
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setName("mainPrincipal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(575, 675));
        setSize(new java.awt.Dimension(575, 675));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        escudoUnam.setBackground(new java.awt.Color(213, 159, 15));
        escudoUnam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosGraficos/gymPumas.jpg"))); // NOI18N

        tablaPrincipal.setAutoCreateRowSorter(true);
        tablaPrincipal.setBackground(new java.awt.Color(0, 61, 121));
        tablaPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaPrincipal.setForeground(new java.awt.Color(213, 159, 15));
        tablaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Inicio", "Fin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPrincipal.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tablaPrincipal.setInheritsPopupMenu(true);
        tablaPrincipal.setMaximumSize(new java.awt.Dimension(628, 789));
        tablaPrincipal.setMinimumSize(new java.awt.Dimension(628, 789));
        tablaPrincipal.setSelectionBackground(new java.awt.Color(0, 61, 121));
        tablaPrincipal.setSelectionForeground(new java.awt.Color(213, 159, 15));
        tablaPrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaPrincipalKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPrincipal);
        if (tablaPrincipal.getColumnModel().getColumnCount() > 0) {
            tablaPrincipal.getColumnModel().getColumn(0).setMinWidth(35);
            tablaPrincipal.getColumnModel().getColumn(0).setMaxWidth(55);
        }

        btnActualizarTabla.setBackground(new java.awt.Color(213, 159, 15));
        btnActualizarTabla.setForeground(new java.awt.Color(0, 61, 121));
        btnActualizarTabla.setText("Actualizar tabla");
        btnActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTablaActionPerformed(evt);
            }
        });

        panelInformacion.setVisible(false);
        panelInformacion.setBackground(new java.awt.Color(0, 61, 121));
        panelInformacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelInformacion.setForeground(new java.awt.Color(0, 0, 255));

        jLabel1.setBackground(new java.awt.Color(213, 159, 15));
        jLabel1.setForeground(new java.awt.Color(213, 159, 15));
        jLabel1.setText("Nombre:");

        lblNombre.setBackground(new java.awt.Color(213, 159, 15));
        lblNombre.setForeground(new java.awt.Color(213, 159, 15));
        lblNombre.setText("-");

        jLabel3.setBackground(new java.awt.Color(213, 159, 15));
        jLabel3.setForeground(new java.awt.Color(213, 159, 15));
        jLabel3.setText("Telefono;");

        lblTelefono.setBackground(new java.awt.Color(213, 159, 15));
        lblTelefono.setForeground(new java.awt.Color(213, 159, 15));
        lblTelefono.setText("-");

        jLabel5.setBackground(new java.awt.Color(213, 159, 15));
        jLabel5.setForeground(new java.awt.Color(213, 159, 15));
        jLabel5.setText("Dirección:");

        lblDireccion.setForeground(new java.awt.Color(213, 159, 15));
        lblDireccion.setText("-");

        javax.swing.GroupLayout panelInformacionLayout = new javax.swing.GroupLayout(panelInformacion);
        panelInformacion.setLayout(panelInformacionLayout);
        panelInformacionLayout.setHorizontalGroup(
            panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel3)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInformacionLayout.setVerticalGroup(
            panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(lblTelefono))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btnEliminar.setBackground(new java.awt.Color(213, 159, 15));
        btnEliminar.setForeground(new java.awt.Color(0, 61, 121));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        menuMain.setBackground(new java.awt.Color(213, 159, 15));
        menuMain.setBorder(null);
        menuMain.setForeground(new java.awt.Color(0, 61, 121));
        menuMain.setBorderPainted(false);
        menuMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuMain.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenu1.setBackground(new java.awt.Color(213, 159, 15));
        jMenu1.setForeground(new java.awt.Color(0, 61, 121));
        jMenu1.setText("Membresia");

        registrarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        registrarUsuario.setBackground(new java.awt.Color(0, 61, 121));
        registrarUsuario.setForeground(new java.awt.Color(213, 159, 15));
        registrarUsuario.setText("Registrar nuevo usuario");
        registrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(registrarUsuario);
        jMenu1.add(jSeparator1);

        modificarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        modificarUsuario.setBackground(new java.awt.Color(0, 61, 121));
        modificarUsuario.setForeground(new java.awt.Color(213, 159, 15));
        modificarUsuario.setText("Modificar usuario");
        modificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(modificarUsuario);
        jMenu1.add(jSeparator2);

        renovarMembresia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        renovarMembresia.setBackground(new java.awt.Color(0, 61, 121));
        renovarMembresia.setForeground(new java.awt.Color(213, 159, 15));
        renovarMembresia.setText("Renovar membresia");
        renovarMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renovarMembresiaActionPerformed(evt);
            }
        });
        jMenu1.add(renovarMembresia);

        menuMain.add(jMenu1);

        menuProductos.setBackground(new java.awt.Color(213, 159, 15));
        menuProductos.setForeground(new java.awt.Color(0, 61, 121));
        menuProductos.setText("Productos");
        menuProductos.add(jSeparator3);

        listaProductos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        listaProductos.setBackground(new java.awt.Color(0, 61, 121));
        listaProductos.setForeground(new java.awt.Color(213, 159, 15));
        listaProductos.setText("Lista de productos");
        listaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaProductosActionPerformed(evt);
            }
        });
        menuProductos.add(listaProductos);

        registrarProductos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        registrarProductos.setBackground(new java.awt.Color(0, 61, 121));
        registrarProductos.setForeground(new java.awt.Color(213, 159, 15));
        registrarProductos.setText("Registrar productos");
        registrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarProductosActionPerformed(evt);
            }
        });
        menuProductos.add(registrarProductos);

        actualizarCantidad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        actualizarCantidad.setBackground(new java.awt.Color(0, 61, 121));
        actualizarCantidad.setForeground(new java.awt.Color(213, 159, 15));
        actualizarCantidad.setText("Actualizar cantidad");
        actualizarCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarCantidadActionPerformed(evt);
            }
        });
        menuProductos.add(actualizarCantidad);

        editarProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        editarProducto.setBackground(new java.awt.Color(0, 61, 121));
        editarProducto.setForeground(new java.awt.Color(213, 159, 15));
        editarProducto.setText("Editar producto");
        editarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarProductoActionPerformed(evt);
            }
        });
        menuProductos.add(editarProducto);
        menuProductos.add(jSeparator4);

        venderProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        venderProducto.setBackground(new java.awt.Color(0, 61, 121));
        venderProducto.setForeground(new java.awt.Color(213, 159, 15));
        venderProducto.setText("Vender productos");
        venderProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venderProductoActionPerformed(evt);
            }
        });
        menuProductos.add(venderProducto);

        menuMain.add(menuProductos);

        menuReporteVentas.setBackground(new java.awt.Color(213, 159, 15));
        menuReporteVentas.setForeground(new java.awt.Color(0, 61, 121));
        menuReporteVentas.setText("Reporte de Ventas");

        reporteVentas.setBackground(new java.awt.Color(0, 61, 121));
        reporteVentas.setForeground(new java.awt.Color(213, 159, 15));
        reporteVentas.setText("Generar reporte de ventas");
        reporteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteVentasActionPerformed(evt);
            }
        });
        menuReporteVentas.add(reporteVentas);

        menuMain.add(menuReporteVentas);

        registrarEquipos.setBackground(new java.awt.Color(213, 159, 15));
        registrarEquipos.setForeground(new java.awt.Color(0, 61, 121));
        registrarEquipos.setText("Equipo");

        objMenuRegistrarEquipo.setBackground(new java.awt.Color(0, 61, 121));
        objMenuRegistrarEquipo.setForeground(new java.awt.Color(213, 159, 15));
        objMenuRegistrarEquipo.setText("Registrar equipo");
        objMenuRegistrarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                objMenuRegistrarEquipoActionPerformed(evt);
            }
        });
        registrarEquipos.add(objMenuRegistrarEquipo);
        registrarEquipos.add(jSeparator5);

        menuMain.add(registrarEquipos);

        menuAsistencia.setBackground(new java.awt.Color(213, 159, 15));
        menuAsistencia.setForeground(new java.awt.Color(0, 61, 121));
        menuAsistencia.setText("Asistencias");

        menuAsistencias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuAsistencias.setBackground(new java.awt.Color(0, 61, 121));
        menuAsistencias.setForeground(new java.awt.Color(213, 159, 15));
        menuAsistencias.setText("Ingresar asistencia");
        menuAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAsistenciasActionPerformed(evt);
            }
        });
        menuAsistencia.add(menuAsistencias);

        menuMain.add(menuAsistencia);

        setJMenuBar(menuMain);
        menuMain.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnActualizarTabla)
                        .addGap(6, 6, 6)
                        .addComponent(btnEliminar))
                    .addComponent(panelInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(escudoUnam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(escudoUnam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizarTabla)
                    .addComponent(btnEliminar))
                .addGap(6, 6, 6)
                .addComponent(panelInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Creacion de objetos que nos permitira renovar membresias
    private void renovarMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renovarMembresiaActionPerformed
        SolicitudID si = new SolicitudID("Renovar", this);
        si.setVisible(true);
    }//GEN-LAST:event_renovarMembresiaActionPerformed

    //Creacion de objetos que nos permitiran registrar nuevas membresias
    private void registrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarUsuarioActionPerformed
        ModificarCliente modificar = new ModificarCliente("registrar", this);
        modificar.setVisible(true);
    }//GEN-LAST:event_registrarUsuarioActionPerformed

    //Creacion de objetos que nos permitiran modificar membresias
    private void modificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarUsuarioActionPerformed
        SolicitudID si = new SolicitudID("Modificar", this);
        si.setVisible(true);
    }//GEN-LAST:event_modificarUsuarioActionPerformed

    //Metodo que actualiza las consultas
    private void btnActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaActionPerformed
        rellenarTabla(membs.desplegarMembresias());
    }//GEN-LAST:event_btnActualizarTablaActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    //Metodo que se activa al presionar la tabla
    private void tablaPrincipalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaPrincipalKeyPressed

        if (evt.getSource() == tablaPrincipal) {
            switch (evt.getKeyCode()) {
                case KeyEvent.VK_R:
                    if (tablaPrincipal.getSelectedRow() != -1) {
                        if (!membs.isMembresiaVigente(tablaPrincipal.getValueAt(tablaPrincipal.getSelectedRow(), 0).toString())) {
                            ModificarCliente modificar = new ModificarCliente("renovar", this);
                            llenarFormulario(modificar, "Renovar");
                        } else {
                            JOptionPane.showMessageDialog(new JPanel(), "La membresia del cliente todavía está vigente, no se puede renovar!", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(new JPanel(), "No ha seleccionado una membresia a renovar!", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    break;

                case KeyEvent.VK_M:
                    if (tablaPrincipal.getSelectedRow() != -1) {
                        ModificarCliente modificar = new ModificarCliente(this);
                        modificar.scrollMembresia.setEnabled(false);
                        llenarFormulario(modificar, "");
                    } else {
                        JOptionPane.showMessageDialog(new JPanel(), "No ha seleccionado una membresia de un cliente a modificar!", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    break;
            }
        }

    }//GEN-LAST:event_tablaPrincipalKeyPressed

    //Metodo que nos permite eliminar membresias
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tablaPrincipal.getSelectedRow() != -1) {
            eliminarMembresia();
        } else {
            JOptionPane.showMessageDialog(new JPanel(), "No ha seleccionado una membresia de un cliente a eliminar!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    //Metodo del submenu de registro de equipo
    private void objMenuRegistrarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_objMenuRegistrarEquipoActionPerformed
        RegistrarEquipo eq = new RegistrarEquipo();
        eq.setVisible(true);
    }//GEN-LAST:event_objMenuRegistrarEquipoActionPerformed

    //Metodo del submenu del reporte de ventas
    private void reporteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteVentasActionPerformed
        // TODO add your handling code here:
        ListaVentas p  = new ListaVentas();
        p.setVisible(true);
    }//GEN-LAST:event_reporteVentasActionPerformed

    //Metodo del submenu de venta de productos
    private void venderProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venderProductoActionPerformed
        // TODO add your handling code here:
        VentaDeProductos p = new VentaDeProductos("Venta Productos");
        if (p.llenarComboVenta()) {
            p.setVisible(true);
        } else {
            p.noserequiere = true;
            p.dispose();
            JOptionPane.showMessageDialog(new JPanel(), "No hay inventario o no hay productos registrados!\nFavor de inventariar productos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_venderProductoActionPerformed

    //Metodo del submenu del registro de invtario
    private void actualizarCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarCantidadActionPerformed
        // TODO add your handling code here:
        VentaDeProductos p = new VentaDeProductos("Actualizar cantidad de productos");
        p.setVisible(true);
    }//GEN-LAST:event_actualizarCantidadActionPerformed

    //Metodo del submenu del registro de productos
    private void registrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarProductosActionPerformed
        // TODO add your handling code here:
        RegistrarProducto rp = new RegistrarProducto();
        rp.setVisible(true);
    }//GEN-LAST:event_registrarProductosActionPerformed

    //Metodo del submenu de la edicion de productos
    private void editarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarProductoActionPerformed
        if (np.desplegarProductos().isEmpty()) {
            JOptionPane.showMessageDialog(new JPanel(), "No hay productos registrados!\nFavor de registrar productos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            EditarProducto sp = new EditarProducto();
            sp.setVisible(true);
        }
    }//GEN-LAST:event_editarProductoActionPerformed

    //Metodo del submenu de la asistencia de clientes
    private void menuAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAsistenciasActionPerformed
        if (ctes.desplegarClientes().isEmpty()) {
            JOptionPane.showMessageDialog(new JPanel(), "No hay clientes registrados!\nFavor de registrar clientes", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Asistencias cf = new Asistencias();
            cf.setVisible(true);
        }
    }//GEN-LAST:event_menuAsistenciasActionPerformed

    private void listaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaProductosActionPerformed
        // TODO add your handling code here:
        ListaProductos lp = new ListaProductos();
        lp.setVisible(true);
    }//GEN-LAST:event_listaProductosActionPerformed

    //Metodo del submenu para eliminar membresias
    private void eliminarMembresia() {
        String id = tablaPrincipal.getValueAt(tablaPrincipal.getSelectedRow(), 0).toString();

        if (!membs.isMembresiaVigente(id)) {
            int input = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar la membresía?\n¡Esto no se podrá deshacer!");
            if (input == 0) {
                boolean stat = membs.delMembresia(id);
                if (!stat) {
                    JOptionPane.showMessageDialog(new JPanel(), "Error al eliminar!\n Ver la consola para más detalle", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(new JPanel(), "Hecho!");
                }
                llenarTabla();
            }
        } else {
            JOptionPane.showMessageDialog(new JPanel(), "Error al eliminar!\n La membresía aún está vigente!", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    //Metodo para hacer registros en la BD
    private void llenarFormulario(ModificarCliente modificar, String Accion) {
        gysMembresia mem = membs.obtenerMembresia(tablaPrincipal.getValueAt(tablaPrincipal.getSelectedRow(), 0).toString());
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

    //Hacemos una consulta de datos
    public void llenarTabla() {
        rellenarTabla(membs.desplegarMembresias());
    }

    public void actualizarLista() {

    }

    //Metodo que al seleccionar la tabla nos muestre un panel con informacion 
    private void crearEventoTabla() {
        tablaPrincipal.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            panelInformacion.setVisible(true);
            String id;
            if (!e.getValueIsAdjusting() && tablaPrincipal.getSelectedRow() != -1) {
                id = tablaPrincipal.getValueAt(tablaPrincipal.getSelectedRow(), 0).toString();
                gysCliente cte = ctes.obtenerCliente(id);
                lblNombre.setText(cte.getNombre());
                lblTelefono.setText(cte.getTelefono());
                lblDireccion.setText(cte.getDireccion());
            } else if (tablaPrincipal.getSelectedRow() == -1) {
                panelInformacion.setVisible(false);
            }
        });
    }

    //Metodo para re mostrar tabla despues de un registro
    private void rellenarTabla(List memlista) {
        vaciarTabla();
        for (Object obj : memlista) {
            gysMembresia mem = (gysMembresia) obj;
            ((DefaultTableModel) tablaPrincipal.getModel()).addRow(new Object[]{
                mem.getCliente().getId(), mem.getCliente().getNombre(), mem.getFechaIn().toString(), mem.getFechaFin().toString()});
        }
    }

    //Vaciar datos
    private void vaciarTabla() {
        DefaultTableModel model = (DefaultTableModel) tablaPrincipal.getModel();
        model.setRowCount(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
          UIManager.put( "control", new Color( 128, 128, 128) );
          UIManager.put( "info", new Color(128,128,128) );
          UIManager.put( "nimbusBase", new Color( 18, 30, 49) );
          UIManager.put( "nimbusAlertYellow", new Color( 248, 187, 0) );
          UIManager.put( "nimbusDisabledText", new Color( 128, 128, 128) );
          UIManager.put( "nimbusFocus", new Color(115,164,209) );
          UIManager.put( "nimbusGreen", new Color(176,179,50) );
          UIManager.put( "nimbusInfoBlue", new Color( 66, 139, 221) );
          UIManager.put( "nimbusLightBackground", new Color( 18, 30, 49) );
          UIManager.put( "nimbusOrange", new Color(191,98,4) );
          UIManager.put( "nimbusRed", new Color(169,46,34) );
          UIManager.put( "nimbusSelectedText", new Color( 255, 255, 255) );
          UIManager.put( "nimbusSelectionBackground", new Color( 104, 93, 156) );
          UIManager.put( "text", new Color( 230, 230, 230) );
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPrincipal().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actualizarCantidad;
    private javax.swing.JButton btnActualizarTabla;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JMenuItem editarProducto;
    private javax.swing.JLabel escudoUnam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JMenuItem listaProductos;
    private javax.swing.JMenu menuAsistencia;
    private javax.swing.JMenuItem menuAsistencias;
    javax.swing.JMenuBar menuMain;
    private javax.swing.JMenu menuProductos;
    private javax.swing.JMenu menuReporteVentas;
    private javax.swing.JMenuItem modificarUsuario;
    private javax.swing.JMenuItem objMenuRegistrarEquipo;
    private javax.swing.JPanel panelInformacion;
    private javax.swing.JMenu registrarEquipos;
    private javax.swing.JMenuItem registrarProductos;
    private javax.swing.JMenuItem registrarUsuario;
    private javax.swing.JMenuItem renovarMembresia;
    private javax.swing.JMenuItem reporteVentas;
    public javax.swing.JTable tablaPrincipal;
    private javax.swing.JMenuItem venderProducto;
    // End of variables declaration//GEN-END:variables

}
