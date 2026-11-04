package campingapp;

import java.sql.*;
import campingapp.Koneksi;
import javax.swing.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public final class FormCamping extends javax.swing.JFrame {
    private final Connection conn = new Koneksi().connect();
    private javax.swing.table.DefaultTableModel tabmode;
    
    public FormCamping() {
        initComponents();
        tampilData();
    }
protected void aktif(){
     txtKode.requestFocus();
     txtNama.setEnabled(true);
     txtMerk.setEnabled(true);
     txtKondisi.setEnabled(true);
     txtKelengkapan.setEnabled(true);
     txtHarga.setEnabled(true);
     txtStok.setEnabled(true);
}

protected void kosong(){
    txtKode.setText("");
    txtNama.setText("");
    txtMerk.setText("");
    txtKondisi.setText("");
    txtKelengkapan.setText("");
    txtHarga.setText("");
    txtStok.setText("");
}
    
    protected void tampilData() {

    Object[] Baris ={"kode_alat","nama_alat","merk","kondisi","kelengkapan","harga_sewa","stok"};
        tabmode = new javax.swing.table.DefaultTableModel(null, Baris);
        tableAlat.setModel(tabmode);
        String sql = "SELECT * FROM alat_camping";
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("kode_alat");
                String b = hasil.getString("nama_alat");
                String c = hasil.getString("merk");
                String d = hasil.getString("kondisi");
                String e = hasil.getString("kelengkapan");
                String f = hasil.getString("harga_sewa");
                String g = hasil.getString("stok");
                
                String[] data={a,b,c,d,e,f,g};
                tabmode.addRow(data);
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Gagal menampilkan data: " + e.getMessage());
        }
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Kode = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        Nama = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        Merk = new javax.swing.JLabel();
        txtMerk = new javax.swing.JTextField();
        Kondisi = new javax.swing.JLabel();
        txtKondisi = new javax.swing.JTextField();
        Kelengkapan = new javax.swing.JLabel();
        txtKelengkapan = new javax.swing.JTextField();
        Harga = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        Stok = new javax.swing.JLabel();
        txtStok = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAlat = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(113, 128, 147));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 700));

        Title.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("The Ryderz Camp");

        Kode.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        Kode.setText("Kode");

        txtKode.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        Nama.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        Nama.setText("Nama");

        txtNama.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        Merk.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        Merk.setText("Merk");

        txtMerk.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        Kondisi.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        Kondisi.setText("Kondisi");

        txtKondisi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtKondisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKondisiActionPerformed(evt);
            }
        });

        Kelengkapan.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        Kelengkapan.setText("Kelengkapan");

        txtKelengkapan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtKelengkapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKelengkapanActionPerformed(evt);
            }
        });

        Harga.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        Harga.setText("Harga");

        txtHarga.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        Stok.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        Stok.setText("Stock");

        txtStok.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnEdit.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tableAlat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "kode_alat", "nama_alat", "merk", "kondisi", "kelengkapan", "harga_sewa", "stok"
            }
        ));
        jScrollPane1.setViewportView(tableAlat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Kelengkapan)
                            .addComponent(Kondisi)
                            .addComponent(Merk)
                            .addComponent(Nama)
                            .addComponent(Kode)
                            .addComponent(Harga)
                            .addComponent(Stok))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKondisi, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKelengkapan, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Kode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Merk))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Kondisi)
                            .addComponent(txtKondisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Kelengkapan)
                            .addComponent(txtKelengkapan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Harga))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Stok))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKondisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKondisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKondisiActionPerformed

    private void txtKelengkapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKelengkapanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKelengkapanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
    int selectedRow = tableAlat.getSelectedRow();
        if (selectedRow != -1) {
            String selectedKode = tableAlat.getValueAt(selectedRow, 0).toString();
            String sql = "UPDATE alat_camping SET nama_alat=?, merk=?, kondisi=?, kelengkapan=?, harga_sewa=?, stok=? WHERE kode_alat=?";
            try (PreparedStatement stat = conn.prepareStatement(sql)) {
                stat.setString(1, txtNama.getText());
                stat.setString(2, txtMerk.getText());
                stat.setString(3, txtKondisi.getText());
                stat.setString(4, txtKelengkapan.getText());
                stat.setInt(5, Integer.parseInt(txtHarga.getText()));
                stat.setInt(6, Integer.parseInt(txtStok.getText()));
                stat.setInt(7, Integer.parseInt(txtKode.getText()));
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil diubah");
                kosong();
                tampilData();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Gagal mengubah data: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Pilih data yang akan diedit terlebih dahulu");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
     String sql = "INSERT INTO alat_camping(kode_alat, nama_alat, merk, kondisi, kelengkapan, harga_sewa, stok) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stat = conn.prepareStatement(sql)) {
            stat.setInt(1, Integer.parseInt(txtKode.getText()));
            stat.setString(2, txtNama.getText());
            stat.setString(3, txtMerk.getText());
            stat.setString(4, txtKondisi.getText());
            stat.setString(5, txtKelengkapan.getText());
            stat.setInt(6, Integer.parseInt(txtHarga.getText()));
            stat.setInt(7, Integer.parseInt(txtStok.getText()));
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            kosong();
            tampilData();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal menyimpan data: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
   int selectedRow = tableAlat.getSelectedRow();
        if (selectedRow != -1) {
            String selectedKode = tableAlat.getValueAt(selectedRow, 0).toString();
            int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                String sql = "DELETE FROM alat_camping WHERE kode_alat=?";
                try (PreparedStatement stat = conn.prepareStatement(sql)) {
                    stat.setString(1, selectedKode);
                    stat.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                    kosong();
                    tampilData();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Gagal menghapus data: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Pilih data yang akan dihapus terlebih dahulu");
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void resetForm() {
    txtKode.setText("");
    txtNama.setText("");
    txtMerk.setText("");
    txtKondisi.setText("");
    txtKelengkapan.setText("");
    txtHarga.setText("");
    txtStok.setText("");
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
            java.util.logging.Logger.getLogger(FormCamping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCamping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCamping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCamping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCamping().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Harga;
    private javax.swing.JLabel Kelengkapan;
    private javax.swing.JLabel Kode;
    private javax.swing.JLabel Kondisi;
    private javax.swing.JLabel Merk;
    private javax.swing.JLabel Nama;
    private javax.swing.JLabel Stok;
    private javax.swing.JLabel Title;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAlat;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtKelengkapan;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtKondisi;
    private javax.swing.JTextField txtMerk;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables
}
