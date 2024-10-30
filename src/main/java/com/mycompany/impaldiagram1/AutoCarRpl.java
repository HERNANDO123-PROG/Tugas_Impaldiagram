/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.impaldiagram1;

/**
 *
 * @author F4L4H
 */
public class AutoCarRpl implements Transportasi {
    private String bahanBakar;
    private int kecepatan;
    private Setir setir;  // Association dengan Setir
    private Roda roda;    // Aggregation dengan Roda
    private Mesin mesin;  // Composition dengan Mesin

    public AutoCarRpl(String bahanBakar, int kecepatan, Mesin mesin) {
        this.bahanBakar = bahanBakar;
        this.kecepatan = kecepatan;
        this.mesin = mesin;
    }

    public void setSetir(Setir setir) {
        this.setir = setir;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

    @Override
    public void bahanBakar() {
        System.out.println("Bahan bakar: " + this.bahanBakar);
    }

    @Override
    public void kecepatan() {
        System.out.println("Kecepatan: " + this.kecepatan);
    }

    public void start(Fuel fuel) {
        System.out.println("Menggunakan bahan bakar tipe: " + fuel.getTipeBahanBakar());
        System.out.println("Mobil mulai berjalan.");
    }

    public void drive() {
        System.out.println("Mobil sedang dikendarai.");
    }

    public void tampilkanKomponen() {
        if (setir != null) setir.tampilkanSetir();
        if (roda != null) roda.tampilkanJumlahRoda();
        if (mesin != null) mesin.tampilkanTipeMesin();
    }
}