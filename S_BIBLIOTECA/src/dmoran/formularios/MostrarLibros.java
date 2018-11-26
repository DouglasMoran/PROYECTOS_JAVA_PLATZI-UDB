
package dmoran.formularios;


import coneccion.Conexcion_Consulta;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class MostrarLibros extends javax.swing.JInternalFrame {

    public MostrarLibros() {
        Conexcion_Consulta.conectar();
        initComponents();
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("LIBRO_ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("NUM_PAGE");
        modelo.addColumn("ISBN");
        modelo.addColumn("FECHA_PUBLIC");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("AUTOR");
        modelo.addColumn("CATEGORIA");
        //modelo.setColumnIdentifiers(new Object[]{"libro_id", "NOMBRE","NUMPAGE","ISBN","FECHAPUBLIC","EDITORIAL","AUTOR","CATEGORIA"});
        
        ArrayList<Object[]> listaLibros = new ArrayList<Object[]>();
        listaLibros = Conexcion_Consulta.llenarTablaRegistros();
        for (int i = 0; i < listaLibros.size(); i++) {
            modelo.addRow(listaLibros.get(i));
        }
        registrosLibros.setModel(modelo);
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        registrosLibros = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setText("Vista, registro de libros ingresados");

        registrosLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(registrosLibros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable registrosLibros;
    // End of variables declaration//GEN-END:variables
}
