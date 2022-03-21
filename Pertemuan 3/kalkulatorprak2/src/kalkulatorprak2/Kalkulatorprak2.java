/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorprak2;

import java.util.Scanner;

/**
 *
 * @author Gani
 */
public class Kalkulatorprak2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mesin op = new mesin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Pertamabahan : ");
        op.a=sc.nextInt();
        System.out.println("Masukan pengurangan : ");
        op.b=sc.nextInt();
        System.out.println("Masukan Pertkalian : ");
        op.c=sc.nextInt();
        System.out.println("Masukan Pembagian : ");
        op.d=sc.nextInt();
        
        
        op.tambah(20);
        op.kurang(5);
        op.kali(20);
        op.bagi(5);
        
    }
    
    
}
