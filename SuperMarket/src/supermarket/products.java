package supermarket;

import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class products extends javax.swing.JFrame {

    public products() {
        initComponents();
        SelectProduct();
    }
    
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    
    public void SelectProduct(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "admin");
            st = con.createStatement();
            rs = st.executeQuery("select * from product");
            ProductTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                if(rs != null) rs.close();
                if(st != null) st.close();
                if(con != null) con.close();
            } catch(SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        MenuButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        product_id = new javax.swing.JTextField();
        product_name = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        supplier_name = new javax.swing.JTextField();
        category_name = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        price = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage Products");

        MenuButton.setText("MENU");
        MenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuButtonMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("←");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(MenuButton)
                .addGap(202, 202, 202)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MenuButton)
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel5.setText("Name");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel6.setText("Price");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel7.setText("Product ID");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel9.setText("Quantity");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel10.setText("Category");

        AddButton.setBackground(new java.awt.Color(204, 255, 255));
        AddButton.setText("ADD");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });

        EditButton.setBackground(new java.awt.Color(204, 255, 255));
        EditButton.setText("EDIT");
        EditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditButtonMouseClicked(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(204, 255, 255));
        DeleteButton.setText("DELETE");
        DeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseClicked(evt);
            }
        });

        ClearButton.setBackground(new java.awt.Color(204, 255, 255));
        ClearButton.setText("CLEAR");
        ClearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearButtonMouseClicked(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel12.setText("Supplier");

        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Name", "Price", "Quantity", "Category ID", "Supplier ID"
            }
        ));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ProductTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(product_id, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(category_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(supplier_name, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(product_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(AddButton)
                        .addComponent(product_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(EditButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(DeleteButton))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel10))
                                .addComponent(jLabel9)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(supplier_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(category_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ClearButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        if(product_id.getText().isEmpty() || product_name.getText().isEmpty() || price.getText().isEmpty() || quantity.getText().isEmpty() || category_name.getText().isEmpty() || supplier_name.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information!!");
        } 
        else{
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "admin");
            
                // Retrieve category ID based on category name
                String categoryQuery = "SELECT category_id FROM category WHERE category_name = ?";
                PreparedStatement categoryStatement = con.prepareStatement(categoryQuery);
                categoryStatement.setString(1, category_name.getText());
                ResultSet categoryResultSet = categoryStatement.executeQuery();
            
                int categoryId = -1; // Default value if category not found
                if(categoryResultSet.next()) {
                    categoryId = categoryResultSet.getInt("category_id");
                } 
                else {
                    JOptionPane.showMessageDialog(this, "Category not found.");
                    return;
                }
            
                // Retrieve supplier ID based on supplier name
                String supplierQuery = "SELECT supplier_id FROM supplier WHERE supplier_name = ?";
                PreparedStatement supplierStatement = con.prepareStatement(supplierQuery);
                supplierStatement.setString(1, supplier_name.getText());
                ResultSet supplierResultSet = supplierStatement.executeQuery();
            
                int supplierId = -1; // Default value if supplier not found
                if(supplierResultSet.next()) {
                    supplierId = supplierResultSet.getInt("supplier_id");
                } 
                else {
                    JOptionPane.showMessageDialog(this, "Supplier not found.");
                    return;
                }
            
                // Insert new product into product table
                PreparedStatement add = con.prepareStatement("INSERT INTO product VALUES (?,?,?,?,?,?)");
                add.setInt(1, Integer.valueOf(product_id.getText()));
                add.setString(2, product_name.getText());
                add.setFloat(3, Float.valueOf(price.getText()));
                add.setInt(4, Integer.valueOf(quantity.getText()));
                add.setInt(5, categoryId);
                add.setInt(6, supplierId);

                int row = add.executeUpdate();
                if(row > 0) {
                    JOptionPane.showMessageDialog(this, "Product Added Successfully!!");
                } 
                else {
                    JOptionPane.showMessageDialog(this, "Failed to add product.");
                }
            } 
            catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input for numeric fields.");
                ex.printStackTrace();
            } 
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
                ex.printStackTrace();
            } 
            finally {
                try {
                    if(con != null) con.close();
                } 
                catch (SQLException ex) {
                    ex.printStackTrace();
                }
                SelectProduct();
            }
        }
    }//GEN-LAST:event_AddButtonMouseClicked

    private void EditButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditButtonMouseClicked
        if(product_id.getText().isEmpty() || product_name.getText().isEmpty() || price.getText().isEmpty() || quantity.getText().isEmpty() || category_name.getText().isEmpty() || supplier_name.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information !!");
        }
        else{
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "admin");
                
                // Retrieve category ID based on category name
                String categoryQuery = "SELECT category_id FROM category WHERE category_name = ?";
                PreparedStatement categoryStatement = con.prepareStatement(categoryQuery);
                categoryStatement.setString(1, category_name.getText());
                ResultSet categoryResultSet = categoryStatement.executeQuery();
            
                int categoryId = -1; // Default value if category not found
                if(categoryResultSet.next()) {
                    categoryId = categoryResultSet.getInt("category_id");
                } 
                else {
                    JOptionPane.showMessageDialog(this, "Category not found.");
                    return;
                }
            
                // Retrieve supplier ID based on supplier name
                String supplierQuery = "SELECT supplier_id FROM supplier WHERE supplier_name = ?";
                PreparedStatement supplierStatement = con.prepareStatement(supplierQuery);
                supplierStatement.setString(1, supplier_name.getText());
                ResultSet supplierResultSet = supplierStatement.executeQuery();
            
                int supplierId = -1; // Default value if supplier not found
                if(supplierResultSet.next()) {
                    supplierId = supplierResultSet.getInt("supplier_id");
                } 
                else {
                    JOptionPane.showMessageDialog(this, "Supplier not found.");
                    return;
                }
                
                String Q = "UPDATE product SET product_name = ?, price = ?, quantity = ?, category_id = ?, supplier_id = ? WHERE product_id = ?";
                PreparedStatement updateStatement = con.prepareStatement(Q);
                updateStatement.setString(1, product_name.getText());
                updateStatement.setFloat(2, Float.parseFloat(price.getText()));
                updateStatement.setInt(3, Integer.parseInt(quantity.getText()));
                updateStatement.setInt(4, categoryId);
                updateStatement.setInt(5, supplierId);
                updateStatement.setInt(6, Integer.parseInt(product_id.getText()));
                int row = updateStatement.executeUpdate();
                
                if(row > 0) {
                    JOptionPane.showMessageDialog(this, "Product Updated!!");
                } 
                else {
                    JOptionPane.showMessageDialog(this, "Failed to update product.");
                }
            }
            catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input for numeric fields.");
                ex.printStackTrace();
            } 
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
                ex.printStackTrace();
            } 
            finally {
                try {
                    if(con != null) con.close();
                } 
                catch (SQLException ex) {
                    ex.printStackTrace();
                }
                SelectProduct();
            }
        }
    }//GEN-LAST:event_EditButtonMouseClicked

    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
        if(product_id.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter the Product to be Deleted !!");
        }
        else{
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "admin");
                String pid = product_id.getText();
                String Q = "Delete from product where product_id=" + pid;
                Statement Add = con.createStatement();
                Add.executeUpdate(Q);
                SelectProduct();
                JOptionPane.showMessageDialog(this, "Product Deleted Successfully");
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteButtonMouseClicked

    private void ClearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearButtonMouseClicked
        product_id.setText("");
        product_name.setText("");
        price.setText("");
        quantity.setText("");
        category_name.setText("");
        supplier_name.setText("");
    }//GEN-LAST:event_ClearButtonMouseClicked

    private void MenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuButtonMouseClicked
        new buttons().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuButtonMouseClicked

    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
        int Myindex = ProductTable.getSelectedRow();
        product_id.setText(model.getValueAt(Myindex, 0).toString());
        product_name.setText(model.getValueAt(Myindex, 1).toString());
        price.setText(model.getValueAt(Myindex, 2).toString());
        quantity.setText(model.getValueAt(Myindex, 3).toString());
        
        String catid = model.getValueAt(Myindex, 4).toString();
        String suppid = model.getValueAt(Myindex, 5).toString();

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "admin");
    
            // Retrieve category name based on category ID
            String categoryQuery = "SELECT category_name FROM category WHERE category_id = ?";
            PreparedStatement categoryStatement = con.prepareStatement(categoryQuery);
            categoryStatement.setInt(1, Integer.parseInt(catid));
            ResultSet categoryResultSet = categoryStatement.executeQuery();
    
            String categoryName = "";
            if (categoryResultSet.next()) {
                categoryName = categoryResultSet.getString("category_name");
            } 
            else {
                JOptionPane.showMessageDialog(this, "Category not found for ID: " + catid);
                return;
            }

            // Retrieve supplier name based on supplier ID
            String supplierQuery = "SELECT supplier_name FROM supplier WHERE supplier_id = ?";
            PreparedStatement supplierStatement = con.prepareStatement(supplierQuery);
            supplierStatement.setInt(1, Integer.parseInt(suppid));
            ResultSet supplierResultSet = supplierStatement.executeQuery();
    
            String supplierName = "";
            if (supplierResultSet.next()) {
                supplierName = supplierResultSet.getString("supplier_name");
            } 
            else {
                JOptionPane.showMessageDialog(this, "Supplier not found for ID: " + suppid);
                return;
            }
        
            category_name.setText(categoryName);
            supplier_name.setText(supplierName);
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ProductTableMouseClicked

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JButton MenuButton;
    private javax.swing.JTable ProductTable;
    private javax.swing.JTextField category_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField price;
    private javax.swing.JTextField product_id;
    private javax.swing.JTextField product_name;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField supplier_name;
    // End of variables declaration//GEN-END:variables
}
