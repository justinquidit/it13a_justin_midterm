
package pkgfinal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class order extends javax.swing.JFrame {
private String currentUsername;

    public order(String username) {
       
          initComponents(); 
 this.currentUsername = username;
    DefaultTableModel model = new DefaultTableModel(
        new Object[][]{}, 
        new String[]{"Product Name", "Price", "Quantity", "Total"}
    );
    cart.setModel(model);
       setTitle("Foodie POS - " + username);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        product1button = new javax.swing.JButton();
        product1container = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        product1 = new javax.swing.JLabel();
        product1name = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        product1qty = new javax.swing.JSpinner();
        product1price170 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        product2button = new javax.swing.JButton();
        product2container = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        product2 = new javax.swing.JLabel();
        product2name = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        product2qty = new javax.swing.JSpinner();
        product2price130 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        product3button = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        product3 = new javax.swing.JLabel();
        product3name = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        product3qty = new javax.swing.JSpinner();
        product3price87 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jSpinner7 = new javax.swing.JSpinner();
        jLabel29 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jSpinner8 = new javax.swing.JSpinner();
        jLabel33 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        product4button = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        product4 = new javax.swing.JLabel();
        product4name = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        product4qty = new javax.swing.JSpinner();
        product4price110 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jSpinner10 = new javax.swing.JSpinner();
        jLabel41 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        product5button = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        product5 = new javax.swing.JLabel();
        product5name = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        product5qty = new javax.swing.JSpinner();
        product5price120 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        product6button = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        product6 = new javax.swing.JLabel();
        product6name = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        product6qty = new javax.swing.JSpinner();
        product6price150 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        subtotalLabel = new javax.swing.JLabel();
        Sub_total_on_the_cart = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cart = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        Pay = new javax.swing.JButton();
        Payment_Amount = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        total_change = new javax.swing.JLabel();
        history_subtotal = new javax.swing.JLabel();
        history_payment = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Save_receipt = new javax.swing.JButton();
        receiptpanel = new javax.swing.JPanel();
        desplay_receipt = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        product1button.setText("Add to Cart");
        product1button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product1buttonActionPerformed(evt);
            }
        });
        jPanel1.add(product1button, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        product1container.setBackground(new java.awt.Color(204, 204, 204));
        product1container.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        product1container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        product1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pngtree-tanduay-select-a-blend-of-rum-in-a-bottle-from-the-philippines-photo-image_32744470.jpg"))); // NOI18N
        jPanel5.add(product1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -110, 220, 230));

        product1container.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 110));

        product1name.setBackground(new java.awt.Color(0, 0, 0));
        product1name.setFont(new java.awt.Font("Showcard Gothic", 2, 12)); // NOI18N
        product1name.setText("Tanduay Select");
        product1container.add(product1name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Qty");
        product1container.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        product1container.add(product1qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        product1price170.setBackground(new java.awt.Color(0, 0, 0));
        product1price170.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        product1price170.setText("Price : ₱ 170.00 ");
        product1container.add(product1price170, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jButton2.setText("Add to Cart");
        product1container.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pngtree-tanduay-select-a-blend-of-rum-in-a-bottle-from-the-philippines-photo-image_32744470.jpg"))); // NOI18N
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -110, 220, 230));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 110));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 2, 12)); // NOI18N
        jLabel7.setText("Tanduay Select");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Qty");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel6.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Price : ₱ 170.00 ");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jButton3.setText("Add to Cart");
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        product1container.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 160, 210));

        jPanel1.add(product1container, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 160, 210));

        product2button.setText("Add to Cart");
        product2button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product2buttonActionPerformed(evt);
            }
        });
        jPanel1.add(product2button, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, 30));

        product2container.setBackground(new java.awt.Color(204, 204, 204));
        product2container.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        product2container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        product2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/San Miguel Light.jpg"))); // NOI18N
        jPanel9.add(product2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -220, 340, 340));

        product2container.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 110));

        product2name.setBackground(new java.awt.Color(0, 0, 0));
        product2name.setFont(new java.awt.Font("Showcard Gothic", 2, 12)); // NOI18N
        product2name.setText("San mig light");
        product2container.add(product2name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, -1));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Qty");
        product2container.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        product2container.add(product2qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        product2price130.setBackground(new java.awt.Color(0, 0, 0));
        product2price130.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        product2price130.setText("Price : ₱ 130.00");
        product2container.add(product2price130, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jButton5.setText("Add to Cart");
        product2container.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pngtree-tanduay-select-a-blend-of-rum-in-a-bottle-from-the-philippines-photo-image_32744470.jpg"))); // NOI18N
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -110, 220, 230));

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 110));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Showcard Gothic", 2, 12)); // NOI18N
        jLabel15.setText("Tanduay Select");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, -1));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Qty");
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel10.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Price : ₱ 170.00 ");
        jPanel10.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jButton6.setText("Add to Cart");
        jPanel10.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        product2container.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 160, 210));

        jButton7.setText("Add to Cart");
        product2container.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        jPanel1.add(product2container, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 160, 210));

        product3button.setText("Add to Cart");
        product3button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product3buttonActionPerformed(evt);
            }
        });
        jPanel1.add(product3button, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, -1, 30));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        product3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Tanduay Spirit Ice Blue.jpg"))); // NOI18N
        jPanel13.add(product3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, -270, 390, 390));

        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 110));

        product3name.setBackground(new java.awt.Color(0, 0, 0));
        product3name.setFont(new java.awt.Font("Showcard Gothic", 2, 12)); // NOI18N
        product3name.setText("Tanduay Ice");
        jPanel12.add(product3name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, 20));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Qty");
        jPanel12.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel12.add(product3qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        product3price87.setBackground(new java.awt.Color(0, 0, 0));
        product3price87.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        product3price87.setText("Price : ₱ 87.00 ");
        jPanel12.add(product3price87, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jButton9.setText("Add to Cart");
        jPanel12.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pngtree-tanduay-select-a-blend-of-rum-in-a-bottle-from-the-philippines-photo-image_32744470.jpg"))); // NOI18N
        jPanel15.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -110, 220, 230));

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 110));

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Showcard Gothic", 2, 12)); // NOI18N
        jLabel23.setText("Tanduay Select");
        jPanel14.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, -1));

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Qty");
        jPanel14.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel14.add(jSpinner6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Price : ₱ 170.00 ");
        jPanel14.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jButton10.setText("Add to Cart");
        jPanel14.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        jPanel12.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 160, 210));

        jButton11.setText("Add to Cart");
        jPanel12.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 160, 210));

        jButton12.setText("Add to Cart");
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, 30));

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pngtree-tanduay-select-a-blend-of-rum-in-a-bottle-from-the-philippines-photo-image_32744470.jpg"))); // NOI18N
        jPanel17.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -110, 220, 230));

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 110));

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new java.awt.Font("Showcard Gothic", 2, 12)); // NOI18N
        jLabel27.setText("Tanduay Select");
        jPanel16.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, -1));

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Qty");
        jPanel16.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel16.add(jSpinner7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText("Price : ₱ 170.00 ");
        jPanel16.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jButton13.setText("Add to Cart");
        jPanel16.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        jPanel18.setBackground(new java.awt.Color(204, 204, 204));
        jPanel18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pngtree-tanduay-select-a-blend-of-rum-in-a-bottle-from-the-philippines-photo-image_32744470.jpg"))); // NOI18N
        jPanel19.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -110, 220, 230));

        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 110));

        jLabel31.setBackground(new java.awt.Color(0, 0, 0));
        jLabel31.setFont(new java.awt.Font("Showcard Gothic", 2, 12)); // NOI18N
        jLabel31.setText("Tanduay Select");
        jPanel18.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, -1));

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText("Qty");
        jPanel18.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel18.add(jSpinner8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setText("Price : ₱ 170.00 ");
        jPanel18.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jButton14.setText("Add to Cart");
        jPanel18.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        jPanel16.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 160, 210));

        jButton15.setText("Add to Cart");
        jPanel16.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 160, 210));

        product4button.setText("Add to Cart");
        product4button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product4buttonActionPerformed(evt);
            }
        });
        jPanel1.add(product4button, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, 30));

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));
        jPanel20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        product4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Tanduay-Rhum-5-Years-750ml.jpg"))); // NOI18N
        jPanel21.add(product4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -100, 230, 230));

        jPanel20.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 110));

        product4name.setBackground(new java.awt.Color(0, 0, 0));
        product4name.setFont(new java.awt.Font("Showcard Gothic", 2, 12)); // NOI18N
        product4name.setText("Tanduay rhum");
        jPanel20.add(product4name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, -1));

        jLabel36.setBackground(new java.awt.Color(0, 0, 0));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setText("Qty");
        jPanel20.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel20.add(product4qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        product4price110.setBackground(new java.awt.Color(0, 0, 0));
        product4price110.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        product4price110.setText("Price : ₱ 110.00 ");
        jPanel20.add(product4price110, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jButton17.setText("Add to Cart");
        jPanel20.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        jPanel22.setBackground(new java.awt.Color(204, 204, 204));
        jPanel22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pngtree-tanduay-select-a-blend-of-rum-in-a-bottle-from-the-philippines-photo-image_32744470.jpg"))); // NOI18N
        jPanel23.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -110, 220, 230));

        jPanel22.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 110));

        jLabel39.setBackground(new java.awt.Color(0, 0, 0));
        jLabel39.setFont(new java.awt.Font("Showcard Gothic", 2, 12)); // NOI18N
        jLabel39.setText("Tanduay Select");
        jPanel22.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, -1));

        jLabel40.setBackground(new java.awt.Color(0, 0, 0));
        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setText("Qty");
        jPanel22.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel22.add(jSpinner10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel41.setBackground(new java.awt.Color(0, 0, 0));
        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setText("Price : ₱ 170.00 ");
        jPanel22.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jButton18.setText("Add to Cart");
        jPanel22.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        jPanel20.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 160, 210));

        jButton19.setText("Add to Cart");
        jPanel20.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        jPanel1.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 160, 210));

        product5button.setText("Add to Cart");
        product5button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product5buttonActionPerformed(evt);
            }
        });
        jPanel1.add(product5button, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 100, 30));

        jPanel24.setBackground(new java.awt.Color(204, 204, 204));
        jPanel24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        product5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Redhorse.jpg"))); // NOI18N
        jPanel25.add(product5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, -240, 310, 380));

        jPanel24.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 110));

        product5name.setBackground(new java.awt.Color(0, 0, 0));
        product5name.setFont(new java.awt.Font("Showcard Gothic", 2, 12)); // NOI18N
        product5name.setText("red horse");
        jPanel24.add(product5name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 80, -1));

        jLabel44.setBackground(new java.awt.Color(0, 0, 0));
        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setText("Qty");
        jPanel24.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel24.add(product5qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        product5price120.setBackground(new java.awt.Color(0, 0, 0));
        product5price120.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        product5price120.setText("Price : ₱ 120.00 ");
        jPanel24.add(product5price120, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jButton21.setText("Add to Cart");
        jPanel24.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        jButton23.setText("Add to Cart");
        jPanel24.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        jPanel1.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 160, 210));

        product6button.setText("Add to Cart");
        product6button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product6buttonActionPerformed(evt);
            }
        });
        jPanel1.add(product6button, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, -1, 30));

        jPanel26.setBackground(new java.awt.Color(204, 204, 204));
        jPanel26.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        product6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/GSM Blue Mojito.jpg"))); // NOI18N
        jPanel27.add(product6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-300, -180, 470, 430));

        jPanel26.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 110));

        product6name.setBackground(new java.awt.Color(0, 0, 0));
        product6name.setFont(new java.awt.Font("Showcard Gothic", 2, 12)); // NOI18N
        product6name.setText("GSM Mojito");
        jPanel26.add(product6name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 80, -1));

        jLabel48.setBackground(new java.awt.Color(0, 0, 0));
        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setText("Qty");
        jPanel26.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel26.add(product6qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        product6price150.setBackground(new java.awt.Color(0, 0, 0));
        product6price150.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        product6price150.setText("Price : ₱ 150.00 ");
        jPanel26.add(product6price150, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jButton25.setText("Add to Cart");
        jPanel26.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        jButton26.setText("Add to Cart");
        jPanel26.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        jPanel1.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 160, 210));

        subtotalLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        subtotalLabel.setText("₱ 00.00");
        jPanel1.add(subtotalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 210, 120, 20));

        Sub_total_on_the_cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sub_total_on_the_cartActionPerformed(evt);
            }
        });
        jPanel1.add(Sub_total_on_the_cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 200, 140, 40));

        jLabel50.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 48)); // NOI18N
        jLabel50.setText("Your Chart");
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 210, -1));

        cart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product_Name", "Products_Price", "Qty", "Total_Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(cart);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 500, 130));

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel53.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        jLabel53.setText("Payment method :");

        Pay.setText("Pay");
        Pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayActionPerformed(evt);
            }
        });

        Payment_Amount.setText("00.00");
        Payment_Amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Payment_AmountActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        jLabel55.setText(" Amount : ");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Total Change :");

        jLabel3.setText("Payment :");

        jLabel5.setText("Subtotal :");

        total_change.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        total_change.setText("₱ 00.00");

        history_subtotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        history_subtotal.setText("₱ 00.00");

        history_payment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        history_payment.setText("₱ 00.00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(history_payment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(history_subtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total_change, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(history_subtotal)
                .addGap(18, 18, 18)
                .addComponent(history_payment)
                .addGap(18, 18, 18)
                .addComponent(total_change)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("₱");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(Pay, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Payment_Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGap(415, 415, 415))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(Payment_Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 240, 260));

        jLabel54.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        jLabel54.setText("Subtotal :");
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 90, -1));

        Save_receipt.setText("Save");
        Save_receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_receiptActionPerformed(evt);
            }
        });

        receiptpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        receiptpanel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout receiptpanelLayout = new javax.swing.GroupLayout(receiptpanel);
        receiptpanel.setLayout(receiptpanelLayout);
        receiptpanelLayout.setHorizontalGroup(
            receiptpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desplay_receipt, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        receiptpanelLayout.setVerticalGroup(
            receiptpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desplay_receipt, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel52.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        jLabel52.setText(" Receipt :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(Save_receipt)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(receiptpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Save_receipt)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 200, 270, 330));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel8.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 100, 40));

        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/beer-10.gif"))); // NOI18N
        jPanel28.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-480, 0, 760, 440));

        jPanel8.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 180, 440));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 260, 540));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/RESIN_OKTOBERFEST.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void updateSubtotal() {
    DefaultTableModel model = (DefaultTableModel) cart.getModel();
    double subtotal = 0.0;

    for (int i = 0; i < model.getRowCount(); i++) {
        String totalStr = model.getValueAt(i, 3).toString();
        try {
            double total = Double.parseDouble(totalStr);
            subtotal += total;
        } catch (NumberFormatException e) {
            
        }
    }

    subtotalLabel.setText(String.format("₱ %.2f", subtotal)); // assuming subtotalLabel is a JLabel
}

    private void product1buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product1buttonActionPerformed
        String name = product1name.getText(); 
    String priceText = product1price170.getText()
        .replace("Price :", "")
        .replace("₱", "")
        .trim(); 
    
    int quantity = (Integer) product1qty.getValue();

    if (quantity <= 0) {
        JOptionPane.showMessageDialog(this, "Please enter a valid quantity.");
        return;
    }

    double price;
    try {
        price = Double.parseDouble(priceText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid price format.");
        return;
    }

    double total = price * quantity;

    DefaultTableModel model = (DefaultTableModel) cart.getModel();
    model.addRow(new Object[]{name, String.format("%.2f", price), quantity, String.format("%.2f", total)});  product1qty.setValue(0); updateSubtotal();
    }//GEN-LAST:event_product1buttonActionPerformed

    private void product2buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product2buttonActionPerformed
     String name = product2name.getText(); 
    String priceText = product2price130.getText()
        .replace("Price :", "")
        .replace("₱", "")
        .trim(); 
    
    int quantity = (Integer) product2qty.getValue();

    if (quantity <= 0) {
        JOptionPane.showMessageDialog(this, "Please enter a valid quantity.");
        return;
    }

    double price;
    try {
        price = Double.parseDouble(priceText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid price format.");
        return;
    }

    double total = price * quantity;

    DefaultTableModel model = (DefaultTableModel) cart.getModel();
    model.addRow(new Object[]{name, String.format("%.2f", price), quantity, String.format("%.2f", total)});  product2qty.setValue(0);updateSubtotal();
    }//GEN-LAST:event_product2buttonActionPerformed

    private void product3buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product3buttonActionPerformed
     String name = product3name.getText(); 
    String priceText = product3price87.getText()
        .replace("Price :", "")
        .replace("₱", "")
        .trim(); 
    
    int quantity = (Integer) product3qty.getValue();

    if (quantity <= 0) {
        JOptionPane.showMessageDialog(this, "Please enter a valid quantity.");
        return;
    }

    double price;
    try {
        price = Double.parseDouble(priceText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid price format.");
        return;
    }

    double total = price * quantity;

    DefaultTableModel model = (DefaultTableModel) cart.getModel();
    model.addRow(new Object[]{name, String.format("%.2f", price), quantity, String.format("%.2f", total)});  product3qty.setValue(0);updateSubtotal();
    }//GEN-LAST:event_product3buttonActionPerformed

    private void product4buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product4buttonActionPerformed
      String name = product4name.getText(); 
    String priceText = product4price110.getText()
        .replace("Price :", "")
        .replace("₱", "")
        .trim(); 
    
    int quantity = (Integer) product4qty.getValue();

    if (quantity <= 0) {
        JOptionPane.showMessageDialog(this, "Please enter a valid quantity.");
        return;
    }

    double price;
    try {
        price = Double.parseDouble(priceText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid price format.");
        return;
    }

    double total = price * quantity;

    DefaultTableModel model = (DefaultTableModel) cart.getModel();
    model.addRow(new Object[]{name, String.format("%.2f", price), quantity, String.format("%.2f", total)});  product4qty.setValue(0);updateSubtotal();
    }//GEN-LAST:event_product4buttonActionPerformed

    private void product5buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product5buttonActionPerformed
      String name = product5name.getText(); 
    String priceText = product5price120.getText()
        .replace("Price :", "")
        .replace("₱", "")
        .trim(); 
    
    int quantity = (Integer) product5qty.getValue();

    if (quantity <= 0) {
        JOptionPane.showMessageDialog(this, "Please enter a valid quantity.");
        return;
    }

    double price;
    try {
        price = Double.parseDouble(priceText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid price format.");
        return;
    }

    double total = price * quantity;

    DefaultTableModel model = (DefaultTableModel) cart.getModel();
    model.addRow(new Object[]{name, String.format("%.2f", price), quantity, String.format("%.2f", total)});  product5qty.setValue(0);updateSubtotal();
    }//GEN-LAST:event_product5buttonActionPerformed

    private void product6buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product6buttonActionPerformed
     String name = product6name.getText(); 
    String priceText = product6price150.getText()
        .replace("Price :", "")
        .replace("₱", "")
        .trim(); 
    
    int quantity = (Integer) product6qty.getValue();

    if (quantity <= 0) {
        JOptionPane.showMessageDialog(this, "Please enter a valid quantity.");
        return;
    }

    double price;
    try {
        price = Double.parseDouble(priceText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid price format.");
        return;
    }

    double total = price * quantity;

    DefaultTableModel model = (DefaultTableModel) cart.getModel();
    model.addRow(new Object[]{name, String.format("%.2f", price), quantity, String.format("%.2f", total)});  product6qty.setValue(0);updateSubtotal();
    }//GEN-LAST:event_product6buttonActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
     int confirm = JOptionPane.showConfirmDialog(this, 
                "Are you sure you want to logout?", 
                "Logout Confirmation", 
                JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
        });
        this.dispose();
    }
    }//GEN-LAST:event_logoutActionPerformed

    private void Sub_total_on_the_cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sub_total_on_the_cartActionPerformed
         DefaultTableModel model = (DefaultTableModel) cart.getModel();
    double subtotal = 0.0;

    for (int i = 0; i < model.getRowCount(); i++) {
        String totalStr = model.getValueAt(i, 3).toString(); // get total value from column 3
        try {
            double total = Double.parseDouble(totalStr);
            subtotal += total;
        } catch (NumberFormatException e) {
            // skip or handle invalid number format
        }
    }

    // Display subtotal formatted to 2 decimals
    // Assuming you have a JLabel named subtotalLabel
    subtotalLabel.setText(String.format("₱ %.2f", subtotal));
    }//GEN-LAST:event_Sub_total_on_the_cartActionPerformed

    private void PayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayActionPerformed
           DefaultTableModel model = (DefaultTableModel) cart.getModel();
    double subtotal = 0.0;

    // Compute subtotal
    for (int i = 0; i < model.getRowCount(); i++) {
        try {
            String totalStr = model.getValueAt(i, 3).toString();
            subtotal += Double.parseDouble(totalStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid total format in cart.");
            return;
        }
    }

    // Get payment
    String paymentText = Payment_Amount.getText().trim();
    double payment;
    try {
        payment = Double.parseDouble(paymentText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter a valid payment amount.");
        return;
    }

    if (payment < subtotal) {
        JOptionPane.showMessageDialog(this, "Insufficient payment.");
        return;
    }

    double change = payment - subtotal;

    // Update history labels
    history_subtotal.setText(String.format("₱ %.2f", subtotal));
    history_payment.setText(String.format("₱ %.2f", payment));
    total_change.setText(String.format("₱ %.2f", change));

    // ===== Create receipt =====
    StringBuilder receipt = new StringBuilder();
    receipt.append("<html><pre style='font-family:monospace;'>");
    receipt.append("      🍽 Foodie POS Receipt 🍽      \n");
    receipt.append("===================================\n");
    receipt.append(String.format("%-15s %5s %3s %7s\n", "Item", "Price", "Qty", "Total"));
    receipt.append("-----------------------------------\n");

    for (int i = 0; i < model.getRowCount(); i++) {
        String item = model.getValueAt(i, 0).toString();
        String price = model.getValueAt(i, 1).toString();
        String qty = model.getValueAt(i, 2).toString();
        String total = model.getValueAt(i, 3).toString();

        receipt.append(String.format("%-15s %5s x%s %7s\n", item, price, qty, total));
    }

    receipt.append("-----------------------------------\n");
    receipt.append(String.format("Subtotal:           ₱ %.2f\n", subtotal));
    receipt.append(String.format("Payment:            ₱ %.2f\n", payment));
    receipt.append(String.format("Change:             ₱ %.2f\n", change));
    receipt.append("===================================\n");
    receipt.append("     Thank you for your order!     \n");
    receipt.append("         Have a great day!         \n");
    receipt.append("</pre></html>");

    // Show receipt
    desplay_receipt.setText(receipt.toString());

    // Optional: Clear cart
    model.setRowCount(0);
    updateSubtotal();
    }//GEN-LAST:event_PayActionPerformed

    private void Payment_AmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Payment_AmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Payment_AmountActionPerformed

    private void Save_receiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_receiptActionPerformed
 if (currentUsername == null || currentUsername.isEmpty()) {
    JOptionPane.showMessageDialog(this, "User not logged in. Cannot save receipt.");
    return;
}

// Create path: C:\data_user\<username>
String folderPath = "C:\\data_user\\" + currentUsername;
File userFolder = new File(folderPath);
if (!userFolder.exists()) {
    userFolder.mkdirs(); // Create user's folder if not exists
}

// Generate unique timestamped receipt file name
String timestamp = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date());
String fileName = "receipt_" + timestamp + ".txt";
File receiptFile = new File(userFolder, fileName);

// Get current date and time for receipt header
String dateTimeNow = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());

try (BufferedWriter writer = new BufferedWriter(new FileWriter(receiptFile))) {
    // Write plain text receipt with date and time at the top
    writer.write("🍽 drink Receipt 🍽\n");
    writer.write("Date and Time: " + dateTimeNow + "\n");
    writer.write("===================================\n");
    writer.write(String.format("%-15s %5s %3s %7s\n", "Item", "Price", "Qty", "Total"));
    writer.write("-----------------------------------\n");

    DefaultTableModel model = (DefaultTableModel) cart.getModel();
    for (int i = 0; i < model.getRowCount(); i++) {
        String item = model.getValueAt(i, 0).toString();
        String price = model.getValueAt(i, 1).toString();
        String qty = model.getValueAt(i, 2).toString();
        String total = model.getValueAt(i, 3).toString();

        writer.write(String.format("%-15s %5s x%s %7s\n", item, price, qty, total));
    }

    writer.write("-----------------------------------\n");
    writer.write(history_subtotal.getText() + "\n");
    writer.write(history_payment.getText() + "\n");
    writer.write(total_change.getText() + "\n");
    writer.write("===================================\n");
    writer.write("     Thank you for your order!     \n");
    writer.write("         Have a great day!         \n");

    JOptionPane.showMessageDialog(this, "Receipt saved to: " + receiptFile.getAbsolutePath());

} catch (IOException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error saving receipt.");
}

    }//GEN-LAST:event_Save_receiptActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new order("testuser").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pay;
    private javax.swing.JTextField Payment_Amount;
    private javax.swing.JButton Save_receipt;
    private javax.swing.JTextField Sub_total_on_the_cart;
    private javax.swing.JTable cart;
    private javax.swing.JLabel desplay_receipt;
    private javax.swing.JLabel history_payment;
    private javax.swing.JLabel history_subtotal;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JButton logout;
    private javax.swing.JLabel product1;
    private javax.swing.JButton product1button;
    private javax.swing.JPanel product1container;
    private javax.swing.JLabel product1name;
    private javax.swing.JLabel product1price170;
    private javax.swing.JSpinner product1qty;
    private javax.swing.JLabel product2;
    private javax.swing.JButton product2button;
    private javax.swing.JPanel product2container;
    private javax.swing.JLabel product2name;
    private javax.swing.JLabel product2price130;
    private javax.swing.JSpinner product2qty;
    private javax.swing.JLabel product3;
    private javax.swing.JButton product3button;
    private javax.swing.JLabel product3name;
    private javax.swing.JLabel product3price87;
    private javax.swing.JSpinner product3qty;
    private javax.swing.JLabel product4;
    private javax.swing.JButton product4button;
    private javax.swing.JLabel product4name;
    private javax.swing.JLabel product4price110;
    private javax.swing.JSpinner product4qty;
    private javax.swing.JLabel product5;
    private javax.swing.JButton product5button;
    private javax.swing.JLabel product5name;
    private javax.swing.JLabel product5price120;
    private javax.swing.JSpinner product5qty;
    private javax.swing.JLabel product6;
    private javax.swing.JButton product6button;
    private javax.swing.JLabel product6name;
    private javax.swing.JLabel product6price150;
    private javax.swing.JSpinner product6qty;
    private javax.swing.JPanel receiptpanel;
    private javax.swing.JLabel subtotalLabel;
    private javax.swing.JLabel total_change;
    // End of variables declaration//GEN-END:variables
}
