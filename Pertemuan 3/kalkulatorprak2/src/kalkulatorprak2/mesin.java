/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorprak2;

/**
 *
 * @author Gani
 */
public class mesin {
    int a;
    int b;
    int c;
    int d;
    
    void tambah(int tambahbil){
    a=a+tambahbil;
    System.out.println("Pertambahan :"+a);
    }
    
    void kurang (int kurangbil){
    b=b-kurangbil;
    System.out.println("Perkurangan : "+b);
    }
    
    void kali (int kalibil){
    c=c*kalibil;
    System.out.println("Pembagian : "+c);
    }
    
    void bagi (int bagibil){
    d=d/bagibil;
    System.out.println("Pembagian : "+d);
    }
}
