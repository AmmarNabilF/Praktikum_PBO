/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import model.Produk;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
/**
 *
 * @author ammar
 */
public class CrudProduk extends Crud<Produk> {
    
    public void simpanProduk(Produk produk){
        tambah(produk);
    }
    
    public void showProduk(){
        show();
//        if (daftarProduk.isEmpty()){
//            System.out.println("\nProduk masih kosong");
//            return;
//        }
//        for (Produk p : daftarProduk){
//            System.out.println("ID: " + p.getidProduk() +", Nama: " + p.getnamaProduk() + 
//                    ", Kategori: " + p.getkategori() + ", Harga: " + p.gethargaJual());
//        }
    }
    
    public boolean updateProduk(String id, String namaBaru, String kategoriBaru, double hargaBaru){
        for (Produk p : storage){
            if (p.getidProduk().equals(id)){
                p.setnamaProduk(namaBaru);
                p.setkategori(kategoriBaru);
                p.sethargaJual(hargaBaru);
                return true;
            }
        }
        return false;
    }
    
    @Override
    protected boolean hapus(Produk produk){
        Iterator<Produk> iterator = storage.iterator();
        while (iterator.hasNext()){
            Produk p = iterator.next();
            if (p.getidProduk().equals(produk.getidProduk())){
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    public boolean delProduk(String id){
        for (Produk p : storage){
            if (p.getidProduk().equals(id)){
                return hapus(p);
            }
        }
        return false;   
    }
}
