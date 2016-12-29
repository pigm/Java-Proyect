
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.io.File;
import javax.swing.JFileChooser;
import java.io.FileOutputStream;

public class Lista extends javax.swing.JFrame {
  
    public Lista() {
        initComponents();   
        Toolkit t =  Toolkit.getDefaultToolkit();
        setIconImage(t.getImage(getClass().getResource("/Iconos/icono_principalAPP.png")));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_impresor_lista = new javax.swing.JTextArea();
        btn_clear = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();
        lbl_contadorDeClienetes = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_separadorDeVentana1 = new javax.swing.JLabel();
        lbl_separadorDeVentana2 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        lbl_separadorDeVentana3 = new javax.swing.JLabel();
        lbl_separadorDeVentana4 = new javax.swing.JLabel();
        btn_ir = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        txt_ir = new javax.swing.JTextField();

        setTitle("Mostrar Clientes");

        jPanel1.setBackground(new java.awt.Color(239, 49, 68));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulo.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(0, 0, 0));
        lbl_titulo.setText("Lista de Datos del Clientes...");
        jPanel1.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 347, 38));

        txt_impresor_lista.setEditable(false);
        txt_impresor_lista.setColumns(20);
        txt_impresor_lista.setRows(5);
        jScrollPane1.setViewportView(txt_impresor_lista);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 370, 310));

        btn_clear.setBackground(new java.awt.Color(153, 255, 153));
        btn_clear.setForeground(new java.awt.Color(0, 0, 0));
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icono_vaciarDatos.png"))); // NOI18N
        btn_clear.setText("Vaciar");
        btn_clear.setContentAreaFilled(false);
        btn_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        btn_clear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btn_clearKeyReleased(evt);
            }
        });
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, 100, 30));

        btn_imprimir.setBackground(new java.awt.Color(153, 255, 153));
        btn_imprimir.setForeground(new java.awt.Color(0, 0, 0));
        btn_imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icono_buscar.png"))); // NOI18N
        btn_imprimir.setText("Buscar");
        btn_imprimir.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153)));
        btn_imprimir.setBorderPainted(false);
        btn_imprimir.setContentAreaFilled(false);
        btn_imprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_imprimir.setFocusPainted(false);
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });
        btn_imprimir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_imprimirKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btn_imprimirKeyReleased(evt);
            }
        });
        jPanel1.add(btn_imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 80, 50));

        lbl_contadorDeClienetes.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lbl_contadorDeClienetes.setForeground(new java.awt.Color(0, 0, 0));
        lbl_contadorDeClienetes.setText("La cantidad de Clientes Ingresados es: 0.");
        jPanel1.add(lbl_contadorDeClienetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 380, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ingresar una letra dentro del campo y presionar el boton Buscar.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 470, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Buscar Clientes:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, 50));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Para actualizar la lista,  debes presionar  el boton vaciar y luego");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 480, 50));

        lbl_separadorDeVentana1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_separadorDeVentana1.setText("---------------------------------------------------------------------------------------------------------------------------");
        jPanel1.add(lbl_separadorDeVentana1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 500, 20));

        lbl_separadorDeVentana2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_separadorDeVentana2.setText("------------------------------------------------------------------------------------------------------------------");
        jPanel1.add(lbl_separadorDeVentana2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 460, 20));

        btn_salir.setBackground(new java.awt.Color(153, 255, 153));
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
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, 90, 30));

        lbl_separadorDeVentana3.setForeground(new java.awt.Color(0, 0, 0));
        lbl_separadorDeVentana3.setText("---------------------------------------------------------------------------------------------------------------------------");
        jPanel1.add(lbl_separadorDeVentana3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 500, 20));

        lbl_separadorDeVentana4.setForeground(new java.awt.Color(0, 0, 0));
        lbl_separadorDeVentana4.setText("------------------------------------------------------------------------------------------------------------------");
        jPanel1.add(lbl_separadorDeVentana4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 460, 20));

        btn_ir.setForeground(new java.awt.Color(0, 0, 0));
        btn_ir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icono ir.png"))); // NOI18N
        btn_ir.setText("Ir");
        btn_ir.setContentAreaFilled(false);
        btn_ir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_irActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 60, 30));

        btn_guardar.setForeground(new java.awt.Color(0, 0, 0));
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icono guardado.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.setContentAreaFilled(false);
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, 50));

        txt_ir.setEditable(false);
        jPanel1.add(txt_ir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_impresor_lista.setText("");
        txt_ir.setText("");
        
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
        try {
          txt_impresor_lista.append(RegistroClientes.listarPersonas()+"");
          lbl_contadorDeClienetes.setText("La cantidad de clientes Ingresados es: "+RegistroClientes.cantidadDePersonas());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "ERROR"+ex.getMessage());
        }
    }//GEN-LAST:event_btn_imprimirActionPerformed

    private void btn_imprimirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_imprimirKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_imprimirKeyPressed

    private void btn_imprimirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_imprimirKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           btn_imprimir.doClick();
        }
    }//GEN-LAST:event_btn_imprimirKeyReleased

    private void btn_clearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_clearKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           btn_clear.doClick();
        }
    }//GEN-LAST:event_btn_clearKeyReleased

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_irActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_irActionPerformed
        JFileChooser dlg = new JFileChooser();
        int option = dlg.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
            String f1 = f.toString();
            
            txt_ir.setText(f1);
        }
        
    }//GEN-LAST:event_btn_irActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        String d = txt_ir.getText();
        String text = txt_impresor_lista.getText();
        try {
            FileOutputStream archivo = new FileOutputStream(d+".pdf");
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            doc.add(new Paragraph(text));
            doc.close();
            JOptionPane.showMessageDialog(rootPane, "Archivo guardado exitosamente.");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error"+e.getMessage());
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_ir;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_contadorDeClienetes;
    private javax.swing.JLabel lbl_separadorDeVentana1;
    private javax.swing.JLabel lbl_separadorDeVentana2;
    private javax.swing.JLabel lbl_separadorDeVentana3;
    private javax.swing.JLabel lbl_separadorDeVentana4;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTextArea txt_impresor_lista;
    private javax.swing.JTextField txt_ir;
    // End of variables declaration//GEN-END:variables
}
