/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import model.BahanBaku;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ammar
 */
public class CrudBahan {
    private List<BahanBaku> daftarBahan = new ArrayList<>();
    
    public void tambahBahan(BahanBaku bahanBaru) {
        daftarBahan.add(bahanBaru);
    }
    
    public void showBahan(){
        if (daftarBahan.isEmpty()){
            System.out.println("\nBahan baku kosong");
        }
        for (BahanBaku b : daftarBahan){
            System.out.println("ID: " + b.getidBahan() +
                    ", Nama: " + b.getnamaBahan() + 
                    ", Kategori: " + b.getkategori() + 
                    ", Stok: " + b.getstok() +
                    ", Satuan: " + b.getsatuan() + 
                    ",Tanggal Expired: " + b.gettanggalexp());
        }
    }
    
    public boolean delBahan(String id){
        return daftarBahan.removeIf(b -> b.setidBahan(id).equals(id));
    }
    
//    public List<BahanBaku> remvBahan(){
//        
//    }
//        System.out.println("Daftar bahan baku");
    
//    public BahanBaku[] getAllBahan() {
//        return daftarBahan;
//    }
}
