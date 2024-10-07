/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import manejoarchivos.Banco;
import manejoarchivos.Cliente;
import static ventanas.Login.banco;
import static ventanas.Login.clienteActual;

/**
 *
 * @author JHAK
 */

public class Depositar extends javax.swing.JFrame {

   
    /**
     * Creates new form Depositar
     */
    public Depositar() {
        initComponents();
       
        setSize(400, 600);
        setResizable(false);
        setTitle("Depositar - Cajero Automatico PROTECH");
        setLocationRelativeTo(null);
        
        ImageIcon wallpaper= new ImageIcon("src/images/fondo_login.png");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
        ImageIcon wallpaper_logo= new ImageIcon("src/images/logo_protech.png");
        Icon icono_logo = new ImageIcon(wallpaper_logo.getImage().getScaledInstance(jLabel_Logo.getWidth(), jLabel_Logo.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Logo.setIcon(icono_logo);
        this.repaint();
        
        //Imagen de Depositar
        ImageIcon ImagDepositar= new ImageIcon("src/images/donar.png");
        Icon icono_depositar = new ImageIcon(ImagDepositar.getImage().getScaledInstance(jLabel_ImaDepositar.getWidth(), jLabel_ImaDepositar.getHeight(), Image.SCALE_DEFAULT));
        jLabel_ImaDepositar.setIcon(icono_depositar);
        this.repaint();
    }
    
    @Override
    public Image getIconImage() {  //CAMBIAR DIRECCION DEL ICONO POR ERROR DE CARPETA DE RECURSOS
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/logo_protech.png"));
    return retValue;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel_Subtitulo = new javax.swing.JLabel();
        Derechos_Autor = new javax.swing.JLabel();
        jLabel_Logo = new javax.swing.JLabel();
        jButton_AccionDepositar = new javax.swing.JButton();
        jButton_Salir1 = new javax.swing.JButton();
        jLabel_ImaDepositar = new javax.swing.JLabel();
        jTextField_MontoDepositar = new javax.swing.JTextField();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_SaldoDepositar = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Subtitulo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel_Subtitulo.setText("Ingrese el monto");
        getContentPane().add(jLabel_Subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        Derechos_Autor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Derechos_Autor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Derechos_Autor.setText("ProTech2024 © ");
        Derechos_Autor.setToolTipText("");
        getContentPane().add(Derechos_Autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, -1, -1));
        getContentPane().add(jLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 100, 100));

        jButton_AccionDepositar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_AccionDepositar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton_AccionDepositar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_AccionDepositar.setText("Depositar");
        jButton_AccionDepositar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        jButton_AccionDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AccionDepositarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_AccionDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 150, 40));

        jButton_Salir1.setBackground(new java.awt.Color(255, 51, 0));
        jButton_Salir1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton_Salir1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Salir1.setText("Salir");
        jButton_Salir1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        jButton_Salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Salir1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 150, 40));
        getContentPane().add(jLabel_ImaDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        jTextField_MontoDepositar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField_MontoDepositar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextField_MontoDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 230, 50));

        jLabel_Titulo.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel_Titulo.setText("DEPOSITAR");
        getContentPane().add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel_SaldoDepositar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_SaldoDepositar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel_SaldoDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 300, 50));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        pack();
    }// </editor-fold>                        

    private void jButton_Salir1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        new PagPrincipal().setVisible(true);
        this.setVisible(false);
    }                                              

    private void jButton_AccionDepositarActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        double cantidad = Double.parseDouble(jTextField_MontoDepositar.getText());
        clienteActual.depositar(cantidad);
        jLabel_SaldoDepositar.setText("Saldo Actual: " + clienteActual.getSaldo());
        jTextField_MontoDepositar.setText("");
        banco.guardarClientes(); // Guardar cambios en el archivo
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
            java.util.logging.Logger.getLogger(Depositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Depositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Depositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Depositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Depositar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Derechos_Autor;
    private javax.swing.JButton jButton_AccionDepositar;
    private javax.swing.JButton jButton_Salir1;
    private javax.swing.JLabel jLabel_ImaDepositar;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLabel_SaldoDepositar;
    private javax.swing.JLabel jLabel_Subtitulo;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField jTextField_MontoDepositar;
    // End of variables declaration                   
}
