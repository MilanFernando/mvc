/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.mvc.view;
import edu.ijse.mvc.controller.ItemController;
import edu.ijse.mvc.controller.CustomerController;
import edu.ijse.mvc.dto.ItemDto;
import edu.ijse.mvc.dto.CustomerDto;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Milan
 */
public class OrderView extends javax.swing.JFrame {
    private ItemController itemController;
    private CustomerController customerController; 
    /**
     * Creates new form OrderView
     */
    public OrderView() {
        itemController=new ItemController();
        customerController=new CustomerController();
        initComponents();}
   /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltitle = new javax.swing.JLabel();
        lblorderid = new javax.swing.JLabel();
        lblcustid = new javax.swing.JLabel();
        lblitemid = new javax.swing.JLabel();
        txtorderid = new javax.swing.JTextField();
        txtitemid = new javax.swing.JTextField();
        txtcustid = new javax.swing.JTextField();
        btncustid = new javax.swing.JButton();
        btnitemid = new javax.swing.JButton();
        lblitemdata = new javax.swing.JLabel();
        lblcustdata = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("Order");

        lblorderid.setText("Order ID");

        lblcustid.setText("Cust ID");

        lblitemid.setText("Item ID");

        txtitemid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtcustid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btncustid.setText("Search");
        btncustid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustidActionPerformed(evt);
            }
        });

        btnitemid.setText("Search");
        btnitemid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnitemidActionPerformed(evt);
            }
        });

        lblcustdata.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblorderid)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtorderid))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblcustid)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcustid, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btncustid)))
                        .addGap(18, 18, 18)
                        .addComponent(lblcustdata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblitemid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtitemid, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnitemid)
                .addGap(18, 18, 18)
                .addComponent(lblitemdata, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblorderid)
                    .addComponent(txtorderid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcustid)
                    .addComponent(txtcustid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncustid)
                    .addComponent(lblcustdata))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblitemid)
                    .addComponent(txtitemid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnitemid)
                    .addComponent(lblitemdata))
                .addGap(0, 180, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncustidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncustidActionPerformed
       searchCustomer();
    }//GEN-LAST:event_btncustidActionPerformed

    private void btnitemidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnitemidActionPerformed
       searchItem();
    }//GEN-LAST:event_btnitemidActionPerformed
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
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new OrderView().setVisible(true);
            }
        });
    }
    private void searchItem(){
     try {
         String itemId=txtitemid.getText();
         ItemDto itemDto=itemController.searchItem(itemId);
         if(itemDto !=null){
             lblitemdata.setText(itemDto.getDescription()+" | "+itemDto.getUnitprice()+" | "+itemDto.getQoh());
         }else{
         JOptionPane.showMessageDialog(this,"item not found");
}
     } catch (Exception ex) {
         Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    private void searchCustomer(){
        try {
            String custId=txtcustid.getText();
            CustomerDto customerDto=customerController.searchCustomer(custId);
            if(customerDto !=null){
             lblcustdata.setText(customerDto.getCustTitle()+"  "+customerDto.getCustName());
         }else{
         JOptionPane.showMessageDialog(this,"customer not found");}
        } catch (Exception ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncustid;
    private javax.swing.JButton btnitemid;
    private javax.swing.JLabel lblcustdata;
    private javax.swing.JLabel lblcustid;
    private javax.swing.JLabel lblitemdata;
    private javax.swing.JLabel lblitemid;
    private javax.swing.JLabel lblorderid;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTextField txtcustid;
    private javax.swing.JTextField txtitemid;
    private javax.swing.JTextField txtorderid;
    // End of variables declaration//GEN-END:variables
}
