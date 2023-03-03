package lab6p2_andreaortez;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FrameP extends javax.swing.JFrame {

    ArrayList<Usuario> usuarios = new ArrayList();
    int tipo;

    public FrameP() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Iniciar_Registrar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_contra = new javax.swing.JTextField();
        bt_iniciar = new javax.swing.JButton();
        tf_usuario = new javax.swing.JTextField();
        bt_registrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Iniciar_Registrar.setBackground(new java.awt.Color(32, 32, 32));

        jPanel1.setBackground(new java.awt.Color(32, 32, 32));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MÚSICA PARA TODOS.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1390, -1));

        tf_contra.setBackground(new java.awt.Color(51, 51, 51));
        tf_contra.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
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
        jPanel1.add(tf_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 432, 29));

        bt_iniciar.setBackground(new java.awt.Color(25, 187, 81));
        bt_iniciar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        bt_iniciar.setText("INICIAR SESIÓN");
        bt_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_iniciarMouseClicked(evt);
            }
        });
        jPanel1.add(bt_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 160, 40));

        tf_usuario.setBackground(new java.awt.Color(51, 51, 51));
        tf_usuario.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
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
        jPanel1.add(tf_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 432, 29));

        bt_registrar.setBackground(new java.awt.Color(25, 187, 81));
        bt_registrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_registrar.setForeground(new java.awt.Color(255, 255, 255));
        bt_registrar.setText("REGISTRARSE");
        jPanel1.add(bt_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 150, 40));

        javax.swing.GroupLayout Iniciar_RegistrarLayout = new javax.swing.GroupLayout(Iniciar_Registrar);
        Iniciar_Registrar.setLayout(Iniciar_RegistrarLayout);
        Iniciar_RegistrarLayout.setHorizontalGroup(
            Iniciar_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Iniciar_RegistrarLayout.setVerticalGroup(
            Iniciar_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Iniciar_RegistrarLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

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

    private void bt_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_iniciarMouseClicked
        if (ValidarUsuario(tf_usuario.getText(), tf_contra.getText())) {
            switch (tipo) {
                case 1://registro
                    Iniciar_Registrar.setVisible(false);
//                    Registro.setVisible(true);
//                    Portal.setVisible(false);
//                    Canvas.setVisible(false);
                    break;
                case 2://maestro
                    Iniciar_Registrar.setVisible(false);
//                    Registro.setVisible(false);
//                    Portal.setVisible(true);
//                    Canvas.setVisible(false);
                    break;
            }
        }
    }//GEN-LAST:event_bt_iniciarMouseClicked

    private boolean ValidarUsuario(String admin, String contra) {
        for (Usuario u : usuarios) {
            if (u.getUser().equals(admin) && u.getContra().equals(contra)) {
                if (u instanceof Artista) {
                    tipo = 1;
                } else if (u instanceof Cliente) {
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
                new FrameP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Iniciar_Registrar;
    private javax.swing.JButton bt_iniciar;
    private javax.swing.JButton bt_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf_contra;
    private javax.swing.JTextField tf_usuario;
    // End of variables declaration//GEN-END:variables
}
