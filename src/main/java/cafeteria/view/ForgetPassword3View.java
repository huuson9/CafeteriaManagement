/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.view;

import cafeteria.dao.EmployeeDAO;
import cafeteria.utils.Auth;
import cafeteria.utils.MsgBox;

import java.awt.Color;
import javax.swing.ImageIcon;

public class ForgetPassword3View extends javax.swing.JFrame {

    private EmployeeDAO nhanVienDAO;

    public ForgetPassword3View() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon("hinhanh\\chef.png").getImage());
        lblTenNguoiDung.setText(Auth.user.getTenNhanVien());
        initialization();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblTenNguoiDung = new javax.swing.JLabel();
        txtMatKhauMoi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNhapLai = new javax.swing.JTextField();
        btnXacNhan = new javax.swing.JButton();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cập nhật mật khẩu của");

        lblTenNguoiDung.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTenNguoiDung.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTenNguoiDung.setText("Nguyen Van A");

        txtMatKhauMoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mật khẩu mới");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nhập lại mật khẩu mới");

        txtNhapLai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnXacNhan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnXacNhan.setText("Xác nhận");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBack.setText("back");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBackMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTenNguoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXacNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(txtNhapLai, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                .addGap(44, 44, 44))
            .addComponent(lblBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTenNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addComponent(btnXacNhan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(lblBack))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        this.dispose();
        new ForgetPassword2View().setVisible(true);
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseEntered
        lblBack.setForeground(Color.BLUE);
    }//GEN-LAST:event_lblBackMouseEntered

    private void lblBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseExited
        lblBack.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblBackMouseExited

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        if (isError(txtMatKhauMoi.getText(), txtNhapLai.getText())) {
            return;
        }

        changePassword();

        if (MsgBox.confirm("Bạn có muốn đến trang đăng nhập không?", this)) {
            this.dispose();
            new LoginView().setVisible(true);
        }
    }//GEN-LAST:event_btnXacNhanActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblTenNguoiDung;
    private javax.swing.JTextField txtMatKhauMoi;
    private javax.swing.JTextField txtNhapLai;
    // End of variables declaration//GEN-END:variables
    
    private void initialization() {
        nhanVienDAO = new EmployeeDAO();
    }

    private boolean isError(String matKhauMoi, String xacNhanMatKhau) {
        if (isEmpty(matKhauMoi, xacNhanMatKhau)) {
            MsgBox.notify("Mật khẩu không được trống", this);
            return true;
        }

        if (!isGreater8Char(matKhauMoi, xacNhanMatKhau)) {
            MsgBox.notify("Mật khẩu phải dài hơn 8 ký tự", this);
            return true;
        }

        if (!isMatch(matKhauMoi, xacNhanMatKhau)) {
            MsgBox.notify("Mật khẩu mới và xác nhận mật khẩu không trùng nhau", this);
            return true;
        }
        return false;
    }

    private boolean isEmpty(String matKhau, String xacNhanMatKhau) {
        return (matKhau.isEmpty() || xacNhanMatKhau.isEmpty());
    }

    private boolean isGreater8Char(String matKhau, String xacNhanMatKhau) {
        return (matKhau.length() >= 8 && xacNhanMatKhau.length() >= 8);
    }

    private boolean isMatch(String matKhauMoi, String xacNhanMatKhau) {
        return matKhauMoi.equals(xacNhanMatKhau);
    }

    private void changePassword() {
        Auth.user.setMatKhau(txtMatKhauMoi.getText());
        try {
            nhanVienDAO.update(Auth.user);
            MsgBox.notify("Đổi mật khẩu thành công", this);
        } catch (Exception e) {
            MsgBox.notify("lỗi", this);
        }
    }
}
