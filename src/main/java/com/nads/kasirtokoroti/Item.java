/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nads.kasirtokoroti;

/**
 *
 * @author Premio
 */
public abstract class Item {
private String nama;
private int harga;


public Item(String nama, int harga) {
    this.nama = nama;
    this.harga = harga;
}

public String getNama() {
    return nama;
}

public int getHarga() {
    return harga;
}

public abstract String getKategori();

public void tampilkanInfo() {
    System.out.printf("%-20s Rp%,d%n", nama, harga);
}
}