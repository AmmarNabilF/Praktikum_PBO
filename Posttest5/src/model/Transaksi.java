/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ammar
 */
public abstract class Transaksi {
    protected String idPemasok;
    protected String idTransaksi;
    
    public Transaksi(String idTransaksi, String idPemasok){
        this.idTransaksi = idTransaksi;
        this.idPemasok = idPemasok;
    }
    
    public abstract void cetakResi();
}
