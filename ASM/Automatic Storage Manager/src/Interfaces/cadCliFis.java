/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Tiago
 */
import Principal.Fisica;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class cadCliFis extends javax.swing.JFrame {

    int a = 1;

    /**
     * Creates new form cadCliFis
     */
    public cadCliFis() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cx2 = new javax.swing.JTextField();
        cx8 = new javax.swing.JComboBox<>();
        cx4 = new javax.swing.JFormattedTextField();
        cx5 = new javax.swing.JTextField();
        cx6 = new javax.swing.JTextField();
        cx7 = new javax.swing.JTextField();
        cx9 = new javax.swing.JFormattedTextField();
        cx10 = new javax.swing.JFormattedTextField();
        cx11 = new javax.swing.JFormattedTextField();
        cx12 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cx13 = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente - Pessoa Física");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Nome: ");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Data de Nascimento: ");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("C.P.F.:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Bairro:");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Endereço:");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Cidade:");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Estado:");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("C.E.P.:");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("Telefone:");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setText("Celular:");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setText("E-mail:");

        cx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cx2ActionPerformed(evt);
            }
        });

        cx8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cx8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cx8.setSelectedItem("Paraná - PR");
        cx8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cx8ActionPerformed(evt);
            }
        });

        try {
            cx4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cx4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cx4ActionPerformed(evt);
            }
        });

        cx5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cx5ActionPerformed(evt);
            }
        });

        cx6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cx6ActionPerformed(evt);
            }
        });

        try {
            cx9.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cx10.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cx11.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cx11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cx11ActionPerformed(evt);
            }
        });

        cx12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cx12ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton1.setText("SALVAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setText("ID: ");

        jButton4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton4.setText("LIMPAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton5.setText("CANCELAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel14.setText(Integer.toString(incrId()));

        cx13.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        cx13.setToolTipText("");
        cx13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cx13ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel15.setText("Cadastro de Cliente Físico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 72, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(83, 83, 83)
                .addComponent(jButton4)
                .addGap(78, 78, 78)
                .addComponent(jButton5)
                .addGap(78, 78, 78))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cx12))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cx2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cx5))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cx13))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cx7))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cx10, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel8))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cx4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cx6))
                                .addComponent(cx11)
                                .addComponent(cx8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cx9, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(153, 153, 153))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cx4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cx13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(cx5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cx6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(cx8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cx7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cx9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(cx10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cx11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cx12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cx12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cx12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cx12ActionPerformed

    private void cx6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cx6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cx6ActionPerformed

    private void cx5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cx5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cx5ActionPerformed

    private void cx4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cx4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cx4ActionPerformed

    private void cx8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cx8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cx8ActionPerformed

    private void cx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cx2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cx2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MyConnection mc = new MyConnection();
        Connection cn = mc.conexao();
        Fisica pf = new Fisica();
        boolean cond = false;
        int c = 0;
        String sql = "";
        String sql2 = "";
        try {
            if (cx2.getText().equals("") || cx13.getText().equals("") || cx4.getText().equals("") || cx5.getText().equals("") || cx6.getText().equals("") || cx7.getText().equals("") || cx9.getText().equals("") || cx10.getText().equals("") || cx11.getText().equals("") || cx12.getText().equals("") || cx8.getSelectedItem().toString().equals("------")) {
                throw new Exception();
            } else {
                pf.setNome(cx2.getText());
                pf.setEndereco(cx5.getText());
                pf.setBairro(cx6.getText());
                pf.setCidade(cx7.getText());
                pf.setEstado(cx8.getSelectedItem().toString());
                pf.setEmail(cx12.getText());
                pf.setDataNasc(cx13.getText());
                pf.setCpf(cx4.getText());
                pf.setTelefone1(cx10.getText());
                pf.setTelefone2(cx11.getText());
                pf.setCep(cx9.getText());

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "Cadastro de Cliente Físico", JOptionPane.ERROR_MESSAGE);
            c = 2;
        }
        if (c != 2) {
            sql = "INSERT INTO Pessoa (Tipo, Nome, Endereco, Bairro, Telefone_1, Telefone_2, Cidade, CEP, Estado, Email) VALUES ('C', ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            sql2 = "INSERT INTO Fisica (dataNasc, CPF, ID_Pes) VALUES (?, ?, ?);";

            while (cond != true) {
                try {
                    PreparedStatement psd = cn.prepareStatement(sql);
                    psd.setString(1, pf.getNome());
                    psd.setString(2, pf.getEndereco());
                    psd.setString(3, pf.getBairro());
                    psd.setString(4, pf.getTelefone1());
                    psd.setString(5, pf.getTelefone2());
                    psd.setString(6, pf.getCidade());
                    psd.setString(7, pf.getCep());
                    psd.setString(8, pf.getEstado());
                    psd.setString(9, pf.getEmail());

                    int n = psd.executeUpdate();
                    if (n > 0) {

                        try {
                            PreparedStatement psd2 = cn.prepareStatement(sql2);
                            psd2.setString(1, pf.getDataNasc());
                            psd2.setString(2, pf.getCpf());
                            psd2.setInt(3, getIdB(pf));

                            int n2 = psd2.executeUpdate();

                            if (n2 > 0) {
                                JOptionPane.showMessageDialog(null, "Dados salvos com sucesso", "Cadastro de Cliente Físico", JOptionPane.INFORMATION_MESSAGE);
                                int op = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro cliente agora?", "Cadastro de Cliente Físico", JOptionPane.YES_NO_OPTION);
                                if (op == 0) {
                                    cond = true;
                                    dispose();
                                    new cadCliFis().setVisible(true);

                                } else {
                                    dispose();
                                    cond = true;
                                }
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(cadProd.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }

                } catch (SQLException ex) {
                    Logger.getLogger(cadProd.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void cx11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cx11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cx11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limpar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cx13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cx13ActionPerformed

    }//GEN-LAST:event_cx13ActionPerformed

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
            java.util.logging.Logger.getLogger(cadCliFis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadCliFis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadCliFis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadCliFis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadCliFis().setVisible(true);
            }
        });
    }

    public void limpar() {
        cx2.setText("");
        cx13.setText("");
        cx4.setText("");
        cx5.setText("");
        cx6.setText("");
        cx7.setText("");
        cx9.setText("");
        cx10.setText("");
        cx11.setText("");
        cx12.setText("");
    }

    public static int incrId() {
        int id = 0;
        try {
            MyConnection mc = new MyConnection();
            Connection cn = mc.conexao();
            PreparedStatement psd = cn.prepareStatement("SELECT * FROM Pessoa");
            ResultSet rs = psd.executeQuery();
            while (rs.next()) {
                id = (rs.getInt("ID_Pes"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(cadProd.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (id == 0) {
            return 1;
        } else {
            return (id + 1);
        }
    }

    public static int getIdB(Fisica pf) {
        int id = 0;
        try {
            MyConnection mc = new MyConnection();
            Connection cn = mc.conexao();
            PreparedStatement psd = cn.prepareStatement("SELECT ID_Pes FROM Pessoa WHERE Nome = ?;");
            psd.setString(1, pf.getNome());

            ResultSet rs = psd.executeQuery();
            while (rs.next()) {
                id = (rs.getInt("ID_Pes"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(cadProd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField cx10;
    private javax.swing.JFormattedTextField cx11;
    private javax.swing.JTextField cx12;
    private javax.swing.JFormattedTextField cx13;
    private javax.swing.JTextField cx2;
    private javax.swing.JFormattedTextField cx4;
    private javax.swing.JTextField cx5;
    private javax.swing.JTextField cx6;
    private javax.swing.JTextField cx7;
    private javax.swing.JComboBox<String> cx8;
    private javax.swing.JFormattedTextField cx9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
