/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nads.kasirtokoroti;

/**
 *
 * @author Premio
 */
import java.util.Scanner;

public class Kasirtokoroti {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Item[] daftarRoti = {
        new Roti("Roti Lapis Cokelat", 27000),
        new Roti("Roti Brownies Keju", 25000),
        new Roti("Roti Gulung", 20000),
        new Roti("Donat", 4000),
        new Roti("Croissant", 10000)
    };

    Transaksi transaksi = new Transaksi();

    System.out.println("==================================");
    System.out.println("       KASIR TOKO ROTI");
    System.out.println("==================================");

    boolean belanja = true;

    while (belanja) {
        System.out.println("\nDAFTAR MENU ROTI:");

        for (int i = 0; i < daftarRoti.length; i++) {
            System.out.printf("%d. %-20s Rp%,d%n",
                    i + 1,
                    daftarRoti[i].getNama(),
                    daftarRoti[i].getHarga());
        }

        System.out.println("0. Selesai memilih");
        System.out.print("Pilih nomor roti: ");

        if (!input.hasNextInt()) {
            System.out.println("Input harus berupa angka.");
            input.next();
            continue;
        }

        int pilihan = input.nextInt();

        if (pilihan == 0) {
            belanja = false;
            continue;
        }

        if (pilihan < 1 || pilihan > daftarRoti.length) {
            System.out.println("Pilihan tidak tersedia.");
            continue;
        }

        System.out.print("Masukkan jumlah: ");

        if (!input.hasNextInt()) {
            System.out.println("Jumlah harus berupa angka.");
            input.next();
            continue;
        }

        int jumlah = input.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah harus lebih dari 0.");
            continue;
        }

        transaksi.tambahItem(daftarRoti[pilihan - 1], jumlah);
        System.out.println("Roti berhasil ditambahkan.");
    }

    if (transaksi.isKosong()) {
        System.out.println("\nTidak ada transaksi.");
        input.close();
        return;
    }

    transaksi.tampilkanKeranjang();

    int total = transaksi.hitungTotal();
    int pembayaran;

    while (true) {
        System.out.print("\nMasukkan uang pembayaran: Rp");

        if (!input.hasNextInt()) {
            System.out.println("Pembayaran harus berupa angka.");
            input.next();
            continue;
        }

        pembayaran = input.nextInt();

        if (pembayaran < total) {
            System.out.println("Uang kurang Rp"
                    + String.format("%,d", total - pembayaran));
        } else {
            break;
        }
    }

    int kembalian = pembayaran - total;

    System.out.println("\n========== STRUK PEMBAYARAN ==========");
    transaksi.tampilkanKeranjang();
    System.out.printf("Pembayaran : Rp%,d%n", pembayaran);
    System.out.printf("Kembalian  : Rp%,d%n", kembalian);
    System.out.println("Terima kasih telah berbelanja have a nice day!");
    System.out.println("======================================");

    input.close();
}

}
