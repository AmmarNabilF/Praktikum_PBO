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
public class TransaksiMasuk {
    private String idMasuk;
    private String idBahan;
    private String idPemasok;
    private Date tanggalMasuk;
    private int jumlah;
    private double hargaUnit;

    public TransaksiMasuk(String idMasuk, String idBahan, String idPemasok, Date tanggalMasuk, int jumlah, double hargaUnit) {
        this.idMasuk = idMasuk;
        this.idBahan = idBahan;
        this.idPemasok = idPemasok;
        this.tanggalMasuk = tanggalMasuk;
        this.jumlah = jumlah;
        this.hargaUnit = hargaUnit;
    }
}
