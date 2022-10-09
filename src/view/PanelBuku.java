/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.DAOBuku;
import control.DAOMember;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.Buku;
import static view.PanelMember.daomember;


public class PanelBuku extends javax.swing.JPanel implements ListSelectionListener{

    /**
     * Creates new form PanelBuku
     */
    Buku oldBuku;
    Buku newBuku;
    //Buat Dao sesuai dengan model yang dikelola di view ini(Buku) dengan nama daoBuku
    public  static  DAOBuku daoBuku;
    DefaultTableModel dtmbuku;
    public PanelBuku() {
        initComponents();
        daoBuku = new DAOBuku();
        //dtmBuku menampung model tabelBuku
        dtmbuku = (DefaultTableModel) tabelBuku.getModel();
    }
    public static DAOBuku getDaoBuku() {
        return daoBuku ;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void reset(){
        InputISBN.setText("");
        InputJudul.setText("");
        InputJumlahStok.setValue(0);
        InputPenerbit.setText("");
        InputPengarang.setText("");
        InputTahunTerbit.setValue(2000);
        tampilDataMahasiswaTOJTable();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelKelolaBuku = new javax.swing.JLabel();
        LabelMasterDataBuku = new javax.swing.JLabel();
        LabelISBN = new javax.swing.JLabel();
        InputISBN = new javax.swing.JTextField();
        LabelJudul = new javax.swing.JLabel();
        InputJudul = new javax.swing.JTextField();
        LabelPengarang = new javax.swing.JLabel();
        InputPengarang = new javax.swing.JTextField();
        LabelPenerbit = new javax.swing.JLabel();
        InputPenerbit = new javax.swing.JTextField();
        LabelTahunTerbit = new javax.swing.JLabel();
        InputTahunTerbit = new javax.swing.JSpinner();
        LabelJumlahStok = new javax.swing.JLabel();
        InputJumlahStok = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBuku = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        LabelKelolaBuku.setText("Kelola Buku");

        LabelMasterDataBuku.setText("Master Data Buku");

        LabelISBN.setText("ISBN");

        LabelJudul.setText("Judul");

        LabelPengarang.setText("Pengarang");

        LabelPenerbit.setText("Penerbit");

        LabelTahunTerbit.setText("Tahun Terbit");

        InputTahunTerbit.setModel(new javax.swing.SpinnerNumberModel(2000, 1980, 2021, 1));

        LabelJumlahStok.setText("Jumlah Stok");

        InputJumlahStok.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        tabelBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Judul", "Penerbit", "Pengarang", "Jumlah Stock", "Tahun Terbit"
            }
        ));
        jScrollPane1.setViewportView(tabelBuku);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelKelolaBuku)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LabelISBN)
                                        .addComponent(LabelJudul)
                                        .addComponent(LabelPengarang)
                                        .addComponent(LabelPenerbit))
                                    .addGap(29, 29, 29))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LabelTahunTerbit)
                                    .addGap(12, 12, 12)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelJumlahStok)
                                .addGap(17, 17, 17)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(InputPenerbit)
                            .addComponent(InputPengarang)
                            .addComponent(InputJudul)
                            .addComponent(InputISBN)
                            .addComponent(InputTahunTerbit, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(InputJumlahStok))))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelMasterDataBuku)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelMasterDataBuku)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSimpan))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelKelolaBuku)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelISBN)
                            .addComponent(InputISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelJudul)
                            .addComponent(InputJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelPengarang)
                            .addComponent(InputPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelPenerbit)
                            .addComponent(InputPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelTahunTerbit)
                            .addComponent(InputTahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelJumlahStok)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(InputJumlahStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnReset)))))
                .addContainerGap(214, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            if (InputISBN.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "ISBN is required!", "Warning Message", JOptionPane.WARNING_MESSAGE);
            } else if (InputJudul.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Judul is required!", "Warning Message", JOptionPane.WARNING_MESSAGE);
            } else if (InputPengarang.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Pengarang is required!", "Warning Message", JOptionPane.WARNING_MESSAGE);
            } else if (InputPenerbit.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Penerbit is required!", "Warning Message", JOptionPane.WARNING_MESSAGE);
            } else if (Integer.parseInt(InputTahunTerbit.getValue().toString()) < 0) {
                JOptionPane.showMessageDialog(this, "Tahun Terbit required!", "Warning Message", JOptionPane.WARNING_MESSAGE);
            } else if (InputJumlahStok.getValue() == null) {
                JOptionPane.showMessageDialog(this, "Stok required!", "Warning Message", JOptionPane.WARNING_MESSAGE);
            } else if (oldBuku == null) { //Create
                //pada tahap ini digunakan untuk menambah data buku
                //1. masukkan data buku dari form input ke newBuku
                //2. Jika daoBuku.insertData(newBuku) --> true maka tampilkan dialog berhasil
                //3. Jika daoBuku.insertData(newBuku) --> false maka tampilkan dialog data buku sudah ada
                newBuku = new Buku();
                newBuku.setIsbn(InputISBN.getText().trim());
                newBuku.setJudul(InputJudul.getText().trim());
                newBuku.setPengarang(InputPengarang.getText().trim());
                newBuku.setPenerbit(InputPenerbit.getText().trim());
                newBuku.setTahunTerbit(Integer.parseInt(InputTahunTerbit.getValue().toString()));
                newBuku.setStok(Integer.parseInt(InputJumlahStok.getValue().toString()));

                daoBuku.insertData(newBuku);
                reset();
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Format Tahun Terbit salah!", "Warning Message", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed
    public void tampilDataMahasiswaTOJTable() {
        tabelBuku.getSelectionModel().removeListSelectionListener(this);
        dtmbuku.getDataVector().removeAllElements();
        for (Buku b : daoBuku.getAllData()) {
            dtmbuku.addRow(new Object[]{
                b.getIsbn(),
                b.getJudul(),
                b.getPenerbit(),
                b.getPengarang(),
                b.getStok(),
                b.getTahunTerbit()
            });
        }
        tabelBuku.getSelectionModel().addListSelectionListener(this);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputISBN;
    private javax.swing.JTextField InputJudul;
    private javax.swing.JSpinner InputJumlahStok;
    private javax.swing.JTextField InputPenerbit;
    private javax.swing.JTextField InputPengarang;
    private javax.swing.JSpinner InputTahunTerbit;
    private javax.swing.JLabel LabelISBN;
    private javax.swing.JLabel LabelJudul;
    private javax.swing.JLabel LabelJumlahStok;
    private javax.swing.JLabel LabelKelolaBuku;
    private javax.swing.JLabel LabelMasterDataBuku;
    private javax.swing.JLabel LabelPenerbit;
    private javax.swing.JLabel LabelPengarang;
    private javax.swing.JLabel LabelTahunTerbit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelBuku;
    // End of variables declaration//GEN-END:variables

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (e.getSource() == tabelBuku.getSelectionModel()) {
            oldBuku = daoBuku.getData(tabelBuku.getSelectedRow());
            InputISBN.setText(oldBuku.getIsbn());
            InputJudul.setText(oldBuku.getJudul());
            InputPengarang.setText(oldBuku.getPengarang());
            InputPenerbit.setText(oldBuku.getPenerbit());
            InputTahunTerbit.setValue(oldBuku.getTahunTerbit());
            InputJumlahStok.setValue(oldBuku.getStok());
        }
    }
}