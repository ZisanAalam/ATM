package ATM_System;

/**
 *
 * @author Engineer-PC
 */
public class ATMS extends javax.swing.JFrame {
    
    private int generatedOtp = 123456;
    private String panel = "jDisplay";
   
    public ATMS() {
        
        initComponents();
        btnDisable();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jBtnLT = new javax.swing.JButton();
        jBtnLB = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jBtn3 = new javax.swing.JButton();
        jBtnCancle = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtnClear = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtnEnter = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jBtnRT = new javax.swing.JButton();
        jBtnRB = new javax.swing.JButton();
        backPanel = new javax.swing.JPanel();
        jDisplay = new javax.swing.JPanel();
        jpw = new javax.swing.JTextField();
        msg1 = new javax.swing.JLabel();
        nextPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        withdrawPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        balancePanel = new javax.swing.JPanel();
        changePinPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        newPin1 = new javax.swing.JTextField();
        FastwithdrawPanel = new javax.swing.JPanel();
        w1 = new javax.swing.JLabel();
        w2 = new javax.swing.JLabel();
        w3 = new javax.swing.JLabel();
        w4 = new javax.swing.JLabel();
        pinChangedPanel = new javax.swing.JPanel();
        pinmsg = new javax.swing.JLabel();
        otpPanel = new javax.swing.JPanel();
        otpMsg = new javax.swing.JLabel();
        otp = new javax.swing.JTextField();
        MsgPanel = new javax.swing.JPanel();
        allmsg = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM MACHINE");
        setBackground(new java.awt.Color(153, 153, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jBtnLT.setText("<<<<");
        jBtnLT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLTActionPerformed(evt);
            }
        });

        jBtnLB.setText("<<<<");
        jBtnLB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnLB))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jBtnLT)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnLT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jBtnLB, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jBtn3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jBtn3.setText("3");
        jBtn3.setBorder(javax.swing.BorderFactory.createTitledBorder("DEF"));
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtnCancle.setBackground(new java.awt.Color(204, 0, 51));
        jBtnCancle.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jBtnCancle.setText("CANCLE");
        jBtnCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancleActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jBtn2.setText("2");
        jBtn2.setBorder(javax.swing.BorderFactory.createTitledBorder("ABC"));
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jBtn1.setText("1");
        jBtn1.setBorder(javax.swing.BorderFactory.createTitledBorder("QZ"));
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jBtn4.setText("4");
        jBtn4.setBorder(javax.swing.BorderFactory.createTitledBorder("GHI"));
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jBtn5.setText("5");
        jBtn5.setBorder(javax.swing.BorderFactory.createTitledBorder("JKL"));
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jBtn8.setText("8");
        jBtn8.setBorder(javax.swing.BorderFactory.createTitledBorder("STU"));
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jBtn9.setText("9");
        jBtn9.setBorder(javax.swing.BorderFactory.createTitledBorder("VXY"));
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtnClear.setBackground(new java.awt.Color(255, 255, 0));
        jBtnClear.setText("CLEAR");
        jBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClearActionPerformed(evt);
            }
        });

        jBtn7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jBtn7.setText("7");
        jBtn7.setBorder(javax.swing.BorderFactory.createTitledBorder("PQR"));
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jBtn6.setText("6");
        jBtn6.setBorder(javax.swing.BorderFactory.createTitledBorder("MNO"));
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtnEnter.setBackground(new java.awt.Color(51, 153, 0));
        jBtnEnter.setText("ENTER");
        jBtnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEnterActionPerformed(evt);
            }
        });

        jBtn0.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jBtn0.setText("0");
        jBtn0.setBorder(javax.swing.BorderFactory.createTitledBorder("QZ"));
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtn0, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jBtn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jBtn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtn6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jBtn9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jBtnEnter, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jBtnCancle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBtnCancle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jBtnRT.setText(">>>>");
        jBtnRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRTActionPerformed(evt);
            }
        });

        jBtnRB.setText(">>>>");
        jBtnRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnRB))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jBtnRT)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnRT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jBtnRB, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backPanel.setBackground(new java.awt.Color(255, 204, 102));
        backPanel.setLayout(new java.awt.CardLayout());

        jDisplay.setBackground(new java.awt.Color(0, 204, 204));
        jDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jDisplay.setName("jtxtDisplay"); // NOI18N

        jpw.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N

        msg1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        msg1.setText("                   Enter Your Pin");

        javax.swing.GroupLayout jDisplayLayout = new javax.swing.GroupLayout(jDisplay);
        jDisplay.setLayout(jDisplayLayout);
        jDisplayLayout.setHorizontalGroup(
            jDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDisplayLayout.createSequentialGroup()
                .addGroup(jDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDisplayLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(msg1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDisplayLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jpw, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jDisplayLayout.setVerticalGroup(
            jDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDisplayLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(msg1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        backPanel.add(jDisplay, "card2");

        nextPanel2.setBackground(new java.awt.Color(0, 204, 204));
        nextPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel1.setText("Withdraw");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel2.setText("Change Pin");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel3.setText("Balance");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel4.setText("Fast Withdraw");

        javax.swing.GroupLayout nextPanel2Layout = new javax.swing.GroupLayout(nextPanel2);
        nextPanel2.setLayout(nextPanel2Layout);
        nextPanel2Layout.setHorizontalGroup(
            nextPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nextPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nextPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(nextPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        nextPanel2Layout.setVerticalGroup(
            nextPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nextPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(nextPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(59, 59, 59)
                .addGroup(nextPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        backPanel.add(nextPanel2, "card3");

        withdrawPanel.setBackground(new java.awt.Color(0, 204, 204));
        withdrawPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel5.setText("Enter Amount");

        amount.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout withdrawPanelLayout = new javax.swing.GroupLayout(withdrawPanel);
        withdrawPanel.setLayout(withdrawPanelLayout);
        withdrawPanelLayout.setHorizontalGroup(
            withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawPanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, withdrawPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        withdrawPanelLayout.setVerticalGroup(
            withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        backPanel.add(withdrawPanel, "card4");

        balancePanel.setBackground(new java.awt.Color(0, 204, 204));
        balancePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout balancePanelLayout = new javax.swing.GroupLayout(balancePanel);
        balancePanel.setLayout(balancePanelLayout);
        balancePanelLayout.setHorizontalGroup(
            balancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );
        balancePanelLayout.setVerticalGroup(
            balancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        backPanel.add(balancePanel, "card4");

        changePinPanel.setBackground(new java.awt.Color(0, 204, 204));
        changePinPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel6.setText("New Pin :");

        newPin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout changePinPanelLayout = new javax.swing.GroupLayout(changePinPanel);
        changePinPanel.setLayout(changePinPanelLayout);
        changePinPanelLayout.setHorizontalGroup(
            changePinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePinPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPin1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        changePinPanelLayout.setVerticalGroup(
            changePinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePinPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(changePinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        backPanel.add(changePinPanel, "card4");

        FastwithdrawPanel.setBackground(new java.awt.Color(0, 204, 204));
        FastwithdrawPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        w1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        w1.setText("500");

        w2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        w2.setText("1000");

        w3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        w3.setText("5000");

        w4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        w4.setText("10000");

        javax.swing.GroupLayout FastwithdrawPanelLayout = new javax.swing.GroupLayout(FastwithdrawPanel);
        FastwithdrawPanel.setLayout(FastwithdrawPanelLayout);
        FastwithdrawPanelLayout.setHorizontalGroup(
            FastwithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FastwithdrawPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(FastwithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(w1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(FastwithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(w2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        FastwithdrawPanelLayout.setVerticalGroup(
            FastwithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FastwithdrawPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(FastwithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(w2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(FastwithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(w4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        backPanel.add(FastwithdrawPanel, "card4");

        pinChangedPanel.setBackground(new java.awt.Color(0, 204, 204));
        pinChangedPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        pinmsg.setText("Pin Changed Succefully !!!");

        javax.swing.GroupLayout pinChangedPanelLayout = new javax.swing.GroupLayout(pinChangedPanel);
        pinChangedPanel.setLayout(pinChangedPanelLayout);
        pinChangedPanelLayout.setHorizontalGroup(
            pinChangedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pinChangedPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(pinmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        pinChangedPanelLayout.setVerticalGroup(
            pinChangedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pinChangedPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(pinmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        backPanel.add(pinChangedPanel, "card8");

        otpPanel.setBackground(new java.awt.Color(0, 204, 204));
        otpPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        otpMsg.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        otpMsg.setText("Enter OTP");

        otp.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N

        javax.swing.GroupLayout otpPanelLayout = new javax.swing.GroupLayout(otpPanel);
        otpPanel.setLayout(otpPanelLayout);
        otpPanelLayout.setHorizontalGroup(
            otpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otpPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(otp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, otpPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(otpMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        otpPanelLayout.setVerticalGroup(
            otpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otpPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(otpMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        backPanel.add(otpPanel, "card9");

        MsgPanel.setBackground(new java.awt.Color(0, 204, 204));

        allmsg.setBackground(new java.awt.Color(0, 204, 204));
        allmsg.setColumns(20);
        allmsg.setRows(5);

        javax.swing.GroupLayout MsgPanelLayout = new javax.swing.GroupLayout(MsgPanel);
        MsgPanel.setLayout(MsgPanelLayout);
        MsgPanelLayout.setHorizontalGroup(
            MsgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(allmsg, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
        );
        MsgPanelLayout.setVerticalGroup(
            MsgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(allmsg, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );

        backPanel.add(MsgPanel, "card10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void btnDisable(){
        jBtnLT.setEnabled(false);
        jBtnLB.setEnabled(false);
        jBtnRT.setEnabled(false);
        jBtnRB.setEnabled(false);
    }
    private void btnEnable(){
        jBtnLT.setEnabled(true);
        jBtnLB.setEnabled(true);
        jBtnRT.setEnabled(true);
        jBtnRB.setEnabled(true);
    }
    
    private void setValue(String p, String value){
        if(p.equals("jDisplay")){
            String enteredNum = jpw.getText()+value;
            jpw.setText(enteredNum);
        }
        else if(p.equals("changePinPanel")){
                String enteredNum = newPin1.getText()+value;
                newPin1.setText(enteredNum);
 
        }
        else if(p.equals("otpPanel")){
            String enteredNum = otp.getText()+value;
            otp.setText(enteredNum);
        }
        else if(p.equals("withdrawPanel")){
            String enteredNum = amount.getText()+value;
            amount.setText(enteredNum);
        }
    }
    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
 
            setValue(panel,"1");
        
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed

        setValue(panel,"4");
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed

        setValue(panel,"7");
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowActivated

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed

        setValue(panel,"2");
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed

        setValue(panel,"3");
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed

        setValue(panel,"5");
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed

        setValue(panel,"6");
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed

        setValue(panel,"8");
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed

        setValue(panel,"9");
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed

        setValue(panel,"0");
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void jBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClearActionPerformed
        // TODO add your handling code here:
        if(panel.equals("jDisplay")){
            jpw.setText("");
        }
        else if(panel.equals("changePinPanel")){
            newPin1.setText("");
        }
        else if(panel.equals("otpPanel")){
            otp.setText("");
        }
        else if(panel.equals("withdrawPanel")){
            amount.setText("");
        }
        
    }//GEN-LAST:event_jBtnClearActionPerformed

    private void jBtnRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRBActionPerformed

        if(panel.equals("nextPanel2")){
         jDisplay.setVisible(false);
            nextPanel2.setVisible(false);
            withdrawPanel.setVisible(false);
            balancePanel.setVisible(false);
            otpPanel.setVisible(false);
            changePinPanel.setVisible(false);
            FastwithdrawPanel.setVisible(false);
            MsgPanel.setVisible(true);
            panel="balancePanel";
            
            int balance = 1;
            allmsg.setText("\n\n   Your Current Balance is \n\t Rs."+balance);
                allmsg.setEditable(false);
            btnDisable();  
        }
            
        else if(panel.equals("fastWithdrawPanel")){
               jDisplay.setVisible(false);
                nextPanel2.setVisible(false);
                withdrawPanel.setVisible(false);
                balancePanel.setVisible(false);
                otpPanel.setVisible(false);
                changePinPanel.setVisible(false);
                FastwithdrawPanel.setVisible(false);
                MsgPanel.setVisible(true);
                allmsg.setText("\n\n\tWithdrawal Successfull!!! \n\t\t Rs.5000\n\n\t\tTHANK YOU");
                allmsg.setEditable(false);
                btnDisable();
            }
            
    }//GEN-LAST:event_jBtnRBActionPerformed

    private void jBtnLBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLBActionPerformed

            if(panel.equals("nextPanel2")){
            jDisplay.setVisible(false);
            nextPanel2.setVisible(false);
            withdrawPanel.setVisible(false);
            balancePanel.setVisible(false);
            otpPanel.setVisible(false);
            changePinPanel.setVisible(false);
            FastwithdrawPanel.setVisible(true);
            panel="fastWithdrawPanel";
             
        }
            
        else if(panel.equals("fastWithdrawPanel")){
               jDisplay.setVisible(false);
                nextPanel2.setVisible(false);
                withdrawPanel.setVisible(false);
                balancePanel.setVisible(false);
                otpPanel.setVisible(false);
                changePinPanel.setVisible(false);
                FastwithdrawPanel.setVisible(false);
                MsgPanel.setVisible(true);
                allmsg.setText("\n\n\tWithdrawal Successfull!!! \n\t\t Rs.10000\n\n\t\tTHANK YOU");
                allmsg.setEditable(false);
                btnDisable();
            }
    }//GEN-LAST:event_jBtnLBActionPerformed

    private void jBtnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEnterActionPerformed
       
        if(panel.equals("jDisplay")){
            int p1 = Integer.parseInt(jpw.getText());
            if(p1==1234){
                jDisplay.setVisible(false);
                nextPanel2.setVisible(false);
                withdrawPanel.setVisible(false);
                balancePanel.setVisible(false);
                changePinPanel.setVisible(false);
                otpPanel.setVisible(true);
                FastwithdrawPanel.setVisible(false);
                panel="otpPanel";
            }
            
        }
        else if(panel.endsWith("otpPanel")){
            int enteredOtp = Integer.parseInt(otp.getText());
            if(enteredOtp==generatedOtp){
                jDisplay.setVisible(false);
                nextPanel2.setVisible(true);
                withdrawPanel.setVisible(false);
                balancePanel.setVisible(false);
                changePinPanel.setVisible(false);
                otpPanel.setVisible(false);
                FastwithdrawPanel.setVisible(false);
                btnEnable();
                panel="nextPanel2";
            }
            else{
                otp.setVisible(false);
                otpMsg.setText("Wrong OTP");
                
            }
        }
        else if(panel.equals("changePinPanel")){
            String p1 = newPin1.getText();
            if(p1.length()==4){
                jDisplay.setVisible(false);
                nextPanel2.setVisible(false);
                withdrawPanel.setVisible(false);
                balancePanel.setVisible(false);
                changePinPanel.setVisible(false);
                otpPanel.setVisible(false);
                FastwithdrawPanel.setVisible(false);
                pinChangedPanel.setVisible(true);
            }
            else{
                jDisplay.setVisible(false);
                nextPanel2.setVisible(false);
                withdrawPanel.setVisible(false);
                balancePanel.setVisible(false);
                changePinPanel.setVisible(false);
                otpPanel.setVisible(false);
                FastwithdrawPanel.setVisible(false);
                pinChangedPanel.setVisible(true);
                pinmsg.setText("Invalid Pin please try again");
            }
        }
        else if(panel.equals("withdrawPanel")){
            String amt = amount.getText();
            jDisplay.setVisible(false);
                nextPanel2.setVisible(false);
                withdrawPanel.setVisible(false);
                balancePanel.setVisible(false);
                otpPanel.setVisible(false);
                changePinPanel.setVisible(false);
                FastwithdrawPanel.setVisible(false);
                MsgPanel.setVisible(true);
                allmsg.setText("\n\n\tWithdrawal Successfull!!! \n\t\t Rs."+amt+"\n\n\t\tTHANK YOU");
                allmsg.setEditable(false);
                btnDisable();
                
        }
   
        
    }//GEN-LAST:event_jBtnEnterActionPerformed

    private void jBtnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancleActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBtnCancleActionPerformed

    private void jBtnRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRTActionPerformed
        // TODO add your handling code here:
        if(panel.equals("nextPanel2")){
         jDisplay.setVisible(false);
            nextPanel2.setVisible(false);
            withdrawPanel.setVisible(true);
            balancePanel.setVisible(false);
            otpPanel.setVisible(false);
            changePinPanel.setVisible(false);
            FastwithdrawPanel.setVisible(false);
            panel="withdrawPanel";
            btnDisable();  
        }
            
        else if(panel.equals("fastWithdrawPanel")){
               jDisplay.setVisible(false);
                nextPanel2.setVisible(false);
                withdrawPanel.setVisible(false);
                balancePanel.setVisible(false);
                otpPanel.setVisible(false);
                changePinPanel.setVisible(false);
                FastwithdrawPanel.setVisible(false);
                MsgPanel.setVisible(true);
                allmsg.setText("\n\n\tWithdrawal Successfull!!! \n\t\t Rs.500\n\n\t\tTHANK YOU");
                allmsg.setEditable(false);
                btnDisable();
            }
    }//GEN-LAST:event_jBtnRTActionPerformed

    private void jBtnLTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLTActionPerformed

        if(panel.equals("nextPanel2")){
         jDisplay.setVisible(false);
            nextPanel2.setVisible(false);
            withdrawPanel.setVisible(false);
            balancePanel.setVisible(false);
            otpPanel.setVisible(false);
            changePinPanel.setVisible(true);
            FastwithdrawPanel.setVisible(false);
            panel="changePinPanel";
            btnDisable();  
        }
            
        else if(panel.equals("fastWithdrawPanel")){
               jDisplay.setVisible(false);
                nextPanel2.setVisible(false);
                withdrawPanel.setVisible(false);
                balancePanel.setVisible(false);
                otpPanel.setVisible(false);
                changePinPanel.setVisible(false);
                FastwithdrawPanel.setVisible(false);
                MsgPanel.setVisible(true);
                allmsg.setText("\n\n\tWithdrawal Successfull!!! \n\t\t Rs.1000\n\n\t\tTHANK YOU");
                allmsg.setEditable(false);
                btnDisable();
            }
            
    }//GEN-LAST:event_jBtnLTActionPerformed

    private void newPin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPin1ActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ATMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATMS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FastwithdrawPanel;
    private javax.swing.JPanel MsgPanel;
    private javax.swing.JTextArea allmsg;
    private javax.swing.JTextField amount;
    private javax.swing.JPanel backPanel;
    private javax.swing.JPanel balancePanel;
    private javax.swing.JPanel changePinPanel;
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnCancle;
    private javax.swing.JButton jBtnClear;
    private javax.swing.JButton jBtnEnter;
    private javax.swing.JButton jBtnLB;
    private javax.swing.JButton jBtnLT;
    private javax.swing.JButton jBtnRB;
    private javax.swing.JButton jBtnRT;
    private javax.swing.JPanel jDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jpw;
    private javax.swing.JLabel msg1;
    private javax.swing.JTextField newPin1;
    private javax.swing.JPanel nextPanel2;
    private javax.swing.JTextField otp;
    private javax.swing.JLabel otpMsg;
    private javax.swing.JPanel otpPanel;
    private javax.swing.JPanel pinChangedPanel;
    private javax.swing.JLabel pinmsg;
    private javax.swing.JLabel w1;
    private javax.swing.JLabel w2;
    private javax.swing.JLabel w3;
    private javax.swing.JLabel w4;
    private javax.swing.JPanel withdrawPanel;
    // End of variables declaration//GEN-END:variables
}
