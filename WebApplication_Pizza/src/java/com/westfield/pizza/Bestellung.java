/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.westfield.pizza;

/**
 *
 * @author jwest
 */
public class Bestellung {
    
    private int menge;
    private int position;
    private String sorte;

    public String getSorte() {
        return sorte;
    }

    public void setSorte(String sorte) {
        this.sorte = sorte;
        System.out.println("Bestellung: sorte gesetzt - " + this.sorte);
    }
    
    

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
        System.out.println("Bestellung: menge gesetzt - " + this.menge);
    }

   
}