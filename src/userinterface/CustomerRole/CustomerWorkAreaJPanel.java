/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Enterprise.Enterprise;
import Business.Organization.CustomerOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWorkAreaJPanel
     */
    
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    
    public CustomerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, CustomerOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        purchasedProductsCustomer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewAuctionsCustomer = new javax.swing.JButton();
        placedBidsCustomer = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));

        purchasedProductsCustomer.setBackground(new java.awt.Color(153, 255, 255));
        purchasedProductsCustomer.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        purchasedProductsCustomer.setText("View Products purchased");
        purchasedProductsCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchasedProductsCustomerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Customer Work Area");

        viewAuctionsCustomer.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        viewAuctionsCustomer.setText("View Auctions ");
        viewAuctionsCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAuctionsCustomerActionPerformed(evt);
            }
        });

        placedBidsCustomer.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        placedBidsCustomer.setText("View Placed Bids");
        placedBidsCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placedBidsCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(purchasedProductsCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewAuctionsCustomer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(placedBidsCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(viewAuctionsCustomer)
                .addGap(18, 18, 18)
                .addComponent(placedBidsCustomer)
                .addGap(18, 18, 18)
                .addComponent(purchasedProductsCustomer)
                .addContainerGap(143, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewAuctionsCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAuctionsCustomerActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        AuctionList al = new AuctionList(userProcessContainer, enterprise, userAccount.getMember());
        userProcessContainer.add(al);
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_viewAuctionsCustomerActionPerformed

    private void purchasedProductsCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchasedProductsCustomerActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        PurchasedProducts pp = new PurchasedProducts(userProcessContainer, enterprise, userAccount.getMember());
        userProcessContainer.add(pp);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_purchasedProductsCustomerActionPerformed

    private void placedBidsCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placedBidsCustomerActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        ViewPlacedBids vpb = new ViewPlacedBids(userProcessContainer, enterprise, userAccount.getMember());
        userProcessContainer.add(vpb);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_placedBidsCustomerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton placedBidsCustomer;
    private javax.swing.JButton purchasedProductsCustomer;
    private javax.swing.JButton viewAuctionsCustomer;
    // End of variables declaration//GEN-END:variables
}
