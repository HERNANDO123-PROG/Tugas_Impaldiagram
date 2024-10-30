/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.impaldiagram1;

/**
 *
 * @author F4L4H
 */
public class Impaldiagram1 {

    public static void main(String[] args) {
          // Membuat objek Mesin untuk komposisi
        Mesin mesin = new Mesin("Mesin Bensin");

        // Membuat objek AutoCarRpl
        AutoCarRpl car = new AutoCarRpl("Bensin", 100, mesin);
        
        // Menambahkan Setir (Association)
        Setir setir = new Setir();
        car.setSetir(setir);
        
        // Menambahkan Roda (Aggregation)
        Roda roda = new Roda(4);
        car.setRoda(roda);

        // Membuat objek Fuel sebagai dependency
        Fuel fuel = new Fuel("Pertamax");
        
        car.bahanBakar();
        car.kecepatan();
        car.start(fuel);  // Menggunakan fuel sebagai dependency
        car.drive();
        car.tampilkanKomponen();

        System.out.println("----");

        // Membuat objek Mio sebagai subclass AutoCarRpl
        Mio mio = new Mio("Bensin", 80, mesin);
        mio.start(fuel);  // Menggunakan fuel sebagai dependency
        mio.setRoda(roda);
        mio.drive();
        mio.bahanBakar();
        mio.kecepatan();
        mio.tampilkanKomponen();
    }
}

