/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import model.Produk;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ammar
 */
public class CrudProduk {
    private List<Produk> daftarProduk = new ArrayList<>();
    
    public void simpanProduk(Produk produk){
        daftarProduk.add(produk);
    }
    
    public void showProduk(){
        if (daftarProduk.isEmpty()){
            System.out.println("Produk masih kosong");
            return;
        }
        for (Produk p : daftarProduk){
            System.out.println("ID: " + p.idProduk +", Nama: " + p.namaProduk + 
                    ", Kategori: " + p.kategori + ", Harga: " + p.hargaJual);
        }
    }
    
    public boolean updateProduk(String id, String namaBaru, String kategoriBaru, double hargaBaru){
        for (Produk p : daftarProduk){
            if (p.idProduk.equals(id)){
                p.namaProduk = namaBaru;
                p.kategori = kategoriBaru;
                p.hargaJual = hargaBaru;
                return true;
            }
        }
        return false;
    }
    
    public boolean delProduk(String id){
        return daftarProduk.removeIf(p -> p.idProduk.equals(id));
    }
}
