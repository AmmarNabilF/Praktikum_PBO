/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import model.Resep;

/**
 *
 * @author ammar
 */
public class CrudResep extends Crud<Resep> {
    
    public void catatResep(Resep resep){
        tambah(resep);
    }
        
    public void showResep(){
        show();
    }
//        if (storage.isEmpty()){
//            System.out.println("\nTidak ada resep yang dibuat");
//        }
//        for (Resep r : storage){
//            System.out.println("ID :" + r.getidResep() +
//                    ", ID Produk: " + r.getidProduk() +
//                    ", ID Bahan: " + r.getidBahan() +
//                    ", Jumlah digunakan: " + r.getjumlahDigunakan() +
//                    ", Satuan: " + r.getsatuan());
//        }     
//    }
}
