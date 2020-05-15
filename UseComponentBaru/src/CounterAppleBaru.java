/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naufal M Shafa
 */
public class CounterAppleBaru extends javax.swing.JApplet {

    /**
     * Initializes the applet CounterAppleBaru
     */
    @Override
    public void init() {
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
            java.util.logging.Logger.getLogger(CounterAppleBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CounterAppleBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CounterAppleBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CounterAppleBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonbaru1 = new javax.swing.JButton();
        jButtonbaru2 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        counterbaru1 = new counterbaru.Counterbaru();
        counterbaru2 = new counterbaru.Counterbaru();
        jLabel1 = new javax.swing.JLabel();

        setBackground(java.awt.Color.cyan);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonbaru1.setText("Java");
        jButtonbaru1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbaru1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonbaru1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 90, -1));

        jButtonbaru2.setText("PHP");
        jButtonbaru2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbaru2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonbaru2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 80, -1));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 302, 20));
        getContentPane().add(counterbaru1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 90, -1));

        counterbaru2.setBackground(java.awt.Color.orange);
        getContentPane().add(counterbaru2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 80, 30));

        jLabel1.setBackground(java.awt.Color.black);
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("TUGAS B JAVA BEANS ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonbaru2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbaru2ActionPerformed
        // TODO add your handling code here:
        counterbaru2.increment();
        float voteJAVA = Float.parseFloat(counterbaru1.getvalue());
        float votePHP = Float.parseFloat(counterbaru2.getvalue());

        float total = voteJAVA + votePHP;
        float pembagian = (voteJAVA/total);
        float persen = pembagian*100;
        jProgressBar1.setValue((int)persen);
    }//GEN-LAST:event_jButtonbaru2ActionPerformed

    private void jButtonbaru1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbaru1ActionPerformed
        // TODO add your handling code here:
        counterbaru1.increment();
        float voteJAVA = Float.parseFloat(counterbaru1.getvalue());
        float votePHP = Float.parseFloat(counterbaru2.getvalue());

        float total = voteJAVA + votePHP;
        float pembagian = (voteJAVA/total);
        float persen = pembagian*100;
        jProgressBar1.setValue((int)persen);
    }//GEN-LAST:event_jButtonbaru1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private counterbaru.Counterbaru counterbaru1;
    private counterbaru.Counterbaru counterbaru2;
    private javax.swing.JButton jButtonbaru1;
    private javax.swing.JButton jButtonbaru2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
