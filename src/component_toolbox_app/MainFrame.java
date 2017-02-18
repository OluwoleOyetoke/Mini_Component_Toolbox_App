/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_toolbox_app;

/**
 *
 * @author Oluwole_Jnr
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        componentInfoOption = new javax.swing.JMenuItem();
        resistorCalcOption = new javax.swing.JMenuItem();
        capacitorOption = new javax.swing.JMenuItem();
        spectrumOption = new javax.swing.JMenuItem();
        exitOption = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        aboutOption = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("R-TOOLBOX APP");
        setResizable(false);

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setForeground(new java.awt.Color(255, 153, 0));
        jMenu1.setText("Menu");
        jMenu1.setFont(new java.awt.Font("Footlight MT Light", 1, 12)); // NOI18N

        componentInfoOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        componentInfoOption.setBackground(new java.awt.Color(255, 255, 255));
        componentInfoOption.setFont(new java.awt.Font("Footlight MT Light", 1, 12)); // NOI18N
        componentInfoOption.setForeground(new java.awt.Color(255, 153, 51));
        componentInfoOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_package/info2.jpg"))); // NOI18N
        componentInfoOption.setText("Component Info");
        componentInfoOption.setEnabled(false);
        componentInfoOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                componentInfoOptionActionPerformed(evt);
            }
        });
        jMenu1.add(componentInfoOption);

        resistorCalcOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        resistorCalcOption.setBackground(new java.awt.Color(255, 255, 255));
        resistorCalcOption.setFont(new java.awt.Font("Footlight MT Light", 1, 12)); // NOI18N
        resistorCalcOption.setForeground(new java.awt.Color(255, 153, 51));
        resistorCalcOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_package/ResistorIco.jpg"))); // NOI18N
        resistorCalcOption.setText("Resistance Calculator");
        resistorCalcOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resistorCalcOptionActionPerformed(evt);
            }
        });
        jMenu1.add(resistorCalcOption);

        capacitorOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        capacitorOption.setBackground(new java.awt.Color(255, 255, 255));
        capacitorOption.setFont(new java.awt.Font("Footlight MT Light", 1, 12)); // NOI18N
        capacitorOption.setForeground(new java.awt.Color(255, 153, 0));
        capacitorOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_package/tantalum.jpg"))); // NOI18N
        capacitorOption.setText("Capacitance Calculator");
        capacitorOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacitorOptionActionPerformed(evt);
            }
        });
        jMenu1.add(capacitorOption);

        spectrumOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        spectrumOption.setBackground(new java.awt.Color(255, 255, 255));
        spectrumOption.setFont(new java.awt.Font("Footlight MT Light", 1, 12)); // NOI18N
        spectrumOption.setForeground(new java.awt.Color(255, 153, 0));
        spectrumOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_package/spectrum.jpg"))); // NOI18N
        spectrumOption.setText("Spectrum Analyzer");
        spectrumOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spectrumOptionActionPerformed(evt);
            }
        });
        jMenu1.add(spectrumOption);

        exitOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exitOption.setBackground(new java.awt.Color(255, 255, 255));
        exitOption.setFont(new java.awt.Font("Footlight MT Light", 1, 12)); // NOI18N
        exitOption.setForeground(new java.awt.Color(255, 153, 51));
        exitOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_package/exitIcon.jpg"))); // NOI18N
        exitOption.setText("Exit");
        exitOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitOptionActionPerformed(evt);
            }
        });
        jMenu1.add(exitOption);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setForeground(new java.awt.Color(255, 153, 0));
        jMenu2.setText("Help");
        jMenu2.setFont(new java.awt.Font("Footlight MT Light", 1, 12)); // NOI18N

        aboutOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        aboutOption.setBackground(new java.awt.Color(255, 255, 255));
        aboutOption.setFont(new java.awt.Font("Footlight MT Light", 1, 12)); // NOI18N
        aboutOption.setForeground(new java.awt.Color(255, 153, 0));
        aboutOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_package/infoIcon.jpg"))); // NOI18N
        aboutOption.setText("About");
        aboutOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutOptionActionPerformed(evt);
            }
        });
        jMenu2.add(aboutOption);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitOptionActionPerformed
  //To exit the App
        Controller control = new Controller();
        int Selected = control.ConfirmationMessage("Are you sure you want to exit");
        if (Selected == 0) {
            System.exit(0); //Close the Application
        } else {

        }
    }//GEN-LAST:event_exitOptionActionPerformed

    private void resistorCalcOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resistorCalcOptionActionPerformed
       //To load the resistor colourbad/value calculator view
        Model model = Model.getModelObject();
         Controller control = Controller.getControllerObject();
         model.setBlinkCommand(false);
        control.loadResistorColourBandView();
    }//GEN-LAST:event_resistorCalcOptionActionPerformed

    private void componentInfoOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_componentInfoOptionActionPerformed
        //To load the resistor component informatopin view
        Model model = Model.getModelObject();
         Controller control = Controller.getControllerObject();
         model.setBlinkCommand(false);
        control.loadResistorListView();
    }//GEN-LAST:event_componentInfoOptionActionPerformed

    private void aboutOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutOptionActionPerformed
      //To loa the about frame
        AboutView about = new AboutView();
        about.setVisible(true);
    }//GEN-LAST:event_aboutOptionActionPerformed

    private void capacitorOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacitorOptionActionPerformed
        //To load the capacitor colourbad/value calculator view
        Model model = Model.getModelObject();
         Controller control = Controller.getControllerObject();
         model.setBlinkCommand(false);
        control.loadCapacitorColourBandView();
    }//GEN-LAST:event_capacitorOptionActionPerformed

    private void spectrumOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spectrumOptionActionPerformed
      //To load the spectrum analyzer view
        Model model = Model.getModelObject();
         Controller control = Controller.getControllerObject();
         model.setBlinkCommand(false);
        control.loadSpectrumAnalyserView();
    }//GEN-LAST:event_spectrumOptionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutOption;
    private javax.swing.JMenuItem capacitorOption;
    private javax.swing.JMenuItem componentInfoOption;
    private javax.swing.JMenuItem exitOption;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem resistorCalcOption;
    private javax.swing.JMenuItem spectrumOption;
    // End of variables declaration//GEN-END:variables
}
