package Views.Peticiones;

import UML.Jornada;
import UML.Partido;
import UML_DB.JornadaDB;
import UML_DB.PartidoDB;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eqdaw03
 */

/**
 * Panel ajustesPartidosPanel
 * Este Panel nos permite ajustar los resultados de los partidos
 */

public class AjustesPartidosPanel extends javax.swing.JPanel {

    AdministradorPanel superP;
    
    /**
     *
     * @param superP
     */
    public AjustesPartidosPanel(AdministradorPanel superP) {
        initComponents();
        this.superP = superP;
        cargaInicial();
    }

    /**
     * Carga inical de datos.
     */
    public void cargaInicial(){
        try {
            ArrayList jornadas = JornadaDB.listaJornada();
            for (int i = 0; i < jornadas.size(); i++) {
                Jornada jornada = (Jornada) jornadas.get(i);
                jcbJornada.addItem(String.valueOf(jornada.getCodJornada()));
            }
             
        } catch (Exception ex){
            Logger.getLogger(AjustesPartidosPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbJornada = new javax.swing.JComboBox<>();
        jcbPartido = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfRV = new javax.swing.JTextField();
        tfRL = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jlLocal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("Elegir Jornada");

        jLabel2.setText("Elegir Partido");

        jcbJornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----" }));
        jcbJornada.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbJornadaItemStateChanged(evt);
            }
        });

        jcbPartido.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbPartidoItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Resultado Local");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Resultado Visitante");

        tfRV.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        tfRV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfRV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRVActionPerformed(evt);
            }
        });

        tfRL.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        tfRL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfRL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRLActionPerformed(evt);
            }
        });

        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jlLocal.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jlLocal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLocal.setText("----------");

        jLabel6.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("----------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfRL)
                            .addComponent(jlLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                        .addGap(49, 49, 49)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jbGuardar)
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(tfRV))))
                .addGap(0, 130, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbJornada, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbJornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLocal)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jbGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfRV, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfRL, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(187, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfRVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRVActionPerformed

    private void tfRLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRLActionPerformed

    private void jcbJornadaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbJornadaItemStateChanged
        
        /**
         * Nos permite recoger los datos de las jornadas con sus partidos
         */
        
        try {
            jcbPartido.removeAllItems();
            ArrayList partidos = PartidoDB.listaPartidoPorJornada(Integer.parseInt(jcbJornada.getSelectedItem().toString()));
            for (int i = 0; i < partidos.size(); i++) {
                Partido partidoP = (Partido) partidos.get(i);
                jcbPartido.addItem(partidoP.getLocal().getNombre() + " VS "+ partidoP.getVisitante().getNombre());
            }
        } catch (Exception ex) {
            Logger.getLogger(AjustesPartidosPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jcbJornadaItemStateChanged

    private void jcbPartidoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbPartidoItemStateChanged
        
        /**
         * Nos permite recoger los datos de los partidos ya creados y sus resultados
         */
        
        try {
            Jornada jornada = JornadaDB.consultarJornada(Integer.parseInt(jcbJornada.getSelectedItem().toString()));
            ArrayList partidos = PartidoDB.listaPartidoPorJornada(jornada.getCodJornada());
            if (jcbPartido.getSelectedItem()!=null) {
                Partido partido = (Partido) partidos.get(jcbPartido.getSelectedIndex());
                jlLocal.setText(partido.getLocal().getNombre());
                jLabel6.setText(partido.getVisitante().getNombre());
                tfRL.setText(partido.getResultadoEL().toString());
                tfRV.setText(partido.getResultadoEV().toString());
            }
                    } catch (Exception ex) {
            Logger.getLogger(AjustesPartidosPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jcbPartidoItemStateChanged

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        /**
         * Nos permite cambiar los resultados de los partidos seleccionados
         */
        
        try {
            Jornada jornada = JornadaDB.consultarJornada(Integer.parseInt(jcbJornada.getSelectedItem().toString()));
            ArrayList partidos = PartidoDB.listaPartidoPorJornada(Integer.parseInt(jcbJornada.getSelectedItem().toString()));
            Partido partido = (Partido) partidos.get(jcbPartido.getSelectedIndex());
            partido.setResultadoEL(Integer.parseInt(tfRL.getText()));
            partido.setResultadoEV(Integer.parseInt(tfRV.getText()));
            partido.setJugado(true);
            PartidoDB.actualizarPartido(partido);
            superP.ActualizarAjustesPartidos();
        } catch (Exception ex) {
            Logger.getLogger(AjustesPartidosPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox<String> jcbJornada;
    private javax.swing.JComboBox<String> jcbPartido;
    private javax.swing.JLabel jlLocal;
    private javax.swing.JTextField tfRL;
    private javax.swing.JTextField tfRV;
    // End of variables declaration//GEN-END:variables
}
