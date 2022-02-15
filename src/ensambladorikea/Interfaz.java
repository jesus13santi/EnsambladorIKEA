/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ensambladorikea;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Interfaz extends javax.swing.JFrame {

    final JFrame frame = new JFrame();
    File file;
    
    public Interfaz() {
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.disableBtn(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        l_prod_tablas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        l_prod_tornillos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        l_prod_patas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        l_ensambladores = new javax.swing.JTextField();
        l_disp_escritorios = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        l_disp_patas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        l_disp_tornillos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        l_disp_tablas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        l_estado_gerente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        l_estado_jefe = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        l_dias_left = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        l_dias_trans = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        b_c_tornillos = new javax.swing.JButton();
        b_c_tablas = new javax.swing.JButton();
        b_c_patas = new javax.swing.JButton();
        b_c_ensamblador = new javax.swing.JButton();
        b_d_patas = new javax.swing.JButton();
        b_d_ensamblador = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        b_d_tornillos = new javax.swing.JButton();
        b_d_tablas = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        b_comenzar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        l_total_escritorios = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Productores de Tablas");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setMaximumSize(new java.awt.Dimension(170, 15));
        jLabel2.setMinimumSize(new java.awt.Dimension(170, 15));
        jLabel2.setPreferredSize(new java.awt.Dimension(190, 15));

        l_prod_tablas.setEditable(false);
        l_prod_tablas.setBackground(new java.awt.Color(255, 255, 255));
        l_prod_tablas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l_prod_tablas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        l_prod_tablas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Productores de Tornillos");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setMaximumSize(new java.awt.Dimension(170, 15));
        jLabel3.setMinimumSize(new java.awt.Dimension(170, 15));
        jLabel3.setPreferredSize(new java.awt.Dimension(190, 15));

        l_prod_tornillos.setEditable(false);
        l_prod_tornillos.setBackground(new java.awt.Color(255, 255, 255));
        l_prod_tornillos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l_prod_tornillos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        l_prod_tornillos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Productores de Patas");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setMaximumSize(new java.awt.Dimension(170, 15));
        jLabel4.setMinimumSize(new java.awt.Dimension(170, 15));
        jLabel4.setPreferredSize(new java.awt.Dimension(190, 15));

        l_prod_patas.setEditable(false);
        l_prod_patas.setBackground(new java.awt.Color(255, 255, 255));
        l_prod_patas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l_prod_patas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        l_prod_patas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ensambladores");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setMaximumSize(new java.awt.Dimension(170, 15));
        jLabel6.setMinimumSize(new java.awt.Dimension(170, 15));
        jLabel6.setPreferredSize(new java.awt.Dimension(190, 15));

        l_ensambladores.setEditable(false);
        l_ensambladores.setBackground(new java.awt.Color(255, 255, 255));
        l_ensambladores.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l_ensambladores.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        l_ensambladores.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        l_ensambladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_ensambladoresActionPerformed(evt);
            }
        });

        l_disp_escritorios.setEditable(false);
        l_disp_escritorios.setBackground(new java.awt.Color(255, 255, 255));
        l_disp_escritorios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l_disp_escritorios.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        l_disp_escritorios.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Escritorios Ensamblados Disponibles");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setMaximumSize(new java.awt.Dimension(170, 15));
        jLabel7.setMinimumSize(new java.awt.Dimension(170, 15));

        l_disp_patas.setEditable(false);
        l_disp_patas.setBackground(new java.awt.Color(255, 255, 255));
        l_disp_patas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l_disp_patas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        l_disp_patas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Patas Disponibles");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setMaximumSize(new java.awt.Dimension(170, 15));
        jLabel9.setMinimumSize(new java.awt.Dimension(170, 15));
        jLabel9.setPreferredSize(new java.awt.Dimension(190, 15));

        l_disp_tornillos.setEditable(false);
        l_disp_tornillos.setBackground(new java.awt.Color(255, 255, 255));
        l_disp_tornillos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l_disp_tornillos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        l_disp_tornillos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Tornillos Disponibles");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setMaximumSize(new java.awt.Dimension(170, 15));
        jLabel10.setMinimumSize(new java.awt.Dimension(170, 15));
        jLabel10.setPreferredSize(new java.awt.Dimension(190, 15));

        l_disp_tablas.setEditable(false);
        l_disp_tablas.setBackground(new java.awt.Color(255, 255, 255));
        l_disp_tablas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l_disp_tablas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        l_disp_tablas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Tablas Disponibles");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setMaximumSize(new java.awt.Dimension(170, 15));
        jLabel11.setMinimumSize(new java.awt.Dimension(170, 15));
        jLabel11.setPreferredSize(new java.awt.Dimension(190, 15));

        l_estado_gerente.setEditable(false);
        l_estado_gerente.setBackground(new java.awt.Color(255, 255, 255));
        l_estado_gerente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l_estado_gerente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        l_estado_gerente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Estado del Gerente");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel12.setMaximumSize(new java.awt.Dimension(170, 15));
        jLabel12.setMinimumSize(new java.awt.Dimension(170, 15));
        jLabel12.setPreferredSize(new java.awt.Dimension(190, 15));

        l_estado_jefe.setEditable(false);
        l_estado_jefe.setBackground(new java.awt.Color(255, 255, 255));
        l_estado_jefe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l_estado_jefe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        l_estado_jefe.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Estado del Jefe");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.setMaximumSize(new java.awt.Dimension(170, 15));
        jLabel13.setMinimumSize(new java.awt.Dimension(170, 15));
        jLabel13.setPreferredSize(new java.awt.Dimension(190, 15));

        l_dias_left.setEditable(false);
        l_dias_left.setBackground(new java.awt.Color(255, 255, 255));
        l_dias_left.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l_dias_left.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        l_dias_left.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Días Faltantes");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel14.setMaximumSize(new java.awt.Dimension(170, 15));
        jLabel14.setMinimumSize(new java.awt.Dimension(170, 15));
        jLabel14.setPreferredSize(new java.awt.Dimension(190, 15));

        l_dias_trans.setEditable(false);
        l_dias_trans.setBackground(new java.awt.Color(255, 255, 255));
        l_dias_trans.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l_dias_trans.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        l_dias_trans.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Días Transcurridos");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel15.setMaximumSize(new java.awt.Dimension(170, 15));
        jLabel15.setMinimumSize(new java.awt.Dimension(170, 15));
        jLabel15.setPreferredSize(new java.awt.Dimension(190, 15));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("CONTROL");
        jLabel16.setPreferredSize(new java.awt.Dimension(190, 17));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("CONTRATAR");
        jLabel17.setPreferredSize(new java.awt.Dimension(190, 17));

        b_c_tornillos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b_c_tornillos.setText("Productor de Tornillos");
        b_c_tornillos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_c_tornillos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b_c_tornillos.setMaximumSize(new java.awt.Dimension(190, 23));
        b_c_tornillos.setMinimumSize(new java.awt.Dimension(190, 23));
        b_c_tornillos.setPreferredSize(new java.awt.Dimension(190, 23));
        b_c_tornillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_c_tornillosActionPerformed(evt);
            }
        });

        b_c_tablas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b_c_tablas.setText("Productor de Tablas");
        b_c_tablas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_c_tablas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b_c_tablas.setMaximumSize(new java.awt.Dimension(190, 23));
        b_c_tablas.setMinimumSize(new java.awt.Dimension(190, 23));
        b_c_tablas.setPreferredSize(new java.awt.Dimension(190, 23));
        b_c_tablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_c_tablasActionPerformed(evt);
            }
        });

        b_c_patas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b_c_patas.setText("Productor de Patas");
        b_c_patas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_c_patas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b_c_patas.setMaximumSize(new java.awt.Dimension(190, 23));
        b_c_patas.setMinimumSize(new java.awt.Dimension(190, 23));
        b_c_patas.setPreferredSize(new java.awt.Dimension(190, 23));
        b_c_patas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_c_patasActionPerformed(evt);
            }
        });

        b_c_ensamblador.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b_c_ensamblador.setText("Ensamblador");
        b_c_ensamblador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_c_ensamblador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b_c_ensamblador.setMaximumSize(new java.awt.Dimension(190, 23));
        b_c_ensamblador.setMinimumSize(new java.awt.Dimension(190, 23));
        b_c_ensamblador.setPreferredSize(new java.awt.Dimension(190, 23));
        b_c_ensamblador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_c_ensambladorActionPerformed(evt);
            }
        });

        b_d_patas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b_d_patas.setText("Productor de Patas");
        b_d_patas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_d_patas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b_d_patas.setMaximumSize(new java.awt.Dimension(190, 23));
        b_d_patas.setMinimumSize(new java.awt.Dimension(190, 23));
        b_d_patas.setPreferredSize(new java.awt.Dimension(190, 23));
        b_d_patas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_d_patasActionPerformed(evt);
            }
        });

        b_d_ensamblador.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b_d_ensamblador.setText("Ensamblador");
        b_d_ensamblador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_d_ensamblador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b_d_ensamblador.setMaximumSize(new java.awt.Dimension(190, 23));
        b_d_ensamblador.setMinimumSize(new java.awt.Dimension(190, 23));
        b_d_ensamblador.setPreferredSize(new java.awt.Dimension(190, 23));
        b_d_ensamblador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_d_ensambladorActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("DESPEDIR");
        jLabel18.setPreferredSize(new java.awt.Dimension(190, 17));

        b_d_tornillos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b_d_tornillos.setText("Productor de Tornillos");
        b_d_tornillos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_d_tornillos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b_d_tornillos.setMaximumSize(new java.awt.Dimension(190, 23));
        b_d_tornillos.setMinimumSize(new java.awt.Dimension(190, 23));
        b_d_tornillos.setPreferredSize(new java.awt.Dimension(190, 23));
        b_d_tornillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_d_tornillosActionPerformed(evt);
            }
        });

        b_d_tablas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b_d_tablas.setText("Productor de Tablas");
        b_d_tablas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_d_tablas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b_d_tablas.setMaximumSize(new java.awt.Dimension(190, 23));
        b_d_tablas.setMinimumSize(new java.awt.Dimension(190, 23));
        b_d_tablas.setPreferredSize(new java.awt.Dimension(190, 23));
        b_d_tablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_d_tablasActionPerformed(evt);
            }
        });

        b_comenzar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_comenzar.setText("COMENZAR A PRODUCIR");
        b_comenzar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_comenzar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b_comenzar.setMaximumSize(new java.awt.Dimension(190, 23));
        b_comenzar.setMinimumSize(new java.awt.Dimension(190, 23));
        b_comenzar.setPreferredSize(new java.awt.Dimension(190, 23));
        b_comenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_comenzarActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Escritorios Ensamblados Totales");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel19.setMaximumSize(new java.awt.Dimension(170, 15));
        jLabel19.setMinimumSize(new java.awt.Dimension(170, 15));
        jLabel19.setPreferredSize(new java.awt.Dimension(190, 15));

        l_total_escritorios.setEditable(false);
        l_total_escritorios.setBackground(new java.awt.Color(255, 255, 255));
        l_total_escritorios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l_total_escritorios.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        l_total_escritorios.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(361, 361, 361)
                                    .addComponent(l_disp_escritorios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(124, 124, 124)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(l_estado_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(l_dias_trans, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(l_dias_left, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(l_estado_gerente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel1Layout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(l_disp_tornillos, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(l_disp_tablas, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(l_disp_patas, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(361, 361, 361)
                                .addComponent(l_total_escritorios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(b_comenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 64, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(l_prod_tablas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(l_prod_tornillos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(l_prod_patas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(l_ensambladores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(214, 214, 214))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(77, 77, 77)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(b_c_ensamblador, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(b_c_tornillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(b_c_tablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(b_c_patas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b_d_tornillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_d_tablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_d_patas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_d_ensamblador, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 80, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_prod_tablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_prod_tornillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_prod_patas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_ensambladores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l_dias_trans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l_dias_left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l_estado_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l_estado_gerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l_disp_tablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l_disp_tornillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l_disp_patas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l_disp_escritorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_total_escritorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(b_c_tablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b_c_tornillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b_c_patas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b_c_ensamblador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(b_d_tablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(b_d_tornillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b_d_patas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b_d_ensamblador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_comenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void disableBtn(Boolean value){
    
        b_c_tablas.setEnabled(value);
        b_c_tornillos.setEnabled(value);
        b_c_patas.setEnabled(value);
//        b_c_cuerpo_central.setEnabled(value);
        b_c_ensamblador.setEnabled(value);

        b_d_tablas.setEnabled(value);
        b_d_tornillos.setEnabled(value);
        b_d_patas.setEnabled(value);
//        b_d_cuerpo_central.setEnabled(value);
        b_d_ensamblador.setEnabled(value);
        
    }
    
    private void b_d_tablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_d_tablasActionPerformed
        if( EnsambladorIKEA.numProd_tablas > 0 ){
            EnsambladorIKEA.numProd_tablas--;
            EnsambladorIKEA.prod_tablas[EnsambladorIKEA.numProd_tablas].despedir();
            l_prod_tablas.setText(""+EnsambladorIKEA.numProd_tablas);
        }else{
            JOptionPane.showMessageDialog(null, "No Quedan Productores de Tablas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b_d_tablasActionPerformed

    private void b_d_tornillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_d_tornillosActionPerformed
        if( EnsambladorIKEA.numProd_tornillos > 0 ){
            EnsambladorIKEA.numProd_tornillos--;
            EnsambladorIKEA.prod_tornillos[EnsambladorIKEA.numProd_tornillos].despedir();
            l_prod_tornillos.setText(""+EnsambladorIKEA.numProd_tornillos);
        }else{
            JOptionPane.showMessageDialog(null, "No Quedan Productores de Tornillos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b_d_tornillosActionPerformed

    private void b_d_ensambladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_d_ensambladorActionPerformed
        if( EnsambladorIKEA.num_ensambladores > 0 ){
            EnsambladorIKEA.num_ensambladores--;
            EnsambladorIKEA.ensambladores[ EnsambladorIKEA.num_ensambladores ].despedir();
            l_ensambladores.setText(""+EnsambladorIKEA.num_ensambladores);
        }else{
            JOptionPane.showMessageDialog(null, "No Quedan Ensambladores", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b_d_ensambladorActionPerformed

    private void b_d_patasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_d_patasActionPerformed
        if( EnsambladorIKEA.numProd_patas > 0 ){
            EnsambladorIKEA.numProd_patas--;
            EnsambladorIKEA.prod_patas[EnsambladorIKEA.numProd_patas].despedir();
            l_prod_patas.setText(""+EnsambladorIKEA.numProd_patas);
        }else{
            JOptionPane.showMessageDialog(null, "No Quedan Productores de Patas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b_d_patasActionPerformed

    private void b_c_ensambladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_c_ensambladorActionPerformed
        if( EnsambladorIKEA.num_ensambladores < EnsambladorIKEA.max_ensambladores ){
            EnsambladorIKEA.ensambladores[EnsambladorIKEA.num_ensambladores] = new Ensamblador(EnsambladorIKEA.semTablas, EnsambladorIKEA.semTornillos, EnsambladorIKEA.semPatas, EnsambladorIKEA.semEscritorio, EnsambladorIKEA.dia);
            EnsambladorIKEA.ensambladores[EnsambladorIKEA.num_ensambladores].start();
            EnsambladorIKEA.num_ensambladores++;
            l_ensambladores.setText(""+EnsambladorIKEA.num_ensambladores);
        }else{
            JOptionPane.showMessageDialog(null, "Maximo de Ensambladores Posibles Contratados", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b_c_ensambladorActionPerformed

    private void b_c_patasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_c_patasActionPerformed
        if( EnsambladorIKEA.numProd_patas < EnsambladorIKEA.max_prod_patas ){
            EnsambladorIKEA.prod_patas[EnsambladorIKEA.numProd_patas] = new ProductorPatas(EnsambladorIKEA.semPatas, EnsambladorIKEA.dia);
            EnsambladorIKEA.prod_patas[EnsambladorIKEA.numProd_patas].start();
            EnsambladorIKEA.numProd_patas++;
            l_prod_patas.setText(""+EnsambladorIKEA.numProd_patas);
        }else{
            JOptionPane.showMessageDialog(null, "Maximo de Productores de Patas Posibles Contratados", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b_c_patasActionPerformed

    private void b_c_tablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_c_tablasActionPerformed
        if( EnsambladorIKEA.numProd_tablas < EnsambladorIKEA.max_prod_tablas ){
            EnsambladorIKEA.prod_tablas[EnsambladorIKEA.numProd_tablas] = new ProductorTablas(EnsambladorIKEA.semTablas, EnsambladorIKEA.dia);
            EnsambladorIKEA.prod_tablas[EnsambladorIKEA.numProd_tablas].start();
            EnsambladorIKEA.numProd_tablas++;
            l_prod_tablas.setText(""+EnsambladorIKEA.numProd_tablas);
        }else{
            JOptionPane.showMessageDialog(null, "Maximo de Productores de Tablas Posibles Contratados", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b_c_tablasActionPerformed

    private void b_c_tornillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_c_tornillosActionPerformed
        if( EnsambladorIKEA.numProd_tornillos < EnsambladorIKEA.max_prod_tornillos ){
            EnsambladorIKEA.prod_tornillos[EnsambladorIKEA.numProd_tornillos] = new ProductorTornillos(EnsambladorIKEA.semTornillos, EnsambladorIKEA.dia);
            EnsambladorIKEA.prod_tornillos[EnsambladorIKEA.numProd_tornillos].start();
            EnsambladorIKEA.numProd_tornillos++;
            l_prod_tornillos.setText(""+EnsambladorIKEA.numProd_tornillos);
        }else{
            JOptionPane.showMessageDialog(null, "Maximo de Productores de Tornillos Posibles Contratados", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b_c_tornillosActionPerformed

    private void l_ensambladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_ensambladoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l_ensambladoresActionPerformed

    private void b_comenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_comenzarActionPerformed
       
        if(b_comenzar.getText().equals("COMENZAR A PRODUCIR") ){
            final JFileChooser fc = new JFileChooser(); 
            int returnVal = fc.showOpenDialog(frame);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                file = fc.getSelectedFile();  
                if(EnsambladorIKEA.readCSV(file)){
                    System.out.println(EnsambladorIKEA.readCSV(file));
                    System.out.println("SE CARGO BIEN EL ARCHIVO");
                    this.disableBtn(true);
                    EnsambladorIKEA.exit = false;
                    EnsambladorIKEA.ensamblar();
                    b_comenzar.setText("DEJAR DE PRODUCIR");
                } else{
                    System.out.println(EnsambladorIKEA.readCSV(file));
                    System.out.println("ERROR EN EL ARCHIVO");
                    JOptionPane.showMessageDialog(null, "Error en la lectura del archivo, verifique que:\n- Hay valores correctos en el mismo (numéricos).\n- Los productores iniciales no superan los máximos permitidos.\n- Los datos del archivo son mayores que cero.\n- Existe capacidad en el almacen para poder armar Panas.\n- Seleccionó un archivo válido.", "Error al cargar el archivo", JOptionPane.ERROR_MESSAGE);
                    this.disableBtn(false);
                    b_comenzar.setText("COMENZAR A PRODUCIR");
                    EnsambladorIKEA.exit = true;
                }
            } else {
                System.out.println("Open command cancelled by user.");
            }
            System.out.println(returnVal);
            
        }else{
            this.disableBtn(false);
            
            b_comenzar.setText("COMENZAR A PRODUCIR");
            EnsambladorIKEA.exit = true;
        }
    }//GEN-LAST:event_b_comenzarActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_c_ensamblador;
    private javax.swing.JButton b_c_patas;
    private javax.swing.JButton b_c_tablas;
    private javax.swing.JButton b_c_tornillos;
    private javax.swing.JButton b_comenzar;
    private javax.swing.JButton b_d_ensamblador;
    private javax.swing.JButton b_d_patas;
    private javax.swing.JButton b_d_tablas;
    private javax.swing.JButton b_d_tornillos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public static volatile javax.swing.JTextField l_dias_left;
    public static volatile javax.swing.JTextField l_dias_trans;
    public static volatile javax.swing.JTextField l_disp_escritorios;
    public static volatile javax.swing.JTextField l_disp_patas;
    public static volatile javax.swing.JTextField l_disp_tablas;
    public static volatile javax.swing.JTextField l_disp_tornillos;
    public static volatile javax.swing.JTextField l_ensambladores;
    public static volatile javax.swing.JTextField l_estado_gerente;
    public static volatile javax.swing.JTextField l_estado_jefe;
    public static volatile javax.swing.JTextField l_prod_patas;
    public static volatile javax.swing.JTextField l_prod_tablas;
    public static javax.swing.JTextField l_prod_tornillos;
    public static volatile javax.swing.JTextField l_total_escritorios;
    // End of variables declaration//GEN-END:variables
}
