/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nads.kasirtokoroti;

/**
 *
 * @author Premio
 */
public class Roti extends Item {

public Roti(String nama, int harga) {
    super(nama, harga);
}

@Override
public String getKategori() {
    return "Roti";
}

}
