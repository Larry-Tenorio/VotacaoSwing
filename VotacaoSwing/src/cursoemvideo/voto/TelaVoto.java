/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cursoemvideo.voto;

/**
 *
 * @author trixti
 */
public class TelaVoto extends javax.swing.JFrame {

    /**
     * Creates new form TelaVoto
     */
    public TelaVoto() {
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

        jLabel1 = new javax.swing.JLabel();
        btnVoto = new javax.swing.JButton();
        txtAno = new javax.swing.JTextField();
        lblR = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ano Nasc:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 20, -1, -1));

        btnVoto.setText("Posso Votar ?");
        btnVoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVotoActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 52, -1, -1));

        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });
        getContentPane().add(txtAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 17, 93, -1));
        getContentPane().add(lblR, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 160, 40));

        jLabel2.setText("Idade:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 26));
        getContentPane().add(lblIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 87, 130, 30));

        jLabel3.setText("Resposta:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVotoActionPerformed
        // TODO add your handling code here:
        int a = Integer.parseInt(txtAno.getText());
        int i = 2024 - a;
        lblIdade.setText("sua idade é " + i);
        if (i < 16) {
            lblR.setText("Voto proibido");
        } else {
            if ((i >= 16 && i < 18) || (i > 70)) {
            lblR.setText("O voto é opcional");
        } else {
                lblR.setText("O voto é obrigatório");
            }
        }
        
    }//GEN-LAST:event_btnVotoActionPerformed

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVoto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblR;
    private javax.swing.JTextField txtAno;
    // End of variables declaration//GEN-END:variables
}
