package Views.Peticiones;

import UML.Equipo;
import UML_DB.EquipoDB;
import UML_DB.JornadaDB;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import master_esport.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Eqdaw03
 */

/**
 * Panel ajustesJornadasPanel
 * Este Panel nos permite crear las jornadas
 */

public class AjustesJornadasPanel extends javax.swing.JPanel {

    private AdministradorPanel superP;
    
    public AjustesJornadasPanel(AdministradorPanel superP) {
        initComponents();
        this.superP = superP;
        comprobarJornada();
        cargaInicial();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        tbJornada = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jlAdvertencia = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlEquiposND = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlEquiposD = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jLabel1.setText("EQUIPOS NO DISPONIBLES:");

        tbJornada.setText("INICIAR");
        tbJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbJornadaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jLabel2.setText("EQUIPOS DISPONIBLES:");

        jlEquiposND.setEditable(false);
        jlEquiposND.setColumns(20);
        jlEquiposND.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jlEquiposND.setRows(5);
        jlEquiposND.setOpaque(false);
        jScrollPane1.setViewportView(jlEquiposND);

        jlEquiposD.setEditable(false);
        jlEquiposD.setColumns(20);
        jlEquiposD.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jlEquiposD.setRows(5);
        jlEquiposD.setOpaque(false);
        jScrollPane2.setViewportView(jlEquiposD);

        jLabel3.setText("Mínimo 5 Jugadores.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(281, 281, 281)
                                .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(tbJornada))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jlAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(99, 99, 99))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                .addGap(127, 127, 127)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)))))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tbJornada)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbJornadaActionPerformed

        /**
         * Iniciar una liga con sus jornadas y finalizarla
         */
        
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
        Date date = new Date();
            switch (tbJornada.getText()){
                case "INICIAR":
                    if (jdcFecha.getDate()==null) {
                        showMessageDialog(this, "Elige una fecha.");
                    }else{
                        if (sdf.format(date).compareTo(sdf.format(jdcFecha.getDate()))>-1) {
                            showMessageDialog(this, "Elige una fecha correcta.");
                        }else{
                        master_esport.Master_ESport.crearCalendario(master_esport.Master_ESport.cambiarFormato(String.valueOf(sdf.format(jdcFecha.getDate()))));
                        superP.ActualizarAjustesJornadas();
                        }
                    }
                    break;
                case "FINALIZAR" : {
                        try {
                            JornadaDB.borrarTodasJornadas();
                            superP.ActualizarAjustesJornadas();
                        } catch (Exception ex) {
                            Logger.getLogger(AjustesJornadasPanel.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        }
                    break;
        }
    }//GEN-LAST:event_tbJornadaActionPerformed

    /**
     * Función para cargar los datos de los equipos que disponen de los requisitos para las jornadas
     * y los equipos que no disponen de dichos requisitos.
     */
    
    public void cargaInicial(){
        String equiposText = "";
        String equiposNoText = "";
        try {
            ArrayList listaEquipos = EquipoDB.listaEquipo();
            ArrayList equiposJuegan = new ArrayList();
            for (int i = 0; i < listaEquipos.size(); i++) {
                Equipo equipo = (Equipo) listaEquipos.get(i);
                if (equipo.getJugador()==null) {
                    equiposNoText = equiposNoText + equipo.getNombre()+" \n";
                }else{
                    if (equipo.getJugador().size()<5) {
                        equiposNoText = equiposNoText + equipo.getNombre()+" \n";
                    }else{
                        equiposText = equiposText + equipo.getNombre()+" \n";
                        equiposJuegan.add(equipo);
                    }
                }
            }
            if (equiposJuegan.size()<3 && tbJornada.getText().equalsIgnoreCase("INICIAR")) {
                tbJornada.setEnabled(false);
                jlAdvertencia.setText("No hay equipos suficientes para iniciar la jornada.(3 mínimo).");
            }
            else if(equiposJuegan.size()%2!=0){
                tbJornada.setEnabled(false);
                jlAdvertencia.setText("El número de equipos que juegan debe ser par");
            }
            jlEquiposD.setText(equiposText);
            jlEquiposND.setText(equiposNoText);
        } catch (Exception ex) {
        }
        }
        
    public void comprobarJornada(){
        try {
            if (JornadaDB.listaJornada().size()==0) {
                tbJornada.setText("INICIAR");
            }else{
                tbJornada.setText("FINALIZAR");
            }
        } catch (Exception ex) {
            Logger.getLogger(AjustesJornadasPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JLabel jlAdvertencia;
    private javax.swing.JTextArea jlEquiposD;
    private javax.swing.JTextArea jlEquiposND;
    private javax.swing.JButton tbJornada;
    // End of variables declaration//GEN-END:variables
}
