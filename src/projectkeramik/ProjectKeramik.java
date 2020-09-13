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
public class ProjectKeramik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Keramik A");
        Keramik a = new Keramik();
        a.lantai = 1000000;
        a.ukuran = 30*30;
        a.box = 10;
        a.harga = 54000;
        a.ukuranKeramik();
        a.kebutuhanKeramik();
        
        System.out.println("Keramik B");
        Keramik b = new Keramik();
        b.lantai = 1000000;
        b.ukuran = 40*40;
        b.box = 5;
        b.harga = 65000;
        b.ukuranKeramik();
        b.kebutuhanKeramik();
  
        System.out.println("Keramik C");
        Keramik c = new Keramik();
        c.lantai = 1000000;
        c.ukuran = 40*30;
        c.box = 8;
        c.harga = 60000;
        c.ukuranKeramik();
        c.kebutuhanKeramik();
 
    }
    
}
