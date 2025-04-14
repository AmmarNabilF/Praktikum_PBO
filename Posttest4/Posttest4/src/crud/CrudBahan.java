/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import model.BahanBaku;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
/**
 *
 * @author ammar
 */
public class CrudBahan extends Crud<BahanBaku> {
    
    public void tambahBahan(BahanBaku bahanBaru) {
        tambah(bahanBaru);
    }

    public void showBahan(){
        show();
//        if (storage.isEmpty()){
//            System.out.println("\nBahan baku kosong");
//        }
//        for (BahanBaku b : storage){
//            System.out.println("ID: " + b.getidBahan() +
//                    ", Nama: " + b.getnamaBahan() + 
//                    ", Kategori: " + b.getkategori() + 
//                    ", Stok: " + b.getstok() +
//                    ", Satuan: " + b.getsatuan() + 
//                    ",Tanggal Expired: " + b.gettanggalexp());
//        }
    }
    
    @Override
    protected boolean hapus(BahanBaku bahan){
        Iterator<BahanBaku> iterator = storage.iterator();
        while (iterator.hasNext()){
            BahanBaku b = iterator.next();
            if (b.getidBahan().equals(bahan.getidBahan())){
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    public boolean delBahan(String id){
        for (BahanBaku b : storage){
            if (b.getidBahan().equals(id)){
                return hapus(b);
            }
        }
        return false;   
    }
    
}
