/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import gestion.*;
import javax.swing.JOptionPane;
import modelo.Articulos;

/**
 *
 * @author Juan Carlos
 */
public class VentanaUI extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public VentanaUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        insertarBt = new javax.swing.JButton();
        modificarBt = new javax.swing.JButton();
        borrarBt = new javax.swing.JButton();
        buscarBt = new javax.swing.JButton();
        codigoLb = new javax.swing.JLabel();
        nombreLb = new javax.swing.JLabel();
        cantidadLb = new javax.swing.JLabel();
        descripcionLb = new javax.swing.JLabel();
        codigoTf = new javax.swing.JTextField();
        nombreTf = new javax.swing.JTextField();
        descripcionTf = new javax.swing.JTextField();
        cantidadTf = new javax.swing.JTextField();
        mensajeLb = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        salirBt = new javax.swing.JButton();
        mostrarBt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mensajeTa = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(228, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        insertarBt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        insertarBt.setText("INSERTAR");
        insertarBt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        insertarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarBtActionPerformed(evt);
            }
        });

        modificarBt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        modificarBt.setText("MODIFICAR");
        modificarBt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        modificarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBtActionPerformed(evt);
            }
        });

        borrarBt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        borrarBt.setText("BORRAR");
        borrarBt.setToolTipText("");
        borrarBt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        borrarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBtActionPerformed(evt);
            }
        });

        buscarBt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        buscarBt.setText("BUSCAR");
        buscarBt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtActionPerformed(evt);
            }
        });

        codigoLb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        codigoLb.setText("Código");

        nombreLb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombreLb.setText("Nombre");

        cantidadLb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cantidadLb.setText("Cantidad");

        descripcionLb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        descripcionLb.setText("Descripción");

        mensajeLb.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        mensajeLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(insertarBt, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(borrarBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modificarBt, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(buscarBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensajeLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(descripcionTf, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                            .addComponent(cantidadTf)
                            .addComponent(nombreTf)
                            .addComponent(codigoTf)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(codigoLb))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(nombreLb))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(cantidadLb))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(descripcionLb)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(codigoLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(nombreLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreTf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(cantidadLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantidadTf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(descripcionLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descripcionTf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mensajeLb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(insertarBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificarBt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(borrarBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscarBt, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        jPanel2.setBackground(new java.awt.Color(228, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        salirBt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        salirBt.setText("SALIR");
        salirBt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salirBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtActionPerformed(evt);
            }
        });

        mostrarBt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        mostrarBt.setText("MOSTRAR");
        mostrarBt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mostrarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarBtActionPerformed(evt);
            }
        });

        mensajeTa.setColumns(20);
        mensajeTa.setRows(5);
        jScrollPane1.setViewportView(mensajeTa);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("LISTA DE ARTÍCULOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(salirBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrarBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mostrarBt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(salirBt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insertarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarBtActionPerformed
        GestorBD bd = new GestorBD();

        String msg = ControladorErrores.controlarCamposVacios(this.codigoTf.getText(), 
                this.nombreTf.getText(), this.cantidadTf.getText(), this.descripcionTf.getText());

        if (msg == null) {
            //Objeto Articulos que recoge por parámetros los textField de la ventana
            Articulos art = new Articulos(Integer.parseInt(this.codigoTf.getText()), 
                    this.nombreTf.getText(), Integer.parseInt(this.cantidadTf.getText()), this.descripcionTf.getText());

            //Se llama al método insert para insertar el articulo y el mensaje que 
            //retorna se almacena en la variable mensaje
            bd.insertar(art);

            //Reiniciamos los campos TextField
            limpiarCampos();
        } else {
            ControladorErrores.ErrorshowDialog(msg);
        }


    }//GEN-LAST:event_insertarBtActionPerformed


    private void buscarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtActionPerformed

        GestorBD bd = new GestorBD();
        String msg = ControladorErrores.controlarCampoCodigo(this.codigoTf.getText());

        if (msg == null) {
            //Se llama al metodo buscar que devuelve un objeto
            Articulos articuloEncontrado = bd.buscar(Integer.parseInt(this.codigoTf.getText()));

            //Si (articuloEncontrado no es null) entonces rellena los campos restante TextFiel del articulo
            if (articuloEncontrado != null) {
                this.mensajeLb.setText("Se ha encontrado el artículo");

                this.nombreTf.setText(articuloEncontrado.getNombre());
                this.cantidadTf.setText(Integer.toString(articuloEncontrado.getCantidad()));
                this.descripcionTf.setText(articuloEncontrado.getDescripcion());

                //Si (articuloEncontrado es null) entonces reinicia los campos TextField y envia un mensaje de error
            } else {
                limpiarCampos();
                ControladorErrores.ErrorshowDialog("Ese código de artículo no está resgistrado");
            }
        } else {
            ControladorErrores.ErrorshowDialog(msg);
            limpiarCampos();
        }


    }//GEN-LAST:event_buscarBtActionPerformed

    private void borrarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBtActionPerformed

        GestorBD bd = new GestorBD();

        String msg = ControladorErrores.controlarCampoCodigo(this.codigoTf.getText());

        if (msg == null) {
            //llamada al metodo borrar pasandole por parámetros el codigo del TextField
            bd.borrar(Integer.parseInt(this.codigoTf.getText()));

            //reiniciamos los campos TextField
            limpiarCampos();

            //Borra tambien el articulo en la lista del textArea generada con mostrar
            this.mensajeTa.setText(bd.mostrar());
        } else {
            ControladorErrores.ErrorshowDialog(msg);
            limpiarCampos();
        }

    }//GEN-LAST:event_borrarBtActionPerformed

    private void mostrarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarBtActionPerformed
        GestorBD db = new GestorBD();
        //llamamos al metodo mostrar y se almacena en mensaje
        String mensaje = db.mostrar();

        //método .append --> añade al textarea
        //MÉTODO .setText --> sobreescribe 
        this.mensajeTa.setText(mensaje);
    }//GEN-LAST:event_mostrarBtActionPerformed

    private void modificarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtActionPerformed
        GestorBD bd = new GestorBD();

        String msg = ControladorErrores.controlarCamposVacios(this.codigoTf.getText(), 
                this.nombreTf.getText(), this.cantidadTf.getText(), this.descripcionTf.getText());

        if (msg == null) {
            int codigo = Integer.parseInt(this.codigoTf.getText());
            
            //llamamos al metodo actualizar pasandole por parámetros los TextField
            bd.actualizar(codigo, this.nombreTf.getText(), 
                    Integer.parseInt(this.cantidadTf.getText()), this.descripcionTf.getText());

            //Modifica tambien el articulo en la lista del textArea generada con mostrar
            //String mensajeMostrar = bd.mostrar();
            this.mensajeTa.setText(bd.mostrar());
        } else {
            ControladorErrores.ErrorshowDialog(msg);
        }
    }//GEN-LAST:event_modificarBtActionPerformed

    private void salirBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirBtActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaUI().setVisible(true);
            }
        });

    }

    /**
     * Metodo para limpiar los campos
     */
    private void limpiarCampos() {
        this.codigoTf.setText("");
        this.nombreTf.setText("");
        this.cantidadTf.setText("");
        this.descripcionTf.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarBt;
    private javax.swing.JButton buscarBt;
    private javax.swing.JLabel cantidadLb;
    private javax.swing.JTextField cantidadTf;
    private javax.swing.JLabel codigoLb;
    private javax.swing.JTextField codigoTf;
    private javax.swing.JLabel descripcionLb;
    private javax.swing.JTextField descripcionTf;
    private javax.swing.JButton insertarBt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mensajeLb;
    private javax.swing.JTextArea mensajeTa;
    private javax.swing.JButton modificarBt;
    private javax.swing.JButton mostrarBt;
    private javax.swing.JLabel nombreLb;
    private javax.swing.JTextField nombreTf;
    private javax.swing.JButton salirBt;
    // End of variables declaration//GEN-END:variables
}
