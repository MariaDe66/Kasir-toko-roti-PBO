/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nads.kasirtokoroti;

/**
 *
 * @author Premio
 */
public class ItemTransaksi {
private Item item;
private int jumlah;

public ItemTransaksi(Item item, int jumlah) {
    this.item = item;
    this.jumlah = jumlah;
}

public Item getItem() {
    return item;
}

public int getJumlah() {
    return jumlah;
}

public void tambahJumlah(int jumlah) {
    if (jumlah > 0) {
        this.jumlah += jumlah;
    }
}

public int hitungSubtotal() {
    return item.getHarga() * jumlah;
}

}
