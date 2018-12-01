package conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ingreso_datos_clientes extends javax.swing.JFrame {

    public ingreso_datos_clientes() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Altas");
        limpiar();
        bloquear();
        Limitar();

    }
    public void Limitar(){
        T_TEL.setDocument(new LimitarCaracter(T_TEL,10));
    }
    void limpiar(){
        T_NOM.setText(null);
        T_APP.setText(null);
        T_APM.setText(null);
        T_TEL.setText(null);
        T_COR.setText(null);
        T_ANT.setText(null);
    }
    void bloquear(){
        T_NOM.setEnabled(false);
        T_APP.setEnabled(false);
        T_APM.setEnabled(false);
        T_TEL.setEnabled(false);
        T_COR.setEnabled(false);
        T_TIEVENT.setEnabled(false);
        DIA.setEnabled(false);
        MES.setEnabled(false);
        ANO.setEnabled(false);
        T_ANT.setEnabled(false);
        GUARDAR.setEnabled(false);
        CANCELAR.setEnabled(false);
        FECH.setEnabled(false);
    }
    void desbloquar(){
        T_NOM.setEnabled(true);
        T_APP.setEnabled(true);
        T_APM.setEnabled(true);
        T_TEL.setEnabled(true);
        T_COR.setEnabled(true);
        T_TIEVENT.setEnabled(true);
        DIA.setEnabled(true);
        MES.setEnabled(true);
        ANO.setEnabled(true);
        T_ANT.setEnabled(true);
        GUARDAR.setEnabled(true);
        CANCELAR.setEnabled(true);
        FECH.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Eliminar = new javax.swing.JMenuItem();
        jLabel6 = new javax.swing.JLabel();
        T_NOM = new javax.swing.JTextField();
        T_TEL = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        T_ANT = new javax.swing.JTextField();
        T_COR = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        GUARDAR = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        DIA = new javax.swing.JComboBox();
        MES = new javax.swing.JComboBox();
        ANO = new javax.swing.JComboBox();
        FECH = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        T_TIEVENT = new javax.swing.JComboBox();
        T_APM = new javax.swing.JTextField();
        T_APP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        CANCELAR = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Anticipo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 315, 90, 22));

        T_NOM.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        T_NOM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                T_NOMKeyTyped(evt);
            }
        });
        getContentPane().add(T_NOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 11, 200, 30));

        T_TEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_TELActionPerformed(evt);
            }
        });
        T_TEL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                T_TELKeyTyped(evt);
            }
        });
        getContentPane().add(T_TEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 134, 200, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 17, 90, 15));

        T_ANT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                T_ANTKeyTyped(evt);
            }
        });
        getContentPane().add(T_ANT, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 313, 200, 30));
        getContentPane().add(T_COR, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 175, 200, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Telefono");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 136, 90, 22));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Correo Electronico");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 177, 140, 22));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fecha");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 266, 90, 22));

        GUARDAR.setText("Guardar");
        GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDARActionPerformed(evt);
            }
        });
        getContentPane().add(GUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 371, 83, -1));

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 371, -1, -1));

        DIA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 ", "11 ", "12 ", "13 ", "14 ", "15 ", "16 ", "17 ", "18 ", "19 ", "20 ", "21 ", "22 ", "23 ", "24 ", "25 ", "26 ", "27 ", "28 ", "29 ", "30 ", "31 " }));
        getContentPane().add(DIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 269, -1, -1));

        MES.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));
        getContentPane().add(MES, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 269, -1, -1));

        ANO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        getContentPane().add(ANO, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        FECH.setForeground(new java.awt.Color(255, 255, 255));
        FECH.setText("    DIA                  MES                         AÑO");
        getContentPane().add(FECH, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 245, 229, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo de Evento");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 216, 119, 22));

        T_TIEVENT.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XV AÑOS", "BODA", "CUMPLEAÑOS", "EVENTOS INFANTILES", "FIESTAS DE EGRASADOS", "FIESTAS BENEFICAS", "ANIVERSARIOS", "BAUTIZO", "PRIMERA COMUNION", "CONFIRMACION" }));
        getContentPane().add(T_TIEVENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 219, 200, -1));

        T_APM.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        T_APM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_APMActionPerformed(evt);
            }
        });
        T_APM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                T_APMKeyTyped(evt);
            }
        });
        getContentPane().add(T_APM, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 93, 200, 30));

        T_APP.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        T_APP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                T_APPKeyTyped(evt);
            }
        });
        getContentPane().add(T_APP, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 52, 200, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido Paterno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 58, -1, 15));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Apellido Materno");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 99, 126, 15));

        jButton2.setText("Nuevo");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 371, -1, -1));

        CANCELAR.setText("Cancelar");
        CANCELAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CANCELARMouseClicked(evt);
            }
        });
        getContentPane().add(CANCELAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 371, 89, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12051998_443633209167351_1649452124_n.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 420));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12051998_443633209167351_1649452124_n.gif"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 420));

        pack();
    }// </editor-fold>                        

    private void GUARDARActionPerformed(java.awt.event.ActionEvent evt) {                                        
 getToolkit().beep();
try {                                        
            getToolkit().beep();
            
            String sql="SELECT * FROM Reservacion WHERE Fecha_Reservacion=?";
            String dia,mes,fecha,ano;
            String e=" ";
            dia=DIA.getSelectedItem().toString();
            mes=MES.getSelectedItem().toString();
            ano=ANO.getSelectedItem().toString();
            fecha=dia+e+mes+e+ano; 
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,fecha);
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                dispose();
                JOptionPane.showMessageDialog(null,"Fecha Ya Registrada");
                ingreso_datos_clientes obj=new ingreso_datos_clientes();
                obj.setVisible(true);
                dispose();
                
            }
            else{
                 conectar conct=new conectar();
        Connection cc=conct.conexion();

        String nom,app,apm,dir,tel,cor,tievent,anti;

        String popo;
        dia=DIA.getSelectedItem().toString();
        mes=MES.getSelectedItem().toString();
        ano=ANO.getSelectedItem().toString();
        e=" ";
        nom=T_NOM.getText().toUpperCase();
        app=T_APP.getText().toUpperCase();
        apm=T_APM.getText().toUpperCase();
        tel=T_TEL.getText().toUpperCase();
        cor=T_COR.getText().toUpperCase();
        tievent=T_TIEVENT.getSelectedItem().toString();
        fecha=dia+e+mes+e+ano;
        anti=T_ANT.getText(); 
        popo= "INSERT INTO reservacion(Nombre,Apellido_Paterno,Apellido_Materno,Telefono,Correo_Electronico,Tipo_Evento,Fecha_Reservacion,Anticipo) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps=cc.prepareStatement(popo);
            ps.setString(1, nom);
            ps.setString(2, app);
            ps.setString(3, apm);
            ps.setString(4, tel);
            ps.setString(5, cor);
            ps.setString(6, tievent);
            ps.setString(7, fecha);
            ps.setString(8, anti);
            int n=ps.executeUpdate();
            if (n>0){
                dispose();
                JOptionPane.showMessageDialog(null,"registrado con exito");
                ingreso_datos_clientes obj=new ingreso_datos_clientes();
                obj.setVisible(true);
                dispose();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ingreso_datos_clientes.class.getName()).log(Level.SEVERE, null, ex);
        }  
            }
            } catch (SQLException ex) {
            Logger.getLogger(ingreso_datos_clientes.class.getName()).log(Level.SEVERE, null, ex);
        }  
       
        // TODO add your handling code here:
    }                                       

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
Menu obj=new Menu();
obj.setVisible(true);
dispose();// TODO add your handling code here:
    }                                        

    private void T_NOMKeyTyped(java.awt.event.KeyEvent evt) {                               
char c=evt.getKeyChar();
if((c<'a' || c>'z') && (c<'A' || c>'Z'))evt.consume();
    // TODO add your handling code here:
    }                              

    private void T_TELKeyTyped(java.awt.event.KeyEvent evt) {                               
char c=evt.getKeyChar();
if(c<'0' || c>'9')evt.consume();
        // TODO add your handling code here:
    }                              

    private void T_APMKeyTyped(java.awt.event.KeyEvent evt) {                               
    char c=evt.getKeyChar();
if((c<'a' || c>'z') && (c<'A' || c>'Z'))evt.consume();    // TODO add your handling code here:
    }                              

    private void T_APPKeyTyped(java.awt.event.KeyEvent evt) {                               
    char c=evt.getKeyChar();
if((c<'a' || c>'z') && (c<'A' || c>'Z'))evt.consume();    // TODO add your handling code here:
    }                              

    private void T_APMActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void T_TELActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {                                      
desbloquar();
limpiar();
T_NOM.requestFocus();
getToolkit().beep();
// TODO add your handling code here:
    }                                     

    private void CANCELARMouseClicked(java.awt.event.MouseEvent evt) {                                      
bloquear();
limpiar();
getToolkit().beep();// TODO add your handling code here:
    }                                     

    private void T_ANTKeyTyped(java.awt.event.KeyEvent evt) {                               
 char c=evt.getKeyChar();
if(c<'0' || c>'9')evt.consume();       // TODO add your handling code here:
    }                              

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {                                         

// TODO add your handling code here:
    }                                        

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
            java.util.logging.Logger.getLogger(ingreso_datos_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingreso_datos_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingreso_datos_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingreso_datos_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingreso_datos_clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox ANO;
    private javax.swing.JButton CANCELAR;
    private javax.swing.JComboBox DIA;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JLabel FECH;
    private javax.swing.JButton GUARDAR;
    private javax.swing.JComboBox MES;
    private javax.swing.JTextField T_ANT;
    private javax.swing.JTextField T_APM;
    private javax.swing.JTextField T_APP;
    private javax.swing.JTextField T_COR;
    private javax.swing.JTextField T_NOM;
    private javax.swing.JTextField T_TEL;
    private javax.swing.JComboBox T_TIEVENT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration                   

    private Connection conexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    conectar cc=new conectar();
    Connection cn=cc.conexion();
}
