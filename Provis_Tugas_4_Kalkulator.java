/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cikal
 */
public class Provis_Tugas_4_Kalkulator extends javax.swing.JFrame {
        float a;
        String oprasi;
    /**
     * Creates new form Provis_Tugas_4_Kalkulator
     */
    public Provis_Tugas_4_Kalkulator() {
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
        jLabel1 = new javax.swing.JLabel();
        textoutput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnkeluar = new javax.swing.JButton();
        btnbagi = new javax.swing.JButton();
        btntitik = new javax.swing.JButton();
        btnsamadengan = new javax.swing.JButton();
        btnsembilan = new javax.swing.JButton();
        btnlima = new javax.swing.JButton();
        btnsatu = new javax.swing.JButton();
        btndua = new javax.swing.JButton();
        btnenam = new javax.swing.JButton();
        btnnol = new javax.swing.JButton();
        btntujuh = new javax.swing.JButton();
        btnkurang = new javax.swing.JButton();
        btnkali = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        btntiga = new javax.swing.JButton();
        btnempat = new javax.swing.JButton();
        btndelapan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("KALKULATOR");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoutput, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jLabel2.setText("MUHAMAD CIKAL SOPYAN - 10118360");

        btnkeluar.setText("KELUAR");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        btnbagi.setText(":");
        btnbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbagiActionPerformed(evt);
            }
        });

        btntitik.setText(".");
        btntitik.setToolTipText("");
        btntitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntitikActionPerformed(evt);
            }
        });

        btnsamadengan.setText("=");
        btnsamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsamadenganActionPerformed(evt);
            }
        });

        btnsembilan.setText("9");
        btnsembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsembilanActionPerformed(evt);
            }
        });

        btnlima.setText("5");
        btnlima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimaActionPerformed(evt);
            }
        });

        btnsatu.setText("1");
        btnsatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsatuActionPerformed(evt);
            }
        });

        btndua.setText("2");
        btndua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnduaActionPerformed(evt);
            }
        });

        btnenam.setText("6");
        btnenam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenamActionPerformed(evt);
            }
        });

        btnnol.setText("0");
        btnnol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnolActionPerformed(evt);
            }
        });

        btntujuh.setText("7");
        btntujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntujuhActionPerformed(evt);
            }
        });

        btnkurang.setText("-");
        btnkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkurangActionPerformed(evt);
            }
        });

        btnkali.setText("x");
        btnkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaliActionPerformed(evt);
            }
        });

        btntambah.setText("+");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btntiga.setText("3");
        btntiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntigaActionPerformed(evt);
            }
        });

        btnempat.setText("4");
        btnempat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnempatActionPerformed(evt);
            }
        });

        btndelapan.setText("8");
        btndelapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelapanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(btnlima)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnenam, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(btnsatu)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                            .addComponent(btndua))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnsembilan)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnnol, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnkurang, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnkali, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btntiga)
                                                .addComponent(btntujuh))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btndelapan)
                                                .addComponent(btnempat)))
                                        .addComponent(btntambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnbagi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btntitik, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsamadengan)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsatu)
                            .addComponent(btndua)
                            .addComponent(btntiga)
                            .addComponent(btnempat))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnlima)
                            .addComponent(btnenam)
                            .addComponent(btntujuh)
                            .addComponent(btndelapan))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsembilan)
                            .addComponent(btnnol)
                            .addComponent(btntambah))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnkurang)
                            .addComponent(btnkali))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnsamadengan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbagi)
                    .addComponent(btnkeluar)
                    .addComponent(btntitik))
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btntitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntitikActionPerformed
        // TODO add your handling code here:
        textoutput.setText(textoutput.getText()+".");
    }//GEN-LAST:event_btntitikActionPerformed

    private void btnbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbagiActionPerformed
        // TODO add your handling code here:
        a = Float.parseFloat(textoutput.getText());
        oprasi = "btnbagi";
        textoutput.setText("");
    }//GEN-LAST:event_btnbagiActionPerformed

    private void btnsamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsamadenganActionPerformed
        // TODO add your handling code here:
        if(oprasi=="btnkali"){
            textoutput.setText(Float.toString(a*Float.parseFloat(textoutput.getText())));
        }else if(oprasi=="btntambah"){
            textoutput.setText(Float.toString(a+Float.parseFloat(textoutput.getText())));
        }else if(oprasi=="btnbagi"){
            textoutput.setText(Float.toString(a/Float.parseFloat(textoutput.getText())));
        }else if(oprasi=="btnkurang"){
            textoutput.setText(Float.toString(a-Float.parseFloat(textoutput.getText())));
        }
    }//GEN-LAST:event_btnsamadenganActionPerformed

    private void btnkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaliActionPerformed
        // TODO add your handling code here:
        a = Float.parseFloat(textoutput.getText());
        oprasi = "btnkali";
        textoutput.setText("");
    }//GEN-LAST:event_btnkaliActionPerformed

    private void btnkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkurangActionPerformed
        // TODO add your handling code here:
        a = Float.parseFloat(textoutput.getText());
        oprasi = "btnkurang";
        textoutput.setText("");
    }//GEN-LAST:event_btnkurangActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        a = Float.parseFloat(textoutput.getText());
        oprasi = "btntambah";
        textoutput.setText("");
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnnolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnolActionPerformed
        // TODO add your handling code here:
        textoutput.setText(textoutput.getText()+"0");
    }//GEN-LAST:event_btnnolActionPerformed

    private void btnsembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsembilanActionPerformed
        // TODO add your handling code here:
        textoutput.setText(textoutput.getText()+"9");
    }//GEN-LAST:event_btnsembilanActionPerformed

    private void btndelapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelapanActionPerformed
        // TODO add your handling code here:
        textoutput.setText(textoutput.getText()+"8");
    }//GEN-LAST:event_btndelapanActionPerformed

    private void btntujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntujuhActionPerformed
        // TODO add your handling code here:
        textoutput.setText(textoutput.getText()+"7");
    }//GEN-LAST:event_btntujuhActionPerformed

    private void btnenamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenamActionPerformed
        // TODO add your handling code here:
        textoutput.setText(textoutput.getText()+"6");
    }//GEN-LAST:event_btnenamActionPerformed

    private void btnlimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimaActionPerformed
        // TODO add your handling code here:
        textoutput.setText(textoutput.getText()+"5");
    }//GEN-LAST:event_btnlimaActionPerformed

    private void btnempatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnempatActionPerformed
        // TODO add your handling code here:
        textoutput.setText(textoutput.getText()+"4");
    }//GEN-LAST:event_btnempatActionPerformed

    private void btntigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntigaActionPerformed
        // TODO add your handling code here:
        textoutput.setText(textoutput.getText()+"3");
    }//GEN-LAST:event_btntigaActionPerformed

    private void btnduaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnduaActionPerformed
        // TODO add your handling code here:
        textoutput.setText(textoutput.getText()+"2");
    }//GEN-LAST:event_btnduaActionPerformed

    private void btnsatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsatuActionPerformed
        // TODO add your handling code here:
        textoutput.setText(textoutput.getText()+"1");
    }//GEN-LAST:event_btnsatuActionPerformed

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
            java.util.logging.Logger.getLogger(Provis_Tugas_4_Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Provis_Tugas_4_Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Provis_Tugas_4_Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Provis_Tugas_4_Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Provis_Tugas_4_Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbagi;
    private javax.swing.JButton btndelapan;
    private javax.swing.JButton btndua;
    private javax.swing.JButton btnempat;
    private javax.swing.JButton btnenam;
    private javax.swing.JButton btnkali;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnkurang;
    private javax.swing.JButton btnlima;
    private javax.swing.JButton btnnol;
    private javax.swing.JButton btnsamadengan;
    private javax.swing.JButton btnsatu;
    private javax.swing.JButton btnsembilan;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton btntiga;
    private javax.swing.JButton btntitik;
    private javax.swing.JButton btntujuh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textoutput;
    // End of variables declaration//GEN-END:variables
}
