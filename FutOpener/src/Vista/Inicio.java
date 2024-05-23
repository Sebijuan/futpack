/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Sebi
 */

package Vista;
import Beans.Usuario;
import Controlador.ControladorActualizar;
import Controlador.ControladorIniciarSesion;

import javax.swing.JTextPane;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import Vista.ActualizarUsuario;



public class Inicio extends  javax.swing.JFrame {
          
             private Clip clip;
            private boolean loop = false;
            private long clipTimePosition = 0;
            private ControladorIniciarSesion controladorIniciarSesion;
           
    
            
             public void mostrar() {
        this.setVisible(true);
        
    }
            
           public void IniciarMusica() {
    try {
        InputStream inputStream = getClass().getResourceAsStream("/Sonido/El-Futbol_Sebijuan.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(inputStream);
        if (clip != null && !clip.isRunning()) {
            clip.setMicrosecondPosition(clipTimePosition);
            clip.start();
        } else {
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}

 public void detenerMusica() {
    if (clip != null && clip.isRunning()) {
        clipTimePosition = clip.getMicrosecondPosition(); // Guardar la posición actual de la canción
        clip.stop();
    }
}


   

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
            
            
    public Inicio() {
        initComponents();
     
         this.setVisible(true);
        this.setSize(1200, 700);
        this.setLocationRelativeTo(null);  
        this.dispose();
        controladorIniciarSesion = new ControladorIniciarSesion();
    }
       public void BotonInvisible(){
           jTextPane2.setOpaque(false);
          
           jButton1.setOpaque(false);
           jButton1.setContentAreaFilled(false);
           jButton1.setBorderPainted(false);
           
           jButton2.setOpaque(false);
           jButton2.setContentAreaFilled(false);
           jButton2.setBorderPainted(false);
           
           jButton3.setOpaque(false);
           jButton3.setContentAreaFilled(false);
           jButton3.setBorderPainted(false);
           
           jButton4.setOpaque(false);
           jButton4.setContentAreaFilled(false);
           jButton4.setBorderPainted(false);
           
           jButton5.setOpaque(false);
           jButton5.setContentAreaFilled(false);
           jButton5.setBorderPainted(false);
           
           jButton6.setOpaque(false);
           jButton6.setContentAreaFilled(false);
           jButton6.setBorderPainted(false);
       }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jSpinner1 = new javax.swing.JSpinner();
        jSlider1 = new javax.swing.JSlider();
        jDialog1 = new javax.swing.JDialog();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtUsuario = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jButton6 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jToolBar1.setRollover(true);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ea-sports-fc-24_5015499_20230713161659.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ea-sports-fc-24_5015499_20230713161659.jpg"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ea-sports-fc-24_5015499_20230713161659.jpg"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ea-sports-fc-24_5015499_20230713161659.jpg"))); // NOI18N

        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 204));
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 130, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 204));
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, -1, -1));

        txtUsuario.setBorder(null);
        txtUsuario.setForeground(new java.awt.Color(204, 0, 0));
        jScrollPane1.setViewportView(txtUsuario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 160, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setLabel("Iniciar Sesion");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, 160, 30));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 61, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 96, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 204));
        jLabel6.setText("Correo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 140, 30));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setText("Registrarse");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 610, 130, 30));
        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));
        getContentPane().add(jDesktopPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 150, -1));

        jTextPane2.setForeground(new java.awt.Color(204, 0, 0));
        jScrollPane3.setViewportView(jTextPane2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 160, 30));

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Actualizar Cuenta");
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 360, -1, -1));

        jPasswordField1.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 150, 30));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Iniciar Musica");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 60, 180, 30));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Detener");
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 140, 30));

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Eliminar Usuario");
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 210, -1, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ea-sports-fc-24_5015499_20230713161659.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String usuario = txtUsuario.getText();
    String contraseña = String.valueOf(jPasswordField1.getPassword());
    String correo = jTextPane2.getText();    

     boolean result = controladorIniciarSesion.ConfirmarIniciarSesion(usuario,contraseña,correo);
     
     
     if(result){
         Video video = new Video();
         video.setVisible(true);
         this.dispose();
          JOptionPane.showMessageDialog(this,"El usuario se ha iniciado correctamente");
     }else{
         JOptionPane.showMessageDialog(this,"El usuario no ha sido encontrado");
     }
    }//GEN-LAST:event_jButton1ActionPerformed
   
    
    
    
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
        // Carga el archivo de audio desde el paquete de recursos
        InputStream inputStream = getClass().getResourceAsStream("/sonido/panza.wav");
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(new BufferedInputStream(inputStream));
        Clip sound = AudioSystem.getClip();
        sound.open(audioIn);
        sound.start(); // Reproduce el sonido
    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Registrar pantalla = new Registrar();
    pantalla.setVisible(true);
    this.dispose(); 
     try {
        // Carga el archivo de audio desde el paquete de recursos
        InputStream inputStream = getClass().getResourceAsStream("/sonido/panza.wav");
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(new BufferedInputStream(inputStream));
        Clip sound = AudioSystem.getClip();
        sound.open(audioIn);
        sound.start(); // Reproduce el sonido
    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
        e.printStackTrace();
    }
    
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
     
        
    
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
              IniciarMusica(); 
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          detenerMusica(); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
       
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
      
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       EliminarUsuario eliminar = new EliminarUsuario();
       eliminar.setVisible(true);
       this.dispose();
       
      try {
        // Carga el archivo de audio desde el paquete de recursos
        InputStream inputStream = getClass().getResourceAsStream("/sonido/mileurista.wav");
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(new BufferedInputStream(inputStream));
        Clip sound = AudioSystem.getClip();
        sound.open(audioIn);
        sound.start(); // Reproduce el sonido
    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
        e.printStackTrace();
    }
    
       
       
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         
         ArrayList<Usuario> usuarios = new ControladorActualizar().ActualizarUsuarios();

       ActualizarUsuario actualizarUsuario= new ActualizarUsuario(usuarios);
       
       
       actualizarUsuario.setVisible(true);
       
       
       
     this.dispose();
        
        
         try {
        // Carga el archivo de audio desde el paquete de recursos
        InputStream inputStream = getClass().getResourceAsStream("/sonido/aquivan.wav");
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(new BufferedInputStream(inputStream));
        Clip sound = AudioSystem.getClip();
        sound.open(audioIn);
        sound.start(); // Reproduce el sonido
    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
        e.printStackTrace();
    }
        
        
        
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextPane txtUsuario;
    // End of variables declaration//GEN-END:variables

    
}