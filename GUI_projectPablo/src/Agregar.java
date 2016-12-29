//@author Pablo.-
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;

public class Agregar extends javax.swing.JFrame {

    public Agregar() {
        initComponents();
        txt_nombre.setDocument(new soloMinuscula());
        txt_direccion.setDocument(new soloMinuscula());
        Toolkit t =  Toolkit.getDefaultToolkit();
        setIconImage(t.getImage(getClass().getResource("/Iconos/icono_principalAPP.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group_sexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_rut = new javax.swing.JLabel();
        lbl_edad = new javax.swing.JLabel();
        lbl_estado = new javax.swing.JLabel();
        lbl_direccion = new javax.swing.JLabel();
        lbl_nacionalidad = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_rut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_guionRut = new javax.swing.JTextField();
        cbo_edad = new javax.swing.JComboBox();
        cbo_estado = new javax.swing.JComboBox();
        txt_direccion = new javax.swing.JTextField();
        btn_enviar = new javax.swing.JButton();
        opt_hombre = new javax.swing.JRadioButton();
        opt_mujer = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        lbl_separadorDeFormulario1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_separadorDeFormulario2 = new javax.swing.JLabel();
        lbl_separadorDeFormulario3 = new javax.swing.JLabel();
        lbl_MostrarClienteAgregado = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        cbo_pais = new javax.swing.JComboBox();

        setTitle("Agregar Clienete");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(239, 49, 68));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setText("Agregar Clientes..");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 273, 34));

        lbl_nombre.setText("Nombre:");
        jPanel1.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 72, 24));

        lbl_rut.setText("Rut:");
        jPanel1.add(lbl_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 44, 22));

        lbl_edad.setText("Edad:");
        jPanel1.add(lbl_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 72, 23));

        lbl_estado.setText("Estado Civil:");
        jPanel1.add(lbl_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 72, 22));

        lbl_direccion.setText("Direccion:");
        jPanel1.add(lbl_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 72, 22));

        lbl_nacionalidad.setText("Pais:");
        jPanel1.add(lbl_nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 24));

        txt_nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_nombreFocusGained(evt);
            }
        });
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nombreKeyReleased(evt);
            }
        });
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 170, -1));

        txt_rut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_rutFocusGained(evt);
            }
        });
        txt_rut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_rutKeyReleased(evt);
            }
        });
        jPanel1.add(txt_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 123, -1));

        jLabel2.setText("-");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, 30));

        txt_guionRut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_guionRutFocusGained(evt);
            }
        });
        txt_guionRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_guionRutKeyReleased(evt);
            }
        });
        jPanel1.add(txt_guionRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 23, -1));

        cbo_edad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona edad", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", " " }));
        cbo_edad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbo_edadFocusGained(evt);
            }
        });
        cbo_edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbo_edadKeyReleased(evt);
            }
        });
        jPanel1.add(cbo_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 150, -1));

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
        jPanel1.add(cbo_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 150, -1));

        txt_direccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_direccionFocusGained(evt);
            }
        });
        txt_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_direccionKeyReleased(evt);
            }
        });
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 170, -1));

        btn_enviar.setBackground(new java.awt.Color(255, 204, 0));
        btn_enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/iconoAgregarCliente.png"))); // NOI18N
        btn_enviar.setText("Agregar");
        btn_enviar.setContentAreaFilled(false);
        btn_enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });
        btn_enviar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btn_enviarKeyReleased(evt);
            }
        });
        jPanel1.add(btn_enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 110, 40));

        group_sexo.add(opt_hombre);
        opt_hombre.setSelected(true);
        opt_hombre.setText("Hombre");
        opt_hombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                opt_hombreFocusGained(evt);
            }
        });
        opt_hombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt_hombreActionPerformed(evt);
            }
        });
        opt_hombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                opt_hombreKeyReleased(evt);
            }
        });
        jPanel1.add(opt_hombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, 30));

        group_sexo.add(opt_mujer);
        opt_mujer.setText("Mujer");
        opt_mujer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                opt_mujerFocusGained(evt);
            }
        });
        opt_mujer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                opt_mujerKeyReleased(evt);
            }
        });
        jPanel1.add(opt_mujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 61, 30));

        jLabel3.setText("Sexo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 68, 30));

        lbl_separadorDeFormulario1.setText("-----------------------------------------------------------------------------------------");
        jPanel1.add(lbl_separadorDeFormulario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 370, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel4.setText("  A continuación debes ingresar los siguientes datos. ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 102, 355, 30));

        lbl_separadorDeFormulario2.setText("-----------------------------------------------------------------------------------------");
        jPanel1.add(lbl_separadorDeFormulario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 370, -1));

        lbl_separadorDeFormulario3.setText("-----------------------------------------------------------------------------------------");
        jPanel1.add(lbl_separadorDeFormulario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 370, -1));

        lbl_MostrarClienteAgregado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(lbl_MostrarClienteAgregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 330, 30));

        btn_salir.setBackground(new java.awt.Color(255, 204, 0));
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
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 110, 40));

        cbo_pais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona Pais", "Afganistán ", "Albania ", "Alemania ", "Andorra ", "Angola ", "Antigua y Barbuda ", "Antillas Holandesas ", "Arabia Saudí ", "Argelia ", "Argentina ", "Armenia ", "Aruba ", "Australia ", "Austria ", "Azerbaiyán ", "Bahamas ", "Bahrein ", "Bangladesh ", "Barbados ", "Bélgica ", "Belice ", "Benín ", "Bermudas ", "Bielorrusia ", "Bolivia ", "Botswana ", "Bosnia ", "Brasil ", "Brunei ", "Bulgaria ", "Burkina Faso ", "Burundi ", "Bután ", "Cabo Verde ", "Camboya ", "Camerún ", "Canadá ", "Chad ", "Chile ", "China ", "Chipre ", "Colombia ", "Comoras ", "Congo ", "Corea del Norte ", "Corea del Sur ", "Costa de Marfil ", "Costa Rica ", "Croacia ", "Cuba ", "Dinamarca ", "Dominica ", "Dubai ", "Ecuador ", "Egipto ", "El Salvador ", "Emiratos Árabes Unidos ", "Eritrea ", "Eslovaquia ", "Eslovenia ", "España ", "Estados Unidos de América ", "Estonia ", "Etiopía ", "Fiyi ", "Filipinas ", "Finlandia ", "Francia ", "Gabón ", "Gambia ", "Georgia ", "Ghana ", "Grecia ", "Guam ", "Guatemala ", "Guayana Francesa ", "Guinea-Bissau ", "Guinea Ecuatorial ", "Guinea ", "Guyana ", "Granada  ", "Haití ", "Honduras ", "Hong Kong ", "Hungría ", "Holanda ", "India ", "Indonesia ", "Irak ", "Irán ", "Irlanda ", "Islandia ", "Islas Caimán ", "Islas Marshall ", "Islas Pitcairn ", "Islas Salomón ", "Israel ", "Italia ", "Jamaica ", "Japón ", "Jordania ", "Kazajstán ", "Kenia ", "Kirguistán ", "Kiribati ", "Kósovo ", "Kuwait ", "Laos ", "Lesotho ", "Letonia ", "Líbano ", "Liberia ", "Libia ", "Liechtenstein ", "Lituania ", "Luxemburgo ", "Macedonia ", "Madagascar ", "Malasia ", "Malawi ", "Maldivas ", "Malí ", "Malta ", "Marianas del Norte ", "Marruecos ", "Mauricio ", "Mauritania ", "México ", "Micronesia ", "Mónaco ", "Moldavia ", "Mongolia ", "Montenegro ", "Mozambique ", "Myanmar (antes Birmania) ", "Namibia ", "Nauru ", "Nepal ", "Nicaragua ", "Níger ", "Nigeria ", "Noruega ", "Nueva Zelanda ", "Omán ", "Orden de Malta ", "Países Bajos ", "Pakistán ", "Palestina ", "Palau ", "Panamá ", "Papúa Nueva Guinea ", "Paraguay ", "Perú ", "Polonia ", "Portugal ", "Puerto Rico ", "Qatar ", "Reino Unido ", "República Centroafricana ", "República Checa ", "República del Congo ", "República Democrática del Congo (antiguo Zaire) ", "República Dominicana ", "Ruanda ", "Rumania ", "Rusia ", "Sáhara Occidental ", "Saint Kitts-Nevis ", "Samoa Americana ", "Samoa ", "San Marino ", "Santa Lucía (país) ", "Santo Tomé y Príncipe ", "San Vicente y las Granadinas ", "Senegal ", "Serbia ", "Seychelles ", "Sierra Leona ", "Singapur ", "Siria ", "Somalia ", "Sri Lanka (antes Ceilán) ", "Sudáfrica ", "Sudán ", "Suecia ", "Suiza ", "Suazilandia ", "Tailandia ", "Taiwán o Formosa (República Nacionalista China) ", "Tanzania ", "Tayikistán ", "Tíbet (actualmente bajo soberanía China) ", "Timor Oriental (antiguamente ocupado por Indonesia) ", "Togo ", "Tonga ", "Trinidad y Tobago ", "Túnez ", "Turkmenistán ", "Turquía ", "Tuvalu ", "Ucrania ", "Uganda ", "Uruguay ", "Uzbequistán ", "Vanuatu ", "Vaticano ", "Venezuela ", "Vietnam ", "Wallis y Futuna ", "Yemen ", "Yibuti ", "Zambia ", "Zaire ", "Zimbabue" }));
        jPanel1.add(cbo_pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed

    }//GEN-LAST:event_txt_nombreActionPerformed


    
   public void soloLetras(JTextField a){
   a.addKeyListener(new KeyAdapter(){
   public void keyTyped (KeyEvent e){
       char c = e.getKeyChar();
       if (Character.isDigit(c)) {
           //getToolkit().beep();
           e.consume();
           
       }
      
   }
   });
   }
    
    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed

        try {
            String sexo = " ";
            if (opt_hombre.isSelected()) {
                sexo = opt_hombre.getText();
            } else if (opt_mujer.isSelected()) {
                sexo = opt_mujer.getText();
            } else {
                return;
            }

            Cliente cliente = new Cliente(txt_nombre.getText(), txt_rut.getText(),
            txt_guionRut.getText(),
            Integer.parseInt(cbo_edad.getSelectedItem().toString()),
            cbo_estado.getSelectedItem().toString(), txt_direccion.getText(),
            sexo, cbo_pais.getSelectedItem().toString());
            soloLetras(txt_nombre);
            soloLetras(txt_direccion);
            cliente.validacionQl();
            RegistroClientes.agregarClientes(cliente);
            txt_nombre.setText("");
            txt_rut.setText("");
            txt_guionRut.setText("");
            txt_direccion.setText("");
            cbo_pais.setSelectedIndex(0);
            cbo_edad.setSelectedIndex(0);
            cbo_estado.setSelectedIndex(0); 
            group_sexo.clearSelection();
            
            
            lbl_MostrarClienteAgregado.setText("Cliente agregado exitosamente!.");
           
            
        } catch (Exception ex) {
            
            //custom title, warning icon

            JOptionPane.showMessageDialog(rootPane, "ERROR " + ex.getMessage(),"", JOptionPane.WARNING_MESSAGE);
        }

 
    }//GEN-LAST:event_btn_enviarActionPerformed


    

    private void opt_hombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt_hombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opt_hombreActionPerformed

    private void txt_nombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nombreFocusGained
        lbl_MostrarClienteAgregado.setText("");
    }//GEN-LAST:event_txt_nombreFocusGained

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
        lbl_MostrarClienteAgregado.setText("");
    }//GEN-LAST:event_jPanel1FocusGained

    private void opt_hombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_opt_hombreFocusGained
        lbl_MostrarClienteAgregado.setText("");
    }//GEN-LAST:event_opt_hombreFocusGained

    private void opt_mujerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_opt_mujerFocusGained
        lbl_MostrarClienteAgregado.setText("");
    }//GEN-LAST:event_opt_mujerFocusGained

    private void txt_direccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_direccionFocusGained
        lbl_MostrarClienteAgregado.setText("");
    }//GEN-LAST:event_txt_direccionFocusGained

    private void cbo_estadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbo_estadoFocusGained
        lbl_MostrarClienteAgregado.setText("");
    }//GEN-LAST:event_cbo_estadoFocusGained

    private void cbo_edadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbo_edadFocusGained
        lbl_MostrarClienteAgregado.setText("");
    }//GEN-LAST:event_cbo_edadFocusGained

    private void txt_guionRutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_guionRutFocusGained
        lbl_MostrarClienteAgregado.setText("");
    }//GEN-LAST:event_txt_guionRutFocusGained

    private void txt_rutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_rutFocusGained
        lbl_MostrarClienteAgregado.setText("");
    }//GEN-LAST:event_txt_rutFocusGained

    private void txt_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_enviar.doClick();
        }
    }//GEN-LAST:event_txt_nombreKeyReleased

    private void txt_rutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rutKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_enviar.doClick();
        }
    }//GEN-LAST:event_txt_rutKeyReleased

    private void txt_guionRutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_guionRutKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_enviar.doClick();
        }
    }//GEN-LAST:event_txt_guionRutKeyReleased

    private void cbo_edadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbo_edadKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_enviar.doClick();
        }
        
    }//GEN-LAST:event_cbo_edadKeyReleased

    private void cbo_estadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbo_estadoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_enviar.doClick();
        }
    }//GEN-LAST:event_cbo_estadoKeyReleased

    private void txt_direccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_direccionKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_enviar.doClick();
        }
    }//GEN-LAST:event_txt_direccionKeyReleased

    private void opt_hombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_opt_hombreKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_enviar.doClick();
        }
    }//GEN-LAST:event_opt_hombreKeyReleased

    private void opt_mujerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_opt_mujerKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_enviar.doClick();
        }
    }//GEN-LAST:event_opt_mujerKeyReleased

    private void btn_enviarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_enviarKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_enviar.doClick();
        }
    }//GEN-LAST:event_btn_enviarKeyReleased

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_salirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_salirKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_salir.doClick();
        }
    }//GEN-LAST:event_btn_salirKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enviar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox cbo_edad;
    private javax.swing.JComboBox cbo_estado;
    private javax.swing.JComboBox cbo_pais;
    private javax.swing.ButtonGroup group_sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_MostrarClienteAgregado;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_edad;
    private javax.swing.JLabel lbl_estado;
    private javax.swing.JLabel lbl_nacionalidad;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_rut;
    private javax.swing.JLabel lbl_separadorDeFormulario1;
    private javax.swing.JLabel lbl_separadorDeFormulario2;
    private javax.swing.JLabel lbl_separadorDeFormulario3;
    private javax.swing.JRadioButton opt_hombre;
    private javax.swing.JRadioButton opt_mujer;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_guionRut;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_rut;
    // End of variables declaration//GEN-END:variables
}
