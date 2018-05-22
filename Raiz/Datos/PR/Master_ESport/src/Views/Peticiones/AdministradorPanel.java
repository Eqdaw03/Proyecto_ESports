package Views.Peticiones;

import Views.AdministrarUsuarios;
import java.awt.BorderLayout;

/**
 *
 * @author Eqdaw03
 */

/**
 * Panel administradorPanel
 * Este Panel nos permite elegir que panel queremos ver del admin
 */

public class AdministradorPanel extends javax.swing.JPanel {

   public void Peticiones(){

       /**
        * Visualizar panel peticiones
        */
       
        Peticiones c1 = new Peticiones();
        c1.setSize(991, 578);
        c1.setLocation(0, 0);

        PAdministradorPrincipal.removeAll();
        PAdministradorPrincipal.add(c1, BorderLayout.CENTER);
        PAdministradorPrincipal.revalidate();
        PAdministradorPrincipal.repaint();
    }
   
    public void AjustesJornadas(){

        /**
        * Visualizar panel JornadaPanel
        */
        
        AjustesJornadasPanel c1 = new AjustesJornadasPanel(this);
        c1.setSize(991, 578);
        c1.setLocation(0, 0);

        PAdministradorPrincipal.removeAll();
        PAdministradorPrincipal.add(c1, BorderLayout.CENTER);
        PAdministradorPrincipal.revalidate();
        PAdministradorPrincipal.repaint();
    }
   
    public void ActualizarAjustesJornadas(){
        BAjusteJornada.doClick();
    }
    
    public void AjustesPartidos(){

        /**
        * Visualizar panel partidosPanel
        */
        
        AjustesPartidosPanel c1 = new AjustesPartidosPanel(this);
        c1.setSize(991, 578);
        c1.setLocation(0, 0);

        PAdministradorPrincipal.removeAll();
        PAdministradorPrincipal.add(c1, BorderLayout.CENTER);
        PAdministradorPrincipal.revalidate();
        PAdministradorPrincipal.repaint();
    }
        
    public void ActualizarAjustesPartidos(){
        BAjustePartidos.doClick();
    }
    
    public void borrar(){

        /**
        * Visualizar panel borrar
        */
        
        Borrar b1 = new Borrar(this);
        b1.setSize(991, 578);
        b1.setLocation(0, 0);

        PAdministradorPrincipal.removeAll();
        PAdministradorPrincipal.add(b1, BorderLayout.CENTER);
        PAdministradorPrincipal.revalidate();
        PAdministradorPrincipal.repaint();
    }
    
    public void actualizarBorrar(){
        BAborrar.doClick();
    }
    
    public void reload(){
    
        BAborrar.doClick();
    }
    
    
   
    public AdministradorPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BPeticiones = new javax.swing.JButton();
        BAjusteJornada = new javax.swing.JButton();
        PAdministradorPrincipal = new javax.swing.JPanel();
        BAjustePartidos = new javax.swing.JButton();
        BAborrar = new javax.swing.JButton();

        BPeticiones.setBackground(new java.awt.Color(255, 255, 255));
        BPeticiones.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BPeticiones.setText("Peticiones");
        BPeticiones.setBorder(null);
        BPeticiones.setBorderPainted(false);
        BPeticiones.setFocusable(false);
        BPeticiones.setOpaque(false);
        BPeticiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPeticionesActionPerformed(evt);
            }
        });

        BAjusteJornada.setBackground(new java.awt.Color(255, 255, 255));
        BAjusteJornada.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BAjusteJornada.setText("Ajustes Jornadas");
        BAjusteJornada.setBorder(null);
        BAjusteJornada.setBorderPainted(false);
        BAjusteJornada.setFocusable(false);
        BAjusteJornada.setOpaque(false);
        BAjusteJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAjusteJornadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PAdministradorPrincipalLayout = new javax.swing.GroupLayout(PAdministradorPrincipal);
        PAdministradorPrincipal.setLayout(PAdministradorPrincipalLayout);
        PAdministradorPrincipalLayout.setHorizontalGroup(
            PAdministradorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 865, Short.MAX_VALUE)
        );
        PAdministradorPrincipalLayout.setVerticalGroup(
            PAdministradorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        BAjustePartidos.setBackground(new java.awt.Color(255, 255, 255));
        BAjustePartidos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BAjustePartidos.setText("Ajustes Partidos");
        BAjustePartidos.setBorder(null);
        BAjustePartidos.setBorderPainted(false);
        BAjustePartidos.setFocusable(false);
        BAjustePartidos.setOpaque(false);
        BAjustePartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAjustePartidosActionPerformed(evt);
            }
        });

        BAborrar.setBackground(new java.awt.Color(255, 255, 255));
        BAborrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BAborrar.setText("Borrar");
        BAborrar.setBorder(null);
        BAborrar.setBorderPainted(false);
        BAborrar.setFocusable(false);
        BAborrar.setOpaque(false);
        BAborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAborrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PAdministradorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BPeticiones, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BAjusteJornada, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(BAjustePartidos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BAborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BPeticiones)
                    .addComponent(BAjusteJornada)
                    .addComponent(BAjustePartidos)
                    .addComponent(BAborrar))
                .addGap(52, 52, 52)
                .addComponent(PAdministradorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BPeticionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPeticionesActionPerformed

        Peticiones();
    }//GEN-LAST:event_BPeticionesActionPerformed

    private void BAjusteJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAjusteJornadaActionPerformed

         AjustesJornadas();
    }//GEN-LAST:event_BAjusteJornadaActionPerformed

    private void BAjustePartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAjustePartidosActionPerformed

        AjustesPartidos();
    }//GEN-LAST:event_BAjustePartidosActionPerformed

    private void BAborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAborrarActionPerformed

        borrar();
    }//GEN-LAST:event_BAborrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAborrar;
    private javax.swing.JButton BAjusteJornada;
    private javax.swing.JButton BAjustePartidos;
    private javax.swing.JButton BPeticiones;
    private javax.swing.JPanel PAdministradorPrincipal;
    // End of variables declaration//GEN-END:variables
}
