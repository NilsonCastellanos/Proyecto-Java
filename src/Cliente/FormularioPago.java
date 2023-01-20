package Cliente;

import Cliente.CRUDConsumo;
import Cliente.CRUDHabitacion;
import Cliente.CRUDPago;
import Cliente.CRUDReserva;
import Metodos_sql.ConexionBD;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class FormularioPago extends javax.swing.JInternalFrame {
    

    /**
     * Creates new form FormularioPago
     */
    public FormularioPago() {
        initComponents();
        
        txtidreserva.setText(idreserva);
        txtUsuario.setText(cliente);
        txthabitacion.setText(habitacion);
        txtidhabitacion.setText(idhabitacion);
        txttotalreserva.setText(Double.toString(totalreserva));
        
        CRUDConsumo func=new CRUDConsumo();
        func.mostrar(idreserva);
        
        txttotal_pago.setText(Double.toString(totalreserva + func.totalconsumo));
        
        setTitle("Proyecto Final");
        setResizable(false);
        setVisible(true);
        
        mostrar(idreserva);
        inhabilitar();
  
    }

    private String accion = "guardar";
    
    public static String idreserva;
    public static String cliente;
    public static String idhabitacion;
    public static String habitacion;
    public static Double totalreserva;

    public void ocultar_columnas() {

        tablalistadopago.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistadopago.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistadopago.getColumnModel().getColumn(0).setPreferredWidth(0);

        tablalistadopago.getColumnModel().getColumn(1).setMaxWidth(0);
        tablalistadopago.getColumnModel().getColumn(1).setMinWidth(0);
        tablalistadopago.getColumnModel().getColumn(1).setPreferredWidth(0);
    }

    public void ocultar_columnasconsumo() {

        tablalistadoconsumo.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistadoconsumo.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistadoconsumo.getColumnModel().getColumn(0).setPreferredWidth(0);

        tablalistadoconsumo.getColumnModel().getColumn(1).setMaxWidth(0);
        tablalistadoconsumo.getColumnModel().getColumn(1).setMinWidth(0);
        tablalistadoconsumo.getColumnModel().getColumn(1).setPreferredWidth(0);

        tablalistadoconsumo.getColumnModel().getColumn(2).setMaxWidth(0);
        tablalistadoconsumo.getColumnModel().getColumn(2).setMinWidth(0);
        tablalistadoconsumo.getColumnModel().getColumn(2).setPreferredWidth(0);
    }

    public void inhabilitar() {

        txtidpago.setVisible(false);

        txtidreserva.setVisible(false);
        txtUsuario.setEnabled(false);
        txtnum_comprobante.setEnabled(false);
        cbotipocomprobante.setEnabled(false);
        txtiva.setEnabled(false);
        txttotal_pago.setEnabled(false);
        txttotalreserva.setEnabled(false);

        dcfecha_emision.setEnabled(false);
        dcfecha_pago.setEnabled(false);
        txtidhabitacion.setVisible(false);
        txtidhabitacion.setEnabled(false);

        btnguardar.setEnabled(false);
        btncancelar.setEnabled(false);
        btnsalir.setEnabled(false);
        txtidpago.setText("");
        txtnum_comprobante.setText("");
        txtiva.setText("");
        txttotal_pago.setText("");

    }

    public void habilitar() {

        txtidpago.setVisible(false);

        txtidreserva.setVisible(true);
        txtUsuario.setEnabled(true);
        txtnum_comprobante.setEnabled(true);
        cbotipocomprobante.setEnabled(true);
        txtiva.setEnabled(true);
        txttotal_pago.setEnabled(true);
        txttotalreserva.setEnabled(true);
        dcfecha_emision.setEnabled(true);
        dcfecha_pago.setEnabled(true);

        txtidhabitacion.setVisible(true);
        txtidhabitacion.setEnabled(true);

        btnguardar.setEnabled(true);
        btncancelar.setEnabled(true);
        btnsalir.setEnabled(true);
        txtidpago.setText("");
        txtnum_comprobante.setText("");
        txtiva.setText("");
        txttotal_pago.setText("");

    }

    public void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            CRUDPago func = new CRUDPago();
            modelo = func.mostrar(buscar);

            tablalistadopago.setModel(modelo);
            ocultar_columnas();
            lbltotalregistros.setText("Total Pagos " + Integer.toString(func.totalregistros));

            //Mostrar los datos de los consumos
            CRUDConsumo func2 = new CRUDConsumo();
            modelo = func2.mostrar(buscar);
            tablalistadoconsumo.setModel(modelo);
            ocultar_columnasconsumo();

            lbltotalregistros.setText("Total Consumos " + func2.totalregistros);
            lbltotalconsumo.setText("Consumo Total: $." + func2.totalconsumo);

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        tablalistadoconsumo1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablalistadoconsumo = new javax.swing.JTable();
        lbltotalregistros = new javax.swing.JLabel();
        lbltotalconsumo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnimprimircomprobante = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablalistadopago = new javax.swing.JTable();
        btnsalir = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        lblconsumo1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtidpago = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        btncancelar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        txtidreserva = new javax.swing.JTextField();
        txttotalreserva = new javax.swing.JTextField();
        txtidhabitacion = new javax.swing.JTextField();
        txthabitacion = new javax.swing.JTextField();
        txtnum_comprobante = new javax.swing.JTextField();
        txtiva = new javax.swing.JTextField();
        txttotal_pago = new javax.swing.JTextField();
        cbotipocomprobante = new javax.swing.JComboBox<>();
        dcfecha_emision = new com.toedter.calendar.JDateChooser();
        dcfecha_pago = new com.toedter.calendar.JDateChooser();

        tablalistadoconsumo1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablalistadoconsumo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoconsumo1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablalistadoconsumo1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(47, 79, 79));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 239, 213));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Consumos"));

        tablalistadoconsumo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablalistadoconsumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoconsumoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablalistadoconsumo);

        lbltotalregistros.setForeground(new java.awt.Color(102, 102, 102));
        lbltotalregistros.setText("Registros:");

        lbltotalconsumo.setForeground(new java.awt.Color(102, 102, 102));
        lbltotalconsumo.setText("Consumos:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltotalconsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lbltotalregistros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltotalconsumo)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 40, 560, -1));

        jPanel5.setBackground(new java.awt.Color(255, 239, 213));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Pagos"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnimprimircomprobante.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnimprimircomprobante.setText("Imprimir Ticket ");
        btnimprimircomprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimircomprobanteActionPerformed(evt);
            }
        });
        jPanel5.add(btnimprimircomprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 18, -1, -1));

        tablalistadopago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablalistadopago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadopagoMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablalistadopago);

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 520, 128));

        btnsalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        jPanel5.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        btneliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btneliminar.setText("Eliminar");
        jPanel5.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        lblconsumo1.setForeground(new java.awt.Color(102, 102, 102));
        lblconsumo1.setText("Registros:");
        jPanel5.add(lblconsumo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 180, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 560, 260));

        jPanel6.setBackground(new java.awt.Color(255, 239, 213));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Pago"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Total de Reserva");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel3.setText("Reserva");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel12.setText("Habitación");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel13.setText("Tipo de comprobante");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel14.setText("Numero de Comprobante");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel15.setText("Iva");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel16.setText("Fecha de emisión");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel17.setText("Fecha de pago");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        jLabel18.setText("Total de pago");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));
        jPanel6.add(txtidpago, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 120, -1));
        jPanel6.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 150, -1));

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        jPanel6.add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, -1));

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        jPanel6.add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel6.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, -1, -1));
        jPanel6.add(txtidreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 80, 100, -1));
        jPanel6.add(txttotalreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));
        jPanel6.add(txtidhabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));
        jPanel6.add(txthabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 150, -1));
        jPanel6.add(txtnum_comprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 180, -1));
        jPanel6.add(txtiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 180, -1));
        jPanel6.add(txttotal_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 180, -1));

        cbotipocomprobante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Recibo", "Factura", "Ticket", " " }));
        jPanel6.add(cbotipocomprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 170, -1));
        jPanel6.add(dcfecha_emision, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));
        jPanel6.add(dcfecha_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 20, 406, 580));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1330, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablalistadoconsumoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoconsumoMouseClicked

    }//GEN-LAST:event_tablalistadoconsumoMouseClicked

    private void tablalistadoconsumo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoconsumo1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablalistadoconsumo1MouseClicked

    private void btnimprimircomprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimircomprobanteActionPerformed
        // TODO add your handling code here:
            
        Document documento = new Document();

       String usuarioid = txtUsuario.getText();
        String fecha = ((JTextField) dcfecha_emision.getDateEditor().getUiComponent()).getText();
      //  String horario = dcfecha_pago.getSelectedItem().toString();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/" + txtUsuario.getText().trim() + ".pdf"));

            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/imagenes/Banner.png");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            //clientes
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Informacion del Cliente. \n Nilson Castellanos \n nilson@gmail.com \n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));

            documento.open();
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tablaCliente = new PdfPTable(3);

            tablaCliente.addCell("ID");
            tablaCliente.addCell("nombre");
            tablaCliente.addCell("correo");

            try {
                Connection conexion = null;
                conexion = ConexionBD.conectar();
                PreparedStatement pst = conexion.prepareStatement("select id,nombre,correo from usuarios where id = '" + usuarioid + "' ");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    do {
                        tablaCliente.addCell(rs.getString(1));
                        tablaCliente.addCell(rs.getString(2));
                        tablaCliente.addCell(rs.getString(3));
                    } while (rs.next());

                    documento.add(tablaCliente);
                }

                //habitaciones
                Paragraph parrafo2 = new Paragraph();
                parrafo2.setAlignment(Paragraph.ALIGN_CENTER);
                parrafo2.add("\n \n  Habitaciones y Productos Registrados. \n Habitacion N°1-Standar \n Jugo de naranja-1 UND\n");
                parrafo2.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));

                documento.add(parrafo2);

                PdfPTable tablaHabitacion = new PdfPTable(4);

                tablaHabitacion.addCell("ID habitacion");
                tablaHabitacion.addCell("numero");
                tablaHabitacion.addCell("piso");
                tablaHabitacion.addCell("descripcion");
                

                try {
                    Connection conexion2 = null;
                    conexion2 = ConexionBD.conectar();
                    PreparedStatement pst2 = conexion2.prepareStatement("select idhabitacion, numero,piso,  from habitacion  where idhabitacion = '" + idhabitacion);
                    ResultSet rs2 = pst2.executeQuery();

                    if (rs2.next()) {
                        do {
                            tablaHabitacion.addCell(rs2.getString(1));
                            tablaHabitacion.addCell(rs2.getString(2));
                            tablaHabitacion.addCell(rs2.getString(3));
                            tablaHabitacion.addCell(rs2.getString(4));
                        } while (rs2.next());

                        documento.add(tablaHabitacion);

                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());

                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            //reserva
            Paragraph parrafo3 = new Paragraph();
            parrafo3.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo3.add("\n \n  Reserva Registrada. \n \n");
            parrafo3.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));

            documento.add(parrafo3);

            PdfPTable FormularioVistaHabitacion = new PdfPTable(1);

            FormularioVistaHabitacion.addCell("Numero Habitaciones");

            try {
                Connection conexion3 = null;
                conexion3 = ConexionBD.conectar();
                PreparedStatement pst3 = conexion3.prepareStatement("select distinct id from mesas m inner join venta on m.id = venta.mesas_id where venta.usuarios_id = '" + usuarioid + "' and venta.fecha =  '" + fecha + "' ");
                ResultSet rs3 = pst3.executeQuery();

                if (rs3.next()) {
                    do {
                        FormularioVistaHabitacion.addCell(rs3.getString(1));

                    } while (rs3.next());

                    documento.add(FormularioVistaHabitacion);

                }

            } catch (Exception e) {
                System.out.println(e.getMessage());

            }

            //TOTAL
            Paragraph parrafo4 = new Paragraph();
            parrafo4.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo4.add("\n \n  Total a Pagar  Y Fecha Reserva \n $10.500-30/11/2022 \n");
            parrafo4.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));

            documento.add(parrafo4);

            PdfPTable totalapagar = new PdfPTable(3);

            totalapagar.addCell("Total ");
            totalapagar.addCell("Fecha de la reserva");
            totalapagar.addCell("hora reserva");

            try {
                Connection conexion4 = null;
                conexion4 = ConexionBD.conectar();
                PreparedStatement pst4 = conexion4.prepareStatement("select sum(subtotal) as total from venta where venta.usuarios_id = '" + usuarioid + "' and venta.fecha =  '" + fecha + "' ");
                ResultSet rs4 = pst4.executeQuery();

                if (rs4.next()) {
                    do {
                        totalapagar.addCell(rs4.getString(1));
                        totalapagar.addCell(fecha);
                      //  totalapagar.addCell(horario);

                    } while (rs4.next());

                    documento.add(totalapagar);

                }

            } catch (Exception e) {
                System.out.println(e.getMessage());

            }

            Paragraph parrafo5 = new Paragraph();
            parrafo5.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo5.add("\n \n  Gracias por tu reserva, Te esperamos!! \n \n");
            parrafo5.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));

            documento.add(parrafo5);
            documento.close();

            JOptionPane.showMessageDialog(null, "Se genero el ticket correctamente, Gracias por tu reserva!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnimprimircomprobanteActionPerformed

    private void tablalistadopagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadopagoMouseClicked

        btnguardar.setText("Editar");
        habilitar();
        btnsalir.setEnabled(true);
        accion = "editar";

        int fila = tablalistadopago.rowAtPoint(evt.getPoint());

        txtidpago.setText(tablalistadopago.getValueAt(fila, 0).toString());
        txtidreserva.setText(tablalistadopago.getValueAt(fila, 1).toString());

        cbotipocomprobante.setSelectedItem(tablalistadopago.getValueAt(fila, 2).toString());
        txtnum_comprobante.setText(tablalistadopago.getValueAt(fila, 3).toString());
        txtiva.setText(tablalistadopago.getValueAt(fila, 4).toString());
        txttotal_pago.setText(tablalistadopago.getValueAt(fila, 5).toString());

        dcfecha_emision.setDate(Date.valueOf(tablalistadopago.getValueAt(fila, 6).toString()));
        dcfecha_pago.setDate(Date.valueOf(tablalistadopago.getValueAt(fila, 7).toString()));
    }//GEN-LAST:event_tablalistadopagoMouseClicked

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
       
        if (cbotipocomprobante.getSelectedItem().equals("-seleccionar-")){
            JOptionPane.showMessageDialog(null,"Seleccione el tipo de comprobante ");
            return;
        }
            if (txtnum_comprobante.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Número de Comprobante del Pago");
            txtnum_comprobante.requestFocus();
            return;
        }
     
        if (txtiva.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el iva del Comprobante de pago a generar");
            txtiva.requestFocus();
            return;
        }
        if (txttotal_pago.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el total de pago del comprobante");
            txttotal_pago.requestFocus();
            return;
        }

    
        DPago dts = new DPago();
        CRUDPago func = new CRUDPago();

        dts.setIdreserva(Integer.parseInt(txtidreserva.getText()));

        int seleccionado = cbotipocomprobante.getSelectedIndex();
        dts.setTipo_comprobante((String) cbotipocomprobante.getItemAt(seleccionado));

        dts.setNum_comprobante(txtnum_comprobante.getText());
        dts.setIva(Double.parseDouble(txtiva.getText()));
        dts.setTotal_pago(Double.parseDouble(txttotal_pago.getText()));
        
        Calendar cal;
        int d,m,a;

        cal=dcfecha_pago.getCalendar();
        d=cal.get(Calendar.DAY_OF_MONTH);
        m=cal.get(Calendar.MONTH);
        a=cal.get(Calendar.YEAR) - 1900;

        dts.setFecha_pago( new Date (a,m,d));

        cal=dcfecha_emision.getCalendar();
        d=cal.get(Calendar.DAY_OF_MONTH);
        m=cal.get(Calendar.MONTH);
        a=cal.get(Calendar.YEAR) - 1900;

        dts.setFecha_emision(new Date (a,m,d));
        

        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, " El pago por $. " + txttotal_pago.getText() +
                    " del Sr. " + txtUsuario.getText() + " Ha sido realizado con Éxito");
                mostrar(idreserva);
                inhabilitar();

                //Desocupar la Habitación
                CRUDHabitacion func2 = new CRUDHabitacion();
                DHabitacion dts2 = new DHabitacion();

                dts2.setIdhabitacion(Integer.parseInt(txtidhabitacion.getText()));
                func2.desocupar(dts2);

                //Cancelar o pagar la reserva

                CRUDReserva func3 = new CRUDReserva();
                DReserva dts3 = new DReserva();

                dts3.setIdreserva(Integer.parseInt(txtidreserva.getText()));
                func3.pagar(dts3);

            }

        }
        else if (accion.equals("editar")){
            dts.setIdpago(Integer.parseInt(txtidpago.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El pago del Sr. " +
                    txtUsuario.getText() + " Ha sido Modificado Correctamente");
                mostrar(idreserva);
                inhabilitar();
            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        habilitar();
        btnguardar.setText("Guardar");
        accion="guardar";
        
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnimprimircomprobante;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cbotipocomprobante;
    private com.toedter.calendar.JDateChooser dcfecha_emision;
    private com.toedter.calendar.JDateChooser dcfecha_pago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblconsumo1;
    private javax.swing.JLabel lbltotalconsumo;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JTable tablalistadoconsumo;
    private javax.swing.JTable tablalistadoconsumo1;
    private javax.swing.JTable tablalistadopago;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txthabitacion;
    private javax.swing.JTextField txtidhabitacion;
    private javax.swing.JTextField txtidpago;
    private javax.swing.JTextField txtidreserva;
    private javax.swing.JTextField txtiva;
    private javax.swing.JTextField txtnum_comprobante;
    private javax.swing.JTextField txttotal_pago;
    private javax.swing.JTextField txttotalreserva;
    // End of variables declaration//GEN-END:variables
}
