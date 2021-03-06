/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.parser.TokenType;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author User
 */
public class Issuelist extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddBook
     */
    Connection con = null;
    PreparedStatement pat;
    ResultSet rst;

    public Issuelist() {
        initComponents();
        con = DBConnect.connect();
        tablellord();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblbookheadibg = new javax.swing.JPanel();
        lblbookmhd = new javax.swing.JLabel();
        bookname = new javax.swing.JLabel();
        memberIDfind = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        iTableDetail = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnclear = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fromdate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        todate = new com.toedter.calendar.JDateChooser();
        btnfilter = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1124, 643));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        lblbookheadibg.setBackground(new java.awt.Color(153, 204, 255));
        lblbookheadibg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblbookmhd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblbookmhd.setText("Issue List");

        bookname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bookname.setText("Member ID");

        memberIDfind.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        memberIDfind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                memberIDfindKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout lblbookheadibgLayout = new javax.swing.GroupLayout(lblbookheadibg);
        lblbookheadibg.setLayout(lblbookheadibgLayout);
        lblbookheadibgLayout.setHorizontalGroup(
            lblbookheadibgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblbookheadibgLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblbookmhd, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 540, Short.MAX_VALUE)
                .addComponent(bookname, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(memberIDfind, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        lblbookheadibgLayout.setVerticalGroup(
            lblbookheadibgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblbookheadibgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lblbookheadibgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(memberIDfind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lblbookheadibgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bookname)
                        .addComponent(lblbookmhd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        iTableDetail.setAutoCreateRowSorter(true);
        iTableDetail.setBackground(new java.awt.Color(204, 255, 204));
        iTableDetail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        iTableDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Issue No", "Book ID", "Member ID", "Issue Date", "Return Date"
            }
        ));
        iTableDetail.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(iTableDetail);
        iTableDetail.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnclear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clear-32.png"))); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnprint.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnprint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/print-32.png"))); // NOI18N
        btnprint.setText("Print");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel1.setText("From");

        fromdate.setDateFormatString("yyyy-MM-dd");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setText("To");

        todate.setDateFormatString("yyyy-MM-dd");

        btnfilter.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnfilter.setText("Filter");
        btnfilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fromdate, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(todate, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnfilter, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fromdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(todate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnprint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnfilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(5, 5, 5))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblbookheadibg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblbookheadibg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void memberIDfindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_memberIDfindKeyReleased
        // TODO add your handling code here:
        try {
            String sql = "SELECT `issue_no`, `mid`, `bid`, `i_date`, `r_date` FROM `bookissue`"
                    + " WHERE mid LIKE '%"+memberIDfind.getText()+"%'";
            pat = (PreparedStatement) con.prepareStatement(sql);
            rst = pat.executeQuery();
            iTableDetail.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rst));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_memberIDfindKeyReleased

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        
        memberIDfind.setText("");
        ((JTextField)fromdate.getDateEditor().getUiComponent()).setText("");
        ((JTextField)todate.getDateEditor().getUiComponent()).setText("");
        tablellord();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        // TODO add your handling code here:
        int count = iTableDetail.getRowCount();
        if(count > 0){
            
            DefaultTableModel mTable = (DefaultTableModel) iTableDetail.getModel();
            try {
                JasperPrint jprint = null;
                JasperCompileManager.compileReportToFile("C:\\Users\\User\\Documents\\NetBeansProjects\\LibraryManagement\\src\\Report\\issuelist.jrxml");
                jprint = JasperFillManager.fillReport("C:\\Users\\User\\Documents\\NetBeansProjects\\LibraryManagement\\src\\Report\\issuelist.jasper", null,
                        new JRTableModelDataSource(mTable));
                JasperViewer.viewReport(jprint, false);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Not OKAY");
                
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "No Report Generate");
        }
    }//GEN-LAST:event_btnprintActionPerformed

    private void btnfilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfilterActionPerformed
        // TODO add your handling code here:
        issueHistory();
    }//GEN-LAST:event_btnfilterActionPerformed
    
    public void issueHistory(){
        String fDate = ((JTextField)fromdate.getDateEditor().getUiComponent()).getText();
        String tDate = ((JTextField)todate.getDateEditor().getUiComponent()).getText();
        
        if(0 < fDate.length() && tDate.isEmpty()){
            try {
                String issueReport = "SELECT `issue_no`, `mid`, `bid`, `i_date`, `r_date` FROM `bookissue`"
                        + " WHERE i_date='"+fDate+"' and mid LIKE '%"+memberIDfind.getText()+"%'";
                pat = (PreparedStatement) con.prepareStatement(issueReport);
                rst = pat.executeQuery();
                iTableDetail.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rst));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "from date");
            }
        }
        else if(0 < fDate.length() && 0 < tDate.length()){
            try {
                String issueReport = "SELECT `issue_no`, `mid`, `bid`, `i_date`, `r_date` FROM `bookissue`"
                        + " WHERE mid LIKE '%"+memberIDfind.getText()+"%' and i_date BETWEEN '"+fDate+"' and '"+tDate+"'";
                 pat = (PreparedStatement) con.prepareStatement(issueReport);
                rst = pat.executeQuery();
                iTableDetail.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rst));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "between");
            }   
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Detect no Date");
        }
    }
    
    private void tablellord(){
        try {
            String sql = "SELECT `issue_no`, `mid`, `bid`, `i_date`, `r_date` FROM `bookissue`";
            pat = (PreparedStatement) con.prepareStatement(sql);
            rst = pat.executeQuery();
            iTableDetail.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rst));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookname;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnfilter;
    private javax.swing.JButton btnprint;
    private com.toedter.calendar.JDateChooser fromdate;
    private javax.swing.JTable iTableDetail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel lblbookheadibg;
    private javax.swing.JLabel lblbookmhd;
    private javax.swing.JTextField memberIDfind;
    private com.toedter.calendar.JDateChooser todate;
    // End of variables declaration//GEN-END:variables
}
