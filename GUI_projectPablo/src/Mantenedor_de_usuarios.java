// @author Pablo
import java.awt.Toolkit;
import java.util.GregorianCalendar;

public class Mantenedor_de_usuarios extends javax.swing.JFrame {

    private Agregar agrega;
    private Lista listar;
    private ElimanarPorRut elimina;
    private EditorDeUsuario editar;

   
    public Mantenedor_de_usuarios() {
        initComponents();
        Reloj hora = new Reloj(lbl_hora);
        hora.start();
        fecha();
        agrega = new Agregar();
        listar = new Lista();
        elimina = new ElimanarPorRut();
        editar = new EditorDeUsuario();
        Toolkit t =  Toolkit.getDefaultToolkit();
        setIconImage(t.getImage(getClass().getResource("/Iconos/icono_principalAPP.png")));
    }

    @SuppressWarnings("unchecked")
    public void fecha(){
     String fecha = fechaRetornada();
     lbl_fecha.setText(fecha);
    }

    

    public String nombre(int mes) {
        switch (mes) {
            case 0:
                return "Enero";
            case 1:
                return "Febrero";
            case 2:
                return "Marzo";
            case 3:
                return "Abril";
            case 4:
                return "Mayo";
            case 5:
                return "Junio";
            case 6:
                return "Julio";
            case 7:
                return "Agosto";
            case 8:
                return "Septiembre";
            case 9:
                return "Octubre";
            case 10:
                return "Noviembre";
            case 11:
                return "Diciembre";

        }
        return "Error";
    }

    public String fechaRetornada() {
        GregorianCalendar fecha = new GregorianCalendar();
        int dia = fecha.get(fecha.DAY_OF_MONTH);
        int mes = fecha.get(fecha.MONTH);
        int year = fecha.get(fecha.YEAR);
        String fechaImp = String.valueOf(dia) + " de " + nombre(mes) + " de " + String.valueOf(year) + "";

        return fechaImp;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_fecha = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_hora = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_agrega = new javax.swing.JMenuItem();
        menu_eliminar = new javax.swing.JMenuItem();
        menu_listar = new javax.swing.JMenuItem();
        menu_editar = new javax.swing.JMenuItem();
        Menu_salir = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setTitle("Mantenedor de Usuarios");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 81, 9));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icono_portada..jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 220, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icono_portada.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 270, 250));

        jLabel3.setFont(new java.awt.Font("DilleniaUPC", 2, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Mantenedor usuarios!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 310, 70));

        lbl_fecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_fecha.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lbl_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 230, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_hora.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_hora.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(lbl_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 100, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 590, 40));

        jMenuBar1.setMaximumSize(new java.awt.Dimension(100, 28000));

        jMenu1.setText("Mantenedor");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menu_agrega.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menu_agrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icono_agregar_menu.png"))); // NOI18N
        menu_agrega.setText("Agregar Cliente");
        menu_agrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_agregaActionPerformed(evt);
            }
        });
        jMenu1.add(menu_agrega);

        menu_eliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menu_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icono_papelera_menu.png"))); // NOI18N
        menu_eliminar.setText("Eliminar Cliente");
        menu_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_eliminarActionPerformed(evt);
            }
        });
        jMenu1.add(menu_eliminar);

        menu_listar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        menu_listar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icono_lista_menu.png"))); // NOI18N
        menu_listar.setText("Listar Clientes");
        menu_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_listarActionPerformed(evt);
            }
        });
        jMenu1.add(menu_listar);

        menu_editar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        menu_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icono_editar_manu.png"))); // NOI18N
        menu_editar.setText("Editar Cliente");
        menu_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_editarActionPerformed(evt);
            }
        });
        jMenu1.add(menu_editar);

        jMenuBar1.add(jMenu1);

        Menu_salir.setText("Salir");
        Menu_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icono salir.png"))); // NOI18N
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Menu_salir.add(jMenuItem1);

        jMenuBar1.add(Menu_salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menu_agregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_agregaActionPerformed
        agrega.setVisible(true);
    }//GEN-LAST:event_menu_agregaActionPerformed

    private void menu_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_listarActionPerformed
        listar.setVisible(true);
    }//GEN-LAST:event_menu_listarActionPerformed

    private void menu_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_eliminarActionPerformed
        elimina.setVisible(true);
    }//GEN-LAST:event_menu_eliminarActionPerformed

    private void menu_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_editarActionPerformed
        editar.setVisible(true);
    }//GEN-LAST:event_menu_editarActionPerformed

    
    
   /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mantenedor_de_usuarios().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_hora;
    private javax.swing.JMenuItem menu_agrega;
    private javax.swing.JMenuItem menu_editar;
    private javax.swing.JMenuItem menu_eliminar;
    private javax.swing.JMenuItem menu_listar;
    // End of variables declaration//GEN-END:variables
}
