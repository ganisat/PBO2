/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak2;



import java.util.Scanner;

/**
 *
 * @author Gani
 */
public class Prak2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner baru = new Scanner (System.in);
      	 Mobil  mobilku = new Mobil();
         System.out.print("Masukan Wrna : ");
         mobilku.warna = baru.nextLine();
	 System.out.print("Masukan Tahun : ");
         mobilku.tahunProduksi = baru.nextInt();
         System.out.println("Warna: " + mobilku.warna);
	 System.out.println("Tahun: " + mobilku.tahunProduksi);

    }
    
}
