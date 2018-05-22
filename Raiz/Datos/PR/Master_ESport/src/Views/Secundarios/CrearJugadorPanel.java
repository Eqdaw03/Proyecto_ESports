package Views.Secundarios;

import UML.Equipo;
import UML.Jugador;
import UML.Usuario;
import UML_DB.EquipoDB;
import UML_DB.JugadorDB;
import Views.Consultas.ConsultarEquipoPanel;
import exceptions.MyException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;
import master_esport.Master_ESport;

/**
 *
 * @author Eqdaw03
 */

/**
 * Panel crearJugadorPanel
 * Este Panel nos permite crear un jugador
 */

public class CrearJugadorPanel extends javax.swing.JPanel {

    private Usuario usuario;
    
    public CrearJugadorPanel(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        rellenarCombo();
    }

    /**
     * Esta función nos permite ver el equipo que tiene el dueño conectado
     */
    
    public void rellenarCombo(){
        Equipo equipo=null;
        try {
            equipo = EquipoDB.consultarEquipoCodDuenno(usuario.getCodusuario());
        } catch (Exception ex) {
            Logger.getLogger(ConsultarEquipoPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
            if(equipo!=null){
                CEquipo.addItem(equipo.getNombre());
            }
    }
    
    public void validar() throws MyException{
    
        Master_ESport.validar(1, TNickname.getText(), "^[A-Z]{1}[A-z0-9]{2,}$");
        Master_ESport.validar(2, TNombre.getText(), "^[A-Z]{1}[A-z0-9]{2,}$");
        Master_ESport.validar(3, TApellidos.getText(), "^[A-Z]{1}[A-z0-9]{2,}$");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LNombre = new javax.swing.JLabel();
        LApellidos = new javax.swing.JLabel();
        LNickname = new javax.swing.JLabel();
        LEquipo = new javax.swing.JLabel();
        TNombre = new javax.swing.JTextField();
        CEquipo = new javax.swing.JComboBox<>();
        TNickname = new javax.swing.JTextField();
        TApellidos = new javax.swing.JTextField();
        TituloAltaJugador = new javax.swing.JLabel();
        jbCrear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TSueldo = new javax.swing.JTextField();

        LNombre.setText("Nombre");

        LApellidos.setText("Apellidos");

        LNickname.setText("Nickname");

        LEquipo.setText("Equipo");

        CEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----" }));
        CEquipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CEquipoItemStateChanged(evt);
            }
        });
        CEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEquipoActionPerformed(evt);
            }
        });

        TituloAltaJugador.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TituloAltaJugador.setText("Alta jugador");

        jbCrear.setText("CREAR");
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });

        jLabel1.setText("Sueldo");

        TSueldo.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(TituloAltaJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LApellidos)
                            .addComponent(LNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LNickname))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(454, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(LEquipo)))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbCrear))
                            .addComponent(TSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(TituloAltaJugador)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LNombre)
                    .addComponent(TNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LApellidos)
                    .addComponent(TApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LNickname)
                    .addComponent(TNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(TSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LEquipo)
                    .addComponent(CEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCrear))
                .addContainerGap(163, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CEquipoActionPerformed

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed
        
        /**
         * Nos permite crear un jugador sin equipo o con equipo
         * tambien verificar si dicho jugador ya esta creado por su nickname
         */
        
        
        
        try {
            
            validar();
            
            Jugador jugador = new Jugador();
            jugador.setNombre(TNombre.getText());
            jugador.setApellido(TApellidos.getText());
            jugador.setNickname(TNickname.getText());
            if (JugadorDB.consultarJugadorNickSinEquipo(TNickname.getText())!=null) {
                showMessageDialog(this, "Nickname ocupado, prueba con otro.");
            }else
                if (CEquipo.getSelectedItem().toString()=="-----") {
                    Master_ESport.peticionJugador(jugador, null, "jugador");
                    javax.swing.JOptionPane.showMessageDialog(this, "Peticion Jugador Creada");
                    this.paintAll(this.getGraphics());  
                }else{
                    
                    if(Double.parseDouble(TSueldo.getText())<760){
                    
                        throw new MyException(7);
                    }
                    
                    jugador.setSueldo(Double.parseDouble(TSueldo.getText()));
                    Equipo equipo = EquipoDB.consultarEquipoNom(CEquipo.getSelectedItem().toString());
                    jugador.setEquipo(equipo);
                    Master_ESport.peticionJugador(jugador, equipo, "jugador");
                    this.paintAll(this.getGraphics());  
                    javax.swing.JOptionPane.showMessageDialog(this, "Peticion Jugador Creada");
                }
            
            TNombre.setText(null);
            TApellidos.setText(null);
            TNickname.setText(null);
            TSueldo.setText(null);
            CEquipo.setSelectedIndex(0);
        } 
        catch (MyException e){
        
            showMessageDialog(this, e.getMessage());
        }
        catch (Exception ex) {javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());}
    }//GEN-LAST:event_jbCrearActionPerformed

    private void CEquipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CEquipoItemStateChanged
        
        /**
         * Nos permite hibilitar o dehabilitar el texfield de sueldo
         * dependiendo si el jugador va a estar en un equipo o no
         */
        
        if (CEquipo.getSelectedItem().toString()!="-----") {
            TSueldo.setEnabled(true);
        }else
            TSueldo.setEnabled(false);
            TSueldo.setText("");
    }//GEN-LAST:event_CEquipoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CEquipo;
    private javax.swing.JLabel LApellidos;
    private javax.swing.JLabel LEquipo;
    private javax.swing.JLabel LNickname;
    private javax.swing.JLabel LNombre;
    private javax.swing.JTextField TApellidos;
    private javax.swing.JTextField TNickname;
    private javax.swing.JTextField TNombre;
    private javax.swing.JTextField TSueldo;
    private javax.swing.JLabel TituloAltaJugador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbCrear;
    // End of variables declaration//GEN-END:variables
}
