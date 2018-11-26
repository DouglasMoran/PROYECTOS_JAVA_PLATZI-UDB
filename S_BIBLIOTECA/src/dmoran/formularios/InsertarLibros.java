
package dmoran.formularios;

import coneccion.Conexcion_Consulta;
import dmoran.clasesvo.CategoriaVO;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
   

public class InsertarLibros extends javax.swing.JInternalFrame {
    //CONECCIÓN CON DB
    public static final String URL = "jdbc:mysql://localhost:3306/biblioteca?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; //Direccion, puerto y nombre de la Base de Datos
    public static final String USERNAME = "root"; //Usuario de Acceso a MySQL
    public static final String PASSWORD = "kodigo2018"; //Password del usuario
    
    PreparedStatement ps;
    ResultSet rs;
    
    public static Connection getConection() {
        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
    //:::**************************************************:::
    
    public InsertarLibros() {
        CategoriaVO categoria = new CategoriaVO();
        Conexcion_Consulta.conectar();
        initComponents();
        //cbxCategorias.removeAllItems();
        ArrayList<CategoriaVO> listaCategorias = new ArrayList<CategoriaVO>();
        listaCategorias = Conexcion_Consulta.llenarComoListaCategorias();
        DefaultComboBoxModel modelo= new DefaultComboBoxModel();
        cbxCategorias.setModel(modelo);
        for(CategoriaVO cat: listaCategorias){
            modelo.addElement(cat);
        }
        
        
        //System.out.println(listaCategorias.size());
//        for(int i = 0; i<listaCategorias.size();i++){
//            cbxCategorias.addItem(listaCategorias.get(i));
//        }
        //cbxCategorias.addItem(listaCategorias.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroPag = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFechaPublic = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnguardar_r = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cbxCategorias = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setForeground(new java.awt.Color(0, 120, 215));
        setIconifiable(true);
        setMaximizable(true);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("NOMBRE:");

        txtNombre.setBackground(java.awt.SystemColor.scrollbar);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("CANTIDAD DE PÁGINAS:");

        txtNumeroPag.setBackground(java.awt.SystemColor.scrollbar);
        txtNumeroPag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroPagKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setText("ISBN:");

        txtIsbn.setBackground(java.awt.SystemColor.scrollbar);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setText("FECHA PUBLICACIÓN:");

        txtFechaPublic.setBackground(java.awt.SystemColor.scrollbar);

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setText("EDITORIAL:");

        txtEditorial.setBackground(java.awt.SystemColor.scrollbar);
        txtEditorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditorialKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setText("CATEGORIA:");

        jLabel8.setText("Registro de libro:");

        btnguardar_r.setIcon(new javax.swing.ImageIcon("/home/douglas-moran/Documentos/POO/S_BIBLIOTECA/src/imgs-icon/f_guardar.png")); // NOI18N
        btnguardar_r.setBorder(null);
        btnguardar_r.setBorderPainted(false);
        btnguardar_r.setContentAreaFilled(false);
        btnguardar_r.setFocusPainted(false);
        btnguardar_r.setPressedIcon(new javax.swing.ImageIcon("/home/douglas-moran/Documentos/POO/S_BIBLIOTECA/src/imgs-icon/fp_guardar.png")); // NOI18N
        btnguardar_r.setRolloverIcon(new javax.swing.ImageIcon("/home/douglas-moran/Documentos/POO/S_BIBLIOTECA/src/imgs-icon/fr_guardar.png")); // NOI18N
        btnguardar_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardar_rActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon("/home/douglas-moran/Documentos/POO/S_BIBLIOTECA/src/imgs-icon/f_limpiar.png")); // NOI18N
        btnLimpiar.setBorder(null);
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setFocusPainted(false);
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon("/home/douglas-moran/Documentos/POO/S_BIBLIOTECA/src/imgs-icon/fp_limpiar.png")); // NOI18N
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon("/home/douglas-moran/Documentos/POO/S_BIBLIOTECA/src/imgs-icon/fr_limpiar.png")); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        cbxCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cbxCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriasActionPerformed(evt);
            }
        });

        jLabel1.setText("AUTOR:");

        txtAutor.setBackground(new java.awt.Color(200, 200, 200));
        txtAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAutorKeyTyped(evt);
            }
        });

        jLabel9.setText("ingrese en formato: \"YYYY-MM-DD\"");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnguardar_r, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtIsbn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                .addComponent(txtNumeroPag, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFechaPublic, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEditorial, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbxCategorias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAutor)))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFechaPublic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbxCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnguardar_r, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnguardar_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar_rActionPerformed
        // TODO add your handling code here:
         Connection con = null;
        try{
            
            con = getConection();
            
            CategoriaVO categoriaSeleccionada= (CategoriaVO) cbxCategorias.getSelectedItem();
            
            int idcate = categoriaSeleccionada.getCategorias_id();
            
            ps = con.prepareStatement("INSERT INTO libros (nombre,numPag,isbn,fechaPublicacion,editorial,n_autor,categoria_id) VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, txtNombre.getText());
            ps.setString(2, txtNumeroPag.getText());
            ps.setString(3, txtIsbn.getText());
            ps.setString(4, txtFechaPublic.getText());
            ps.setString(5, txtEditorial.getText());
            ps.setString(6, txtAutor.getText());
            ps.setInt(7, idcate);
            
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Libro registrado exitosamente!");
                //limpiarCajas();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al Guardar Libro");
                 //limpiarCajas();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnguardar_rActionPerformed

    private void cbxCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriasActionPerformed
       CategoriaVO categorie = new CategoriaVO();
       int id = categorie.getCategorias_id();
       
    }//GEN-LAST:event_cbxCategoriasActionPerformed

    public void limpiarCajas(){
        txtNombre.setText(null);
        txtNumeroPag.setText(null);
        txtIsbn.setText(null);
        txtFechaPublic.setText(null);
        txtEditorial.setText(null);
        txtAutor.setText(null);
    }
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarCajas();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
            char c; 
            c=evt.getKeyChar(); 
            if(!(c<'0'||c>'9'))
                JOptionPane.showMessageDialog(null,"No puede ingresar numeros!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
            evt.consume(); 
         
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNumeroPagKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroPagKeyTyped
        // TODO add your handling code here:
        int k=(int)evt.getKeyChar();
        if (k >= 97 && k <= 122 || k>=65 && k<=90){
        evt.setKeyChar((char)KeyEvent.VK_CLEAR);
        JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
        if(k==241 || k==209){
        evt.setKeyChar((char)KeyEvent.VK_CLEAR);
        JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
        if(k==10){
        txtNumeroPag.transferFocus();
        }
        
    }//GEN-LAST:event_txtNumeroPagKeyTyped

    private void txtEditorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditorialKeyTyped
        // TODO add your handling code here:
        char c; 
            c=evt.getKeyChar(); 
            if(!(c<'0'||c>'9'))
                JOptionPane.showMessageDialog(null,"No puede ingresar numeros!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
            evt.consume();
    }//GEN-LAST:event_txtEditorialKeyTyped

    private void txtAutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorKeyTyped
        // TODO add your handling code here:
        char c; 
            c=evt.getKeyChar(); 
            if(!(c<'0'||c>'9'))
                JOptionPane.showMessageDialog(null,"No puede ingresar numeros!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
            evt.consume();
    }//GEN-LAST:event_txtAutorKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnguardar_r;
    private javax.swing.JComboBox<String> cbxCategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtFechaPublic;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroPag;
    // End of variables declaration//GEN-END:variables
}
