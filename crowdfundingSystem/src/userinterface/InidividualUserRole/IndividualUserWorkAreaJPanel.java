/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InidividualUserRole;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Employee.Employee;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.ProjectApprovalRole.ProjectApprovalJPanel;

/**
 *
 * @author xinzh
 */
public class IndividualUserWorkAreaJPanel extends javax.swing.JPanel {

  private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private Employee employee;
    
    public IndividualUserWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, Employee employee) {
        initComponents();
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.employee = employee;
        valueLabel.setText(enterprise.getName());
        valueLabel2.setText(employee.getName());
        populateRequestTable();
        populateHistoryTable();
         SectorJComboBox.removeAllItems();
         SectorJComboBox.addItem(Organization.Type.Charity);
         SectorJComboBox.addItem(Organization.Type.Commercial);
    }
     public void populateRequestTable(){
           
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();   
        model.setRowCount(0);
        for (WorkRequest request : network.getProjectList().getWorkRequestList()){
            System.out.println(request);
            if(request.getStatus().equals("In Progress")){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getRequestFunds();
            row[2] = request.getRecievedFunds();
            row[3] = request.getSector();
            row[4] = request.getStatus();
            
            model.addRow(row);}
        }
        }
     public void populateHistoryTable(){
        DefaultTableModel model = (DefaultTableModel) InvestedHistoryTable.getModel();   
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            System.out.println(request);
          
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getSector();
            row[2] = request.getStatus();
            row[3] = Double.toString(request.getRecievedFunds())+"/"+Double.toString(request.getRequestFunds());
            if(request.getInvestorInformation().containsKey(userAccount)){
            row[4] = request.getInvestorInformation().get(userAccount);}                            
            model.addRow(row);
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

        ViewBtn1 = new javax.swing.JButton();
        refreshTestJButton1 = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SectorJComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        InvestedHistoryTable = new javax.swing.JTable();
        ViewBtn2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        valueLabel2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(206, 229, 229));

        ViewBtn1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        ViewBtn1.setText("View and Invest");
        ViewBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtn1ActionPerformed(evt);
            }
        });

        refreshTestJButton1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        refreshTestJButton1.setText("Refresh");
        refreshTestJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButton1ActionPerformed(evt);
            }
        });

        valueLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        valueLabel.setText("<>");

        enterpriseLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel3.setText("Sector:");

        SectorJComboBox.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        SectorJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        workRequestJTable.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Project", "Requested Fund (USD)", "Recieved Fund (USD)", "Sector", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel1.setText("All projects you have invested:");

        InvestedHistoryTable.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        InvestedHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Project Name", "Sector", "Status", "Funds(Received/Request)", "You Invested"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(InvestedHistoryTable);

        ViewBtn2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        ViewBtn2.setText("View and Invest");
        ViewBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtn2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 2, 24)); // NOI18N
        jLabel6.setText("Hello");

        valueLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 2, 24)); // NOI18N
        valueLabel2.setText("<>");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 2, 14)); // NOI18N
        jLabel2.setText("You can make the world a better place!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ViewBtn2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(37, 37, 37)
                                        .addComponent(SectorJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(207, 207, 207)
                                        .addComponent(refreshTestJButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ViewBtn1))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valueLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(valueLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshTestJButton1)
                    .addComponent(jLabel3)
                    .addComponent(SectorJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewBtn1))
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewBtn2)
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ViewBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBtn1ActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();      
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row first");
            return;
        }
      WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
      CardLayout layout = (CardLayout) userProcessContainer.getLayout();
      userProcessContainer.add("IndividualUserActionJPanel", new IndividualUserActionJPanel(userProcessContainer, userAccount,organization,enterprise,network,request) );
      layout.next(userProcessContainer);
    }//GEN-LAST:event_ViewBtn1ActionPerformed

    private void refreshTestJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButton1ActionPerformed
        Organization.Type chosedSector = (Organization.Type)SectorJComboBox.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();   
        model.setRowCount(0);
        for (WorkRequest request : network.getProjectList().getWorkRequestList()){
            Organization.Type sector=request.getSector();
            if(sector.equals(chosedSector)&&request.getStatus().equals("In Progress")){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getRequestFunds();
            row[2] = request.getRecievedFunds();
            row[3] = request.getSector();
            row[4] = request.getStatus();      
            model.addRow(row);}
        }
    }//GEN-LAST:event_refreshTestJButton1ActionPerformed

    private void ViewBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBtn2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = InvestedHistoryTable.getSelectedRow();      
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row first");
            return;
        }
      WorkRequest request = (WorkRequest)InvestedHistoryTable.getValueAt(selectedRow, 0);
      CardLayout layout = (CardLayout) userProcessContainer.getLayout();
      userProcessContainer.add("IndividualUserActionJPanel", new IndividualUserActionJPanel(userProcessContainer, userAccount,organization,enterprise,network,request) );
      layout.next(userProcessContainer);
    }//GEN-LAST:event_ViewBtn2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable InvestedHistoryTable;
    private javax.swing.JComboBox SectorJComboBox;
    private javax.swing.JButton ViewBtn1;
    private javax.swing.JButton ViewBtn2;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshTestJButton1;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel valueLabel2;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}