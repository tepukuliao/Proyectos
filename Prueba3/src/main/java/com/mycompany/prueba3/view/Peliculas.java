/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prueba3.view;

import com.mycompany.prueba3.controller.ConectorBD;
import com.mycompany.prueba3.controller.PeliculaController;
import com.mycompany.prueba3.model.MovieDAO;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tomac
 */
public class Peliculas extends javax.swing.JFrame {
    

    
    
    CardLayout vista;
    /**
     * Creates new form Peliculas
     */
    public Peliculas() throws SQLException {
        initComponents();
        this.jPanelAgregar.setVisible(false);
        this.setSize(800,600);
        this.conector = new ConectorBD();
        this.conector.crearConexion();
        
    
        
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAgregar = new javax.swing.JPanel();
        jLabel1TituloAgregar = new javax.swing.JLabel();
        jLabel2Titulo = new javax.swing.JLabel();
        jLabel3Director = new javax.swing.JLabel();
        jLabel4Duracion = new javax.swing.JLabel();
        jTextFieldTitulo1 = new javax.swing.JTextField();
        jTextFieldDirector1 = new javax.swing.JTextField();
        jTextFieldDuracion1 = new javax.swing.JTextField();
        jButtonLimpiarCampos = new javax.swing.JButton();
        jLabel1Anho = new javax.swing.JLabel();
        jTextFieldAnho1 = new javax.swing.JTextField();
        jLabel1Genero = new javax.swing.JLabel();
        jButtonVolverAgregarIni = new javax.swing.JButton();
        jButtonGuardarPelicula = new javax.swing.JButton();
        jTextFieldGenero1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuPeliculas = new javax.swing.JMenu();
        jMenuAgregarPelicula = new javax.swing.JMenuItem();
        jMenuModificarPelicula = new javax.swing.JMenuItem();
        jMenuEliminarPelicula = new javax.swing.JMenuItem();
        jMenuListarPelicula = new javax.swing.JMenuItem();
        jMenuAcercaDe = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1TituloAgregar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1TituloAgregar.setText("Agregar peliculas");

        jLabel2Titulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2Titulo.setText("Titulo:");
        jLabel2Titulo.setToolTipText("");

        jLabel3Director.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3Director.setText("Director:");

        jLabel4Duracion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4Duracion.setText("Duracion:");

        jTextFieldTitulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTitulo1ActionPerformed(evt);
            }
        });

        jTextFieldDuracion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDuracion1ActionPerformed(evt);
            }
        });
        jTextFieldDuracion1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDuracion1KeyTyped(evt);
            }
        });

        jButtonLimpiarCampos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonLimpiarCampos.setText("Limpiar");
        jButtonLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarCamposActionPerformed(evt);
            }
        });

        jLabel1Anho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1Anho.setText("Año:");

        jTextFieldAnho1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnho1ActionPerformed(evt);
            }
        });
        jTextFieldAnho1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAnho1KeyTyped(evt);
            }
        });

        jLabel1Genero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1Genero.setText("Genero:");

        jButtonVolverAgregarIni.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonVolverAgregarIni.setText("<");
        jButtonVolverAgregarIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverAgregarIniActionPerformed(evt);
            }
        });

        jButtonGuardarPelicula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonGuardarPelicula.setText("Guardar");
        jButtonGuardarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarPeliculaActionPerformed(evt);
            }
        });

        jTextFieldGenero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGenero1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAgregarLayout = new javax.swing.GroupLayout(jPanelAgregar);
        jPanelAgregar.setLayout(jPanelAgregarLayout);
        jPanelAgregarLayout.setHorizontalGroup(
            jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgregarLayout.createSequentialGroup()
                .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAgregarLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1Anho, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3Director, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelAgregarLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4Duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelAgregarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVolverAgregarIni, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAgregarLayout.createSequentialGroup()
                        .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAgregarLayout.createSequentialGroup()
                                .addGap(248, 248, 248)
                                .addComponent(jLabel1TituloAgregar))
                            .addComponent(jTextFieldAnho1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAgregarLayout.createSequentialGroup()
                        .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldTitulo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                                .addComponent(jTextFieldDirector1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldGenero1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldDuracion1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAgregarLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jButtonLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(jButtonGuardarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
        );
        jPanelAgregarLayout.setVerticalGroup(
            jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgregarLayout.createSequentialGroup()
                .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAgregarLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1TituloAgregar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAgregarLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButtonVolverAgregarIni, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDirector1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3Director))
                .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAgregarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1Anho, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAgregarLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jTextFieldAnho1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDuracion1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4Duracion))))
                .addGap(56, 56, 56)
                .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGuardarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jMenuPeliculas.setText("Peliculas");

        jMenuAgregarPelicula.setText("Agregar");
        jMenuAgregarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAgregarPeliculaActionPerformed(evt);
            }
        });
        jMenuPeliculas.add(jMenuAgregarPelicula);

        jMenuModificarPelicula.setText("Modificar");
        jMenuPeliculas.add(jMenuModificarPelicula);

        jMenuEliminarPelicula.setText("Eliminar");
        jMenuPeliculas.add(jMenuEliminarPelicula);

        jMenuListarPelicula.setText("Listar");
        jMenuListarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListarPeliculaActionPerformed(evt);
            }
        });
        jMenuPeliculas.add(jMenuListarPelicula);

        jMenuBar1.add(jMenuPeliculas);

        jMenuAcercaDe.setText("Acerca de");

        jMenuItem1.setText("jMenuItem1");
        jMenuAcercaDe.add(jMenuItem1);

        jMenuBar1.add(jMenuAcercaDe);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAgregarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgregarPeliculaActionPerformed
        // TODO add your handling code here:   
        this.jPanelAgregar.setVisible(true);    

    }//GEN-LAST:event_jMenuAgregarPeliculaActionPerformed

    private void jTextFieldAnho1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAnho1KeyTyped
        // TODO add your handling code here:
        int num = evt.getKeyChar();
        boolean numeros = num >=48 && num <=57;

        if(!numeros){
            evt.consume();
        }

        if(this.jTextFieldAnho1.getText().length()>=4){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldAnho1KeyTyped

    private void jTextFieldAnho1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnho1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAnho1ActionPerformed

    private void jButtonLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarCamposActionPerformed
        // TODO add your handling code here:
        this.jTextFieldTitulo1.setText("");
        this.jTextFieldDirector1.setText("");
        this.jTextFieldDuracion1.setText("");
        this.jTextFieldAnho1.setText("");
        this.jTextFieldGenero1.setText("");
    }//GEN-LAST:event_jButtonLimpiarCamposActionPerformed

    private void jTextFieldDuracion1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDuracion1KeyTyped
        // TODO add your handling code here:
        int num = evt.getKeyChar();
        boolean numeros = num >=48 && num <=57;

        if(!numeros){
            evt.consume();
        }

        if(this.jTextFieldDuracion1.getText().length()>=3){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldDuracion1KeyTyped

    private void jTextFieldDuracion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDuracion1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextFieldDuracion1ActionPerformed

    private void jTextFieldTitulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTitulo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTitulo1ActionPerformed

    private void jButtonVolverAgregarIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverAgregarIniActionPerformed
        // TODO add your handling code here:
        this.jPanelAgregar.setVisible(false);
        this.jTextFieldTitulo1.setText("");
        this.jTextFieldDirector1.setText("");
        this.jTextFieldDuracion1.setText("");
        this.jTextFieldAnho1.setText("");
        this.jTextFieldGenero1.setText("");
    }//GEN-LAST:event_jButtonVolverAgregarIniActionPerformed

    private void jButtonGuardarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarPeliculaActionPerformed
        // TODO add your handling code here:
        int anho =Integer.parseInt(jTextFieldAnho1.getText()); 
           
        if(this.jTextFieldTitulo1.getText().isEmpty() || this.jTextFieldDirector1.getText().isEmpty() || this.jTextFieldAnho1.getText().isEmpty() || 
                    this.jTextFieldDuracion1.getText().isEmpty() || this.jTextFieldGenero1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "faltan campos por completar");
        }else{
            if(anho<1900){
            JOptionPane.showMessageDialog(this, "ingrese año mayor a 1900");
        }else{
            MovieDAO peliculaNueva = new MovieDAO();
        peliculaNueva.setTitulo(jTextFieldTitulo1.getText());
        peliculaNueva.setDirector(jTextFieldDirector1.getText());
        peliculaNueva.setAnho(Integer.valueOf(jTextFieldAnho1.getText()));
        peliculaNueva.setDuracion(Integer.valueOf(jTextFieldDuracion1.getText()));
        peliculaNueva.setGenero(jTextFieldGenero1.getText());
        
        PeliculaController controlador = new PeliculaController();
        try {
            controlador.agregarPeliculaController(peliculaNueva, this.conector.getConn());
        } catch (SQLException ex) {
            Logger.getLogger(Peliculas.class.getName()).log(Level.SEVERE, null, ex);
            
        }
            
            JOptionPane.showMessageDialog(this, "Pelicula agregada con exito");
        }
        
        }
        
    }//GEN-LAST:event_jButtonGuardarPeliculaActionPerformed

    private void jTextFieldGenero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGenero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGenero1ActionPerformed

    private void jMenuListarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListarPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuListarPeliculaActionPerformed

    /**
     * @param args the command line arguments
     */
    protected Connection conexionOCI;
    protected ConectorBD conector;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardarPelicula;
    private javax.swing.JButton jButtonLimpiarCampos;
    private javax.swing.JButton jButtonVolverAgregarIni;
    private javax.swing.JLabel jLabel1Anho;
    private javax.swing.JLabel jLabel1Genero;
    private javax.swing.JLabel jLabel1TituloAgregar;
    private javax.swing.JLabel jLabel2Titulo;
    private javax.swing.JLabel jLabel3Director;
    private javax.swing.JLabel jLabel4Duracion;
    private javax.swing.JMenu jMenuAcercaDe;
    private javax.swing.JMenuItem jMenuAgregarPelicula;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuEliminarPelicula;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuListarPelicula;
    private javax.swing.JMenuItem jMenuModificarPelicula;
    private javax.swing.JMenu jMenuPeliculas;
    private javax.swing.JPanel jPanelAgregar;
    private javax.swing.JTextField jTextFieldAnho1;
    private javax.swing.JTextField jTextFieldDirector1;
    private javax.swing.JTextField jTextFieldDuracion1;
    private javax.swing.JTextField jTextFieldGenero1;
    private javax.swing.JTextField jTextFieldTitulo1;
    // End of variables declaration//GEN-END:variables
}