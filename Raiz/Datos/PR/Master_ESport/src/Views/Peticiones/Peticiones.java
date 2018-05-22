
package Views.Peticiones;

import UML.Duenno;
import UML.Equipo;
import UML.Jugador;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import static javax.swing.JOptionPane.showMessageDialog;
import master_esport.Master_ESport;

/**
 *
 * @author Eqdaw03
 */

/**
 * Ventana peticiones
 * Esta clase nos sirve para hacer las distintas peticiones que hay.
 */

public class Peticiones extends javax.swing.JPanel {
    
    public Peticiones() {
        initComponents();
        listaPeticiones();
    }
    
    /**
     * Esta función nos permite cargar los datos de las peticiones y meterlos en un panel para poder verlas
     */
    public void listaPeticiones(){
    
        try {
            
            Master_ESport.verPeticionDuennos();
            Master_ESport.verPeticionEquipos();
            Master_ESport.verPeticionJugadores();
            
            jpl.setModel(Master_ESport.list);

            
        } catch (Exception ex) {
            Logger.getLogger(Peticiones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Esta función nos permite aceptar una peticion de dueño.
     * Eliminar la peticion de la tabla de peticiones y la insertar en la tabla de dueño
     */
    public void aceptarPeticionDuenno(int r){
    
        try {
            
            ArrayList <Duenno> d = Master_ESport.verPeticionDuenno();
            Master_ESport.anadirDuenno(d.get(r));
            Master_ESport.borrarPeticion(d.get(r).getNickname());
            
            Master_ESport.list.remove(r);
            
            showMessageDialog(this, "Peticion aceptada");
            
        }
        catch (Exception e) {
            
            showMessageDialog(this, "Seleccione la primera peticion");
        }
    }
    
    /**
     * Esta función nos permite denegar una peticion de dueño.
     * Eliminar la peticion de la tabla de peticiones
     */
    public void denegarPeticionDuenno(int r){
        
        try {
            
            ArrayList <Duenno> d = Master_ESport.verPeticionDuenno();
            Master_ESport.borrarPeticion(d.get(r).getNickname());
            
            Master_ESport.list.remove(r);
            
            showMessageDialog(this, "Peticion denegada");
            
        }
        catch (Exception e) {
            
            showMessageDialog(this, "Seleccione la primera peticion");
        }

    }
    
    /**
     * Esta función nos permite aceptar una peticion de equipo.
     * Eliminar la peticion de la tabla de peticiones y la insertar en la tabla de equipo
     */
    public void aceptarPeticionEquipo(int r){
        
        try {
                         
            ArrayList <Equipo> d = Master_ESport.verPeticionEquipo();
            
            Master_ESport.anadirEquipo(d.get(r));
            Master_ESport.borrarPeticionN(d.get(r).getNombre());
            
            Master_ESport.list.remove(r);
            
            showMessageDialog(this, "Peticion aceptada");
            
        }
        catch (Exception e) {
            
            showMessageDialog(this, "Seleccione la primera peticion");
        }
    }
    
    /**
     * Esta función nos permite aceptar una denegar de equipo.
     * Eliminar la peticion de la tabla de peticiones
     */
    public void denegarPeticionEquipo(int r){
    
        try {
            
            ArrayList <Equipo> d = Master_ESport.verPeticionEquipo();
            Master_ESport.borrarPeticionN(d.get(r).getNombre());
            
            Master_ESport.list.remove(r);
            
            showMessageDialog(this, "Peticion denegada");
            
        }
        catch (Exception e) {
            
            showMessageDialog(this, "Seleccione la primera peticion");
        }

    }
    
    /**
     * Esta función nos permite aceptar una peticion de jugador.
     * Eliminar la peticion de la tabla de peticiones y la insertar en la tabla de jugador
     */
    public void aceptarPeticionJugador(int r){
        
        try {
                         
            ArrayList <Jugador> d = Master_ESport.verPeticionJugador();
            
            Master_ESport.anadirJugador(d.get(r));
            Master_ESport.borrarPeticion(d.get(r).getNickname());
            
            Master_ESport.list.remove(r);
            
            showMessageDialog(this, "Peticion aceptada");
            
        }
        catch (Exception e) {
            
            showMessageDialog(this, "Seleccione la primera peticion");
        }
    }
    
    /**
     * Esta función nos permite aceptar una denegar de jugador.
     * Eliminar la peticion de la tabla de peticiones
     */
    public void denegarPeticionJugador(int r){
    
        try {
            
            ArrayList <Jugador> d = Master_ESport.verPeticionJugador();
            Master_ESport.borrarPeticion(d.get(r).getNickname());
            
            Master_ESport.list.remove(r);
            
            showMessageDialog(this, "Peticion denegada");
            
        }
        catch (Exception e) {
            
            showMessageDialog(this, "Seleccione la primera peticion");
        }

    }
    

            @SuppressWarnings("unchecked")
            // <editor-fold defaultstate="collapsed" desc="Generated Code">
            
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDuenno = new javax.swing.JScrollPane();
        jpl = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jDuenno.setViewportView(jpl);

        jButton1.setForeground(new java.awt.Color(51, 255, 51));
        jButton1.setText("✔");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("✖");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jDuenno, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(229, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jDuenno, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(262, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        /**
         * Con este botón aceptamos una peticion seleccionada
         */
        if(jpl.getSelectedIndex()==-1){

            showMessageDialog(this, "Seleccione una peticion por favor");
        }
        else{
            if(jpl.getSelectedValue().substring(15, 21).equals("duenno")){

                aceptarPeticionDuenno(jpl.getSelectedIndex());
            }
            else if(jpl.getSelectedValue().substring(15, 21).equals("equipo")){

                aceptarPeticionEquipo(jpl.getSelectedIndex());
            }
            else if(jpl.getSelectedValue().substring(15, 22).equals("jugador")){

                aceptarPeticionJugador(jpl.getSelectedIndex());
            }
        }
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        /**
         * Con este botón denegamos una peticion seleccionada
         */
        if(jpl.getSelectedIndex()==-1){

            showMessageDialog(this, "Seleccione una peticion por favor");
        }
        else{
            
            if(jpl.getSelectedValue().substring(15, 21).equals("duenno")){

                denegarPeticionDuenno(jpl.getSelectedIndex());
            }
            else if(jpl.getSelectedValue().substring(15, 21).equals("equipo")){

                denegarPeticionEquipo(jpl.getSelectedIndex());
            }
            else if(jpl.getSelectedValue().substring(15, 22).equals("jugador")){

                denegarPeticionJugador(jpl.getSelectedIndex());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jDuenno;
    private javax.swing.JList<String> jpl;
    // End of variables declaration//GEN-END:variables
}
