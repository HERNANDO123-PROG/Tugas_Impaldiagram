/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.impaldiagram1;

/**
 *
 * @author F4L4H
 */
public class Mesin {
    private String tipeMesin;

    public Mesin(String tipeMesin) {
        this.tipeMesin = tipeMesin;
    }

    public void tampilkanTipeMesin() {
        System.out.println("Tipe mesin: " + this.tipeMesin);
    }
}
