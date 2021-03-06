/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DealerRole;

import Business.Auction.Auction;
import Business.Product.Product;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public class AddProducts extends javax.swing.JPanel {

    /**
     * Creates new form CustomerScreen
     */
    JPanel userProcessContainer;
    Auction auction;
    private static final String usernameRegex = "^[a-zA-Z][a-zA-Z0-9.,$;]+$";
    private static final String usernameRegex1 = "^[a-zA-Z][a-zA-Z0-9.,$;]+$";
    Pattern usernamenormalpattern = Pattern.compile(usernameRegex);
    Pattern usernamenormalpattern1 = Pattern.compile(usernameRegex1);
    Matcher matchUserNameNormal;
    Matcher matchUserNameNormal1;
    
    
    
    
    public AddProducts(JPanel upc, Auction auction) {
        initComponents();
        userProcessContainer = upc;
        this.auction = auction;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        AddAuction = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pName = new javax.swing.JTextField();
        pBid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pDescription = new javax.swing.JTextArea();
        backButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pCategory = new javax.swing.JTextField();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setBackground(new java.awt.Color(153, 255, 255));

        AddAuction.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        AddAuction.setText("Add ");
        AddAuction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAuctionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Add Product");

        jLabel2.setText("Product Name");

        pBid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pBidActionPerformed(evt);
            }
        });

        jLabel4.setText("Product Description");

        jLabel5.setText("Minimum Bid");

        pDescription.setColumns(20);
        pDescription.setRows(5);
        jScrollPane1.setViewportView(pDescription);

        backButton4.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        backButton4.setText("<< Back");
        backButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Product Category");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pName)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(pBid)
                            .addComponent(backButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddAuction, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(pCategory))))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pBid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addComponent(AddAuction)
                .addGap(27, 27, 27)
                .addComponent(backButton4)
                .addContainerGap(96, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddAuctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAuctionActionPerformed
        // TODO add your handling code here:
        Product product = new Product();
        product.setName(pName.getText());
        product.setCategory(pCategory.getText());
        product.setDescription(pDescription.getText());
        product.setMinBid(Integer.parseInt(pBid.getText()));
      //  matchUserNameNormal = usernamenormalpattern.matcher(pName.getText());
        matchUserNameNormal1 = usernamenormalpattern1.matcher(pCategory.getText());
        String p=pName.getText();
        
        

         if(p.isEmpty() || pCategory.getText().isEmpty() || pDescription.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Fields cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
        }
//         else if(!(matchUserNameNormal.matches()))
//      {
//           JOptionPane.showMessageDialog(this, "Please Enter proper product name");
//           return;
//      }
//          else if(!(matchUserNameNormal1.matches()))
//      {
//           JOptionPane.showMessageDialog(this, "Please Enter proper product category");
//           return;
//      }
         
          else if(auction.isValidName(product.getName()))
        {
            auction.addProduct(product);
            
          JOptionPane.showMessageDialog(this, "Product Created");
          
          pName.setText("");
          pCategory.setText("");
          pDescription.setText("");
          pBid.setText("");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Product with the same name already exists", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_AddAuctionActionPerformed

    private void pBidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pBidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pBidActionPerformed

    private void backButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton4ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAuction;
    private javax.swing.JButton backButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pBid;
    private javax.swing.JTextField pCategory;
    private javax.swing.JTextArea pDescription;
    private javax.swing.JTextField pName;
    // End of variables declaration//GEN-END:variables
}
