/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Member {
    private String id;
    private String nama;
    private String alamat;
    private String kontak;
    private String tanggallahir;
    private boolean status;

    public Member() {
    }

    public Member(String id, String nama, String alamat, String kontak, String tanggallahir, boolean status) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.kontak = kontak;
        this.tanggallahir = tanggallahir;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    public String getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(String tanggallahir) {
        this.tanggallahir = tanggallahir;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Member{" + "id=" + id + ", nama=" + nama + ", alamat=" + alamat + ", kontak=" + kontak + ", tanggallahir=" + tanggallahir + ", status=" + status + '}';
    }
    
    
}
