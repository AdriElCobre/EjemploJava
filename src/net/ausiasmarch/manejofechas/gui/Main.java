/*
 * Fechas.java
 */
package net.ausiasmarch.manejofechas.gui;

import java.awt.Color;
import javax.swing.JOptionPane;
import net.ausiasmarch.common.Convert;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import net.ausiasmarch.manejofechas.modelo.ManejadorFechas;

/**
 * Main.java
 *
 * @author Adri
 */
public class Main extends javax.swing.JFrame {

    private String sFechaHora, ahora, sFechaHora1, agregar, unidades;
    private LocalDateTime ldtFecha1;
    private LocalDate ldtFecha2;

    /**
     * Creates new form Fechas
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldFechaHora = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldDia = new javax.swing.JTextField();
        jTextFieldMes = new javax.swing.JTextField();
        jTextFieldAnyo = new javax.swing.JTextField();
        jTextFieldHora = new javax.swing.JTextField();
        jTextFieldMinutos = new javax.swing.JTextField();
        jTextFieldSegundos = new javax.swing.JTextField();
        jButtonCalcular = new javax.swing.JButton();
        jComboBoxUnidades = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonSumar = new javax.swing.JButton();
        jTextFieldFechaHora1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldAgregar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldResultado = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButtonAhora = new javax.swing.JButton();
        jTextFieldAhora = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldDiaSemana = new javax.swing.JTextField();
        Limpiar = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        jLabelDesde = new javax.swing.JLabel();
        jLabelHasta = new javax.swing.JLabel();
        jTextFieldDesde = new javax.swing.JTextField();
        jTextFieldHasta = new javax.swing.JTextField();
        jLabelA�os = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButtonCalculo = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manejo de Fechas");
        setResizable(false);

        jLabel1.setText("Fecha y hora:");

        jLabel2.setText("D�a Mes");

        jLabel3.setText("Mes");

        jLabel4.setText("A�o");

        jLabel5.setText("Hora");

        jLabel6.setText("Minutos");

        jLabel7.setText("Segundos");

        jTextFieldDia.setEditable(false);
        jTextFieldDia.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldMes.setEditable(false);
        jTextFieldMes.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldAnyo.setEditable(false);
        jTextFieldAnyo.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldAnyo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldHora.setEditable(false);
        jTextFieldHora.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldMinutos.setEditable(false);
        jTextFieldMinutos.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldMinutos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldSegundos.setEditable(false);
        jTextFieldSegundos.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldSegundos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jComboBoxUnidades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dias", "Meses", "A�os", "Semanas" }));
        jComboBoxUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUnidadesActionPerformed(evt);
            }
        });

        jButtonSumar.setText("Sumar");
        jButtonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumarActionPerformed(evt);
            }
        });

        jTextFieldFechaHora1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaHora1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha:");

        jLabel9.setText("A�adir");

        jLabel10.setText("Resultado:");

        jTextFieldResultado.setEditable(false);
        jTextFieldResultado.setBackground(new java.awt.Color(204, 204, 255));

        jButtonAhora.setText("Ahora");
        jButtonAhora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAhoraActionPerformed(evt);
            }
        });

        jTextFieldAhora.setEditable(false);
        jTextFieldAhora.setBackground(new java.awt.Color(204, 204, 255));

        jLabel11.setText("D�a Semana");

        jTextFieldDiaSemana.setEditable(false);
        jTextFieldDiaSemana.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldDiaSemana.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Limpiar.setText("limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Resta.setText("Resta");
        Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaActionPerformed(evt);
            }
        });

        jLabelDesde.setText("Fecha Desde");

        jLabelHasta.setText("Fecha Hasta");

        jLabelA�os.setText("Resultado");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 204, 255));

        jButtonCalculo.setText("Calcular");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gif/giphy-iloveimg-cropped-iloveimg-resized (2).gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(130, 130, 130))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(5, 5, 5))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldMes)
                                        .addComponent(jTextFieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldSegundos)
                            .addComponent(jTextFieldHora)
                            .addComponent(jTextFieldMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFechaHora)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonCalcular)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAhora)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldAhora, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldFechaHora1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jTextFieldAgregar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBoxUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButtonSumar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(Resta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jTextFieldResultado))
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jSeparator3)
                                .addGap(97, 97, 97))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabelA�os, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel12)))
                                .addGap(48, 48, 48)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCalcular))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldFechaHora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSumar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Resta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAhora)
                    .addComponent(jTextFieldAhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelA�os, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCalculo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Limpiar)
                        .addGap(13, 13, 13))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Calcular
     *
     * @param evt
     */
    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        sFechaHora = jTextFieldFechaHora.getText();

        if (!Convert.isValidLocalDateTime(sFechaHora)) {
            mensaje("Fecha y/o Hora no v�lida ");
            return;
        }

        ldtFecha1 = Convert.parseLocalDateTime(sFechaHora);

        jTextFieldDia.setText(Convert.format(ManejadorFechas.getDiaMes(ldtFecha1)));
        jTextFieldDiaSemana.setText(ManejadorFechas.getDiaSemana(ldtFecha1));
        jTextFieldMes.setText(ManejadorFechas.getMes(ldtFecha1));
        jTextFieldAnyo.setText(Convert.format(ManejadorFechas.getAnyo(ldtFecha1)));
        jTextFieldHora.setText(Convert.format(ManejadorFechas.getHora(ldtFecha1)));
        jTextFieldMinutos.setText(Convert.format(ManejadorFechas.getMinuto(ldtFecha1)));
        jTextFieldSegundos.setText(Convert.format(ManejadorFechas.getSegundo(ldtFecha1)));

        //......................................................................................................................................................................

    }//GEN-LAST:event_jButtonCalcularActionPerformed


    private void jButtonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumarActionPerformed
        sumaFechas();

    }//GEN-LAST:event_jButtonSumarActionPerformed
    private void sumaFechas() {
        sFechaHora1 = jTextFieldFechaHora1.getText();
        agregar = jTextFieldAgregar.getText();
        unidades = jComboBoxUnidades.getSelectedItem().toString();

        int valor;
        if (!Convert.isValidLocalDate(sFechaHora1)) {
            mensaje("Fecha no v�lida.");
            return;
        }

        if (!Convert.isValidInt(agregar)) {
            mensaje("Formato no permitido.");
            return;
        }

        ldtFecha2 = Convert.parseLocalDate(sFechaHora1);
        valor = Convert.parseInt(agregar);

        switch (unidades) {
            case "Dias":
                ldtFecha2 = ManejadorFechas.sumaDias(ldtFecha2, valor);
                break;

            case "Meses":
                ldtFecha2 = ManejadorFechas.sumaMes(ldtFecha2, valor);
                break;

            case "A�os":
                ldtFecha2 = ManejadorFechas.sumaA�o(ldtFecha2, valor);
                break;
            case "Semanas":
                ldtFecha2 = ManejadorFechas.sumaSemana(ldtFecha2, valor);
                break;

        }

        jTextFieldResultado.setText(Convert.format(ldtFecha2));
        jTextFieldResultado.setForeground(Color.blue);

    }
    //_______________________________________________________________________________________------------------------------

    private void jButtonAhoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAhoraActionPerformed

        jTextFieldAhora.setText(ManejadorFechas.FechaAhora(ahora));
    }//GEN-LAST:event_jButtonAhoraActionPerformed

    private void jTextFieldFechaHora1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaHora1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaHora1ActionPerformed

    private void jComboBoxUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUnidadesActionPerformed


    }//GEN-LAST:event_jComboBoxUnidadesActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed

        jTextFieldFechaHora.setText("");
        jTextFieldDia.setText("");
        jTextFieldDiaSemana.setText("");
        jTextFieldMes.setText("");
        jTextFieldAnyo.setText("");
        jTextFieldHora.setText("");
        jTextFieldMinutos.setText("");
        jTextFieldSegundos.setText("");
        jTextFieldFechaHora1.setText("");
        jTextFieldAgregar.setText("");
        jTextFieldResultado.setText("");
        jTextFieldAhora.setText("");
        jComboBoxUnidades.setSelectedItem("Dias");
        jTextFieldDesde.setText("");
        jTextFieldHasta.setText("");
        jTextField1.setText("");

    }//GEN-LAST:event_LimpiarActionPerformed

    private void RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaActionPerformed
        restaFechas();
    }//GEN-LAST:event_RestaActionPerformed

    private void restaFechas() {
        sFechaHora1 = jTextFieldFechaHora1.getText();
        agregar = jTextFieldAgregar.getText();
        unidades = jComboBoxUnidades.getSelectedItem().toString();

        int valor;
        if (!Convert.isValidLocalDate(sFechaHora1)) {
            mensaje("Fecha no v�lida.");
            return;
        }

        if (!Convert.isValidInt(agregar)) {
            mensaje("Formato no permitido.");
            return;
        }

        ldtFecha2 = Convert.parseLocalDate(sFechaHora1);
        valor = Convert.parseInt(agregar);

        switch (unidades) {
            case "Dias":
                ldtFecha2 = ManejadorFechas.restaDias(ldtFecha2, valor);
                break;

            case "Meses":
                ldtFecha2 = ManejadorFechas.restaMes(ldtFecha2, valor);
                break;

            case "A�os":
                ldtFecha2 = ManejadorFechas.restaa�o(ldtFecha2, valor);
                break;
            case "Semanas":
                ldtFecha2 = ManejadorFechas.restaSemana(ldtFecha2, valor);
                break;

        }

        jTextFieldResultado.setText(Convert.format(ldtFecha2));
        jTextFieldResultado.setForeground(Color.blue);

    }

    private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Main fechas = new Main();
                fechas.pack();
                fechas.setLocationRelativeTo(null);
                fechas.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Resta;
    private javax.swing.JButton jButtonAhora;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonCalculo;
    private javax.swing.JButton jButtonSumar;
    private javax.swing.JComboBox jComboBoxUnidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelA�os;
    private javax.swing.JLabel jLabelDesde;
    private javax.swing.JLabel jLabelHasta;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldAgregar;
    private javax.swing.JTextField jTextFieldAhora;
    private javax.swing.JTextField jTextFieldAnyo;
    private javax.swing.JTextField jTextFieldDesde;
    private javax.swing.JTextField jTextFieldDia;
    private javax.swing.JTextField jTextFieldDiaSemana;
    private javax.swing.JTextField jTextFieldFechaHora;
    private javax.swing.JTextField jTextFieldFechaHora1;
    private javax.swing.JTextField jTextFieldHasta;
    private javax.swing.JTextField jTextFieldHora;
    private javax.swing.JTextField jTextFieldMes;
    private javax.swing.JTextField jTextFieldMinutos;
    private javax.swing.JTextField jTextFieldResultado;
    private javax.swing.JTextField jTextFieldSegundos;
    // End of variables declaration//GEN-END:variables
}
