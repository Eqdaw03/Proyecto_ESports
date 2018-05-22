package Views.Secundarios;

import UML.Duenno;
import UML.Equipo;
import UML.Usuario;
import UML_DB.DuennoDB;
import UML_DB.EquipoDB;
import exceptions.MyException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;
import master_esport.*;

/**
 *
 * @author Eqdaw03
 */

/**
 * Panel crearEquiposPanel
 * Este Panel nos permite crear un equipo
 */

public class CrearEquiposPanel extends javax.swing.JPanel {

    Usuario usuario = new Usuario();
    public CrearEquiposPanel() {
        initComponents();
    }

    /**
     * Esta función nos permite saber si un dueño ya tiene un equipo creado
     */
    
    public void cargarDatos(Usuario usuario) throws Exception{
        this.usuario = usuario;
        if (EquipoDB.consultarEquipoCodDuenno(usuario.getCodusuario())!=null) {
            jbCrear.setEnabled(false);
            jlAviso.setText("Ya tienes tu equipo creado, elimínalo en la pertaña de modificaciones");
        }
        
    }
    
    public void validar() throws MyException{
    
        Master_ESport.validar(6, TNombredelequipo.getText(), "^[A-Z]{1}[A-z0-9]{2,}$");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        TNombredelequipo = new javax.swing.JTextField();
        TituloCrearEquipos = new javax.swing.JLabel();
        LNombredelequipo = new javax.swing.JLabel();
        jbCrear = new javax.swing.JButton();
        jlAviso = new javax.swing.JLabel();

        TituloCrearEquipos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TituloCrearEquipos.setText("Crear equipos");

        LNombredelequipo.setText("Nombre del equipo");

        jbCrear.setText("CREAR");
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(TituloCrearEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(LNombredelequipo)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlAviso)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TNombredelequipo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbCrear)))))
                .addContainerGap(381, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(TituloCrearEquipos)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LNombredelequipo)
                    .addComponent(TNombredelequipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCrear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlAviso)
                .addContainerGap(323, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed
        
        try {                                        
            
            /**
             * Nos permite crear un equipo con su dueño
             */
            
            validar();
            
            Equipo equipo = new Equipo();
            Duenno duenno = new Duenno();
            try {
                duenno = DuennoDB.consultarDuennoNickName(usuario.getNickname());
                equipo.setNombre(TNombredelequipo.getText());
                duenno.setCodusuario(duenno.getCodusuario());
                equipo.setDuenno(duenno);
                Master_ESport.peticionEquipo(equipo, duenno, "equipo");
                showMessageDialog(this, "Petición realizada, espere a que acepte el administrador");
                
                TNombredelequipo.setText(null);
                jbCrear.setEnabled(false);
                
            } catch (Exception ex) {
                Logger.getLogger(CrearEquiposPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (MyException ex) {
            
            showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jbCrearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LNombredelequipo;
    private javax.swing.JTextField TNombredelequipo;
    private javax.swing.JLabel TituloCrearEquipos;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton jbCrear;
    private javax.swing.JLabel jlAviso;
    // End of variables declaration//GEN-END:variables
}
