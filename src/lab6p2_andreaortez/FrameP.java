package lab6p2_andreaortez;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FrameP extends javax.swing.JFrame {

    ArrayList<Usuario> usuarios = new ArrayList();
    int tipo;
    AdministrarU au = new AdministrarU("./usuarios.txt");

    public FrameP() throws IOException {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        au.cargarArchivo();
        pn_registrarA.setVisible(false);
        pn_registrarO.setVisible(false);

        usuarios = au.getUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Iniciar_Registrar = new javax.swing.JPanel();
        pn_iniciarsesión = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_contra = new javax.swing.JTextField();
        bt_iniciar = new javax.swing.JButton();
        tf_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pn_registrarA = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tf_nombreA = new javax.swing.JTextField();
        tf_usuarioA = new javax.swing.JTextField();
        bt_registrarA = new javax.swing.JButton();
        tf_contraA = new javax.swing.JTextField();
        tf_edadA = new javax.swing.JTextField();
        pn_registrarO = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tf_usuarioO = new javax.swing.JTextField();
        bt_registrarO = new javax.swing.JButton();
        tf_contraO = new javax.swing.JTextField();
        tf_edadO = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Iniciar_Registrar.setBackground(new java.awt.Color(32, 32, 32));
        Iniciar_Registrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_iniciarsesión.setBackground(new java.awt.Color(32, 32, 32));
        pn_iniciarsesión.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MÚSICA PARA TODOS.");
        pn_iniciarsesión.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1390, -1));

        tf_contra.setBackground(new java.awt.Color(51, 51, 51));
        tf_contra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_contra.setForeground(new java.awt.Color(153, 153, 153));
        tf_contra.setText("Contraseña");
        tf_contra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf_contraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tf_contraMouseExited(evt);
            }
        });
        pn_iniciarsesión.add(tf_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 432, 40));

        bt_iniciar.setBackground(new java.awt.Color(25, 187, 81));
        bt_iniciar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        bt_iniciar.setText("INICIAR SESIÓN");
        bt_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_iniciarMouseClicked(evt);
            }
        });
        pn_iniciarsesión.add(bt_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 160, 40));

        tf_usuario.setBackground(new java.awt.Color(51, 51, 51));
        tf_usuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_usuario.setForeground(new java.awt.Color(153, 153, 153));
        tf_usuario.setText("Ingrese su usuario");
        tf_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf_usuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tf_usuarioMouseExited(evt);
            }
        });
        pn_iniciarsesión.add(tf_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 432, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No tienes cuenta, dale click aqui para registrarte");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        pn_iniciarsesión.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, -1, -1));

        Iniciar_Registrar.add(pn_iniciarsesión, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 168, -1, 393));

        pn_registrarA.setBackground(new java.awt.Color(32, 32, 32));
        pn_registrarA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MÚSICA PARA TODOS.");
        pn_registrarA.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1390, -1));

        tf_nombreA.setBackground(new java.awt.Color(51, 51, 51));
        tf_nombreA.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_nombreA.setForeground(new java.awt.Color(153, 153, 153));
        tf_nombreA.setText("Nombre Artístico");
        tf_nombreA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf_nombreAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tf_nombreAMouseExited(evt);
            }
        });
        pn_registrarA.add(tf_nombreA, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 432, 40));

        tf_usuarioA.setBackground(new java.awt.Color(51, 51, 51));
        tf_usuarioA.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_usuarioA.setForeground(new java.awt.Color(153, 153, 153));
        tf_usuarioA.setText("Nombre de usuario");
        tf_usuarioA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf_usuarioAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tf_usuarioAMouseExited(evt);
            }
        });
        pn_registrarA.add(tf_usuarioA, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 432, 40));

        bt_registrarA.setBackground(new java.awt.Color(25, 187, 81));
        bt_registrarA.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_registrarA.setForeground(new java.awt.Color(255, 255, 255));
        bt_registrarA.setText("REGISTRARSE");
        bt_registrarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_registrarAMouseClicked(evt);
            }
        });
        pn_registrarA.add(bt_registrarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 150, 40));

        tf_contraA.setBackground(new java.awt.Color(51, 51, 51));
        tf_contraA.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_contraA.setForeground(new java.awt.Color(153, 153, 153));
        tf_contraA.setText("Contraseña");
        tf_contraA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf_contraAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tf_contraAMouseExited(evt);
            }
        });
        pn_registrarA.add(tf_contraA, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 432, 40));

        tf_edadA.setBackground(new java.awt.Color(51, 51, 51));
        tf_edadA.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_edadA.setForeground(new java.awt.Color(153, 153, 153));
        tf_edadA.setText("Edad");
        tf_edadA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf_edadAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tf_edadAMouseExited(evt);
            }
        });
        pn_registrarA.add(tf_edadA, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 432, 40));

        Iniciar_Registrar.add(pn_registrarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, 460));

        pn_registrarO.setBackground(new java.awt.Color(32, 32, 32));
        pn_registrarO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MÚSICA PARA TODOS.");
        pn_registrarO.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1390, -1));

        tf_usuarioO.setBackground(new java.awt.Color(51, 51, 51));
        tf_usuarioO.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_usuarioO.setForeground(new java.awt.Color(153, 153, 153));
        tf_usuarioO.setText("Nombre de usuario");
        tf_usuarioO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf_usuarioOMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tf_usuarioOMouseExited(evt);
            }
        });
        pn_registrarO.add(tf_usuarioO, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 432, 40));

        bt_registrarO.setBackground(new java.awt.Color(25, 187, 81));
        bt_registrarO.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_registrarO.setForeground(new java.awt.Color(255, 255, 255));
        bt_registrarO.setText("REGISTRARSE");
        bt_registrarO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_registrarOMouseClicked(evt);
            }
        });
        pn_registrarO.add(bt_registrarO, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 150, 40));

        tf_contraO.setBackground(new java.awt.Color(51, 51, 51));
        tf_contraO.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_contraO.setForeground(new java.awt.Color(153, 153, 153));
        tf_contraO.setText("Contraseña");
        tf_contraO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf_contraOMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tf_contraOMouseExited(evt);
            }
        });
        pn_registrarO.add(tf_contraO, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 432, 40));

        tf_edadO.setBackground(new java.awt.Color(51, 51, 51));
        tf_edadO.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_edadO.setForeground(new java.awt.Color(153, 153, 153));
        tf_edadO.setText("Edad");
        tf_edadO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf_edadOMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tf_edadOMouseExited(evt);
            }
        });
        pn_registrarO.add(tf_edadO, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 432, 40));

        Iniciar_Registrar.add(pn_registrarO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Iniciar_Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Iniciar_Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_contraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_contraMouseEntered
        if ("Contraseña".equals(tf_contra.getText())) {
            tf_contra.setText("");
        }
    }//GEN-LAST:event_tf_contraMouseEntered

    private void tf_contraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_contraMouseExited
        if (tf_contra.getText().isEmpty()) {
            tf_contra.setText("Contraseña");
        }
    }//GEN-LAST:event_tf_contraMouseExited

    private void tf_usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_usuarioMouseEntered
        if ("Ingrese su usuario".equals(tf_usuario.getText())) {
            tf_usuario.setText("");
        }
    }//GEN-LAST:event_tf_usuarioMouseEntered

    private void tf_usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_usuarioMouseExited
        if (tf_usuario.getText().isEmpty()) {
            tf_usuario.setText("Ingrese su usuario");
        }
    }//GEN-LAST:event_tf_usuarioMouseExited

    private void tf_nombreAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_nombreAMouseEntered
        if ("Nombre Artístico".equals(tf_nombreA.getText())) {
            tf_nombreA.setText("");
        }
    }//GEN-LAST:event_tf_nombreAMouseEntered

    private void tf_nombreAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_nombreAMouseExited
        if (tf_nombreA.getText().isEmpty()) {
            tf_nombreA.setText("Nombre Artístico");
        }
    }//GEN-LAST:event_tf_nombreAMouseExited

    private void tf_usuarioAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_usuarioAMouseEntered
        if ("Nombre de usuario".equals(tf_usuarioA.getText())) {
            tf_usuarioA.setText("");
        }
    }//GEN-LAST:event_tf_usuarioAMouseEntered

    private void tf_usuarioAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_usuarioAMouseExited
        if (tf_usuarioA.getText().isEmpty()) {
            tf_usuarioA.setText("Nombre de usuario");
        }
    }//GEN-LAST:event_tf_usuarioAMouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        pn_iniciarsesión.setVisible(false);
        int op = Integer.parseInt(JOptionPane.showInputDialog("1-> Artista\n2-> Oyente\nIngrese opción:"));
        if (op == 1) {
            pn_registrarA.setVisible(true);
        } else if (op == 2) {
            pn_registrarO.setVisible(true);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void bt_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_iniciarMouseClicked
        if (ValidarUsuario(tf_usuario.getText(), tf_contra.getText())) {
            switch (tipo) {
                case 1://artista
                    Iniciar_Registrar.setVisible(false);
                    //                    Registro.setVisible(true);
                    //                    Portal.setVisible(false);
                    //                    Canvas.setVisible(false);
                    break;
                case 2://oyente
                    Iniciar_Registrar.setVisible(false);
                    //                    Registro.setVisible(false);
                    //                    Portal.setVisible(true);
                    //                    Canvas.setVisible(false);
                    break;
            }
        }
    }//GEN-LAST:event_bt_iniciarMouseClicked

    private void tf_contraAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_contraAMouseEntered
        if ("Contraseña".equals(tf_contraA.getText())) {
            tf_contraA.setText("");
        }
    }//GEN-LAST:event_tf_contraAMouseEntered

    private void tf_contraAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_contraAMouseExited
        if (tf_contraA.getText().isEmpty()) {
            tf_contraA.setText("Contraseña");
        }
    }//GEN-LAST:event_tf_contraAMouseExited

    private void tf_edadAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_edadAMouseEntered
        if ("Edad".equals(tf_edadA.getText())) {
            tf_edadA.setText("");
        }
    }//GEN-LAST:event_tf_edadAMouseEntered

    private void tf_edadAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_edadAMouseExited
        if (tf_edadA.getText().isEmpty()) {
            tf_edadA.setText("Edad");
        }
    }//GEN-LAST:event_tf_edadAMouseExited

    private void bt_registrarAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registrarAMouseClicked
        Artista a = new Artista(tf_nombreA.toString(), tf_usuarioA.toString(), tf_contraA.toString(), Integer.parseInt(tf_edadA.toString()));
        au.getUsuarios().add(a);
        try {
            au.escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(FrameP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_registrarAMouseClicked

    private void tf_usuarioOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_usuarioOMouseEntered
        if ("Nombre de usuario".equals(tf_usuarioO.getText())) {
            tf_usuarioO.setText("");
        }
    }//GEN-LAST:event_tf_usuarioOMouseEntered

    private void tf_usuarioOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_usuarioOMouseExited
        if (tf_usuarioO.getText().isEmpty()) {
            tf_usuarioO.setText("Nombre de usuario");
        }
    }//GEN-LAST:event_tf_usuarioOMouseExited

    private void bt_registrarOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registrarOMouseClicked
        Oyente o = new Oyente(tf_usuarioA.toString(), tf_contraA.toString(), Integer.parseInt(tf_edadA.toString()));
        au.getUsuarios().add(o);
        try {
            au.escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(FrameP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_registrarOMouseClicked

    private void tf_contraOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_contraOMouseEntered
        if ("Contraseña".equals(tf_contraO.getText())) {
            tf_contraO.setText("");
        }
    }//GEN-LAST:event_tf_contraOMouseEntered

    private void tf_contraOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_contraOMouseExited
        if (tf_contraO.getText().isEmpty()) {
            tf_contraO.setText("Contraseña");
        }
    }//GEN-LAST:event_tf_contraOMouseExited

    private void tf_edadOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_edadOMouseEntered
        if ("Edad".equals(tf_edadO.getText())) {
            tf_edadO.setText("");
        }
    }//GEN-LAST:event_tf_edadOMouseEntered

    private void tf_edadOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_edadOMouseExited
        if (tf_edadO.getText().isEmpty()) {
            tf_edadO.setText("Edad");
        }
    }//GEN-LAST:event_tf_edadOMouseExited

    private boolean ValidarUsuario(String admin, String contra) {
        for (Usuario u : usuarios) {
            if (u.getUser().equals(admin) && u.getContra().equals(contra)) {
                if (u instanceof Artista) {
                    tipo = 1;
                } else if (u instanceof Oyente) {
                    tipo = 2;
                }
                return true;
            }
        }
        return false;
    }

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
            java.util.logging.Logger.getLogger(FrameP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrameP().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(FrameP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Iniciar_Registrar;
    private javax.swing.JButton bt_iniciar;
    private javax.swing.JButton bt_registrarA;
    private javax.swing.JButton bt_registrarO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel pn_iniciarsesión;
    private javax.swing.JPanel pn_registrarA;
    private javax.swing.JPanel pn_registrarO;
    private javax.swing.JTextField tf_contra;
    private javax.swing.JTextField tf_contraA;
    private javax.swing.JTextField tf_contraO;
    private javax.swing.JTextField tf_edadA;
    private javax.swing.JTextField tf_edadO;
    private javax.swing.JTextField tf_nombreA;
    private javax.swing.JTextField tf_usuario;
    private javax.swing.JTextField tf_usuarioA;
    private javax.swing.JTextField tf_usuarioO;
    // End of variables declaration//GEN-END:variables
}
