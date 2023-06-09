
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package my.javainput;
import java.io.BufferedReader;
import java.util.List;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileReader;
import java.util.ArrayList;
import java.util.*;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


/**
 *
 * @author user
 */
public class FileInputUI extends javax.swing.JFrame {

    int numResult;
    public String selectedValue;
    public String value;
    public Connection con;
    private String ID="";
    private String name="";
    private String sur="";
    private String age = "";
    private String phone="";
    private String location="";
    List<String> results = new ArrayList<String>();
    public DefaultTableModel model;
    /**
     * Creates new form FileInputUI
     */
    public FileInputUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem6.setText("jMenuItem6");

        jMenuItem7.setText("jMenuItem7");

        jMenuItem8.setText("jMenuItem8");

        jMenuItem9.setText("jMenuItem9");

        jMenuItem10.setText("jMenuItem10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Details"));
        jPanel1.setToolTipText("");
        jPanel1.setName("File Upload"); // NOI18N

        jButton1.setText("upload");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane3.setName("result"); // NOI18N
        jScrollPane3.setOpaque(false);

        jTextPane3.setEditable(false);
        jScrollPane3.setViewportView(jTextPane3);
        jTextPane3.getAccessibleContext().setAccessibleName("result");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surname", "Age", "Phonenumber", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("sort");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("search:");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("View All Records");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "Surname", "Age", "Phonenumber", "Location" }));
        jComboBox1.setName("Sort By:"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButton3.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //for upload feature
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        upload();
    }//GEN-LAST:event_jButton1ActionPerformed
 
    //for sort feature
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        sort();
    }//GEN-LAST:event_jButton2ActionPerformed

    //for search feature
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        search();
    }//GEN-LAST:event_jButton3ActionPerformed

    //for view all
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        viewAll();
    }//GEN-LAST:event_jButton4ActionPerformed
    
    
    public void upload()
    {
         connectToDatabase(); 
     
       JFileChooser j = new JFileChooser();
       int r = j.showSaveDialog(null);
       
       jTextPane3.setText(j.getSelectedFile().toString());        
        
       
       PreparedStatement stm = null;
       
        try{
       //Scanner sc = new Scanner(new File(j.getSelectedFile().toString()));
       BufferedReader br = new BufferedReader(new FileReader(j.getSelectedFile()));
       //sc.useDelimiter(",");
       stm = con.prepareStatement("INSERT INTO info (ID, Name, Surname, Age, Phonenumber, Location) VALUES (?,?,?,?,?,?)");
       String line;
          while((line = br.readLine()) != null)
           {
               
           String[] values = line.split(",");
           if(!values[0].equals("ID"))
           {
           stm.setInt(1, Integer.valueOf(values[0]));
           stm.setString(2, values[1]);
           stm.setString(3, values[2]);
           stm.setString(4, values[3]);
           stm.setString(5, values[4]);
           stm.setString(6, values[5]);
           stm.executeUpdate();
           results.add(line);
           }
                
           }
           System.out.println(results.get(6));
          showData();
          con.close();
        }
        
       catch(Exception e)
       {
           jTextPane3.setText(e.getLocalizedMessage() + e.getMessage() + e.getCause() + e.getStackTrace());
       }
    }
    
    public void search()
    {
        connectToDatabase();
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        value = jTextField1.getText();   
        System.out.println(value);
        try{           
        PreparedStatement stm = con.prepareStatement("SELECT * FROM info WHERE ID = ? OR Name = ? OR Surname = ? OR Age = ? OR Phonenumber = ? OR Location = ?");       
        stm.setString(1,value);
        stm.setString(2,value);
        stm.setString(3,value);
        stm.setString(4,value);
        stm.setString(5,value);
        stm.setString(6,value);
        stm.executeQuery();
        ResultSet rs = stm.executeQuery();
      
        //update database
        while(rs.next())
        {
            ID = rs.getString("ID");
            name = rs.getString("Name");
            sur = rs.getString("Surname");
            age = rs.getString("Age");
            phone = rs.getString("Phonenumber");
            location = rs.getString("Location");
            
            Object[] row = {ID,name,sur,age,phone,location};
            model.addRow(row);
            
        }
           
        if(model.getRowCount() == 0)
        {
            JOptionPane.showMessageDialog(jPanel1, "Please search for a valid value");
        }
        }
        catch(Exception e)
        {      
            System.out.println("Error");
            JOptionPane.showMessageDialog(jPanel1, "Error");
            jTextPane3.setText(e.getStackTrace().toString() + e.getMessage());
        }
    } 
    
    public void sort()
    {
          connectToDatabase();
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        //String[] selected = {"ID", "Name", "Surname", "Age", "Phonenumber", "Location"};
        selectedValue = jComboBox1.getSelectedItem().toString();
        System.out.println(jComboBox1.getSelectedItem().toString());
        
        try{
        PreparedStatement stm = con.prepareStatement("SELECT * FROM info ORDER BY " + jComboBox1.getSelectedItem());
        System.out.println(jComboBox1.getSelectedItem());
        ResultSet rs = stm.executeQuery();
        while(rs.next())
        {
            ID = rs.getString("ID");
            name = rs.getString("Name");
            sur = rs.getString("Surname");
            age = rs.getString("Age");
            phone = rs.getString("Phonenumber");
            location = rs.getString("Location");
            
            Object[] row = {ID,name,sur,age,phone,location};
            model.addRow(row);      
            System.out.println(model.getValueAt(0, 1) + "sprsdaur");
      
        }
        }
        catch(SQLException e)
        {      
            System.out.println("Error");
            jTextPane3.setText(e.getStackTrace().toString() + e.getMessage() + e.getSQLState());
        }
    }
    
    public void viewAll()
    {
        connectToDatabase();
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        try{
        PreparedStatement stm = con.prepareStatement("SELECT * FROM info");
      
        ResultSet rs = stm.executeQuery();
        while(rs.next())
        {
            //model.addColumn("ID");
            ID = rs.getString("ID");
            name = rs.getString("Name");
            sur = rs.getString("Surname");
            age = rs.getString("Age");
            phone = rs.getString("Phonenumber");
            location = rs.getString("Location");
            
            Object[] row = {ID,name,sur,age,phone,location};
            model.addRow(row);            
      
        }
        }
        catch(SQLException e)
        {      
            System.out.println("Error");
            jTextPane3.setText(e.getStackTrace().toString() + e.getMessage() + e.getSQLState());
        }
    }
    
    public void connectToDatabase()
	{
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customerinfo","root","password"); 
                        System.out.println(con.getCatalog());
	       }
		catch(Exception e)
		{
			System.out.println("Database not connected");
                        System.out.println(e.getMessage());
		}
	}
    
    public void showData()
    {
       model = (DefaultTableModel) jTable1.getModel();
        
        try{
        PreparedStatement stm = con.prepareStatement("SELECT * FROM info");
      
        ResultSet rs = stm.executeQuery();
        while(rs.next())
        {
            //model.addColumn("ID");
            ID = rs.getString("ID");
            name = rs.getString("Name");
            sur = rs.getString("Surname");
            age = rs.getString("Age");
            phone = rs.getString("Phonenumber");
            location = rs.getString("Location");
            
            Object[] row = {ID,name,sur,age,phone,location};
            model.addRow(row);            
      
        }
        }
        catch(SQLException e)
        {      
            System.out.println("Error");
            jTextPane3.setText(e.getStackTrace().toString() + e.getMessage() + e.getSQLState());
        }
    }
    

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
            java.util.logging.Logger.getLogger(FileInputUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileInputUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileInputUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileInputUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileInputUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane3;
    // End of variables declaration//GEN-END:variables
}
