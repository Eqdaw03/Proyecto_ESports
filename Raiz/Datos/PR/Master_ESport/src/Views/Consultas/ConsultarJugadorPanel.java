/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Consultas;

import UML.Equipo;
import UML.Jugador;
import UML_DB.EquipoDB;
import UML_DB.JugadorDB;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1gdaw09
 */
public class ConsultarJugadorPanel extends javax.swing.JPanel {

    /**
     * Creates new form ConsultarJugadorPanel
     */
    public ConsultarJugadorPanel() {
        initComponents();
        rellenarCombo();
    }

    public void rellenarCombo(){
        ArrayList equipos=null;
        try {
            equipos = EquipoDB.listaEquipo();
        } catch (Exception ex) {
            Logger.getLogger(ConsultarEquipoPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < equipos.size(); i++) {
            Equipo equipo = (Equipo) equipos.get(i);
            CConsultarEquipo.addItem(equipo.getNombre());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TBuscarNickname = new javax.swing.JTextField();
        LPerteneceA = new javax.swing.JLabel();
        TituloConsultarJugador = new javax.swing.JLabel();
        LConsultarEquipo = new javax.swing.JLabel();
        CConsultarEquipo = new javax.swing.JComboBox<>();
        LConsultarJugador = new javax.swing.JLabel();
        CConsultarJugador = new javax.swing.JComboBox<>();
        LDatosdeJugador = new javax.swing.JLabel();
        LNickname = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jtaDatos = new javax.swing.JLabel();
        jtaPertenece = new javax.swing.JLabel();

        LPerteneceA.setText("Pertenece a:");

        TituloConsultarJugador.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TituloConsultarJugador.setText("Consultar Jugador");

        LConsultarEquipo.setText("Equipo");

        CConsultarEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----" }));
        CConsultarEquipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CConsultarEquipoItemStateChanged(evt);
            }
        });

        LConsultarJugador.setText("Jugador");

        CConsultarJugador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----" }));
        CConsultarJugador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CConsultarJugadorItemStateChanged(evt);
            }
        });

        LDatosdeJugador.setText("Datos del jugador");

        LNickname.setText("Nickname");

        jbBuscar.setText("BUSCAR");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jtaDatos.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N

        jtaPertenece.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(LPerteneceA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtaPertenece, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LDatosdeJugador))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(TituloConsultarJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(LConsultarEquipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CConsultarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LConsultarJugador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CConsultarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LNickname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TBuscarNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbBuscar)
                .addGap(0, 60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(TituloConsultarJugador)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LConsultarEquipo)
                    .addComponent(CConsultarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LConsultarJugador)
                    .addComponent(CConsultarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LNickname)
                    .addComponent(TBuscarNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LPerteneceA)
                        .addComponent(jtaPertenece, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LDatosdeJugador, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CConsultarEquipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CConsultarEquipoItemStateChanged

        if (CConsultarEquipo.getSelectedItem().equals("-----")) {
            CConsultarJugador.removeAllItems();
        }else{
            TBuscarNickname.setText("");
            CConsultarJugador.setEnabled(true);
            try {
                // TODO add your handling code here:
                CConsultarJugador.removeAllItems();
                Equipo equipo = EquipoDB.consultarEquipoNom(CConsultarEquipo.getSelectedItem().toString());
                if (equipo.getJugador().size()==0 || equipo.getJugador()==null) {
                    CConsultarJugador.addItem("Sin jugadores");
                }else{
                    for (int i = 0; i < equipo.getJugador().size(); i++) {
                        Jugador jugador = (Jugador) equipo.getJugador().get(i);
                        CConsultarJugador.addItem(jugador.getNickname());
                    }
                }
            } catch (Exception ex) {
                javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_CConsultarEquipoItemStateChanged

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        CConsultarJugador.setEnabled(false);
        CConsultarJugador.removeAllItems();
        Jugador jugador;
        CConsultarEquipo.setSelectedIndex(0);
        try {
            jugador = JugadorDB.consultarJugadorNick(TBuscarNickname.getText());
        } catch (Exception ex) {jugador=null;}
        
        if (jugador==null) {
            jtaPertenece.setText("<html><h5>Jugador no encontrado</h5></html>");
            jtaDatos.setText("<html><h5>Jugador no encontrado</h5></html>");
        }else{
            jtaPertenece.setText(jugador.getEquipo().getNombre());
            jtaDatos.setText(jugador.toString());
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void CConsultarJugadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CConsultarJugadorItemStateChanged
        if (CConsultarJugador.isEnabled()) {
            Jugador jugador;
            try {
                jugador = JugadorDB.consultarJugadorNick(CConsultarJugador.getSelectedItem().toString());
            } catch (Exception ex) {jugador=null;}

            if (jugador==null) {
                jtaPertenece.setText("<html><h5>Jugador no encontrado</h5></html>");
                jtaDatos.setText("<html><h5>Jugador no encontrado</h5></html>");
            }else{
                jtaPertenece.setText(jugador.getEquipo().getNombre());
                jtaDatos.setText(jugador.toString());
            }
        }
    }//GEN-LAST:event_CConsultarJugadorItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CConsultarEquipo;
    private javax.swing.JComboBox<String> CConsultarJugador;
    private javax.swing.JLabel LConsultarEquipo;
    private javax.swing.JLabel LConsultarJugador;
    private javax.swing.JLabel LDatosdeJugador;
    private javax.swing.JLabel LNickname;
    private javax.swing.JLabel LPerteneceA;
    private javax.swing.JTextField TBuscarNickname;
    private javax.swing.JLabel TituloConsultarJugador;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JLabel jtaDatos;
    private javax.swing.JLabel jtaPertenece;
    // End of variables declaration//GEN-END:variables
}
