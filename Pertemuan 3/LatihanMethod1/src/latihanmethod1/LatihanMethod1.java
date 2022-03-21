/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmethod1;

import java.util.Scanner;

/**
 *
 * @author Gani
 */
public class LatihanMethod1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sepeda sep =new sepeda();
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Kecepatan Anda : ");
        sep.kec=sc.nextInt();
        System.out.println("Masukan Gear Anda : ");
        sep.gir=sc.nextInt();
        sep.tambahkec(20);
        sep.tambahgir(10);
        
        
        
        
        
        
    }
    
}
