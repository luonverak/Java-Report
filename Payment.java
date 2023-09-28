package Report;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class Payment extends javax.swing.JFrame {
    
    float total=0.0f;
    List<ListData> list= new ArrayList<>();
    DecimalFormat df =new DecimalFormat("#,###########0.00");
    public Payment() {
        initComponents();
    }

    Payment(float total, List<ListData> list) {
        initComponents();
        this.total=total;
        this.list=list;
        txtTotal.setText(df.format(total));
        txtPay.setText(df.format(total));
    }
    public Collection data(){ 
        return list;
    }

    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kButton1 = new com.k33ptoo.components.KButton();
        txtPay = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        cbDis = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        kButton2 = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(779, 548));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kButton1.setText("Cancel");
        kButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        kButton1.setkEndColor(new java.awt.Color(255, 51, 51));
        kButton1.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        kButton1.setkStartColor(new java.awt.Color(204, 0, 0));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));

        txtPay.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtPay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPayActionPerformed(evt);
            }
        });
        getContentPane().add(txtPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 250, 50));

        txtTotal.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setEnabled(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 250, 50));

        cbDis.setEditable(true);
        cbDis.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cbDis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "20%", "30%", "" }));
        cbDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDisActionPerformed(evt);
            }
        });
        getContentPane().add(cbDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 250, 50));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel5.setText("Discount");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 150, 50));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel4.setText("Total");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, 50));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel3.setText("Payment");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 150, 50));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel2.setText("Payment of Product");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 360, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 80));

        kButton2.setText("Payment");
        kButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/macbook/NetBeansProjects/Java3-5/src/Report/Image/1.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 550));

        setSize(new java.awt.Dimension(779, 576));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDisActionPerformed
        int index=cbDis.getSelectedIndex();
        float pay=0.0f;
        switch (index) {
            case 0 -> pay=total;
            case 1 -> pay=total- total*0.1f;
            case 2 -> pay=total-  total*0.2f;
            case 3 -> pay=total- total*0.3f;
        }
        txtPay.setText(df.format(pay));
    }//GEN-LAST:event_cbDisActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        
    }//GEN-LAST:event_btnPayActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
       
    }//GEN-LAST:event_kButton1ActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPayActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
       try {
            String dis = this.cbDis.getSelectedItem().toString();
            dis=dis.substring(0,dis.length()-1);
            float fdis=Float.parseFloat(dis);
            float pay = Float.parseFloat(this.txtPay.getText());
            
            JasperReport report = JasperCompileManager.compileReport("src/Report/product.jrxml");
            HashMap<String,Object> map = new HashMap<String,Object>();
            
            map.put("total", total);
            map.put("dis", fdis);
            map.put("pay", pay);
            
            JRBeanCollectionDataSource source = new JRBeanCollectionDataSource(data());
            JasperPrint print = JasperFillManager.fillReport(report, map,source);
            JasperViewer.viewReport(print);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_kButton2ActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbDis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private javax.swing.JTextField txtPay;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
