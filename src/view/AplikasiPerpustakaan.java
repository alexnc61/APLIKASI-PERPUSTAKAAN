/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static view.PanelBuku.daoBuku;
import static view.PanelMember.daomember;
import static view.PanelPeminjaman.daopinjam;


public class AplikasiPerpustakaan extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiPerpustakaan
     */
    PanelBuku buku = new PanelBuku();
    PanelMember member = new PanelMember();
    PanelPeminjaman pinjam = new PanelPeminjaman();
    PanelDetailPinjaman detailpinjam = new PanelDetailPinjaman();
    public AplikasiPerpustakaan() {
        initComponents();
        this.add(buku);
        this.add(member);
        this.add(pinjam);
        this.add(detailpinjam);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelHome = new javax.swing.JPanel();
        LabelAplikasiPerpustakaan = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        MenuMasterData = new javax.swing.JMenu();
        PanelBuku = new javax.swing.JMenuItem();
        PanelMember = new javax.swing.JMenuItem();
        PanelPeminjaman = new javax.swing.JMenuItem();
        PanelDetailPinjaman = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        PanelHome.setBackground(new java.awt.Color(255, 255, 255));

        LabelAplikasiPerpustakaan.setText("Aplikasi Perpustakaan ");

        javax.swing.GroupLayout PanelHomeLayout = new javax.swing.GroupLayout(PanelHome);
        PanelHome.setLayout(PanelHomeLayout);
        PanelHomeLayout.setHorizontalGroup(
            PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHomeLayout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(LabelAplikasiPerpustakaan)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        PanelHomeLayout.setVerticalGroup(
            PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHomeLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(LabelAplikasiPerpustakaan)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        getContentPane().add(PanelHome, "card2");

        MenuMasterData.setText("Master Data");

        PanelBuku.setBackground(new java.awt.Color(255, 255, 255));
        PanelBuku.setText("PanelBuku");
        PanelBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PanelBukuActionPerformed(evt);
            }
        });
        MenuMasterData.add(PanelBuku);

        PanelMember.setText("PanelMember");
        PanelMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PanelMemberActionPerformed(evt);
            }
        });
        MenuMasterData.add(PanelMember);

        PanelPeminjaman.setText("PanelPeminjaman");
        PanelPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PanelPeminjamanActionPerformed(evt);
            }
        });
        MenuMasterData.add(PanelPeminjaman);

        PanelDetailPinjaman.setText("PanelDetailPinjaman");
        PanelDetailPinjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PanelDetailPinjamanActionPerformed(evt);
            }
        });
        MenuMasterData.add(PanelDetailPinjaman);

        MenuBar.add(MenuMasterData);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PanelBukuActionPerformed
        MenuBuku();
    }//GEN-LAST:event_PanelBukuActionPerformed

    private void PanelMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PanelMemberActionPerformed
        MenuMember();
    }//GEN-LAST:event_PanelMemberActionPerformed

    private void PanelPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PanelPeminjamanActionPerformed
        MenuPinjam();
    }//GEN-LAST:event_PanelPeminjamanActionPerformed

    private void PanelDetailPinjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PanelDetailPinjamanActionPerformed
        MenuDetailPinjam();
    }//GEN-LAST:event_PanelDetailPinjamanActionPerformed

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
            java.util.logging.Logger.getLogger(AplikasiPerpustakaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiPerpustakaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiPerpustakaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiPerpustakaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiPerpustakaan().setVisible(true);
            }
        });
    }
    public void MenuHome(){
        PanelHome.setVisible(true);
        buku.setVisible(false);
        member.setVisible(false);
        pinjam.setVisible(false);
        detailpinjam.setVisible(false);
    }
    public void MenuBuku(){
        PanelHome.setVisible(false);
        buku.setVisible(true);
        member.setVisible(false);
        pinjam.setVisible(false);
        detailpinjam.setVisible(false);
    }
    public void MenuMember(){
        PanelHome.setVisible(false);
        buku.setVisible(false);
        member.setVisible(true);
        pinjam.setVisible(false);
        detailpinjam.setVisible(false);
    }
    public void MenuPinjam(){
        PanelHome.setVisible(false);
        buku.setVisible(false);
        member.setVisible(false);
        pinjam.setVisible(true);
        detailpinjam.setVisible(false);
        pinjam.setDaoMember(daomember);
        pinjam.setDAOBuku(daoBuku);
    }
    public void MenuDetailPinjam(){
        PanelHome.setVisible(false);
        buku.setVisible(false);
        member.setVisible(false);
        pinjam.setVisible(false);
        detailpinjam.setVisible(true);
        detailpinjam.setDAOPinjam(daopinjam);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAplikasiPerpustakaan;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuMasterData;
    private javax.swing.JMenuItem PanelBuku;
    private javax.swing.JMenuItem PanelDetailPinjaman;
    private javax.swing.JPanel PanelHome;
    private javax.swing.JMenuItem PanelMember;
    private javax.swing.JMenuItem PanelPeminjaman;
    // End of variables declaration//GEN-END:variables
}
