/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.util.ArrayList;
import java.util.List;
//import java.util.Iterator;
        

/**
 *
 * @author ammar
 */
public class Crud<daftar> {
    protected List<daftar> storage = new ArrayList<>();
    
    protected void tambah(daftar item){
        storage.add(item);
    }
    
    protected void show(){
        if (storage.isEmpty()){
            System.out.println("\nItem kosong");
        }
        for (daftar item: storage){
            System.out.println(item);
        }
    }
    
    protected boolean hapus(daftar item){
        if (storage.contains(item)){
            storage.remove(item);
            return true;
        }
        else {
            return false;
        }
    }
    

    
}
