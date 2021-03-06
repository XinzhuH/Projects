/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.IntentionReceiverRole;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.ProjectApprovalRole.ProjectApprovalWorkAreaJPanel;

/**
 *
 * @author xinzh
 */
public class IntentionReceiveJPanel extends javax.swing.JPanel {

      private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private Organization organization;
    private WorkRequest request;
    public IntentionReceiveJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network, WorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.organization=organization;
        this.network=network;
        this.request=request;
        valueLabel.setText(enterprise.getName());
        valueLabel3.setText(organization.getName());
        ProjectNameTxt.setText(request.getProjectName());
        DetailsTxt.setText(request.getDetails());
        ProvidedFundsTxt.setText(Double.toString(request.getProvidedFunds()));
        SectorTxt.setText(request.getSector().toString());
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AcceptBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ProjectNameTxt = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        ProvidedFundsTxt = new javax.swing.JTextField();
        enterpriseLabel = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        SectorTxt = new javax.swing.JTextField();
        valueLabel3 = new javax.swing.JLabel();
        enterpriseLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DetailsTxt = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(173, 204, 173));

        AcceptBtn.setBackground(new java.awt.Color(255, 255, 255));
        AcceptBtn.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        AcceptBtn.setText("Accept");
        AcceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel1.setText("Project Name:");

        ProjectNameTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        ProjectNameTxt.setEnabled(false);

        backJButton.setBackground(new java.awt.Color(255, 255, 255));
        backJButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel3.setText("Provided Funds (USD):");

        valueLabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        valueLabel.setText("<value>");

        ProvidedFundsTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        ProvidedFundsTxt.setEnabled(false);

        enterpriseLabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        enterpriseLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        enterpriseLabel1.setText("Please see below for the intention details");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel2.setText("Details:");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jButton1.setText("Decline");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel4.setText("Sector:");

        SectorTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        SectorTxt.setEnabled(false);

        valueLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        valueLabel3.setText("<value>");

        enterpriseLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        enterpriseLabel3.setText("Organization:");

        DetailsTxt.setColumns(20);
        DetailsTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        DetailsTxt.setRows(5);
        DetailsTxt.setEnabled(false);
        jScrollPane1.setViewportView(DetailsTxt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterpriseLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(backJButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ProvidedFundsTxt)
                                    .addComponent(SectorTxt)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                    .addComponent(ProjectNameTxt)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valueLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(289, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AcceptBtn)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(298, 298, 298))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel3)
                    .addComponent(enterpriseLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProjectNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SectorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ProvidedFundsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AcceptBtn)
                            .addComponent(jButton1))
                        .addContainerGap(76, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backJButton)
                        .addGap(37, 37, 37))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AcceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptBtnActionPerformed

        request.setStatus("Accepted");    

    JOptionPane.showMessageDialog(null, "Accepted"); 
       userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        IntentionReceiverWorkAreaJPanel dwjp = ( IntentionReceiverWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();     
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_AcceptBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

            userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        IntentionReceiverWorkAreaJPanel dwjp = ( IntentionReceiverWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();     
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        request.setStatus("Declined");
        JOptionPane.showMessageDialog(null, "Declined"); 
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        IntentionReceiverWorkAreaJPanel dwjp = ( IntentionReceiverWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();     
        layout.previous(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptBtn;
    private javax.swing.JTextArea DetailsTxt;
    private javax.swing.JTextField ProjectNameTxt;
    private javax.swing.JTextField ProvidedFundsTxt;
    private javax.swing.JTextField SectorTxt;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel enterpriseLabel3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel valueLabel3;
    // End of variables declaration//GEN-END:variables
}
