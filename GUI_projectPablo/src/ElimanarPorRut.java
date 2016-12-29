//@author Pablo 
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
public class ElimanarPorRut extends javax.swing.JFrame {
    
    public ElimanarPorRut() {
        initComponents();
        Toolkit t =  Toolkit.getDefaultToolkit();
        setIconImage(t.getImage(getClass().getResource("/Iconos/icono_principalAPP.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_ingrese_rut = new javax.swing.JLabel();
        txt_rutEli = new javax.swing.JTextField();
        lbl_guion = new javax.swing.JLabel();
        txt_guionRutEli = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_impresorDeCliente = new javax.swing.JTextArea();
        btn_eliminar = new javax.swing.JButton();
        lbl_separadorDeTexto = new javax.swing.JLabel();
        lbl_separadorDeBoton = new javax.swing.JLabel();
        lbl_intro = new javax.swing.JLabel();
        lbl_separadorDeTexto1 = new javax.swing.JLabel();
        lbl_separadorDeBoton1 = new javax.swing.JLabel();
        lbl_mostrarClienteEliminado = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();

        setTitle("Eliminar Cliente");

        jPanel1.setBackground(new java.awt.Color(239, 49, 67));
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulo.setFont(new java.awt.Font("sansserif", 2, 24)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(51, 51, 51));
        lbl_titulo.setText("Eliminar Cliente..");
        jPanel1.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 234, 35));

        lbl_ingrese_rut.setForeground(new java.awt.Color(0, 0, 0));
        lbl_ingrese_rut.setText("Ingrese Rut:");
        jPanel1.add(lbl_ingrese_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 70, 25));

        txt_rutEli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_rutEliFocusGained(evt);
            }
        });
        txt_rutEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rutEliActionPerformed(evt);
            }
        });
        txt_rutEli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_rutEliKeyReleased(evt);
            }
        });
        jPanel1.add(txt_rutEli, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 123, -1));

        lbl_guion.setText("-");
        jPanel1.add(lbl_guion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, 30));

        txt_guionRutEli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_guionRutEliFocusGained(evt);
            }
        });
        txt_guionRutEli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_guionRutEliKeyReleased(evt);
            }
        });
        jPanel1.add(txt_guionRutEli, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 23, -1));

        btn_buscar.setBackground(new java.awt.Color(102, 204, 255));
        btn_buscar.setForeground(new java.awt.Color(0, 0, 0));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icono_buscar.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setContentAreaFilled(false);
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        btn_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btn_buscarKeyReleased(evt);
            }
        });
        jPanel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 110, 50));

        txt_impresorDeCliente.setEditable(false);
        txt_impresorDeCliente.setColumns(20);
        txt_impresorDeCliente.setRows(5);
        txt_impresorDeCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_impresorDeClienteFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(txt_impresorDeCliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 380, 140));

        btn_eliminar.setBackground(new java.awt.Color(102, 204, 255));
        btn_eliminar.setForeground(new java.awt.Color(0, 0, 0));
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/iconoBorrar.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setContentAreaFilled(false);
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        btn_eliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btn_eliminarKeyReleased(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 140, 60));

        lbl_separadorDeTexto.setForeground(new java.awt.Color(0, 0, 0));
        lbl_separadorDeTexto.setText("----------------------------------------------------------------------------------------------");
        jPanel1.add(lbl_separadorDeTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 380, -1));

        lbl_separadorDeBoton.setForeground(new java.awt.Color(0, 0, 0));
        lbl_separadorDeBoton.setText("----------------------------------------------------------------------------------------------");
        jPanel1.add(lbl_separadorDeBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 380, 20));

        lbl_intro.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lbl_intro.setForeground(new java.awt.Color(0, 0, 0));
        lbl_intro.setText("Para eliminar un cliente, debes ingresar el rut y buscar");
        jPanel1.add(lbl_intro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 370, 20));

        lbl_separadorDeTexto1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_separadorDeTexto1.setText("----------------------------------------------------------------------------------------------");
        jPanel1.add(lbl_separadorDeTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 380, -1));

        lbl_separadorDeBoton1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_separadorDeBoton1.setText("----------------------------------------------------------------------------------------------");
        jPanel1.add(lbl_separadorDeBoton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 380, 20));

        lbl_mostrarClienteEliminado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(lbl_mostrarClienteEliminado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 350, 30));

        btn_salir.setBackground(new java.awt.Color(102, 204, 255));
        btn_salir.setForeground(new java.awt.Color(0, 0, 0));
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icono exit.png"))); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.setContentAreaFilled(false);
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_rutEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rutEliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rutEliActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
       txt_impresorDeCliente.append( RegistroClientes.buscarXRut(txt_rutEli.getText(), txt_guionRutEli.getText()));
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        if (RegistroClientes.eliminar(txt_rutEli.getText(), txt_guionRutEli.getText())) {
            lbl_mostrarClienteEliminado.setText("Cliente fue eliminado exitosamente. ");
        } else {
            lbl_mostrarClienteEliminado.setText("Cliente no Existente. ");
        }
        
        txt_impresorDeCliente.setText("");
        txt_rutEli.setText("");
        txt_guionRutEli.setText("");
        
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void txt_rutEliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_rutEliFocusGained
        lbl_mostrarClienteEliminado.setText("");
    }//GEN-LAST:event_txt_rutEliFocusGained

    private void txt_guionRutEliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_guionRutEliFocusGained
        lbl_mostrarClienteEliminado.setText("");
    }//GEN-LAST:event_txt_guionRutEliFocusGained

    private void txt_impresorDeClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_impresorDeClienteFocusGained
        lbl_mostrarClienteEliminado.setText("");
    }//GEN-LAST:event_txt_impresorDeClienteFocusGained

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
        lbl_mostrarClienteEliminado.setText("");
    }//GEN-LAST:event_jPanel1FocusGained

    private void txt_rutEliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rutEliKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           btn_buscar.doClick();
        }
    }//GEN-LAST:event_txt_rutEliKeyReleased

    private void txt_guionRutEliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_guionRutEliKeyReleased
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           btn_buscar.doClick();
        }
    }//GEN-LAST:event_txt_guionRutEliKeyReleased

    private void btn_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_buscarKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           btn_buscar.doClick();
        }
    }//GEN-LAST:event_btn_buscarKeyReleased

    private void btn_eliminarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_eliminarKeyReleased
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           btn_eliminar.doClick();
        }
    }//GEN-LAST:event_btn_eliminarKeyReleased

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_guion;
    private javax.swing.JLabel lbl_ingrese_rut;
    private javax.swing.JLabel lbl_intro;
    private javax.swing.JLabel lbl_mostrarClienteEliminado;
    private javax.swing.JLabel lbl_separadorDeBoton;
    private javax.swing.JLabel lbl_separadorDeBoton1;
    private javax.swing.JLabel lbl_separadorDeTexto;
    private javax.swing.JLabel lbl_separadorDeTexto1;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTextField txt_guionRutEli;
    private javax.swing.JTextArea txt_impresorDeCliente;
    private javax.swing.JTextField txt_rutEli;
    // End of variables declaration//GEN-END:variables
}
