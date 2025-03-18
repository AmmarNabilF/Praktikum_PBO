/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ammar
 */
public class Resep {
    public String idResep;
    public String idProduk;
    public String idBahan;
    public int jumlahDigunakan;
    public String satuan;

    public Resep(String idResep, String idProduk, String idBahan, int jumlahDigunakan, String satuan) {
        this.idResep = idResep;
        this.idProduk = idProduk;
        this.idBahan = idBahan;
        this.jumlahDigunakan = jumlahDigunakan;
        this.satuan = satuan;
    }
}
