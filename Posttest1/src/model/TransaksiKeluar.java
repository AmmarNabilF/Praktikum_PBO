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
public class TransaksiKeluar {
    private String idKeluar;
    private String idBahan;
    private Date tanggalKeluar;
    private int jumlah;
    private String keterangan;

    public TransaksiKeluar(String idKeluar, String idBahan, Date tanggalKeluar, int jumlah, String keterangan) {
        this.idKeluar = idKeluar;
        this.idBahan = idBahan;
        this.tanggalKeluar = tanggalKeluar;
        this.jumlah = jumlah;
        this.keterangan = keterangan;
    }    
}
