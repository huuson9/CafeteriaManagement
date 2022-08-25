package cafeteria.view;

import cafeteria.dao.BillDAO;
import cafeteria.dao.EmployeeDAO;
import cafeteria.entity.Bill;
import cafeteria.entity.Employee;
import cafeteria.utils.MsgBox;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class BillManagementView extends javax.swing.JInternalFrame {

    ArrayList<Bill> listHD;
    BillDAO hoadonDAO = new BillDAO();
    EmployeeDAO nvDao = new EmployeeDAO();

    /**
     * Creates new form QuanLyHoaDon
     */
    public BillManagementView() {
        initComponents();
        this.fillTable();
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
        lblNam = new javax.swing.JLabel();
        lblThang = new javax.swing.JLabel();
        lblNgay = new javax.swing.JLabel();
        txtNam = new javax.swing.JTextField();
        txtThang = new javax.swing.JTextField();
        txtNgay = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();

        setClosable(true);
        setTitle("Quản lý hóa đơn");

        lblNam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNam.setText("Năm");

        lblThang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblThang.setText("Tháng");

        lblNgay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNgay.setText("Ngày");

        txtNam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNam.setText("2020");
        txtNam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNamKeyReleased(evt);
            }
        });

        txtThang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtThang.setText("12");
        txtThang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtThangKeyReleased(evt);
            }
        });

        txtNgay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNgay.setText("1");
        txtNgay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNgayKeyReleased(evt);
            }
        });

        tblHoaDon.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hóa Đơn", "Tên nhân viên", "Khách"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHoaDon.setRowHeight(30);
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoaDon);
        if (tblHoaDon.getColumnModel().getColumnCount() > 0) {
            tblHoaDon.getColumnModel().getColumn(0).setResizable(false);
            tblHoaDon.getColumnModel().getColumn(1).setResizable(false);
            tblHoaDon.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblThang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblNgay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtNam, txtNgay, txtThang});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNam)
                    .addComponent(lblThang)
                    .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNgay))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        int selectRow = tblHoaDon.getSelectedRow();
        int maSanPham = Integer.parseInt(tblHoaDon.getValueAt(selectRow, 0).toString());
        BillDetailView hdct = new BillDetailView(maSanPham);
        HomeView.desktop.add(hdct);
        hdct.setVisible(true);
    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void txtThangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtThangKeyReleased
        fillTable();
    }//GEN-LAST:event_txtThangKeyReleased

    private void txtNgayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNgayKeyReleased
        fillTable();
    }//GEN-LAST:event_txtNgayKeyReleased

    private void txtNamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamKeyReleased
        fillTable();
    }//GEN-LAST:event_txtNamKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNam;
    private javax.swing.JLabel lblNgay;
    private javax.swing.JLabel lblThang;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTextField txtNam;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtThang;
    // End of variables declaration//GEN-END:variables

    public void fillTable() {
        if (isEmpty(txtNam.getText()) || isEmpty(txtThang.getText()) || isEmpty(txtNgay.getText())) {
            return;
        }
        
        if (!isNumber(txtNam.getText()) || !isNumber(txtThang.getText()) || !isNumber(txtNgay.getText())) {
            return;
        }
        
        int nam = Integer.parseInt(txtNam.getText());
        int thang = Integer.parseInt(txtThang.getText());
        int ngay = Integer.parseInt(txtNgay.getText());
        
        if (nam < 1753) {
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        try {
            listHD = (ArrayList<Bill>) hoadonDAO.getHoaDonByDate(nam, thang, ngay);
            for (Bill hd : listHD) {
                Employee nv = nvDao.selectByID(hd.getMaNhanVien());
                Object[] row = {
                    hd.getMaHoaDon(),
                    nv.getTenNhanVien(),
                    hd.isLoaiKhachHang() ? "Nước ngoài" : "Trong nước",
                    hd.getNgayXuatHoaDon()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.notify("Lỗi FillTable", this);
        }
    }

    private boolean isEmpty(String time) {
        return time.isEmpty();
    }
    
    private boolean isNumber(String time) {
        try {
            Integer.parseInt(time);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
