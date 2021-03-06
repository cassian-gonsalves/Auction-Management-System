/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;


import Business.DeliveryRequest.DeliveryRequest;
import Business.Enterprise.Enterprise;
import Business.Member.DeliveryAdmin;
import Business.Member.Member;
import Business.Organization.DeliveryAdminOrganization;
import Business.Organization.Organization;
import Business.Product.Product;
import LoggerUtil.LogRecord;
import java.awt.CardLayout;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public class DeliveryDetails extends javax.swing.JPanel {

    /**
     * Creates new form CustomerScreen
     */
    private JPanel userProcessContainer;
    private Product product;
    private Member customer;
    private Enterprise enterprise;
    private DeliveryAdmin deliveryAdmin;

    private static final String usernameRegex = "^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$";
    Pattern usernamenormalpattern = Pattern.compile(usernameRegex);
    Matcher matchUserNameNormal;        
    
    
        
    public DeliveryDetails(JPanel userProcessContainer, Product product, Member customer,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.product = product;
        this.customer = customer;
        for(Organization organization:enterprise.getOrganizationsList())
        {
            if(organization instanceof DeliveryAdminOrganization)
            {
                deliveryAdmin = (DeliveryAdmin)organization.getMemberDirectory().getMembersList().get(0);
            }
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

        ViewAuction = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        contactNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
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
        add(ViewAuction, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 117, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Delivery Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 15, 201, 27));

        jLabel3.setText("Contact Number ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 28));

        contactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNumberActionPerformed(evt);
            }
        });
        add(contactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 216, -1));

        jLabel4.setText("Address");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 216, -1));

        backButton4.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        backButton4.setText("<< Back");
        backButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton4ActionPerformed(evt);
            }
        });
        add(backButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 117, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ViewAuctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAuctionActionPerformed
        if(address.getText().isEmpty() || address.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Fields cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
        }
//            else if(!(matchUserNameNormal.matches()))
//      {
//           JOptionPane.showMessageDialog(this, "Please Enter valid 10 digit number");
//           return;
//      }

       else if(deliveryAdmin.getProductStatus(product).equals("Delivery not requested"))
        {
              LogRecord.log(Level.INFO, "Delivery requested by"+customer);
            DeliveryRequest dr = new DeliveryRequest();
            dr.setCustomer(customer);
            dr.setDeliveryAddress(address.getText());
            dr.setPhoneNumber(contactNumber.getText());
            dr.setProduct(product);
            dr.setDeliveryStatus(false);
            deliveryAdmin.addDeliveryRequest(dr);
  //          matchUserNameNormal = usernamenormalpattern.matcher(contactNumber.getText()); 
JOptionPane.showMessageDialog(null, "Delivery requested", "Warning", JOptionPane.WARNING_MESSAGE);  
        }
        else{
            JOptionPane.showMessageDialog(null, "Delivery has already been requested for this product", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_ViewAuctionActionPerformed

    private void contactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNumberActionPerformed

    private void backButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton4ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewAuction;
    private javax.swing.JTextArea address;
    private javax.swing.JButton backButton4;
    private javax.swing.JTextField contactNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
