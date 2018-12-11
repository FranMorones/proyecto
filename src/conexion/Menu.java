
package conexion;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        Cargar("");
        bloqueartodos();
        setLocationRelativeTo(null);
        setTitle("Menu");
    }
    void actulizacion(){
        try {
            int fila=Tablisha.getSelectedRow();
            String jer=(Tablisha.getValueAt(fila, 0)).toString().toUpperCase();
            String uno=(Tablisha.getValueAt(fila, 1)).toString().toUpperCase();
            String dos=(Tablisha.getValueAt(fila, 2)).toString().toUpperCase();
            String tres=(Tablisha.getValueAt(fila, 3)).toString().toUpperCase();
            String cuatro=(Tablisha.getValueAt(fila, 4)).toString().toUpperCase();
            String cinco=(Tablisha.getValueAt(fila, 5)).toString().toUpperCase();
            String seis=(Tablisha.getValueAt(fila, 6)).toString().toUpperCase();
            String siete=(Tablisha.getValueAt(fila, 7)).toString().toUpperCase();
            String ocho=(Tablisha.getValueAt(fila, 8)).toString().toUpperCase();
            PreparedStatement pst= cn.prepareStatement("UPDATE reservacion SET Nombre='"+uno+"',Apellido_paterno='"+dos+"',Apellido_Materno='"+tres+"',Telefono='"+cuatro+"',Correo_Electronico='"+cinco+"',Tipo_Evento='"+seis+"',Fecha_Reservacion='"+siete+"',Anticipo='"+ocho+"' WHERE No='"+jer+"'");
            pst.executeUpdate();
            Cargar("");
        } catch (Exception e) {
        }
        
    }
    void bloqueartodos(){
        todos.setEnabled(false);
    }
    void desbloqueartodos(){
        todos.setEnabled(true);
        buscar.setEnabled(false);
        coso.setEnabled(false);
        buscadorsisho.setEnabled(false);
    }
    void desbloquearlosdemas(){
        buscar.setEnabled(true);
        coso.setEnabled(true);
        buscadorsisho.setEnabled(true);
        todos.setEnabled(false);
    }
void Cargar(String valor) {
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("Cod_Cliente");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo Electronico");
        modelo.addColumn("Tipo De Evento");
        modelo.addColumn("Fecha De Reservacion");
        modelo.addColumn("Anticipo");
        Tablisha.setModel(modelo);
        String sql="";
        String busqueda=coso.getSelectedItem().toString();
        if(valor.equals("")){
            sql="SELECT * FROM reservacion";
        }
        else if(busqueda.equals("Nombre")){
        sql="SELECT * FROM reservacion WHERE Nombre='"+valor+"'";
        }
        else if(busqueda.equals("Apellido Paterno")){
            sql="SELECT * FROM reservacion WHERE Apellido_Paterno='"+valor+"'";
        }
        else if(busqueda.equals("Apellido Materno")){
            sql="SELECT * FROM reservacion WHERE Apellido_Materno='"+valor+"'";
        }
        else if(busqueda.equals("Telefono")){
            sql="SELECT * FROM reservacion WHERE Telefono='"+valor+"'";
        }
        else if(busqueda.equals("Correo Electronico")){
            sql="SELECT * FROM reservacion WHERE Correo_Electronico='"+valor+"'";
        }
        else if(busqueda.equals("Tipo De Evento")){
            sql="SELECT * FROM reservacion WHERE Tipo_Evento='"+valor+"'";
        }
        else if(busqueda.equals("Fecha De Evento")){
            sql="SELECT * FROM reservacion WHERE Fecha_Evento='"+valor+"'";
        }
        else if(busqueda.equals("Anticipo")){
            sql="SELECT * FROM reservacion WHERE Anticipo='"+valor+"'";
        }
        
        String []datos=new String [9];
        try {
            Statement st= cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
               datos[0]=rs.getString(1);
               datos[1]=rs.getString(2);
               datos[2]=rs.getString(3);
               datos[3]=rs.getString(4);
               datos[4]=rs.getString(5);
               datos[5]=rs.getString(6);
               datos[6]=rs.getString(7);
               datos[7]=rs.getString(8);
               datos[8]=rs.getString(9);
               modelo.addRow(datos);
            }
            Tablisha.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(ingreso_datos_clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Eliminar = new javax.swing.JMenuItem();
        actualizar = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tablisha = new javax.swing.JTable();
        buscadorsisho = new javax.swing.JTextField();
        todos = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        coso = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Eliminar);

        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(actualizar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tablisha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tablisha.setComponentPopupMenu(jPopupMenu1);
        Tablisha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TablishaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(Tablisha);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 820, 310));

        buscadorsisho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorsishoActionPerformed(evt);
            }
        });
        getContentPane().add(buscadorsisho, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 430, 30));

        todos.setText("Mostrar Todos");
        todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosActionPerformed(evt);
            }
        });
        getContentPane().add(todos, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 130, 30));

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 40, 30));

        coso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Apellido Paterno", "Apellido Materno", "Telefono", "Correo Electronico", "Tipo De Evento", "Fecha De Evento", "Anticipo" }));
        getContentPane().add(coso, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 180, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tumblr_ma68cl3Res1rsfj3fo1_400.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 360, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tumblr_ma68cl3Res1rsfj3fo1_400.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 360, 60));

        jMenu2.setText("Archivo");

        jMenuItem1.setText("Nuevo");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem3.setText("Actualizar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);
        jMenu2.add(jSeparator1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
  Inicio obj=new Inicio();
obj.setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
  ingreso_datos_clientes obj=new ingreso_datos_clientes(); 
obj.setVisible(true);
dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        Cargar(buscadorsisho.getText());
        buscadorsisho.setText(null);
        desbloqueartodos();// TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosActionPerformed
        Cargar(""); 
        buscadorsisho.setText(null);
        desbloquearlosdemas();// TODO add your handling code here:
    }//GEN-LAST:event_todosActionPerformed

    private void buscadorsishoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorsishoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorsishoActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int fila=Tablisha.getSelectedRow();
        String cod="";
        cod=Tablisha.getValueAt(fila, 0).toString();
        try{
            PreparedStatement pst=cn.prepareStatement("DELETE FROM reservacion WHERE No='"+cod+"'");
            
            int n=pst.executeUpdate();
            if (n>0){
                dispose();
                JOptionPane.showMessageDialog(null,"Registro Eliminado");
                Menu obj=new Menu();
                obj.setVisible(true);
        dispose();
            }
            Cargar("");
        }catch (Exception e){

        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
actulizacion();
        Menu obj= new Menu();
obj.setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
actulizacion();
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarActionPerformed

    private void TablishaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablishaKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
    try {
            int fila=Tablisha.getSelectedRow();
            String jer=(Tablisha.getValueAt(fila, 0)).toString().toUpperCase();
            String uno=(Tablisha.getValueAt(fila, 1)).toString().toUpperCase();
            String dos=(Tablisha.getValueAt(fila, 2)).toString().toUpperCase();
            String tres=(Tablisha.getValueAt(fila, 3)).toString().toUpperCase();
            String cuatro=(Tablisha.getValueAt(fila, 4)).toString().toUpperCase();
            String cinco=(Tablisha.getValueAt(fila, 5)).toString().toUpperCase();
            String seis=(Tablisha.getValueAt(fila, 6)).toString().toUpperCase();
            String siete=(Tablisha.getValueAt(fila, 7)).toString().toUpperCase();
            String ocho=(Tablisha.getValueAt(fila, 8)).toString().toUpperCase();
            PreparedStatement pst= cn.prepareStatement("UPDATE reservacion SET Nombre='"+uno+"',Apellido_paterno='"+dos+"',Apellido_Materno='"+tres+"',Telefono='"+cuatro+"',Correo_Electronico='"+cinco+"',Tipo_Evento='"+seis+"',Fecha_Reservacion='"+siete+"',Anticipo='"+ocho+"' WHERE No='"+jer+"'");
            pst.executeUpdate();
            Cargar("");
        } catch (Exception e) {
        }
}        // TODO add your handling code here:
    }//GEN-LAST:event_TablishaKeyPressed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JTable Tablisha;
    private javax.swing.JMenuItem actualizar;
    private javax.swing.JTextField buscadorsisho;
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox coso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton todos;
    // End of variables declaration//GEN-END:variables
conectar cc=new conectar();
    Connection cn=cc.conexion();
}

