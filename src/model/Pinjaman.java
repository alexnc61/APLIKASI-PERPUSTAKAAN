/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Pinjaman {
    private String IDMember;
    private String IDPinjam;
    private String tglpinjam;
    private String tglbalik;
    private String ISBN;
    
    public Pinjaman() {
    }

    public Pinjaman(String IDMember, String IDPinjam, String tglpinjam, String tglbalik, String ISBN) {
        this.IDMember = IDMember;
        this.IDPinjam = IDPinjam;
        this.tglpinjam = tglpinjam;
        this.tglbalik = tglbalik;
        this.ISBN = ISBN;
    }

    public String getIDMember() {
        return IDMember;
    }

    public void setIDMember(String IDMember) {
        this.IDMember = IDMember;
    }

    public String getIDPinjam() {
        return IDPinjam;
    }

    public void setIDPinjam(String IDPinjam) {
        this.IDPinjam = IDPinjam;
    }

    public String getTglpinjam() {
        return tglpinjam;
    }

    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public String getTglbalik() {
        return tglbalik;
    }

    public void setTglbalik(String tglbalik) {
        this.tglbalik = tglbalik;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Pinjaman : " + "\nIDMember : " + IDMember + "\nIDPinjam : " + IDPinjam + "\nTanggalpinjam : " + tglpinjam + "\nTanggalbalik : " + tglbalik + "\nISBN : " + ISBN + "\n\n\n";
    }

    
    
}
