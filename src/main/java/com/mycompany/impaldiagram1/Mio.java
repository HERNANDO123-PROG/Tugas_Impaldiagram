/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.impaldiagram1;

/**
 *
 * @author F4L4H
 */
public class Mio extends AutoCarRpl {

    public Mio(String bahanBakar, int kecepatan, Mesin mesin) {
        super(bahanBakar, kecepatan, mesin);
    }

    @Override
    public void start(Fuel fuel) {
        System.out.println("Mio menggunakan bahan bakar tipe: " + fuel.getTipeBahanBakar());
        System.out.println("Mio mulai berjalan dengan gaya.");
    }

    @Override
    public void drive() {
        System.out.println("Mio sedang dikendarai dengan cepat.");
    }
}
