/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ammar
 */
public class Produk {
    public String idProduk;
    public String namaProduk;
    public String kategori;
    public double hargaJual;

    public Produk(String idProduk, String namaProduk, String kategori, double hargaJual) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.kategori = kategori;
        this.hargaJual = hargaJual;
    }
    
    
    
//    public void tampilkanProduk(){
//        System.out.println("ID Produk: " + idProduk);
//        System.out.println("Nama Produk: " + namaProduk);
//        System.out.println("Kategori: " + kategori);
//        System.out.println("Harga: " + hargaJual);
//    }
}
