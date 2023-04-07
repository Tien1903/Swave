package Vu.ui;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class ForgotPass extends java.awt.Dialog {
           
    /**
     * Creates new form ForgotPass
     */
    public ForgotPass(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        init();
        txtTextPane.setBackground(new Color(0,0,0,0));
        btnAbout.setBackground(new Color(0,0,0,0));
    }
    
    private void init(){
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/img/Asset 5@4x 2.png")));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTextPane = new javax.swing.JTextPane();
        lblAnother = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblAbout = new javax.swing.JLabel();
        btnAbout = new javax.swing.JButton();
        textField1 = new AdminToolUtils.TextField();
        textField2 = new AdminToolUtils.TextField();
        textField3 = new AdminToolUtils.TextField();
        buttonPass1 = new AdminToolUtils.ButtonPass();
        buttonPass2 = new AdminToolUtils.ButtonPass();
        buttonPass3 = new AdminToolUtils.ButtonPass();
        jLabel1 = new javax.swing.JLabel();

        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setOpaque(false);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Quên mật khẩu");

        jScrollPane2.setBorder(null);

        txtTextPane.setBackground(new java.awt.Color(0, 0, 0));
        txtTextPane.setBorder(null);
        txtTextPane.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtTextPane.setForeground(new java.awt.Color(136, 136, 136));
        txtTextPane.setText("Nhập địa chỉ email bạn đã sử dụng để\nđăng ký SWave. Chúng tôi sẽ gửi cho bạn\nmột liên kết để đặt lại mật khẩu của bạn.");
        txtTextPane.setAutoscrolls(false);
        txtTextPane.setSelectedTextColor(new java.awt.Color(136, 136, 136));
        txtTextPane.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(txtTextPane);

        lblAnother.setForeground(new java.awt.Color(95, 95, 95));
        lblAnother.setText("hoặc tiếp tục với");

        lblAbout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAbout.setForeground(new java.awt.Color(82, 82, 82));
        lblAbout.setText("Điều khoản sử dụng?");

        btnAbout.setBackground(new java.awt.Color(0, 0, 0));
        btnAbout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAbout.setForeground(new java.awt.Color(255, 255, 255));
        btnAbout.setText("Truy cập");
        btnAbout.setBorder(null);
        btnAbout.setOpaque(true);

        textField2.setPlaceHolder("Mã xác nhận");

        textField3.setPlaceHolder("Nhập mật khẩu mới");

        buttonPass1.setForeground(new java.awt.Color(0, 0, 0));
        buttonPass1.setText("Đặt lại mật khẩu");
        buttonPass1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        buttonPass2.setBackground(new java.awt.Color(109, 0, 136));
        buttonPass2.setText("Gửi mã");
        buttonPass2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        buttonPass3.setBackground(new java.awt.Color(34, 34, 34));
        buttonPass3.setText("Đăng nhập");
        buttonPass3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonPass3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPass3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(lblAbout)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAbout))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jSeparator2)
                                .addGap(18, 18, 18)
                                .addComponent(lblAnother)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblTitle)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)
                            .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonPass1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonPass3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(buttonPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAnother)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(buttonPass3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbout)
                    .addComponent(btnAbout))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 146, -1, -1));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 820));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void buttonPass3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPass3MouseClicked
        this.dispose();
    }//GEN-LAST:event_buttonPass3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ForgotPass dialog = new ForgotPass(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private AdminToolUtils.ButtonPass buttonPass1;
    private AdminToolUtils.ButtonPass buttonPass2;
    private AdminToolUtils.ButtonPass buttonPass3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAbout;
    private javax.swing.JLabel lblAnother;
    private javax.swing.JLabel lblTitle;
    private AdminToolUtils.TextField textField1;
    private AdminToolUtils.TextField textField2;
    private AdminToolUtils.TextField textField3;
    private javax.swing.JTextPane txtTextPane;
    // End of variables declaration//GEN-END:variables
}