/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Consultas;

/**
 *
 * @author 1gdaw09
 */
public class ConsultarLigaPanel extends javax.swing.JPanel {

    /**
     * Creates new form ConsultarLigaPanel
     */
    public ConsultarLigaPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton4 = new javax.swing.JRadioButton();
        TituloConsultarJugador = new javax.swing.JLabel();
        LEligeLiga = new javax.swing.JLabel();
        CElegirLiga = new javax.swing.JComboBox<>();
        LListaequipos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        LOrdenarPor = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("jRadioButton4");

        TituloConsultarJugador.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TituloConsultarJugador.setText("Consultar Liga");

        LEligeLiga.setText("Elige la Liga");

        CElegirLiga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LListaequipos.setText("Lista de los equipos");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Arraylist de los equipos\nde esa liga");
        jScrollPane1.setViewportView(jTextArea1);

        LOrdenarPor.setText("Ordenar por");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("jRadioButton1");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("jRadioButton2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TituloConsultarJugador)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LEligeLiga)
                                .addGap(40, 40, 40)
                                .addComponent(CElegirLiga, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LListaequipos)
                                .addGap(126, 126, 126)
                                .addComponent(LOrdenarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap(494, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(TituloConsultarJugador)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LEligeLiga)
                    .addComponent(CElegirLiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LOrdenarPor)
                    .addComponent(LListaequipos))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton4)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CElegirLiga;
    private javax.swing.JLabel LEligeLiga;
    private javax.swing.JLabel LListaequipos;
    private javax.swing.JLabel LOrdenarPor;
    private javax.swing.JLabel TituloConsultarJugador;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
