/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import Operacoes.OperaçoesBasicas;

/**
 *
 * @author Aluno
 */
public class Java extends javax.swing.JFrame {
    private String display;
    OperaçoesBasicas Op = new OperaçoesBasicas();
    
    
    public Java() {
        initComponents();
        this.display = "";
    }
    double valor1, valor2, resultado;
    char operacao;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton19 = new javax.swing.JButton();
        cpInterno = new javax.swing.JInternalFrame();
        btnNove = new javax.swing.JButton();
        btnOito = new javax.swing.JButton();
        btnSete = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnQuatro = new javax.swing.JButton();
        btntres = new javax.swing.JButton();
        btnUm = new javax.swing.JButton();
        btnVirgula = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnDois = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnDiminuir = new javax.swing.JButton();
        btnSomar = new javax.swing.JButton();
        btnDeleteTotal = new javax.swing.JButton();
        btnIgualdade = new javax.swing.JButton();
        btnPorcentagem = new javax.swing.JButton();
        btnDeleteOneAndOne = new javax.swing.JButton();
        cpResultado = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jButton19.setText("jButton19");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cpInterno.setBackground(new java.awt.Color(0, 0, 0));
        cpInterno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cpInterno.setForeground(new java.awt.Color(153, 153, 153));
        cpInterno.setVisible(true);

        btnNove.setBackground(new java.awt.Color(255, 255, 255));
        btnNove.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNove.setForeground(new java.awt.Color(153, 153, 153));
        btnNove.setText("9");
        btnNove.setMaximumSize(new java.awt.Dimension(30, 30));
        btnNove.setMinimumSize(new java.awt.Dimension(30, 30));
        btnNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoveActionPerformed(evt);
            }
        });

        btnOito.setBackground(new java.awt.Color(255, 255, 255));
        btnOito.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOito.setForeground(new java.awt.Color(153, 153, 153));
        btnOito.setText("8");
        btnOito.setMaximumSize(new java.awt.Dimension(30, 30));
        btnOito.setMinimumSize(new java.awt.Dimension(30, 30));
        btnOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOitoActionPerformed(evt);
            }
        });

        btnSete.setBackground(new java.awt.Color(255, 255, 255));
        btnSete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSete.setForeground(new java.awt.Color(153, 153, 153));
        btnSete.setText("7");
        btnSete.setMaximumSize(new java.awt.Dimension(30, 30));
        btnSete.setMinimumSize(new java.awt.Dimension(30, 30));
        btnSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeteActionPerformed(evt);
            }
        });

        btnSeis.setBackground(new java.awt.Color(255, 255, 255));
        btnSeis.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSeis.setForeground(new java.awt.Color(153, 153, 153));
        btnSeis.setText("6");
        btnSeis.setMaximumSize(new java.awt.Dimension(30, 30));
        btnSeis.setMinimumSize(new java.awt.Dimension(30, 30));
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnCinco.setBackground(new java.awt.Color(255, 255, 255));
        btnCinco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCinco.setForeground(new java.awt.Color(153, 153, 153));
        btnCinco.setText("5");
        btnCinco.setMaximumSize(new java.awt.Dimension(30, 30));
        btnCinco.setMinimumSize(new java.awt.Dimension(30, 30));
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnQuatro.setBackground(new java.awt.Color(255, 255, 255));
        btnQuatro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQuatro.setForeground(new java.awt.Color(153, 153, 153));
        btnQuatro.setText("4");
        btnQuatro.setMaximumSize(new java.awt.Dimension(30, 30));
        btnQuatro.setMinimumSize(new java.awt.Dimension(30, 30));
        btnQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuatroActionPerformed(evt);
            }
        });

        btntres.setBackground(new java.awt.Color(255, 255, 255));
        btntres.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btntres.setForeground(new java.awt.Color(153, 153, 153));
        btntres.setText("3");
        btntres.setMaximumSize(new java.awt.Dimension(30, 30));
        btntres.setMinimumSize(new java.awt.Dimension(30, 30));
        btntres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntresActionPerformed(evt);
            }
        });

        btnUm.setBackground(new java.awt.Color(255, 255, 255));
        btnUm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUm.setForeground(new java.awt.Color(153, 153, 153));
        btnUm.setText("1");
        btnUm.setMaximumSize(new java.awt.Dimension(30, 30));
        btnUm.setMinimumSize(new java.awt.Dimension(30, 30));
        btnUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUmActionPerformed(evt);
            }
        });

        btnVirgula.setBackground(new java.awt.Color(255, 255, 255));
        btnVirgula.setForeground(new java.awt.Color(153, 153, 153));
        btnVirgula.setText(",");
        btnVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVirgulaActionPerformed(evt);
            }
        });

        btnZero.setBackground(new java.awt.Color(255, 255, 255));
        btnZero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnZero.setForeground(new java.awt.Color(153, 153, 153));
        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnDois.setBackground(new java.awt.Color(255, 255, 255));
        btnDois.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDois.setForeground(new java.awt.Color(153, 153, 153));
        btnDois.setText("2");
        btnDois.setMaximumSize(new java.awt.Dimension(30, 30));
        btnDois.setMinimumSize(new java.awt.Dimension(30, 30));
        btnDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoisActionPerformed(evt);
            }
        });

        btnDividir.setBackground(new java.awt.Color(255, 255, 255));
        btnDividir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDividir.setForeground(new java.awt.Color(153, 153, 153));
        btnDividir.setText("/");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnMultiplicar.setBackground(new java.awt.Color(255, 255, 255));
        btnMultiplicar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMultiplicar.setForeground(new java.awt.Color(153, 153, 153));
        btnMultiplicar.setText("x");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnDiminuir.setBackground(new java.awt.Color(255, 255, 255));
        btnDiminuir.setForeground(new java.awt.Color(153, 153, 153));
        btnDiminuir.setText("-");
        btnDiminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiminuirActionPerformed(evt);
            }
        });

        btnSomar.setBackground(new java.awt.Color(255, 255, 255));
        btnSomar.setForeground(new java.awt.Color(153, 153, 153));
        btnSomar.setText("+");
        btnSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomarActionPerformed(evt);
            }
        });

        btnDeleteTotal.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDeleteTotal.setForeground(new java.awt.Color(153, 153, 153));
        btnDeleteTotal.setText("C");
        btnDeleteTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTotalActionPerformed(evt);
            }
        });

        btnIgualdade.setBackground(new java.awt.Color(51, 51, 255));
        btnIgualdade.setForeground(new java.awt.Color(153, 153, 153));
        btnIgualdade.setText("=");
        btnIgualdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualdadeActionPerformed(evt);
            }
        });

        btnPorcentagem.setBackground(new java.awt.Color(255, 255, 255));
        btnPorcentagem.setForeground(new java.awt.Color(153, 153, 153));
        btnPorcentagem.setText("%");
        btnPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentagemActionPerformed(evt);
            }
        });

        btnDeleteOneAndOne.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteOneAndOne.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnDeleteOneAndOne.setForeground(new java.awt.Color(153, 153, 153));
        btnDeleteOneAndOne.setText("Dell");
        btnDeleteOneAndOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteOneAndOneActionPerformed(evt);
            }
        });

        cpResultado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cpResultado.setText("( Resultado )");

        javax.swing.GroupLayout cpInternoLayout = new javax.swing.GroupLayout(cpInterno.getContentPane());
        cpInterno.getContentPane().setLayout(cpInternoLayout);
        cpInternoLayout.setHorizontalGroup(
            cpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cpInternoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cpInternoLayout.createSequentialGroup()
                        .addComponent(cpResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(cpInternoLayout.createSequentialGroup()
                        .addGroup(cpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cpInternoLayout.createSequentialGroup()
                                .addComponent(btnNove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cpInternoLayout.createSequentialGroup()
                                .addGroup(cpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btntres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(cpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(cpInternoLayout.createSequentialGroup()
                                        .addComponent(btnDois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnUm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(cpInternoLayout.createSequentialGroup()
                                        .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnPorcentagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(cpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cpInternoLayout.createSequentialGroup()
                                    .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(btnQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(cpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cpInternoLayout.createSequentialGroup()
                                .addGroup(cpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(cpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSomar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cpInternoLayout.createSequentialGroup()
                                .addComponent(btnDiminuir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(cpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIgualdade, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteOneAndOne, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))))
        );
        cpInternoLayout.setVerticalGroup(
            cpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(cpInternoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cpResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(cpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cpInternoLayout.createSequentialGroup()
                        .addGroup(cpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNove, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOito, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btntres, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDois, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUm, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(cpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cpInternoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addGroup(cpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnVirgula)
                                    .addComponent(btnPorcentagem))
                                .addGap(128, 128, 128))
                            .addGroup(cpInternoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(cpInternoLayout.createSequentialGroup()
                        .addGroup(cpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDividir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDeleteTotal))
                        .addGap(18, 18, 18)
                        .addGroup(cpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteOneAndOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(cpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cpInternoLayout.createSequentialGroup()
                                .addComponent(btnSomar)
                                .addGap(18, 18, 18)
                                .addComponent(btnDiminuir))
                            .addComponent(btnIgualdade, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cpInterno, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cpInterno, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoveActionPerformed
    this.atualizarDisplay('9');
    }//GEN-LAST:event_btnNoveActionPerformed

    private void btnOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOitoActionPerformed
    this.atualizarDisplay('8');
    }//GEN-LAST:event_btnOitoActionPerformed

    private void btnSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeteActionPerformed
        this.atualizarDisplay('7');
    }//GEN-LAST:event_btnSeteActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        this.atualizarDisplay('6');
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        this.atualizarDisplay('5');
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuatroActionPerformed
        this.atualizarDisplay('4');
    }//GEN-LAST:event_btnQuatroActionPerformed

    private void btntresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntresActionPerformed
        this.atualizarDisplay('3');
    }//GEN-LAST:event_btntresActionPerformed

    private void btnDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoisActionPerformed
        this.atualizarDisplay('2');
    }//GEN-LAST:event_btnDoisActionPerformed

    private void btnUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmActionPerformed
        this.atualizarDisplay('1');
    }//GEN-LAST:event_btnUmActionPerformed

    private void btnVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVirgulaActionPerformed
    }//GEN-LAST:event_btnVirgulaActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        this.atualizarDisplay('0');
        
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        this.pegarValor1();
        this.display = "";
        operacao = '/';
    }//GEN-LAST:event_btnDividirActionPerformed
   
    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        this.pegarValor1();
        this.display = "";
        operacao = '*';
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomarActionPerformed
        this.pegarValor1();
        this.display = "";
        operacao = '+';
    }//GEN-LAST:event_btnSomarActionPerformed

    private void btnDiminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiminuirActionPerformed
        this.pegarValor1();
        this.display = "";
        operacao = '-';
    }//GEN-LAST:event_btnDiminuirActionPerformed

    private void btnDeleteOneAndOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteOneAndOneActionPerformed
        String valordocpResultado = this.display;
        
        if(valordocpResultado.length() > 0){
            valordocpResultado = valordocpResultado.substring(0, valordocpResultado.length()-1);
            cpResultado.setText(valordocpResultado);
            display = valordocpResultado;
        }
        System.out.println(valordocpResultado);
    }//GEN-LAST:event_btnDeleteOneAndOneActionPerformed

    private void btnDeleteTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTotalActionPerformed
        this.display = "";
        cpResultado.setText("");
        
    }//GEN-LAST:event_btnDeleteTotalActionPerformed

    private void btnIgualdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualdadeActionPerformed
        this.pegarValor2();
        this.calculo(operacao);
        this.display = "";
    }//GEN-LAST:event_btnIgualdadeActionPerformed

    private void btnPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentagemActionPerformed
        
    }//GEN-LAST:event_btnPorcentagemActionPerformed
    private void atualizarDisplay( char digito) {
        this.display = this.display + digito;
        cpResultado.setText(this.display);
        
    }
    private void pegarValor1(){
        valor1 = Double.parseDouble(this.display);
        cpResultado.setText("");
     
    }
    private void pegarValor2(){
        valor2 = Double.parseDouble(this.display);
        cpResultado.setText("");
        
    }
    private void calculo(char operacao){
        switch (operacao){
            case '+':
                resultado = Op.somar(valor1, valor2);
                break;
            case '-':
                resultado = Op.subtrair(valor1, valor2);
                break;
            case '*':
                resultado = Op.multiplicar(valor1, valor2);
                break;
            case '/':
                resultado = Op.dividir(valor1, valor2);
                break;
                
                
        }
        cpResultado.setText(String.valueOf(resultado));
    }
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
            java.util.logging.Logger.getLogger(Java.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnDeleteOneAndOne;
    private javax.swing.JButton btnDeleteTotal;
    private javax.swing.JButton btnDiminuir;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnDois;
    private javax.swing.JButton btnIgualdade;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnNove;
    private javax.swing.JButton btnOito;
    private javax.swing.JButton btnPorcentagem;
    private javax.swing.JButton btnQuatro;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSete;
    private javax.swing.JButton btnSomar;
    private javax.swing.JButton btnUm;
    private javax.swing.JButton btnVirgula;
    private javax.swing.JButton btnZero;
    private javax.swing.JButton btntres;
    private javax.swing.JInternalFrame cpInterno;
    private javax.swing.JLabel cpResultado;
    private javax.swing.JButton jButton19;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
