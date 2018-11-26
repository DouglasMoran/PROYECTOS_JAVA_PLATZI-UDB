
package dmoran.clasemain.menuprincipal;

import dmoran.formularios.BuscarLibros;
import dmoran.formularios.InsertarLibros;
import dmoran.formularios.MostrarLibros;

public class BibliotecaMenu extends javax.swing.JFrame {

    public BibliotecaMenu() {
        initComponents();
        setLocationRelativeTo(null);
        //setResizable(false);
        setTitle("BIBLIOTECA");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnGUARDAR = new javax.swing.JButton();
        btnMOSTRAR = new javax.swing.JButton();
        btnBUSCAR = new javax.swing.JButton();
        btnELIMINAR = new javax.swing.JButton();
        btnCERRAR = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(38, 14, 4));
        jLabel1.setText("IBLIOTECA");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs-icon/fondo.png"))); // NOI18N

        btnGUARDAR.setIcon(new javax.swing.ImageIcon("/home/douglas-moran/Documentos/POO/S_BIBLIOTECA/src/imgs-icon/m_guardar.png")); // NOI18N
        btnGUARDAR.setBorder(null);
        btnGUARDAR.setBorderPainted(false);
        btnGUARDAR.setContentAreaFilled(false);
        btnGUARDAR.setFocusPainted(false);
        btnGUARDAR.setPressedIcon(new javax.swing.ImageIcon("/home/douglas-moran/Documentos/POO/S_BIBLIOTECA/src/imgs-icon/mp_guardar.png")); // NOI18N
        btnGUARDAR.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs-icon/mr_guardar.png"))); // NOI18N
        btnGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGUARDARActionPerformed(evt);
            }
        });

        btnMOSTRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs-icon/m_mostrar.png"))); // NOI18N
        btnMOSTRAR.setBorder(null);
        btnMOSTRAR.setBorderPainted(false);
        btnMOSTRAR.setContentAreaFilled(false);
        btnMOSTRAR.setPressedIcon(new javax.swing.ImageIcon("/home/douglas-moran/Documentos/POO/S_BIBLIOTECA/src/imgs-icon/mp_mostrar.png")); // NOI18N
        btnMOSTRAR.setRolloverIcon(new javax.swing.ImageIcon("/home/douglas-moran/Documentos/POO/S_BIBLIOTECA/src/imgs-icon/mr_mostrar.png")); // NOI18N
        btnMOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMOSTRARActionPerformed(evt);
            }
        });

        btnBUSCAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs-icon/m_buscar.png"))); // NOI18N
        btnBUSCAR.setBorder(null);
        btnBUSCAR.setBorderPainted(false);
        btnBUSCAR.setContentAreaFilled(false);
        btnBUSCAR.setFocusPainted(false);
        btnBUSCAR.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs-icon/mp_buscar.png"))); // NOI18N
        btnBUSCAR.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs-icon/mr_buscar.png"))); // NOI18N
        btnBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBUSCARActionPerformed(evt);
            }
        });

        btnELIMINAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs-icon/m_elimimar.png"))); // NOI18N
        btnELIMINAR.setBorder(null);
        btnELIMINAR.setBorderPainted(false);
        btnELIMINAR.setContentAreaFilled(false);
        btnELIMINAR.setFocusPainted(false);
        btnELIMINAR.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs-icon/mp_eliminar.png"))); // NOI18N
        btnELIMINAR.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs-icon/mr_eliminar.png"))); // NOI18N
        btnELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnELIMINARActionPerformed(evt);
            }
        });

        btnCERRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs-icon/m_cerrar.png"))); // NOI18N
        btnCERRAR.setBorder(null);
        btnCERRAR.setBorderPainted(false);
        btnCERRAR.setContentAreaFilled(false);
        btnCERRAR.setFocusPainted(false);
        btnCERRAR.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs-icon/mp_cerrar.png"))); // NOI18N
        btnCERRAR.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs-icon/mr_cerrar.png"))); // NOI18N
        btnCERRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCERRARActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs-icon/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(172, 172, 172))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCERRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMOSTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMOSTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCERRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        desktopPane.add(jPanel1);
        jPanel1.setBounds(0, 0, 690, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGUARDARActionPerformed
        // TODO add your handling code here:
        InsertarLibros r_libro = new InsertarLibros();
        desktopPane.add(r_libro);
        r_libro.show();
    }//GEN-LAST:event_btnGUARDARActionPerformed

    private void btnMOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMOSTRARActionPerformed
        // TODO add your handling code here:
        MostrarLibros m_libros = new MostrarLibros();
        desktopPane.add(m_libros);
        m_libros.show();
    }//GEN-LAST:event_btnMOSTRARActionPerformed

    private void btnBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBUSCARActionPerformed
        // TODO add your handling code here:
        BuscarLibros cb_libros = new BuscarLibros();
        desktopPane.add(cb_libros);
        cb_libros.show();
    }//GEN-LAST:event_btnBUSCARActionPerformed

    private void btnELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnELIMINARActionPerformed
        // TODO add your handling code here:
        BuscarLibros cb_libros = new BuscarLibros();
        desktopPane.add(cb_libros);
        cb_libros.show();
    }//GEN-LAST:event_btnELIMINARActionPerformed

    private void btnCERRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCERRARActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCERRARActionPerformed

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
            java.util.logging.Logger.getLogger(BibliotecaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BibliotecaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BibliotecaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BibliotecaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BibliotecaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBUSCAR;
    private javax.swing.JButton btnCERRAR;
    private javax.swing.JButton btnELIMINAR;
    private javax.swing.JButton btnGUARDAR;
    private javax.swing.JButton btnMOSTRAR;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
