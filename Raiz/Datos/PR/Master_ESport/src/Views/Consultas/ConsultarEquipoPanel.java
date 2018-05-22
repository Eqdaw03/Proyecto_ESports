package Views.Consultas;

import UML.Equipo;
import UML.Jugador;
import UML_DB.DuennoDB;
import UML_DB.EquipoDB;
import UML_DB.JugadorDB;
import UML_DB.MiembroDB;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class ConsultarEquipoPanel extends javax.swing.JPanel {

    public ConsultarEquipoPanel() {
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
            jcEquipos.addItem(equipo.getNombre());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TituloIniciosesion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jcEquipos = new javax.swing.JComboBox<>();
        jlJugador1 = new javax.swing.JLabel();
        jlJugador2 = new javax.swing.JLabel();
        jlJugador3 = new javax.swing.JLabel();
        jlJugador4 = new javax.swing.JLabel();
        jlJugador5 = new javax.swing.JLabel();
        jlJugador6 = new javax.swing.JLabel();
        jlAdvertencia = new javax.swing.JLabel();

        TituloIniciosesion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TituloIniciosesion.setText("Consultar Equipos");

        jLabel1.setText("Elige equipo");

        jcEquipos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcEquiposItemStateChanged(evt);
            }
        });

        jlJugador1.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jlJugador1.setText("-----");

        jlJugador2.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jlJugador2.setText("-----");

        jlJugador3.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jlJugador3.setText("-----");

        jlJugador4.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jlJugador4.setText("-----");

        jlJugador5.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jlJugador5.setText("-----");

        jlJugador6.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jlJugador6.setText("-----");

        jlAdvertencia.setText("-----");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TituloIniciosesion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlAdvertencia, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                        .addGap(343, 343, 343))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlJugador5, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(jlJugador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlJugador3, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jlJugador6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(104, 104, 104))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(TituloIniciosesion)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAdvertencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jlJugador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlJugador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlJugador3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlJugador4)
                    .addComponent(jlJugador5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlJugador6))
                .addGap(231, 231, 231))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcEquiposItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcEquiposItemStateChanged
        try {
            // TODO add your handling code here:
            ArrayList jLabel = new <JLabel> ArrayList();
            jLabel.add(jlJugador1);jLabel.add(jlJugador2);jLabel.add(jlJugador3);jLabel.add(jlJugador4);jLabel.add(jlJugador5);jLabel.add(jlJugador6);
            for (int i = 0; i < jLabel.size(); i++) {
                JLabel jLabelSalida = (JLabel) jLabel.get(i);
                jLabelSalida.setText("-----");
                jlAdvertencia.setText("-----");
            }
            Equipo equipo = EquipoDB.consultarEquipoNom(jcEquipos.getSelectedItem().toString());
            String texto="";
            if (equipo.getJugador().size()==0 || equipo.getJugador()==null) {
                jlAdvertencia.setText("Este equipo no tiene jugadores.");
            }else{
                for (int i = 0; i < equipo.getJugador().size(); i++) {
                    Jugador jugador = (Jugador) equipo.getJugador().get(i);
                    JLabel jLabelSalida = (JLabel) jLabel.get(i);
                    jLabelSalida.setText(jugador.toString());
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jcEquiposItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloIniciosesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> jcEquipos;
    private javax.swing.JLabel jlAdvertencia;
    private javax.swing.JLabel jlJugador1;
    private javax.swing.JLabel jlJugador2;
    private javax.swing.JLabel jlJugador3;
    private javax.swing.JLabel jlJugador4;
    private javax.swing.JLabel jlJugador5;
    private javax.swing.JLabel jlJugador6;
    // End of variables declaration//GEN-END:variables
}
