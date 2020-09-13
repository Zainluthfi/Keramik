/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkeramik;

/**
 *
 * @author zainn
 */
public class Keramik {
    /* atribut */
    int lantai;
    int ukuran;
    int box;
    int harga;
    
    /* method */
    void ukuranKeramik(){
        int luas;
        luas = this.ukuran * this.box;
        System.out.println("Luas total keramik: " + luas + " cm^2");
    }
    
    void kebutuhanKeramik(){
        int total;
        total = this.lantai / this.ukuran / this.box ;
        System.out.println("box keramik: " + total + " box dengan harga Rp " + harga*total + ",00" );
    }
        
    }
        
    
