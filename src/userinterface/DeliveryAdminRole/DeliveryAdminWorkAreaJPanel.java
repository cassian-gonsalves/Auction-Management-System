/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryAdminRole;

import userinterface.DealerRole.*;
import Business.Enterprise.Enterprise;
import Business.Member.Dealer;
import Business.Member.DeliveryAdmin;
import Business.Organization.DealerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public class DeliveryAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerScreen
     */
    
    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private DeliveryAdmin deliveryAdmin;
    
    public DeliveryAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
              
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.deliveryAdmin = (DeliveryAdmin)account.getMember();
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
        deliveryQueue = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Delivery Work Area");

        deliveryQueue.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        deliveryQueue.setText("View Delivery Queue");
        deliveryQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryQueueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(deliveryQueue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23)))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(deliveryQueue)
                .addContainerGap(313, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deliveryQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryQueueActionPerformed
        // TODO add your handling code here:
        /*Go to work area(Next Screen) */
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        DeliveryRequests dl = new DeliveryRequests(userProcessContainer, deliveryAdmin);
        userProcessContainer.add(dl);
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_deliveryQueueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deliveryQueue;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
