package Views;

import exceptions.MyException;
import static javax.swing.JOptionPane.showMessageDialog;
import master_esport.Master_ESport;

/**
 *
 * @author Eqdaw03
 */

/**
 * Panel registroPanel
 * Este Panel nos permite recoger los datos del registro de un usuario y registrar dicho usuario
 */

public class RegistroPanel extends javax.swing.JPanel {

    public RegistroPanel() {
        initComponents();
    }
    
    /**
     * Función para saber los permisos del usuario registrado
     */
    
    public String permiso(){
    
        String permiso = "";
        
        if(jcDuenno.isSelected()){
        
            permiso = "duenno";
        }
        else{
        
            permiso = "usuario";
        }
        
        return permiso;
    }

    public void validar() throws MyException{
    
        Master_ESport.validar(1, txNickname.getText(), "^[A-Z]{1}[A-z0-9]{2,}$");
        Master_ESport.validar(2, txNombre.getText(), "^[A-Z]{1}[A-z0-9]{2,}$");
        Master_ESport.validar(3, txApellido.getText(), "^[A-Z]{1}[A-z0-9]{2,}$");
        String passText = new String(txContrasena.getPassword());
        Master_ESport.validar(4, passText, "^[A-z0-9]{5,}$");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LCrearContraseña = new javax.swing.JLabel();
        txNickname = new javax.swing.JTextField();
        txApellido = new javax.swing.JTextField();
        txContrasena = new javax.swing.JPasswordField();
        txNombre = new javax.swing.JTextField();
        BCrearUsuario = new javax.swing.JButton();
        LCrearNombredeUsuario = new javax.swing.JLabel();
        LCrearNombre = new javax.swing.JLabel();
        LCrearApellidos = new javax.swing.JLabel();
        jcDuenno = new javax.swing.JCheckBox();
        cVerpass = new javax.swing.JCheckBox();

        LCrearContraseña.setText("Contraseña");

        BCrearUsuario.setText("Crear Usuario");
        BCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCrearUsuarioActionPerformed(evt);
            }
        });

        LCrearNombredeUsuario.setText("Nombre de usuario");

        LCrearNombre.setText("Nombre");

        LCrearApellidos.setText("Apellidos");

        jcDuenno.setText("¿Dueño?");

        cVerpass.setText("Ver ");
        cVerpass.setOpaque(false);
        cVerpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cVerpassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LCrearNombredeUsuario)
                            .addComponent(LCrearContraseña)
                            .addComponent(LCrearNombre)
                            .addComponent(jcDuenno))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(BCrearUsuario))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txContrasena)
                                    .addComponent(txNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(cVerpass))))
                    .addComponent(LCrearApellidos))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LCrearNombredeUsuario)
                    .addComponent(txNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LCrearNombre)
                    .addComponent(txNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LCrearApellidos)
                    .addComponent(txApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LCrearContraseña)
                    .addComponent(cVerpass))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcDuenno)
                    .addComponent(BCrearUsuario))
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCrearUsuarioActionPerformed

      /**
       * Función para recoger los datos del registro de un usuario dueño o usuario normal y registrarlo si sus datos son correctos
       */  
        try{
        
            if(jcDuenno.isSelected()){
            
                validar();
                
                String passText = new String(txContrasena.getPassword());
                Master_ESport.peticionDuenno(txNickname.getText(), txNombre.getText(), txApellido.getText(), passText, permiso(), "duenno");
                
                showMessageDialog(this, "Peticion de dueño realizada, espera a que un administrador la acepte");
                
                txNickname.setText(null); txNombre.setText(null); txApellido.setText(null); txContrasena.setText(null); jcDuenno.setSelected(false);
                
            }
            else{
            
                validar();
                
                String passText = new String(txContrasena.getPassword());
                Master_ESport.crearMiembro(txNickname.getText(), txNombre.getText(), txApellido.getText(), passText, permiso());
                
                showMessageDialog(this, "Miembro creado");
                
                txNickname.setText(null); txNombre.setText(null); txApellido.setText(null); txContrasena.setText(null);
            }
        }
        catch(Exception e){
        
            showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_BCrearUsuarioActionPerformed

    private void cVerpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cVerpassActionPerformed
        
        /**
         * Función para visualizar la contraseña o no
         */
        
        if(cVerpass.isSelected()){
            txContrasena.setEchoChar((char)0);
        }
        else {
            txContrasena.setEchoChar('•');
        }
    }//GEN-LAST:event_cVerpassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCrearUsuario;
    private javax.swing.JLabel LCrearApellidos;
    private javax.swing.JLabel LCrearContraseña;
    private javax.swing.JLabel LCrearNombre;
    private javax.swing.JLabel LCrearNombredeUsuario;
    private javax.swing.JCheckBox cVerpass;
    private javax.swing.JCheckBox jcDuenno;
    private javax.swing.JTextField txApellido;
    private javax.swing.JPasswordField txContrasena;
    private javax.swing.JTextField txNickname;
    private javax.swing.JTextField txNombre;
    // End of variables declaration//GEN-END:variables
}
