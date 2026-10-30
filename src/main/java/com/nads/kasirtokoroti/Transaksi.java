/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nads.kasirtokoroti;

/**
 *
 * @author Premio
 */
import java.util.ArrayList;
import java.util.List;

public class Transaksi {
private List<ItemTransaksi> keranjang;

public Transaksi() {
    keranjang = new ArrayList<>();
}

public void tambahItem(Item item, int jumlah) {
    if (item == null || jumlah <= 0) {
        System.out.println("Item atau jumlah tidak valid.");
        return;
    }

    for (ItemTransaksi data : keranjang) {
        if (data.getItem() == item) {
            data.tambahJumlah(jumlah);
            return;
        }
    }

    keranjang.add(new ItemTransaksi(item, jumlah));
}

public boolean isKosong() {
    return keranjang.isEmpty();
}

public int hitungTotal() {
    int total = 0;

    for (ItemTransaksi data : keranjang) {
        total += data.hitungSubtotal();
    }

    return total;
}

public void tampilkanKeranjang() {
    System.out.println("\n========== DAFTAR BELANJA ==========");
    System.out.printf("%-20s %-8s %-12s%n",
            "Nama", "Jumlah", "Subtotal");

    for (ItemTransaksi data : keranjang) {
        System.out.printf("%-20s %-8d Rp%,d%n",
                data.getItem().getNama(),
                data.getJumlah(),
                data.hitungSubtotal());
    }

    System.out.println("------------------------------------");
    System.out.printf("TOTAL: Rp%,d%n", hitungTotal());
}

}

