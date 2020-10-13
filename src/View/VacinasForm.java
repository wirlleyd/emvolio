/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Paciente;
import Model.Vacina;
import ModelDAO.PacienteDAO;
import ModelDAO.VacinaDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VacinasForm extends javax.swing.JFrame {

    Vacina vacina;
    VacinaDAO vdao = new VacinaDAO();

    public VacinasForm() {
        initComponents();
        try {
            carregaTabela();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Falha ao carregar Registros!");
        }
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
        procurarButton = new javax.swing.JPanel();
        procurarLabel = new javax.swing.JLabel();
        procurarIdPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        procurarIdTextField = new javax.swing.JTextField();
        procurarIdLabel = new javax.swing.JLabel();
        vacinasLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Vacinas = new javax.swing.JTable();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        idPanel = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        idTextField = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        nomePanel = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        nomeTextField = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        quantidadePanel = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        quantidadeTextField = new javax.swing.JTextField();
        quantidadeLabel = new javax.swing.JLabel();
        observacoesPanel = new javax.swing.JPanel();
        observacoesLabel = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        observacoesTextArea = new javax.swing.JTextArea();
        titleLabel = new javax.swing.JLabel();
        novoButton = new javax.swing.JPanel();
        novoLabel = new javax.swing.JLabel();
        removerButton = new javax.swing.JPanel();
        removerLabel = new javax.swing.JLabel();
        salvarButton = new javax.swing.JPanel();
        salvarLabel = new javax.swing.JLabel();
        cancelarButton = new javax.swing.JPanel();
        cancelarLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(32, 33, 35));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        procurarButton.setBackground(new java.awt.Color(42, 44, 44));
        procurarButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        procurarLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        procurarLabel.setForeground(new java.awt.Color(57, 113, 117));
        procurarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        procurarLabel.setText("Procurar Vacina");
        procurarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                procurarLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout procurarButtonLayout = new javax.swing.GroupLayout(procurarButton);
        procurarButton.setLayout(procurarButtonLayout);
        procurarButtonLayout.setHorizontalGroup(
            procurarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, procurarButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(procurarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );
        procurarButtonLayout.setVerticalGroup(
            procurarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(procurarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(procurarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 170, 50));

        procurarIdPanel.setBackground(new java.awt.Color(32, 33, 35));
        procurarIdPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        procurarIdPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, 350, -1));

        procurarIdTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        procurarIdTextField.setToolTipText("");
        procurarIdTextField.setBorder(null);
        procurarIdTextField.setCaretColor(new java.awt.Color(255, 255, 255));
        procurarIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarIdTextFieldActionPerformed(evt);
            }
        });
        procurarIdPanel.add(procurarIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 320, 30));

        procurarIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        procurarIdLabel.setForeground(new java.awt.Color(57, 113, 117));
        procurarIdLabel.setText("ID:");
        procurarIdPanel.add(procurarIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel1.add(procurarIdPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 330, -1));

        vacinasLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        vacinasLabel.setForeground(new java.awt.Color(242, 242, 242));
        vacinasLabel.setText("Vacinas");
        jPanel1.add(vacinasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jTable_Vacinas.setForeground(new java.awt.Color(57, 113, 117));
        jTable_Vacinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Quantidade", "Obsevações"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_Vacinas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable_Vacinas.setFocusable(false);
        jTable_Vacinas.setGridColor(new java.awt.Color(255, 255, 255));
        jTable_Vacinas.setInheritsPopupMenu(true);
        jTable_Vacinas.getTableHeader().setResizingAllowed(false);
        jTable_Vacinas.getTableHeader().setReorderingAllowed(false);
        jTable_Vacinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_VacinasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Vacinas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 520, 420));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 20, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 590, 710));

        jPanel2.setBackground(new java.awt.Color(32, 33, 35));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idPanel.setBackground(new java.awt.Color(32, 33, 35));
        idPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        idPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, 350, -1));

        idTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idTextField.setToolTipText("");
        idTextField.setBorder(null);
        idTextField.setCaretColor(new java.awt.Color(255, 255, 255));
        idTextField.setEnabled(false);
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });
        idPanel.add(idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, 30));

        idLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        idLabel.setForeground(new java.awt.Color(57, 113, 117));
        idLabel.setText("ID:");
        idPanel.add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel2.add(idPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, -1));

        nomePanel.setBackground(new java.awt.Color(32, 33, 35));
        nomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        nomePanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, 350, -1));

        nomeTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomeTextField.setToolTipText("");
        nomeTextField.setBorder(null);
        nomeTextField.setCaretColor(new java.awt.Color(255, 255, 255));
        nomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextFieldActionPerformed(evt);
            }
        });
        nomePanel.add(nomeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 350, 30));

        nomeLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(57, 113, 117));
        nomeLabel.setText("Nome:");
        nomePanel.add(nomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel2.add(nomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 380, -1));

        quantidadePanel.setBackground(new java.awt.Color(32, 33, 35));
        quantidadePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        quantidadePanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, 150, -1));

        quantidadeTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quantidadeTextField.setToolTipText("");
        quantidadeTextField.setBorder(null);
        quantidadeTextField.setCaretColor(new java.awt.Color(255, 255, 255));
        quantidadeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadeTextFieldActionPerformed(evt);
            }
        });
        quantidadePanel.add(quantidadeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, 30));

        quantidadeLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        quantidadeLabel.setForeground(new java.awt.Color(57, 113, 117));
        quantidadeLabel.setText("Quantidade:");
        quantidadePanel.add(quantidadeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel2.add(quantidadePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 180, -1));

        observacoesPanel.setBackground(new java.awt.Color(32, 33, 35));
        observacoesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        observacoesLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        observacoesLabel.setForeground(new java.awt.Color(57, 113, 117));
        observacoesLabel.setText("Observações:");
        observacoesPanel.add(observacoesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        observacoesTextArea.setColumns(100);
        observacoesTextArea.setRows(5);
        jScrollPane.setViewportView(observacoesTextArea);

        observacoesPanel.add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 530, 200));

        jPanel2.add(observacoesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 550, 240));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(242, 242, 242));
        titleLabel.setText("Vacina");
        jPanel2.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        novoButton.setBackground(new java.awt.Color(42, 44, 44));
        novoButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        novoLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        novoLabel.setForeground(new java.awt.Color(57, 113, 117));
        novoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        novoLabel.setText("Novo");
        novoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                novoLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout novoButtonLayout = new javax.swing.GroupLayout(novoButton);
        novoButton.setLayout(novoButtonLayout);
        novoButtonLayout.setHorizontalGroup(
            novoButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, novoButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(novoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        novoButtonLayout.setVerticalGroup(
            novoButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(novoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.add(novoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 630, 130, 50));

        removerButton.setBackground(new java.awt.Color(42, 44, 44));
        removerButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        removerLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        removerLabel.setForeground(new java.awt.Color(57, 113, 117));
        removerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        removerLabel.setText("Remover");
        removerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removerLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout removerButtonLayout = new javax.swing.GroupLayout(removerButton);
        removerButton.setLayout(removerButtonLayout);
        removerButtonLayout.setHorizontalGroup(
            removerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removerButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(removerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        removerButtonLayout.setVerticalGroup(
            removerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(removerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.add(removerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 630, 130, 50));

        salvarButton.setBackground(new java.awt.Color(42, 44, 44));
        salvarButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        salvarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarButtonMouseClicked(evt);
            }
        });

        salvarLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        salvarLabel.setForeground(new java.awt.Color(57, 113, 117));
        salvarLabel.setText("Salvar");
        salvarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout salvarButtonLayout = new javax.swing.GroupLayout(salvarButton);
        salvarButton.setLayout(salvarButtonLayout);
        salvarButtonLayout.setHorizontalGroup(
            salvarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salvarButtonLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(salvarLabel)
                .addGap(31, 31, 31))
        );
        salvarButtonLayout.setVerticalGroup(
            salvarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salvarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.add(salvarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 630, 130, 50));

        cancelarButton.setBackground(new java.awt.Color(229, 90, 90));
        cancelarButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cancelarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarButtonMouseClicked(evt);
            }
        });

        cancelarLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cancelarLabel.setForeground(new java.awt.Color(247, 247, 247));
        cancelarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelarLabel.setText("Voltar");

        javax.swing.GroupLayout cancelarButtonLayout = new javax.swing.GroupLayout(cancelarButton);
        cancelarButton.setLayout(cancelarButtonLayout);
        cancelarButtonLayout.setHorizontalGroup(
            cancelarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelarButtonLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(cancelarLabel)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        cancelarButtonLayout.setVerticalGroup(
            cancelarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.add(cancelarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, -1, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void procurarIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_procurarIdTextFieldActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void nomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextFieldActionPerformed

    private void quantidadeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantidadeTextFieldActionPerformed

    private void cancelarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarButtonMouseClicked
        // TODO add your handling code here:
        HomeForm frm = new HomeForm();
        frm.setVisible(true);
        this.hide();
    }//GEN-LAST:event_cancelarButtonMouseClicked

    private void novoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoLabelMouseClicked
        // TODO add your handling code here:
        idTextField.setText("");
        nomeTextField.setText("");
        quantidadeTextField.setText("");
        observacoesTextArea.setText("");
        vacina = new Vacina();
    }//GEN-LAST:event_novoLabelMouseClicked

    private void removerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removerLabelMouseClicked
        // TODO add your handling code here:
        if (idTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione um registro");
        } else {
            try {
                vdao.delete(vacina);
                carregaTabela();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(PacientesForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Registro removido!");
        }
        clearFields();
    }//GEN-LAST:event_removerLabelMouseClicked

    private void salvarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarLabelMouseClicked
        // TODO add your handling code here:
        try {
            if (nomeTextField.getText().isEmpty() || quantidadeTextField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, preencha os campos corretamente!");
            } else if (idTextField.getText().isEmpty()) {
                Vacina v = new Vacina(nomeTextField.getText(), Integer.valueOf(quantidadeTextField.getText()), observacoesTextArea.getText());
                vdao.insert(v);
                JOptionPane.showMessageDialog(null, "Registro salvo!");
            } else {
                Vacina v = new Vacina(nomeTextField.getText(), Integer.valueOf(quantidadeTextField.getText()), observacoesTextArea.getText());
                v.setId_vacina(Integer.valueOf(idTextField.getText()));
                JOptionPane.showMessageDialog(null, "Registro Atualizado!");
                vdao.update(v);
            }
            clearFields();
            carregaTabela();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PacientesForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_salvarLabelMouseClicked

    private void salvarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarButtonMouseClicked
        Vacina v = new Vacina(nomeTextField.getText(), Integer.valueOf(quantidadeTextField.getText()), observacoesTextArea.getText());
        try {
            if (nomeTextField.getText().isEmpty() || quantidadeTextField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, preencha os campos corretamente!");
            } else if (idTextField.getText().isEmpty()) {
                vdao.insert(v);
                JOptionPane.showMessageDialog(null, "Registro salvo!");
            } else {
                v.setId_vacina(Integer.valueOf(idTextField.getText()));
                vdao.update(v);
                JOptionPane.showMessageDialog(null, "Registro Atualizado!");
            }
            carregaTabela();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PacientesForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_salvarButtonMouseClicked

    private void jTable_VacinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_VacinasMouseClicked
        // TODO add your handling code here:
        int linha = jTable_Vacinas.getSelectedRow();
        if (linha > -1) {
            DefaultTableModel modelo = (DefaultTableModel) jTable_Vacinas.getModel();
            vacina = new Vacina();
            try {
                vacina = vdao.getOne(Integer.valueOf(modelo.getValueAt(linha, 0).toString()));
                carregaTabela();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(VacinasForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            idTextField.setText(String.valueOf(vacina.getId_vacina()));
            nomeTextField.setText(vacina.getNome());
            quantidadeTextField.setText(String.valueOf(vacina.getQuantidade()));
            observacoesTextArea.setText(vacina.getObservacoes());
        }
    }//GEN-LAST:event_jTable_VacinasMouseClicked

    private void procurarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_procurarLabelMouseClicked
        try {
            // TODO add your handling code here:
            carregaTabelaById();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VacinasForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_procurarLabelMouseClicked

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
            java.util.logging.Logger.getLogger(VacinasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VacinasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VacinasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VacinasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VacinasForm().setVisible(true);
            }
        });
    }

    private void carregaTabela() throws ClassNotFoundException, SQLException {
        DefaultTableModel modelo = (DefaultTableModel) jTable_Vacinas.getModel();
        modelo.setNumRows(0);
        jTable_Vacinas.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable_Vacinas.getColumnModel().getColumn(1).setPreferredWidth(30);
        jTable_Vacinas.getColumnModel().getColumn(2).setPreferredWidth(10);
        jTable_Vacinas.getColumnModel().getColumn(3).setPreferredWidth(70);
        VacinaDAO vacinaDAO = new VacinaDAO();
        for (Vacina v : vacinaDAO.getAll()) {
            modelo.addRow(new Object[]{
                v.getId_vacina(),
                v.getNome(),
                v.getQuantidade(),
                v.getObservacoes()
            });
        }
    }

    private void carregaTabelaById() throws ClassNotFoundException, SQLException {
        DefaultTableModel modelo = (DefaultTableModel) jTable_Vacinas.getModel();
        modelo.setNumRows(0);
        for (Vacina v : vdao.getById(Integer.valueOf(procurarIdTextField.getText()))) {
            modelo.addRow(new Object[]{
                v.getId_vacina(),
                v.getNome(),
                v.getQuantidade(),
                v.getObservacoes()
            });
        }
    }
    
    public void clearFields(){
        idTextField.setText("");
        nomeTextField.setText("");
        quantidadeTextField.setText("");
        observacoesTextArea.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cancelarButton;
    private javax.swing.JLabel cancelarLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel idPanel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTable_Vacinas;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JPanel nomePanel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JPanel novoButton;
    private javax.swing.JLabel novoLabel;
    private javax.swing.JLabel observacoesLabel;
    private javax.swing.JPanel observacoesPanel;
    private javax.swing.JTextArea observacoesTextArea;
    private javax.swing.JPanel procurarButton;
    private javax.swing.JLabel procurarIdLabel;
    private javax.swing.JPanel procurarIdPanel;
    private javax.swing.JTextField procurarIdTextField;
    private javax.swing.JLabel procurarLabel;
    private javax.swing.JLabel quantidadeLabel;
    private javax.swing.JPanel quantidadePanel;
    private javax.swing.JTextField quantidadeTextField;
    private javax.swing.JPanel removerButton;
    private javax.swing.JLabel removerLabel;
    private javax.swing.JPanel salvarButton;
    private javax.swing.JLabel salvarLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel vacinasLabel;
    // End of variables declaration//GEN-END:variables
}
