/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import model.Resep;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ammar
 */
public class CrudResep {
    private List<Resep> daftarResep = new ArrayList<>();
    
    public void catatResep(Resep resep){
        daftarResep.add(resep);
    }
        
    public void showResep(){
        if (daftarResep.isEmpty()){
            System.out.println("Tidak ada resep yang dibuat");
        }
        for (Resep r : daftarResep){
            System.out.println("ID :" + r.idResep +
                    ", ID Produk: " + r.idProduk +
                    ", ID Bahan: " + r.idBahan +
                    ", Jumlah digunakan: " + r.jumlahDigunakan +
                    ", Satuan: " + r.satuan);
        }     
    }
}
