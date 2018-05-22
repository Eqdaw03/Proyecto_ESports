package Views.Peticiones;

import UML.Equipo;
import UML.Jugador;
import UML.Usuario;
import UML_DB.EquipoDB;
import UML_DB.JugadorDB;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import master_esport.Master_ESport;

/**
 *
 * @author Eqdaw03
 */

/**
 * Clase borrar
 * Esta clase nos permite borrar diferentes objetos
 */

public class Borrar extends javax.swing.JPanel {
    private AdministradorPanel superP;
    
    public Borrar(AdministradorPanel superP) {
        initComponents();
        this.superP=superP;
        equipos();
        usuarios();
        jugadores();
    }
    
    /**
     * Función para recoger los equipos
     */
    
    public void equipos(){
    
        try {
            
            Master_ESport.datosEquipos(jcEquipo);
            
        } catch (Exception ex) {
            
            Logger.getLogger(Borrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Función para recoger los usuarios
     */
    
    public void usuarios(){
    
        try {
            
            Master_ESport.datosUsuarios(jcUsuario);
            
        } catch (Exception ex) {
            
            Logger.getLogger(Borrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Función para recoger los jugadores
     */
    
    public void jugadores(){
    
        try {
            
            Master_ESport.datosJugadores(jcJugador);
            
        } catch (Exception ex) {
            
            Logger.getLogger(Borrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcEquipo = new javax.swing.JComboBox<>();
        jcUsuario = new javax.swing.JComboBox<>();
        jcJugador = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Equipos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Usuarios");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Jugadores");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton1.setText("Borrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Borrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jcEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton1)))
                .addGap(96, 96, 96)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jcUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jcJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButton3)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel1)
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(59, 59, 59))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(55, 55, 55)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jcEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jcUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jcJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(jButton3)))
                        .addGap(0, 219, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        /**
         * Borrar un equipo seleccionado
         */
        
        try {
            
            if(showConfirmDialog(this, "¿Seguro que quieres eliminar este equipo?"+"\n"+"Sus jugadores se quedarán sin equipo")==0){
            
                Equipo e1 = EquipoDB.consultarEquipoNom(jcEquipo.getSelectedItem().toString());
                
                JugadorDB.quitarJugadorEquipo(e1);
                EquipoDB.borrarEquipo(e1.getCodequipo());
                showMessageDialog(this, "Equipo eliminado");
                superP.actualizarBorrar();
            }

        } catch (Exception e) {
            
            showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        /**
         * Borrar un usuario seleccionado
         */
        
        try {
            
            Usuario u1 = Master_ESport.tipoUsuario(jcUsuario.getSelectedItem().toString());
            
            String mensaje = "";
            
            if(u1.getPermiso().equals("administrador")){
            
                mensaje = "Este usuario es una administrador";
            }
            else if(u1.getPermiso().equals("duenno")){
            
                mensaje = "Este usuario es un dueño, si lo borras eliminarás su equipo";
            }
            else{
            
                mensaje = "Este usuario es un miembro";
            }
            
            if(showConfirmDialog(this, "¿Seguro que quieres eliminar a este usuario?"+"\n"+mensaje)==0){
            
                Master_ESport.borrarUsuario(u1.getNickname());
                
                showMessageDialog(this, "Usuario eliminado");
                superP.actualizarBorrar();
            }

        } catch (Exception e) {
            
            showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        /**
         * Borrar un jugador seleccionado
         */
        
        try {
            
            Jugador n1 = Master_ESport.verJugadorES(jcJugador.getSelectedItem().toString());
            
            String mensaje = "";
            
            if(n1.getEquipo() == null){
            
                mensaje = "Jugador sin equipo";
            }
            else{
            
                mensaje = "Este jugador esta en un equipo";
            }
            
            if(showConfirmDialog(this, "¿Seguro que quieres eliminar a este jugador?"+"\n"+mensaje)==0){
            
                Master_ESport.borrarJugador(n1.getNickname());

                showMessageDialog(this, "Jugador eliminado");
                superP.actualizarBorrar();
            }

        } catch (Exception e) {
            
            showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> jcEquipo;
    private javax.swing.JComboBox<String> jcJugador;
    private javax.swing.JComboBox<String> jcUsuario;
    // End of variables declaration//GEN-END:variables
}
