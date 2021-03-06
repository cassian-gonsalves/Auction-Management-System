/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;


import Business.Bid.IllegalBidAmountException;
import Business.Member.Member;
import Business.Product.Product;
import java.awt.CardLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public class ViewProduct extends javax.swing.JPanel {

    /**
     * Creates new form CustomerScreen
     */
    private JPanel userProcessContainer;
    private Product product;
    private Member customer;
        
    public ViewProduct(JPanel userProcessContainer, Product product, Member customer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.product=product;
        this.customer = customer;
        displayDetails();
    }
    
    private void displayDetails()
    {
        pName.setText(product.getName());
        pId.setText(String.valueOf(product.getId()));
        prodDescription.setText(product.getDescription());
        pBid.setText(String.valueOf(product.getMinBid()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewAuction = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pName = new javax.swing.JTextField();
        pBid = new javax.swing.JTextField();
        pId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pBid1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        prodDescription = new javax.swing.JTextArea();
        backButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewAuction.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        ViewAuction.setText("Submit ");
        ViewAuction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAuctionActionPerformed(evt);
            }
        });
        add(ViewAuction, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 340, 117, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("View Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 15, 201, 27));

        jLabel2.setText("Product Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 60, 91, 28));

        jLabel3.setText("Product ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 106, 91, 28));

        pName.setEditable(false);
        add(pName, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 61, 216, -1));

        pBid.setEditable(false);
        pBid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pBidActionPerformed(evt);
            }
        });
        add(pBid, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 254, 216, -1));

        pId.setEditable(false);
        pId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pIdActionPerformed(evt);
            }
        });
        add(pId, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 108, 216, -1));

        jLabel4.setText("Product Description");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 167, -1, -1));

        jLabel5.setText("Minimum Bid");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 254, -1, -1));

        pBid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pBid1ActionPerformed(evt);
            }
        });
        add(pBid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 296, 216, -1));

        jLabel6.setText("Place Bid");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 301, -1, -1));

        prodDescription.setColumns(20);
        prodDescription.setRows(5);
        jScrollPane1.setViewportView(prodDescription);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 152, 216, -1));

        backButton4.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        backButton4.setText("<< Back");
        backButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton4ActionPerformed(evt);
            }
        });
        add(backButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 340, 117, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ViewAuctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAuctionActionPerformed
        if(pBid1.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Fields cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
        int custBid = Integer.valueOf(pBid1.getText());
        
      
        try {
            product.addBid(customer, custBid);
            JOptionPane.showMessageDialog(null, "Bid Siccessfully submitted", "Warning", JOptionPane.WARNING_MESSAGE);
            pBid1.setText("");
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
             pBid1.setText("");
             
        }
        
        }
    }//GEN-LAST:event_ViewAuctionActionPerformed

    private void pBidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pBidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pBidActionPerformed

    private void pIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pIdActionPerformed

    private void pBid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pBid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pBid1ActionPerformed

    private void backButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton4ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewAuction;
    private javax.swing.JButton backButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pBid;
    private javax.swing.JTextField pBid1;
    private javax.swing.JTextField pId;
    private javax.swing.JTextField pName;
    private javax.swing.JTextArea prodDescription;
    // End of variables declaration//GEN-END:variables
}
