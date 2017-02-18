/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_toolbox_app;

import javafx.scene.paint.Color;

/**
 *
 * @author Oluwole_Jnr
 */
public class ColourDialogueView extends javax.swing.JFrame {

    /**
     * Creates new form ColourDialogueFrame
     */
    public ColourDialogueView() {
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

        jPanel1 = new javax.swing.JPanel();
        redButton = new javax.swing.JButton();
        orangeButton = new javax.swing.JButton();
        brownButton = new javax.swing.JButton();
        yellowButton = new javax.swing.JButton();
        greenButton = new javax.swing.JButton();
        blueButton = new javax.swing.JButton();
        violetButton = new javax.swing.JButton();
        greyButton = new javax.swing.JButton();
        whiteButton = new javax.swing.JButton();
        goldButton = new javax.swing.JButton();
        silverButton = new javax.swing.JButton();
        blackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COLOUR CHOOSER");
        setAlwaysOnTop(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        redButton.setBackground(new java.awt.Color(204, 0, 0));
        redButton.setFont(new java.awt.Font("Forte", 1, 14)); // NOI18N
        redButton.setForeground(new java.awt.Color(255, 255, 255));
        redButton.setText("RED");
        redButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redButtonActionPerformed(evt);
            }
        });

        orangeButton.setBackground(new java.awt.Color(255, 102, 0));
        orangeButton.setFont(new java.awt.Font("Forte", 1, 14)); // NOI18N
        orangeButton.setForeground(new java.awt.Color(255, 255, 255));
        orangeButton.setText("ORANGE");
        orangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeButtonActionPerformed(evt);
            }
        });

        brownButton.setBackground(new java.awt.Color(204, 102, 0));
        brownButton.setFont(new java.awt.Font("Forte", 1, 14)); // NOI18N
        brownButton.setForeground(new java.awt.Color(255, 255, 255));
        brownButton.setText("BROWN");
        brownButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brownButtonActionPerformed(evt);
            }
        });

        yellowButton.setBackground(new java.awt.Color(255, 255, 51));
        yellowButton.setFont(new java.awt.Font("Forte", 1, 14)); // NOI18N
        yellowButton.setForeground(new java.awt.Color(255, 255, 255));
        yellowButton.setText("YELLOW");
        yellowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowButtonActionPerformed(evt);
            }
        });

        greenButton.setBackground(new java.awt.Color(0, 102, 0));
        greenButton.setFont(new java.awt.Font("Forte", 1, 14)); // NOI18N
        greenButton.setForeground(new java.awt.Color(255, 255, 255));
        greenButton.setText("GREEN");
        greenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenButtonActionPerformed(evt);
            }
        });

        blueButton.setBackground(new java.awt.Color(0, 0, 153));
        blueButton.setFont(new java.awt.Font("Forte", 1, 14)); // NOI18N
        blueButton.setForeground(new java.awt.Color(255, 255, 255));
        blueButton.setText("BLUE");
        blueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueButtonActionPerformed(evt);
            }
        });

        violetButton.setBackground(new java.awt.Color(153, 0, 153));
        violetButton.setFont(new java.awt.Font("Forte", 1, 14)); // NOI18N
        violetButton.setForeground(new java.awt.Color(255, 255, 255));
        violetButton.setText("VIOLET");
        violetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                violetButtonActionPerformed(evt);
            }
        });

        greyButton.setBackground(new java.awt.Color(153, 153, 153));
        greyButton.setFont(new java.awt.Font("Forte", 1, 14)); // NOI18N
        greyButton.setForeground(new java.awt.Color(255, 255, 255));
        greyButton.setText("GREY");
        greyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greyButtonActionPerformed(evt);
            }
        });

        whiteButton.setBackground(new java.awt.Color(255, 255, 255));
        whiteButton.setFont(new java.awt.Font("Forte", 1, 14)); // NOI18N
        whiteButton.setText("WHITE");
        whiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteButtonActionPerformed(evt);
            }
        });

        goldButton.setBackground(new java.awt.Color(255, 204, 51));
        goldButton.setFont(new java.awt.Font("Forte", 1, 14)); // NOI18N
        goldButton.setForeground(new java.awt.Color(255, 255, 255));
        goldButton.setText("GOLD");
        goldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goldButtonActionPerformed(evt);
            }
        });

        silverButton.setBackground(new java.awt.Color(204, 204, 204));
        silverButton.setFont(new java.awt.Font("Forte", 1, 14)); // NOI18N
        silverButton.setForeground(new java.awt.Color(255, 255, 255));
        silverButton.setText("SILVER");
        silverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silverButtonActionPerformed(evt);
            }
        });

        blackButton.setBackground(new java.awt.Color(0, 0, 0));
        blackButton.setFont(new java.awt.Font("Forte", 1, 14)); // NOI18N
        blackButton.setForeground(new java.awt.Color(255, 255, 255));
        blackButton.setText("BLACK");
        blackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(whiteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(goldButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(blueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(violetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(orangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yellowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(blackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(brownButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(redButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(silverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(brownButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(redButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(blackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yellowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(violetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goldButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(silverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(whiteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void violetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_violetButtonActionPerformed
        //update current band's colour with this selected colour value
        Model model = Model.getModelObject();
        Controller control = Controller.getControllerObject();
        control.selectBandColour(model.getCurrentBand(), model.getColourFromList(7));
        this.dispose(); //Closes the dialogue
    }//GEN-LAST:event_violetButtonActionPerformed

    private void brownButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brownButtonActionPerformed
        //update current band's colour with this selected colour value
        Model model = Model.getModelObject();
        Controller control = Controller.getControllerObject();
        control.selectBandColour(model.getCurrentBand(), model.getColourFromList(1));
        this.dispose();
    }//GEN-LAST:event_brownButtonActionPerformed

    private void blackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackButtonActionPerformed
        //update current band's colour with this selected colour value
        Model model = Model.getModelObject();
        Controller control = Controller.getControllerObject();
        control.selectBandColour(model.getCurrentBand(), model.getColourFromList(0));
        this.dispose();
    }//GEN-LAST:event_blackButtonActionPerformed

    private void redButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redButtonActionPerformed
        //update current band's colour with this selected colour value
        Model model = Model.getModelObject();
        Controller control = Controller.getControllerObject();
        control.selectBandColour(model.getCurrentBand(), model.getColourFromList(2));
        this.dispose();
    }//GEN-LAST:event_redButtonActionPerformed

    private void orangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeButtonActionPerformed
        //update current band's colour with this selected colour value
        Model model = Model.getModelObject();
        Controller control = Controller.getControllerObject();
        control.selectBandColour(model.getCurrentBand(), model.getColourFromList(3));
        this.dispose();
    }//GEN-LAST:event_orangeButtonActionPerformed

    private void yellowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowButtonActionPerformed
        //update current band's colour with this selected colour value
        Model model = Model.getModelObject();
        Controller control = Controller.getControllerObject();
        control.selectBandColour(model.getCurrentBand(), model.getColourFromList(4));
        this.dispose();
    }//GEN-LAST:event_yellowButtonActionPerformed

    private void greenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenButtonActionPerformed
        //update current band's colour with this selected colour value
        Model model = Model.getModelObject();
        Controller control = Controller.getControllerObject();
        control.selectBandColour(model.getCurrentBand(), model.getColourFromList(5));
        this.dispose();
    }//GEN-LAST:event_greenButtonActionPerformed

    private void blueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueButtonActionPerformed
        //update current band's colour with this selected colour value
        Model model = Model.getModelObject();
        Controller control = Controller.getControllerObject();
        control.selectBandColour(model.getCurrentBand(), model.getColourFromList(6));
        this.dispose();
    }//GEN-LAST:event_blueButtonActionPerformed

    private void greyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greyButtonActionPerformed
        //update current band's colour with this selected colour value
        Model model = Model.getModelObject();
        Controller control = Controller.getControllerObject();
        control.selectBandColour(model.getCurrentBand(), model.getColourFromList(8));
        this.dispose();
    }//GEN-LAST:event_greyButtonActionPerformed

    private void whiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteButtonActionPerformed
        //update current band's colour with this selected colour value
        Model model = Model.getModelObject();
        Controller control = Controller.getControllerObject();
        control.selectBandColour(model.getCurrentBand(), model.getColourFromList(9));
        this.dispose();
    }//GEN-LAST:event_whiteButtonActionPerformed

    private void goldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goldButtonActionPerformed
        //update current band's colour with this selected colour value
        Model model = Model.getModelObject();
        Controller control = Controller.getControllerObject();
        control.selectBandColour(model.getCurrentBand(), model.getColourFromList(10));
        this.dispose();
    }//GEN-LAST:event_goldButtonActionPerformed

    private void silverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silverButtonActionPerformed
        //update current band's colour with this selected colour value
        Model model = Model.getModelObject();
        Controller control = Controller.getControllerObject();
        control.selectBandColour(model.getCurrentBand(), model.getColourFromList(11));
        this.dispose();
    }//GEN-LAST:event_silverButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ColourDialogueView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColourDialogueView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColourDialogueView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColourDialogueView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColourDialogueView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blackButton;
    private javax.swing.JButton blueButton;
    private javax.swing.JButton brownButton;
    private javax.swing.JButton goldButton;
    private javax.swing.JButton greenButton;
    private javax.swing.JButton greyButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton orangeButton;
    private javax.swing.JButton redButton;
    private javax.swing.JButton silverButton;
    private javax.swing.JButton violetButton;
    private javax.swing.JButton whiteButton;
    private javax.swing.JButton yellowButton;
    // End of variables declaration//GEN-END:variables
}
