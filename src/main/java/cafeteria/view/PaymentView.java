package cafeteria.view;

import cafeteria.dao.BillDAO;
import cafeteria.dao.BillDetailDAO;
import cafeteria.entity.Bill;
import cafeteria.entity.BillDetail;
import cafeteria.utils.*;

import javax.swing.table.DefaultTableModel;
import java.util.Date;

public class PaymentView extends javax.swing.JFrame {

    BillDAO hoadonDAO = new BillDAO();
    int tienkhachdua = 0;

    BillDetailDAO hoaDonChiTiet = new BillDetailDAO();
    DefaultTableModel table;

    public PaymentView(DefaultTableModel tb, String tongTien) {
        initComponents();
        table = tb;
        this.lbTongTien.setText(tongTien);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pnlMenhGia = new javax.swing.JPanel();
        btnNamTram = new javax.swing.JButton();
        btnHaiTram = new javax.swing.JButton();
        btnMotTram = new javax.swing.JButton();
        btnNamChuc = new javax.swing.JButton();
        btnHaiChuc = new javax.swing.JButton();
        btnMuoi = new javax.swing.JButton();
        btnNam = new javax.swing.JButton();
        btnHai = new javax.swing.JButton();
        btnMot = new javax.swing.JButton();
        pnlPhuongThucThanhToan = new javax.swing.JPanel();
        btnTienMat = new javax.swing.JButton();
        btnATM = new javax.swing.JButton();
        btnVisa = new javax.swing.JButton();
        btnMasterCard = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbTongTien = new javax.swing.JLabel();
        lbHinhThuc = new javax.swing.JLabel();
        lbTien = new javax.swing.JLabel();
        lbTienTraLai = new javax.swing.JLabel();
        rdoNoReceipt = new javax.swing.JCheckBox();
        ckbLoaiKhach = new javax.swing.JCheckBox();
        btnInHD = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblThoat = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nhập số tiền khách đưa  -->  chọn hình thức thanh toán");

        txtTongTien.setEditable(false);
        txtTongTien.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtTongTien.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTongTien.setText("0");
        txtTongTien.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(153, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Mệnh giá");

        pnlMenhGia.setLayout(new java.awt.GridLayout(3, 3, 10, 10));

        btnNamTram.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNamTram.setText("500.000đ");
        btnNamTram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNamTramActionPerformed(evt);
            }
        });
        pnlMenhGia.add(btnNamTram);

        btnHaiTram.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHaiTram.setText("200.000đ");
        btnHaiTram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHaiTramActionPerformed(evt);
            }
        });
        pnlMenhGia.add(btnHaiTram);

        btnMotTram.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMotTram.setText("100.000đ");
        btnMotTram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMotTramActionPerformed(evt);
            }
        });
        pnlMenhGia.add(btnMotTram);

        btnNamChuc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNamChuc.setText("50.000đ");
        btnNamChuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNamChucActionPerformed(evt);
            }
        });
        pnlMenhGia.add(btnNamChuc);

        btnHaiChuc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHaiChuc.setText("20.000đ");
        btnHaiChuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHaiChucActionPerformed(evt);
            }
        });
        pnlMenhGia.add(btnHaiChuc);

        btnMuoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMuoi.setText("10.000đ");
        btnMuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuoiActionPerformed(evt);
            }
        });
        pnlMenhGia.add(btnMuoi);

        btnNam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNam.setText("5000đ");
        btnNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNamActionPerformed(evt);
            }
        });
        pnlMenhGia.add(btnNam);

        btnHai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHai.setText("2000đ");
        btnHai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHaiActionPerformed(evt);
            }
        });
        pnlMenhGia.add(btnHai);

        btnMot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMot.setText("1000đ");
        btnMot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMotActionPerformed(evt);
            }
        });
        pnlMenhGia.add(btnMot);

        pnlPhuongThucThanhToan.setLayout(new java.awt.GridLayout(4, 1, 20, 20));

        btnTienMat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTienMat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/system/money.png"))); // NOI18N
        btnTienMat.setText("Tiền mặt");
        btnTienMat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTienMat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlPhuongThucThanhToan.add(btnTienMat);

        btnATM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnATM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/system/ck.png"))); // NOI18N
        btnATM.setText("ATM");
        btnATM.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnATM.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnATM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnATMActionPerformed(evt);
            }
        });
        pnlPhuongThucThanhToan.add(btnATM);

        btnVisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/system/visa.png"))); // NOI18N
        btnVisa.setText("VISA");
        btnVisa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVisa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaActionPerformed(evt);
            }
        });
        pnlPhuongThucThanhToan.add(btnVisa);

        btnMasterCard.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMasterCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/system/mc.png"))); // NOI18N
        btnMasterCard.setText("MASTER CARD");
        btnMasterCard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMasterCard.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMasterCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasterCardActionPerformed(evt);
            }
        });
        pnlPhuongThucThanhToan.add(btnMasterCard);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField1.setText(".000đ");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addComponent(pnlMenhGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtTongTien)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(pnlPhuongThucThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(pnlMenhGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlPhuongThucThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel3.setText(" Tổng tiền       ");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(204, 204, 204)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel4.setText(" Hình thức       ");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(204, 204, 204)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel5.setText("Khách Trả");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(204, 204, 204)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel6.setText(" Tiền trả lại      ");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(204, 204, 204)));

        lbTongTien.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lbTongTien.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTongTien.setText("0");
        lbTongTien.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        lbHinhThuc.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lbHinhThuc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbHinhThuc.setText("Tiền mặt");
        lbHinhThuc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        lbTien.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lbTien.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTien.setText("0");
        lbTien.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        lbTienTraLai.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lbTienTraLai.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTienTraLai.setText("-0");
        lbTienTraLai.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        rdoNoReceipt.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        rdoNoReceipt.setText("Không lấy hoá đơn");

        ckbLoaiKhach.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        ckbLoaiKhach.setText("Khách nước ngoài");
        ckbLoaiKhach.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnInHD.setBackground(new java.awt.Color(102, 255, 51));
        btnInHD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnInHD.setForeground(new java.awt.Color(255, 255, 255));
        btnInHD.setText("IN HOÁ ĐƠN");
        btnInHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHDActionPerformed(evt);
            }
        });

        btnHuy.setBackground(new java.awt.Color(255, 0, 51));
        btnHuy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("HUỶ");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbTien, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbHinhThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTienTraLai, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckbLoaiKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rdoNoReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel4, jLabel5, jLabel6});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbHinhThuc, lbTien, lbTienTraLai, lbTongTien});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbHinhThuc))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(lbTien))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbTienTraLai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdoNoReceipt)
                .addGap(18, 18, 18)
                .addComponent(ckbLoaiKhach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInHD, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, jLabel4, jLabel5, jLabel6});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbHinhThuc, lbTien, lbTienTraLai, lbTongTien});

        jPanel4.setBackground(new java.awt.Color(59, 95, 218));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Thanh toán");

        lblThoat.setBackground(new java.awt.Color(255, 0, 51));
        lblThoat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblThoat.setForeground(new java.awt.Color(255, 255, 255));
        lblThoat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThoat.setText("X");
        lblThoat.setOpaque(true);
        lblThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThoatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
            .addComponent(lblThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

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

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnHuyActionPerformed

    private void lblThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_lblThoatMouseClicked

    private void btnInHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHDActionPerformed

        if (!isPay()) {
            MsgBox.notify("Không đủ tiền", this);
            return;
        }
        insertHoaDon();
        

        if (rdoNoReceipt.isSelected()) {
            return;
        }
        try {
            Bill hd = hoadonDAO.selectLastHoaDon();
            String fileName = hd.getMaHoaDon()+"-"+hd.getNgayXuatHoaDon();
            ExcelHelper.writeExcelFile("hoadon\\"+fileName+".xlsx", hd, tienkhachdua);
            ExcelHelper.writeExcelFile("hdnhabep\\"+fileName+".xlsx", hd, tienkhachdua);
            
            Runtime.getRuntime().exec("cmd /c start excel hdnhabep\\" +fileName);
            
        } catch (Exception e) {
            MsgBox.notify(e.getMessage(), this);
        }
    }//GEN-LAST:event_btnInHDActionPerformed

    private void btnMasterCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasterCardActionPerformed
        MsgBox.notify("Không hỗ trợ", this);
    }//GEN-LAST:event_btnMasterCardActionPerformed

    private void btnVisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaActionPerformed
        MsgBox.notify("Không hỗ trợ", this);
    }//GEN-LAST:event_btnVisaActionPerformed

    private void btnATMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnATMActionPerformed
        MsgBox.notify("Không hỗ trợ", this);
    }//GEN-LAST:event_btnATMActionPerformed

    private void btnMotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMotActionPerformed
        tangTien(1);
        filltext();
    }//GEN-LAST:event_btnMotActionPerformed

    private void btnHaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHaiActionPerformed
        tangTien(2);
        filltext();
    }//GEN-LAST:event_btnHaiActionPerformed

    private void btnNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNamActionPerformed
        tangTien(5);
        filltext();
    }//GEN-LAST:event_btnNamActionPerformed

    private void btnMuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuoiActionPerformed
        tangTien(10);
        filltext();
    }//GEN-LAST:event_btnMuoiActionPerformed

    private void btnHaiChucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHaiChucActionPerformed
        tangTien(20);
        filltext();
    }//GEN-LAST:event_btnHaiChucActionPerformed

    private void btnNamChucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNamChucActionPerformed
        tangTien(50);
        filltext();
    }//GEN-LAST:event_btnNamChucActionPerformed

    private void btnMotTramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMotTramActionPerformed
        tangTien(100);
        filltext();
    }//GEN-LAST:event_btnMotTramActionPerformed

    private void btnHaiTramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHaiTramActionPerformed

        tangTien(200);
        filltext();
    }//GEN-LAST:event_btnHaiTramActionPerformed

    private void btnNamTramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNamTramActionPerformed
        tangTien(500);
        filltext();
    }//GEN-LAST:event_btnNamTramActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnATM;
    private javax.swing.JButton btnHai;
    private javax.swing.JButton btnHaiChuc;
    private javax.swing.JButton btnHaiTram;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnInHD;
    private javax.swing.JButton btnMasterCard;
    private javax.swing.JButton btnMot;
    private javax.swing.JButton btnMotTram;
    private javax.swing.JButton btnMuoi;
    private javax.swing.JButton btnNam;
    private javax.swing.JButton btnNamChuc;
    private javax.swing.JButton btnNamTram;
    private javax.swing.JButton btnTienMat;
    private javax.swing.JButton btnVisa;
    private javax.swing.JCheckBox ckbLoaiKhach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbHinhThuc;
    private javax.swing.JLabel lbTien;
    private javax.swing.JLabel lbTienTraLai;
    private javax.swing.JLabel lbTongTien;
    private javax.swing.JLabel lblThoat;
    private javax.swing.JPanel pnlMenhGia;
    private javax.swing.JPanel pnlPhuongThucThanhToan;
    private javax.swing.JCheckBox rdoNoReceipt;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables

    void insertHoaDon() {
        String manv = Auth.user.getMaNhanVien();
        Date ngayxuatHD = new Date();

        Bill hoadon = new Bill();
        hoadon.setMaNhanVien(manv);
        hoadon.setNgayXuatHoaDon(DateUtils.convertDateToSqlDate(ngayxuatHD));
        hoadon.setLoaiKhachHang(ckbLoaiKhach.isSelected());

        try {
            hoadonDAO.inserts(hoadon);
            insertChiTietHD();
            MsgBox.notify("In hóa đơn thành công", this);
            this.dispose();
        } catch (Exception e) {
            MsgBox.notify(e.getMessage(), this);
        }
    }

    private void insertChiTietHD() {
        Bill hd = hoadonDAO.selectLastHoaDon();
        BillDetail hdct = new BillDetail();
        hdct.setMaHoaDon(hd.getMaHoaDon());

        int rows = table.getRowCount();

        for (int i = 0; i < rows; i++) {
            int amount = Integer.parseInt(table.getValueAt(i, 2).toString());
            for (int j = 0; j < amount; j++) {
                String maSp = table.getValueAt(i, 0).toString();
                hdct.setMaSanPham(maSp);
                try {
                    hoaDonChiTiet.insert(hdct);
                } catch (Exception e) {
                    MsgBox.notify(e.getMessage(), this);
                }
            }
        }
    }

    private int calculation() {
        int tongtien = Integer.parseInt(lbTongTien.getText().substring(0, lbTongTien.getText().length() - 5).replace(".", ""));
        int tientralai = Integer.parseInt(txtTongTien.getText()) - tongtien;
        return tientralai;
    }

    private void filltext() {
        try {
            lbTien.setText(LocalVietNam.getCurrency(String.valueOf(tienkhachdua)));
            int tienThua = calculation();
            if (tienThua < 0) {
                lbTienTraLai.setText("-"+LocalVietNam.getCurrency(String.valueOf(calculation()).substring(1)));
            } else {
               lbTienTraLai.setText(LocalVietNam.getCurrency(String.valueOf(calculation()))); 
            }
        } catch (Exception e) {
            MsgBox.notify(e.getMessage(), this);
        }
    }

    private void tangTien(int tien) {
        tienkhachdua = Integer.parseInt(txtTongTien.getText()) + tien;
        txtTongTien.setText(tienkhachdua + "");
    }

    private boolean isPay() {
        return !lbTienTraLai.getText().startsWith("-");
    }
}