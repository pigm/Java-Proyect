import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
//@author Pablo
public class EditorDeUsuario extends javax.swing.JFrame {
    
    
    Cliente cliente;
    
    public EditorDeUsuario() {
        initComponents();
        opcionEditora(false);
        Toolkit t =  Toolkit.getDefaultToolkit();
        setIconImage(t.getImage(getClass().getResource("/Iconos/icono_principalAPP.png")));
    }
     private void opcionEditora(boolean value) {
        txt_direccion.setEnabled(value);
        
        cbo_pais.setEnabled(value);
        cbo_estado.setEnabled(value);
    }

    private void resetTxt() {
        txt_rutEdi.setText("");
        txt_guionRutEdi.setText("");
        txt_direccion.setText("");
        cbo_pais.setSelectedIndex(0);
        cbo_estado.setSelectedIndex(0);
        opcionEditora(false);
        bloqueoRut(true);
        
    }
    private void bloqueoRut(boolean value){
        txt_rutEdi.setEnabled(value);
        txt_guionRutEdi.setEnabled(value);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_separadorDeTexto1 = new javax.swing.JLabel();
        lbl_ingrese_rut = new javax.swing.JLabel();
        lbl_separadorDeTexto2 = new javax.swing.JLabel();
        txt_rutEdi = new javax.swing.JTextField();
        lbl_guion = new javax.swing.JLabel();
        txt_guionRutEdi = new javax.swing.JTextField();
        lbl_intro = new javax.swing.JLabel();
        btn_buscarParaEditarUsuario = new javax.swing.JButton();
        lbl_separadorDeTexto3 = new javax.swing.JLabel();
        lbl_direccion = new javax.swing.JLabel();
        lbl_nacionalidad = new javax.swing.JLabel();
        lbl_estado = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        cbo_estado = new javax.swing.JComboBox();
        lbl_separadorDeTexto4 = new javax.swing.JLabel();
        lbl_intro1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txa_impresorDeDatosEditados = new javax.swing.JTextArea();
        lbl_separadorDeTexto5 = new javax.swing.JLabel();
        btn_editar = new javax.swing.JButton();
        lbl_mostrarEdicion = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        cbo_pais = new javax.swing.JComboBox();

        setTitle("Editor de Usuario");

        jPanel1.setBackground(new java.awt.Color(239, 49, 68));
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulo.setFont(new java.awt.Font("sansserif", 2, 24)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(51, 51, 51));
        lbl_titulo.setText("Editar Cliente..");
        jPanel1.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 234, 35));

        lbl_separadorDeTexto1.setForeground(new java.awt.Color(51, 51, 51));
        lbl_separadorDeTexto1.setText("------------------------------------------------------------------------------------------------------");
        jPanel1.add(lbl_separadorDeTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 410, -1));

        lbl_ingrese_rut.setText("Ingrese Rut:");
        jPanel1.add(lbl_ingrese_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 70, 25));

        lbl_separadorDeTexto2.setForeground(new java.awt.Color(51, 51, 51));
        lbl_separadorDeTexto2.setText("------------------------------------------------------------------------------------------------------");
        jPanel1.add(lbl_separadorDeTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 410, -1));

        txt_rutEdi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_rutEdiFocusGained(evt);
            }
        });
        txt_rutEdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rutEdiActionPerformed(evt);
            }
        });
        txt_rutEdi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_rutEdiKeyReleased(evt);
            }
        });
        jPanel1.add(txt_rutEdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 123, -1));

        lbl_guion.setText("-");
        jPanel1.add(lbl_guion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, 30));

        txt_guionRutEdi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_guionRutEdiFocusGained(evt);
            }
        });
        txt_guionRutEdi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_guionRutEdiKeyReleased(evt);
            }
        });
        jPanel1.add(txt_guionRutEdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 23, -1));

        lbl_intro.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lbl_intro.setText("Seleccione nuevas opciones:");
        jPanel1.add(lbl_intro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 40));

        btn_buscarParaEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icono_buscar.png"))); // NOI18N
        btn_buscarParaEditarUsuario.setText("Buscar");
        btn_buscarParaEditarUsuario.setContentAreaFilled(false);
        btn_buscarParaEditarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_buscarParaEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarParaEditarUsuarioActionPerformed(evt);
            }
        });
        btn_buscarParaEditarUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btn_buscarParaEditarUsuarioKeyReleased(evt);
            }
        });
        jPanel1.add(btn_buscarParaEditarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, 30));

        lbl_separadorDeTexto3.setForeground(new java.awt.Color(51, 51, 51));
        lbl_separadorDeTexto3.setText("-------------------------------------------------------------------------------------------------------");
        jPanel1.add(lbl_separadorDeTexto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 420, -1));

        lbl_direccion.setText("Direccion:");
        jPanel1.add(lbl_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 72, 22));

        lbl_nacionalidad.setText("Pais:");
        jPanel1.add(lbl_nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 24));

        lbl_estado.setText("Estado Civil:");
        jPanel1.add(lbl_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 72, 22));

        txt_direccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_direccionFocusGained(evt);
            }
        });
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 170, -1));

        cbo_estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona Estado", "Soltero", "Casado", "Viudo", "Divorsiado" }));
        cbo_estado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbo_estadoFocusGained(evt);
            }
        });
        cbo_estado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbo_estadoKeyReleased(evt);
            }
        });
        jPanel1.add(cbo_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 150, -1));

        lbl_separadorDeTexto4.setForeground(new java.awt.Color(51, 51, 51));
        lbl_separadorDeTexto4.setText("-------------------------------------------------------------------------------------------------------");
        jPanel1.add(lbl_separadorDeTexto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 420, -1));

        lbl_intro1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lbl_intro1.setText("Para editar un cliente, debes ingresar el rut y  presionar buscar.");
        jPanel1.add(lbl_intro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 50));

        txa_impresorDeDatosEditados.setEditable(false);
        txa_impresorDeDatosEditados.setColumns(20);
        txa_impresorDeDatosEditados.setRows(5);
        txa_impresorDeDatosEditados.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txa_impresorDeDatosEditadosFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(txa_impresorDeDatosEditados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 370, 160));

        lbl_separadorDeTexto5.setForeground(new java.awt.Color(51, 51, 51));
        lbl_separadorDeTexto5.setText("-------------------------------------------------------------------------------------------------------");
        jPanel1.add(lbl_separadorDeTexto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 420, -1));

        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/iconoEditorDeClientes.png"))); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.setContentAreaFilled(false);
        btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        btn_editar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btn_editarKeyReleased(evt);
            }
        });
        jPanel1.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 110, 40));

        lbl_mostrarEdicion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(lbl_mostrarEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 410, 30));

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icono exit.png"))); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.setContentAreaFilled(false);
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        btn_salir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btn_salirKeyReleased(evt);
            }
        });
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 110, 40));

        cbo_pais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona Pais", "Afganistán ", "Albania ", "Alemania ", "Andorra ", "Angola ", "Antigua y Barbuda ", "Antillas Holandesas ", "Arabia Saudí ", "Argelia ", "Argentina ", "Armenia ", "Aruba ", "Australia ", "Austria ", "Azerbaiyán ", "Bahamas ", "Bahrein ", "Bangladesh ", "Barbados ", "Bélgica ", "Belice ", "Benín ", "Bermudas ", "Bielorrusia ", "Bolivia ", "Botswana ", "Bosnia ", "Brasil ", "Brunei ", "Bulgaria ", "Burkina Faso ", "Burundi ", "Bután ", "Cabo Verde ", "Camboya ", "Camerún ", "Canadá ", "Chad ", "Chile ", "China ", "Chipre ", "Colombia ", "Comoras ", "Congo ", "Corea del Norte ", "Corea del Sur ", "Costa de Marfil ", "Costa Rica ", "Croacia ", "Cuba ", "Dinamarca ", "Dominica ", "Dubai ", "Ecuador ", "Egipto ", "El Salvador ", "Emiratos Árabes Unidos ", "Eritrea ", "Eslovaquia ", "Eslovenia ", "España ", "Estados Unidos de América ", "Estonia ", "Etiopía ", "Fiyi ", "Filipinas ", "Finlandia ", "Francia ", "Gabón ", "Gambia ", "Georgia ", "Ghana ", "Grecia ", "Guam ", "Guatemala ", "Guayana Francesa ", "Guinea-Bissau ", "Guinea Ecuatorial ", "Guinea ", "Guyana ", "Granada  ", "Haití ", "Honduras ", "Hong Kong ", "Hungría ", "Holanda ", "India ", "Indonesia ", "Irak ", "Irán ", "Irlanda ", "Islandia ", "Islas Caimán ", "Islas Marshall ", "Islas Pitcairn ", "Islas Salomón ", "Israel ", "Italia ", "Jamaica ", "Japón ", "Jordania ", "Kazajstán ", "Kenia ", "Kirguistán ", "Kiribati ", "Kósovo ", "Kuwait ", "Laos ", "Lesotho ", "Letonia ", "Líbano ", "Liberia ", "Libia ", "Liechtenstein ", "Lituania ", "Luxemburgo ", "Macedonia ", "Madagascar ", "Malasia ", "Malawi ", "Maldivas ", "Malí ", "Malta ", "Marianas del Norte ", "Marruecos ", "Mauricio ", "Mauritania ", "México ", "Micronesia ", "Mónaco ", "Moldavia ", "Mongolia ", "Montenegro ", "Mozambique ", "Myanmar (antes Birmania) ", "Namibia ", "Nauru ", "Nepal ", "Nicaragua ", "Níger ", "Nigeria ", "Noruega ", "Nueva Zelanda ", "Omán ", "Orden de Malta ", "Países Bajos ", "Pakistán ", "Palestina ", "Palau ", "Panamá ", "Papúa Nueva Guinea ", "Paraguay ", "Perú ", "Polonia ", "Portugal ", "Puerto Rico ", "Qatar ", "Reino Unido ", "República Centroafricana ", "República Checa ", "República del Congo ", "República Democrática del Congo (antiguo Zaire) ", "República Dominicana ", "Ruanda ", "Rumania ", "Rusia ", "Sáhara Occidental ", "Saint Kitts-Nevis ", "Samoa Americana ", "Samoa ", "San Marino ", "Santa Lucía (país) ", "Santo Tomé y Príncipe ", "San Vicente y las Granadinas ", "Senegal ", "Serbia ", "Seychelles ", "Sierra Leona ", "Singapur ", "Siria ", "Somalia ", "Sri Lanka (antes Ceilán) ", "Sudáfrica ", "Sudán ", "Suecia ", "Suiza ", "Suazilandia ", "Tailandia ", "Taiwán o Formosa (República Nacionalista China) ", "Tanzania ", "Tayikistán ", "Tíbet (actualmente bajo soberanía China) ", "Timor Oriental (antiguamente ocupado por Indonesia) ", "Togo ", "Tonga ", "Trinidad y Tobago ", "Túnez ", "Turkmenistán ", "Turquía ", "Tuvalu ", "Ucrania ", "Uganda ", "Uruguay ", "Uzbequistán ", "Vanuatu ", "Vaticano ", "Venezuela ", "Vietnam ", "Wallis y Futuna ", "Yemen ", "Yibuti ", "Zambia ", "Zaire ", "Zimbabue" }));
        jPanel1.add(cbo_pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_rutEdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rutEdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rutEdiActionPerformed

    private void btn_buscarParaEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarParaEditarUsuarioActionPerformed
        
        cliente = RegistroClientes.buscarPersona(txt_rutEdi.getText(), txt_guionRutEdi.getText());
        if (cliente != null) {
            opcionEditora(true);  
            bloqueoRut(false);
            txt_direccion.setText(cliente.getDireccion());
            cbo_pais.setSelectedItem(cliente.getPais());
            cbo_estado.setSelectedItem(cliente.getEstadoCivil());
        } else {
            resetTxt();
        }
    }//GEN-LAST:event_btn_buscarParaEditarUsuarioActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed

        try {
           
            txt_rutEdi.setText(cliente.getRut());
            txt_guionRutEdi.setText(cliente.getGuionRut());
            cliente.setDireccion(txt_direccion.getText());
            cliente.setPais(cbo_pais.getSelectedItem().toString());
            cliente.setEstadoCivil(cbo_estado.getSelectedItem().toString());
            if (RegistroClientes.editarCliente(cliente)) {
                txa_impresorDeDatosEditados.append(RegistroClientes.buscarXRut(txt_rutEdi.getText(), txt_guionRutEdi.getText()));
                lbl_mostrarEdicion.setText("Cliente fue Editado exitosamente. ");
            }
            else {
                lbl_mostrarEdicion.setText("Se ha producido un error en la edicion. ");
                
            }
            resetTxt();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane,"ERROR"+ex.getMessage());
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void txt_rutEdiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_rutEdiFocusGained
        txa_impresorDeDatosEditados.setText("");
        lbl_mostrarEdicion.setText("");
    }//GEN-LAST:event_txt_rutEdiFocusGained

    private void txt_guionRutEdiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_guionRutEdiFocusGained
        txa_impresorDeDatosEditados.setText("");
        lbl_mostrarEdicion.setText("");
    }//GEN-LAST:event_txt_guionRutEdiFocusGained

    private void txt_direccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_direccionFocusGained
        txa_impresorDeDatosEditados.setText("");
        lbl_mostrarEdicion.setText("");
    }//GEN-LAST:event_txt_direccionFocusGained

    private void cbo_estadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbo_estadoFocusGained
        txa_impresorDeDatosEditados.setText("");
        lbl_mostrarEdicion.setText("");
    }//GEN-LAST:event_cbo_estadoFocusGained

    private void txa_impresorDeDatosEditadosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txa_impresorDeDatosEditadosFocusGained
        txa_impresorDeDatosEditados.setText("");
        lbl_mostrarEdicion.setText("");
    }//GEN-LAST:event_txa_impresorDeDatosEditadosFocusGained

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
        txa_impresorDeDatosEditados.setText("");
        lbl_mostrarEdicion.setText("");
    }//GEN-LAST:event_jPanel1FocusGained

    private void txt_rutEdiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rutEdiKeyReleased
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           btn_buscarParaEditarUsuario.doClick();
        }
    }//GEN-LAST:event_txt_rutEdiKeyReleased

    private void txt_guionRutEdiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_guionRutEdiKeyReleased
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           btn_buscarParaEditarUsuario.doClick();
        }
    }//GEN-LAST:event_txt_guionRutEdiKeyReleased

    private void btn_buscarParaEditarUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_buscarParaEditarUsuarioKeyReleased
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           btn_buscarParaEditarUsuario.doClick();
        }
    }//GEN-LAST:event_btn_buscarParaEditarUsuarioKeyReleased

    private void btn_editarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_editarKeyReleased
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           btn_editar.doClick();
        }
    }//GEN-LAST:event_btn_editarKeyReleased

    private void cbo_estadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbo_estadoKeyReleased
  
    }//GEN-LAST:event_cbo_estadoKeyReleased

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_salirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_salirKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           btn_salir.doClick();
        }
    }//GEN-LAST:event_btn_salirKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarParaEditarUsuario;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox cbo_estado;
    private javax.swing.JComboBox cbo_pais;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_estado;
    private javax.swing.JLabel lbl_guion;
    private javax.swing.JLabel lbl_ingrese_rut;
    private javax.swing.JLabel lbl_intro;
    private javax.swing.JLabel lbl_intro1;
    private javax.swing.JLabel lbl_mostrarEdicion;
    private javax.swing.JLabel lbl_nacionalidad;
    private javax.swing.JLabel lbl_separadorDeTexto1;
    private javax.swing.JLabel lbl_separadorDeTexto2;
    private javax.swing.JLabel lbl_separadorDeTexto3;
    private javax.swing.JLabel lbl_separadorDeTexto4;
    private javax.swing.JLabel lbl_separadorDeTexto5;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTextArea txa_impresorDeDatosEditados;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_guionRutEdi;
    private javax.swing.JTextField txt_rutEdi;
    // End of variables declaration//GEN-END:variables
}
