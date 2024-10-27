package com.mycompany.calculadora.tela;

/**
 *
 * @author glhrmdev
 */
public class CalculadoraTela extends javax.swing.JFrame {

    double Numero1, Numero2, Resultado;
    String operacao, divisaoPorZero;

    public CalculadoraTela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel1 = new javax.swing.JPanel();
        botao0 = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        botaoPonto = new javax.swing.JButton();
        botaoSoma = new javax.swing.JButton();
        botaoSubtracao = new javax.swing.JButton();
        botaoDivisao = new javax.swing.JButton();
        botaoMultiplicacao = new javax.swing.JButton();
        botaoC = new javax.swing.JButton();
        telaCalculadora = new javax.swing.JTextField();
        botaoCE = new javax.swing.JButton();
        botaoResultado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(54, 54, 54));

        botao0.setBackground(new java.awt.Color(116, 116, 116));
        botao0.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botao0.setForeground(new java.awt.Color(255, 255, 255));
        botao0.setText("0");
        botao0.setBorderPainted(false);
        botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });

        botao1.setBackground(new java.awt.Color(116, 116, 116));
        botao1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botao1.setForeground(new java.awt.Color(255, 255, 255));
        botao1.setText("1");
        botao1.setBorderPainted(false);
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });

        botao2.setBackground(new java.awt.Color(116, 116, 116));
        botao2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botao2.setForeground(new java.awt.Color(255, 255, 255));
        botao2.setText("2");
        botao2.setBorderPainted(false);
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });

        botao3.setBackground(new java.awt.Color(116, 116, 116));
        botao3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botao3.setForeground(new java.awt.Color(255, 255, 255));
        botao3.setText("3");
        botao3.setBorderPainted(false);
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });

        botao4.setBackground(new java.awt.Color(116, 116, 116));
        botao4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botao4.setForeground(new java.awt.Color(255, 255, 255));
        botao4.setText("4");
        botao4.setBorderPainted(false);
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });

        botao5.setBackground(new java.awt.Color(116, 116, 116));
        botao5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botao5.setForeground(new java.awt.Color(255, 255, 255));
        botao5.setText("5");
        botao5.setBorderPainted(false);
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });

        botao6.setBackground(new java.awt.Color(116, 116, 116));
        botao6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botao6.setForeground(new java.awt.Color(255, 255, 255));
        botao6.setText("6");
        botao6.setBorderPainted(false);
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });

        botao7.setBackground(new java.awt.Color(116, 116, 116));
        botao7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botao7.setForeground(new java.awt.Color(255, 255, 255));
        botao7.setText("7");
        botao7.setBorderPainted(false);
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao7ActionPerformed(evt);
            }
        });

        botao8.setBackground(new java.awt.Color(116, 116, 116));
        botao8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botao8.setForeground(new java.awt.Color(255, 255, 255));
        botao8.setText("8");
        botao8.setBorderPainted(false);
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao8ActionPerformed(evt);
            }
        });

        botao9.setBackground(new java.awt.Color(116, 116, 116));
        botao9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botao9.setForeground(new java.awt.Color(255, 255, 255));
        botao9.setText("9");
        botao9.setBorderPainted(false);
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao9ActionPerformed(evt);
            }
        });

        botaoPonto.setBackground(new java.awt.Color(116, 116, 116));
        botaoPonto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botaoPonto.setForeground(new java.awt.Color(255, 255, 255));
        botaoPonto.setText(".");
        botaoPonto.setBorderPainted(false);
        botaoPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPontoActionPerformed(evt);
            }
        });

        botaoSoma.setBackground(new java.awt.Color(232, 161, 51));
        botaoSoma.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botaoSoma.setForeground(new java.awt.Color(255, 255, 255));
        botaoSoma.setText("+");
        botaoSoma.setBorderPainted(false);
        botaoSoma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSomaActionPerformed(evt);
            }
        });

        botaoSubtracao.setBackground(new java.awt.Color(232, 161, 51));
        botaoSubtracao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botaoSubtracao.setForeground(new java.awt.Color(255, 255, 255));
        botaoSubtracao.setText("-");
        botaoSubtracao.setBorderPainted(false);
        botaoSubtracao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSubtracaoActionPerformed(evt);
            }
        });

        botaoDivisao.setBackground(new java.awt.Color(232, 161, 51));
        botaoDivisao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botaoDivisao.setForeground(new java.awt.Color(255, 255, 255));
        botaoDivisao.setText("/");
        botaoDivisao.setBorderPainted(false);
        botaoDivisao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDivisaoActionPerformed(evt);
            }
        });

        botaoMultiplicacao.setBackground(new java.awt.Color(232, 161, 51));
        botaoMultiplicacao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botaoMultiplicacao.setForeground(new java.awt.Color(255, 255, 255));
        botaoMultiplicacao.setText("*");
        botaoMultiplicacao.setBorderPainted(false);
        botaoMultiplicacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMultiplicacaoActionPerformed(evt);
            }
        });

        botaoC.setBackground(new java.awt.Color(71, 71, 71));
        botaoC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoC.setForeground(new java.awt.Color(255, 255, 255));
        botaoC.setText("C");
        botaoC.setBorderPainted(false);
        botaoC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCActionPerformed(evt);
            }
        });

        telaCalculadora.setBackground(new java.awt.Color(54, 54, 54));
        telaCalculadora.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        telaCalculadora.setForeground(new java.awt.Color(255, 255, 255));
        telaCalculadora.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        telaCalculadora.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botaoCE.setBackground(new java.awt.Color(71, 71, 71));
        botaoCE.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoCE.setForeground(new java.awt.Color(255, 255, 255));
        botaoCE.setText("CE");
        botaoCE.setBorderPainted(false);
        botaoCE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCEActionPerformed(evt);
            }
        });

        botaoResultado.setBackground(new java.awt.Color(232, 161, 51));
        botaoResultado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botaoResultado.setForeground(new java.awt.Color(255, 255, 255));
        botaoResultado.setText("=");
        botaoResultado.setBorderPainted(false);
        botaoResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoResultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telaCalculadora)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoCE, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoC, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(botao0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botaoPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botaoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(telaCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoC, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoCE, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Numero(String q) {
        String Numero = telaCalculadora.getText() + q;
        telaCalculadora.setText(Numero);
    }

    private void botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao0ActionPerformed
        Numero("0");
    }//GEN-LAST:event_botao0ActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        Numero("1");
    }//GEN-LAST:event_botao1ActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        Numero("2");
    }//GEN-LAST:event_botao2ActionPerformed

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
        Numero("3");
    }//GEN-LAST:event_botao3ActionPerformed

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
        Numero("4");
    }//GEN-LAST:event_botao4ActionPerformed

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
        Numero("5");
    }//GEN-LAST:event_botao5ActionPerformed

    private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
        Numero("6");
    }//GEN-LAST:event_botao6ActionPerformed

    private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao7ActionPerformed
        Numero("7");
    }//GEN-LAST:event_botao7ActionPerformed

    private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao8ActionPerformed
        Numero("8");
    }//GEN-LAST:event_botao8ActionPerformed

    private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao9ActionPerformed
        Numero("9");
    }//GEN-LAST:event_botao9ActionPerformed

    private void botaoPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPontoActionPerformed
        Numero(".");
    }//GEN-LAST:event_botaoPontoActionPerformed

    private void botaoResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoResultadoActionPerformed
        Numero2 = Double.parseDouble(telaCalculadora.getText());
        if (operacao == "+") {
            Resultado = Numero1 + Numero2;
            telaCalculadora.setText(String.valueOf(Resultado));
        } else if (operacao == "-") {
            Resultado = Numero1 - Numero2;
            telaCalculadora.setText(String.valueOf(Resultado));
        } else if (operacao == "*") {
            Resultado = Numero1 * Numero2;
            telaCalculadora.setText(String.valueOf(Resultado));
        } else if (operacao == "/") {
            try {
                if (Numero2 == 0) {
                    throw new ArithmeticException("Divisão por zero");
                }
                double Resultado = Numero1 / Numero2;
                telaCalculadora.setText(String.valueOf(Resultado));
            } catch (ArithmeticException e) {
                divisaoPorZero = "Divisão por 0. Tente novamente.";
                telaCalculadora.setText(divisaoPorZero);
            }
        }
    }//GEN-LAST:event_botaoResultadoActionPerformed

    private void botaoSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSomaActionPerformed
        Numero1 = Double.parseDouble(telaCalculadora.getText());
        telaCalculadora.setText("");
        operacao = "+";
    }//GEN-LAST:event_botaoSomaActionPerformed

    private void botaoSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubtracaoActionPerformed
        Numero1 = Double.parseDouble(telaCalculadora.getText());
        telaCalculadora.setText("");
        operacao = "-";
    }//GEN-LAST:event_botaoSubtracaoActionPerformed

    private void botaoDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDivisaoActionPerformed
        Numero1 = Double.parseDouble(telaCalculadora.getText());
        telaCalculadora.setText("");
        operacao = "/";
    }//GEN-LAST:event_botaoDivisaoActionPerformed

    private void botaoMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMultiplicacaoActionPerformed
        Numero1 = Double.parseDouble(telaCalculadora.getText());
        telaCalculadora.setText("");
        operacao = "*";
    }//GEN-LAST:event_botaoMultiplicacaoActionPerformed

    private void botaoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCActionPerformed
        telaCalculadora.setText("");
    }//GEN-LAST:event_botaoCActionPerformed

    private void botaoCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCEActionPerformed
        telaCalculadora.setText("");

        String Num1, Num2;
        Num1 = String.valueOf(Numero1);
        Num2 = String.valueOf(Numero2);

        Num1 = "";
        Num2 = "";
    }//GEN-LAST:event_botaoCEActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao0;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JButton botaoC;
    private javax.swing.JButton botaoCE;
    private javax.swing.JButton botaoDivisao;
    private javax.swing.JButton botaoMultiplicacao;
    private javax.swing.JButton botaoPonto;
    private javax.swing.JButton botaoResultado;
    private javax.swing.JButton botaoSoma;
    private javax.swing.JButton botaoSubtracao;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField telaCalculadora;
    // End of variables declaration//GEN-END:variables
}
