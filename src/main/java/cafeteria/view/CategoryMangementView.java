package cafeteria.view;

import cafeteria.dao.CategoryDAO;
import cafeteria.dao.ProductDAO;
import cafeteria.entity.Category;
import cafeteria.utils.MsgBox;

import javax.swing.DefaultComboBoxModel;

public class CategoryMangementView extends javax.swing.JInternalFrame {

    CategoryDAO loaiSPDAO;
    ProductDAO sanPhamDA0;
    DefaultComboBoxModel<Category> comboBoxLoai;

    public CategoryMangementView() {
        initComponents();
        init();
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
        jLabel2 = new javax.swing.JLabel();
        cbxLoai = new javax.swing.JComboBox<>();
        txtTenLoai = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Loại Sản Phẩm");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Loại");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(153, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tên");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(153, 153, 153)));

        cbxLoai.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        cbxLoai.setModel(new DefaultComboBoxModel<>(new String[] { "Đồ ăn", "Đồ uống" }));

        txtTenLoai.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N

        jButton1.setText("Xóa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Thêm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenLoai)
                            .addComponent(cbxLoai, 0, 291, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenLoai, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxLoai, jLabel1, txtTenLoai});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        insert();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        delete();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxLoai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtTenLoai;
    // End of variables declaration//GEN-END:variables

    private void init() {
        loaiSPDAO = new CategoryDAO();
        sanPhamDA0 = new ProductDAO();
        
        comboBoxLoai = (DefaultComboBoxModel) cbxLoai.getModel();
        
        fillComboBox();
    }
    
    private void fillComboBox() {
        comboBoxLoai.removeAllElements();
        loaiSPDAO.selectAll().forEach( (x) -> {
            comboBoxLoai.addElement(x);
        });
    }
    
    private void insert() {
        String tenloai = txtTenLoai.getText();
        
        if (isEmpty(tenloai)) {
            MsgBox.notify("Tên loại không được trống!", this);
            return;
        }
        
        Category lsp = new Category();
        lsp.setTenLoaiSanPham(tenloai);
        try {
            loaiSPDAO.insert(lsp);
            MsgBox.notify("Thêm thành công", this);
            reload();
        } catch (Exception e) {
            MsgBox.notify(e.getMessage(), this);
        }
    }
    
    private void delete() {
        Category lsp = (Category) comboBoxLoai.getSelectedItem();
        
        if (hasSanPham(lsp)) {
            MsgBox.notify("Loại sản phẩm này đang chứa sản phẩm", this);
            return;
        }
        
        try {
            if (!MsgBox.confirm("Bạn có muốn xóa loại "+lsp.getTenLoaiSanPham()+"?", this))
                return;
            loaiSPDAO.delete(lsp.getMaLoaiSanPham());
            MsgBox.notify("Xóa thành công", this);
            reload();
        } catch (Exception e) {
            MsgBox.notify(e.getMessage(), this);
        }
    }
    
    private boolean isEmpty(String tenLoaiSanPham) {
        return tenLoaiSanPham.isEmpty();
    }
    
    private boolean hasSanPham(Category lsp) {
        return !sanPhamDA0.selectByMaLoai(lsp.getMaLoaiSanPham()).isEmpty();
    }
    
    private void reload() {
        fillComboBox();
        txtTenLoai.setText("");
    }
}