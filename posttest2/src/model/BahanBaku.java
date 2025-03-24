/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author ammar
 */
public class BahanBaku {
    private String idBahan;
    private String namaBahan;
    private String kategori;
    private int stok;
    private String satuan;
    private Date tanggalexp;
    
    public String getidBahan() {
        return this.idBahan;
    }
    
    public String getnamaBahan() {
        return this.namaBahan;
    }
    
    public String getkategori() {
        return this.kategori;
    }
    
    public int getstok() {
        return this.stok;
    }
    
    public String getsatuan() {
        return this.satuan;
    }
    
    public Date gettanggalexp() {
        return this.tanggalexp;
    }
    
    
    public BahanBaku(String idBahan, String namaBahan, String kategori, int stok, String satuan, Date tanggalexp){
        this.idBahan = idBahan;
        this.namaBahan = namaBahan;
        this.kategori = kategori;
        this.stok = stok;
        this.satuan = satuan;
        this.tanggalexp = tanggalexp;
    }
    
    public String setidBahan(String idb){
        return this.idBahan = idb;
    }
    
    
//    public void tampilkanBahan(){
//        System.out.println("ID Bahan: " + idBahan);
//        System.out.println("Nama Bahan: " + namaBahan);
//        System.out.println("Kategori: " + kategori);
//        System.out.println("Stok: " + stok);
//        System.out.println("Harga satuan: " + satuan);
//        System.out.println("Gunakan sebelum: " + tanggalexp);
//    }
}
