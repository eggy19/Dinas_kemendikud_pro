/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import Frame.koneksi;
    import java.sql.Connection;
    import java.sql.ResultSet;
import java.sql.SQLException;
    import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
    import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
    
/**
 *
 * @author Abdul Aziz Tsabit A
 */
public class bio_peserta_BD extends javax.swing.JFrame {
    Connection con = new koneksi().buka_koneksi();
    ResultSet res;
    Statement stat;
    DefaultTableModel tbm;
    String tanggal;
    /**
     * Creates new form bio_peserta
     */
    public bio_peserta_BD() {
        super("Data Peserta Debat Bahasa - Register Lomba");        
        initComponents();
        pilih_agama();
        kosong();
        setLocation(300, 80);
    }
    
    private void kosong(){
        txt_alamat_skolah.setText("");
        txt_asal_skolah.setText("");
        txt_kelas.setText("");      
        txt_nama.setText("");
        txt_nis.setText("");
        txt_no_hp.setText("");
        txt_kota.setText("");
        txt_tlp_sekolah.setText("");
        txt_t4lahir.setText("");
        alamat_rumah.setText("");
        txt_nis.requestFocus();
    }    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_kelas = new javax.swing.JTextField();
        txt_t4lahir = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_alamat_skolah = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        txt_nis = new textlimit.text_limit();
        lomba = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        txt_kota = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        alamat_rumah = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        txt_no_hp = new textlimit.text_limit();
        txt_lks = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_tlp_sekolah = new textlimit.text_limit();
        txt_asal_skolah = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cmb_jenkel = new javax.swing.JComboBox();
        tanggal_lhr = new com.toedter.calendar.JDateChooser();
        cmb_agama = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null), "ISI DATA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N

        jLabel1.setText("Nama");

        jLabel2.setText("NIS");

        jLabel3.setText("Kelas");

        jLabel4.setText("Tempat Lahir");

        jLabel5.setText("Bidang Lomba");

        jLabel7.setText("Alamat sekolah");

        txt_nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_namaKeyTyped(evt);
            }
        });

        txt_kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kelasActionPerformed(evt);
            }
        });
        txt_kelas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_kelasKeyTyped(evt);
            }
        });

        txt_alamat_skolah.setColumns(20);
        txt_alamat_skolah.setRows(5);
        jScrollPane2.setViewportView(txt_alamat_skolah);

        jLabel11.setText("Tgl Lahir");

        txt_nis.setmaxlength(10);
        txt_nis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nisKeyTyped(evt);
            }
        });

        lomba.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Debat Bahasa Indonesia", "Debat Bahasa Inggris" }));

        jLabel12.setText("Kota/Kabupaten");

        jLabel9.setText("Alamat Rumah");

        alamat_rumah.setColumns(20);
        alamat_rumah.setRows(5);
        jScrollPane3.setViewportView(alamat_rumah);

        jLabel10.setText("No HP Pribadi");

        txt_no_hp.setmaxlength(12);
        txt_no_hp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_no_hpKeyTyped(evt);
            }
        });

        txt_lks.setEditable(false);
        txt_lks.setText("Debat Bahasa");

        jLabel15.setText("Katagori");

        jLabel8.setText("Telp Sekolah");

        txt_tlp_sekolah.setmaxlength(12);
        txt_tlp_sekolah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tlp_sekolahActionPerformed(evt);
            }
        });
        txt_tlp_sekolah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tlp_sekolahKeyTyped(evt);
            }
        });

        txt_asal_skolah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_asal_skolahKeyTyped(evt);
            }
        });

        jLabel6.setText("Asal Sekolah");

        btn_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/check_2.png"))); // NOI18N
        btn_simpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/pencil_edit.png"))); // NOI18N
        btn_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/close_delete_2.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_simpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_edit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_tlp_sekolah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_asal_skolah)
                            .addComponent(txt_kota)
                            .addComponent(txt_no_hp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_lks)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(txt_asal_skolah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(txt_tlp_sekolah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(txt_kota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(txt_no_hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_lks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel13.setText("Agama");

        jLabel16.setText("Jenis Kelamin");

        cmb_jenkel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Laki-Laki", "Perempuan" }));

        tanggal_lhr.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tanggal_lhrPropertyChange(evt);
            }
        });

        cmb_agama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---PILIH AGAMA---" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nama, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_kelas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_t4lahir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tanggal_lhr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_jenkel, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lomba, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmb_agama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(txt_nis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(txt_t4lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(tanggal_lhr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cmb_agama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cmb_jenkel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(lomba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem1.setText("kembali");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new beranda_BD_peserta().show();
        this.hide();       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btn_pesertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesertaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pesertaActionPerformed

    private void txt_kelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kelasActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        if (txt_nama.getText().equals("")
            || txt_nis.getText().equals("")
            || txt_kelas.getText().equals("")
            || txt_t4lahir.getText().equals("")
            || tanggal.equals("")
            || lomba.getSelectedItem().equals("")
            || txt_asal_skolah.getText().equals("")
            || txt_alamat_skolah.getText().equals("")
            || txt_kota.getText().equals("")
            || txt_kota.getText().equals("")
            || alamat_rumah.getText().equals("")
            || txt_no_hp.getText().equals("")) {

            JOptionPane.showMessageDialog(rootPane, "data belum di pilih");

        } else {
            try {
                String sql = "UPDATE tb_peserta SET"
                +" nama='"          +txt_nama.getText()
                +"', kelas='"       +txt_kelas.getText()
                +"', tempat_lahir='"+txt_t4lahir.getText()
                +"', tgl_lahir='"   +tanggal
                +"', agama='"       +cmb_agama.getSelectedItem()
                +"', jenkel='"      +cmb_jenkel.getSelectedItem()
                +"', bidang_lomba='"+lomba.getSelectedItem()
                +"', asal_sekolah='"+txt_asal_skolah.getText()
                +"', alamat_sekolah='"+txt_alamat_skolah.getText()
                +"', telp_sekolah='"+txt_tlp_sekolah.getText()
                +"', provinsi='"    +txt_kota.getText()
                +"', alamat_rumah='"+alamat_rumah.getText()
                +"', hp_pribadi='"  +txt_no_hp.getText()
                +"', katagori='"    +txt_lks.getText()
                +"'WHERE nisn='"    +txt_nis.getText()
                +"'";
                stat = con.createStatement();
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(rootPane, "data berhasil di ubah");
                kosong();
                new beranda_BD_peserta().show();
                this.hide();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        simpan();
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void txt_tlp_sekolahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tlp_sekolahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tlp_sekolahActionPerformed

    private void txt_namaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_namaKeyTyped
        if(txt_nama.getText().length()==30){
            evt.consume();
        }
    }//GEN-LAST:event_txt_namaKeyTyped

    private void txt_kelasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_kelasKeyTyped
        if(txt_kelas.getText().length()==20){
            evt.consume();
        }
    }//GEN-LAST:event_txt_kelasKeyTyped

    private void txt_asal_skolahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_asal_skolahKeyTyped
        if(txt_asal_skolah.getText().length()==30){
            evt.consume();
        }       
    }//GEN-LAST:event_txt_asal_skolahKeyTyped

    private void txt_nisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nisKeyTyped
        angka(evt);
    }//GEN-LAST:event_txt_nisKeyTyped

    private void txt_tlp_sekolahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tlp_sekolahKeyTyped
        angka(evt);
    }//GEN-LAST:event_txt_tlp_sekolahKeyTyped

    private void txt_no_hpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_no_hpKeyTyped
        angka(evt);  
    }//GEN-LAST:event_txt_no_hpKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new beranda_BD_peserta().show();
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tanggal_lhrPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggal_lhrPropertyChange
        // TODO add your handling code here:
        if(tanggal_lhr.getDate()!=null){
            SimpleDateFormat format = new SimpleDateFormat("yyy-MM-dd");
            tanggal = format.format(tanggal_lhr.getDate());
        }
    }//GEN-LAST:event_tanggal_lhrPropertyChange

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
            java.util.logging.Logger.getLogger(bio_peserta_BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bio_peserta_BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bio_peserta_BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bio_peserta_BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bio_peserta_BD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea alamat_rumah;
    public javax.swing.JButton btn_edit;
    public javax.swing.JButton btn_simpan;
    public javax.swing.JComboBox cmb_agama;
    public javax.swing.JComboBox cmb_jenkel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JComboBox lomba;
    public com.toedter.calendar.JDateChooser tanggal_lhr;
    public javax.swing.JTextArea txt_alamat_skolah;
    public javax.swing.JTextField txt_asal_skolah;
    public javax.swing.JTextField txt_kelas;
    public javax.swing.JTextField txt_kota;
    private javax.swing.JTextField txt_lks;
    public javax.swing.JTextField txt_nama;
    public textlimit.text_limit txt_nis;
    public textlimit.text_limit txt_no_hp;
    public javax.swing.JTextField txt_t4lahir;
    public textlimit.text_limit txt_tlp_sekolah;
    // End of variables declaration//GEN-END:variables

    private void simpan(){
        if (txt_nama.getText().equals("")
                || txt_nis.getText().equals("")
                || txt_kelas.getText().equals("")
                || txt_t4lahir.getText().equals("")
                || tanggal.equals("")
                || lomba.getSelectedItem().equals("")
                || txt_asal_skolah.getText().equals("")
                || txt_alamat_skolah.getText().equals("")
                || txt_kota.getText().equals("")
                || txt_kota.getText().equals("")
                || alamat_rumah.getText().equals("")
                || txt_no_hp.getText().equals("")) {
            
                JOptionPane.showMessageDialog(rootPane, "masih ada data yang kosong");
                        
        } else {
        try {
            String sql = ("INSERT INTO tb_peserta VALUES('"
                    +txt_nis.getText()          +   "','"                    
                    +txt_nama.getText()         +   "','"
                    +txt_kelas.getText()        +   "','"
                    +txt_t4lahir.getText()      +   "','"
                    +tanggal                    +   "','"
                    +cmb_agama.getSelectedItem()+   "','"
                    +cmb_jenkel.getSelectedItem()+  "','"
                    +lomba.getSelectedItem()    +   "','"
                    +txt_asal_skolah.getText()  +   "','"
                    +txt_alamat_skolah.getText()+   "','"
                    +txt_tlp_sekolah.getText()  +   "','"
                    +txt_kota.getText()         +   "','"
                    +alamat_rumah.getText()     +   "','"
                    +txt_no_hp.getText()        +   "','"
                    +txt_lks.getText()          +   "')");
            stat = con.createStatement();
            stat.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(rootPane, "Berhasil tersimpan");         
            kosong();
            new beranda_BD_peserta().show();
            this.hide();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        }
    }
    
    private void pilih_agama(){
        Statement pilih_agama;
        try {
            String sql = "SELECT *FROM agama";
            pilih_agama = con.createStatement();
            res = pilih_agama.executeQuery(sql);
            while(res.next()){
                cmb_agama.addItem(res.getString("agama"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
          
    void angka(KeyEvent a){
        if(Character.isAlphabetic(a.getKeyChar())){
            a.consume();
            JOptionPane.showMessageDialog(null, "Hanya bisa memasukan angka");
        }
    }
}
