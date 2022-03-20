/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihansoal2;

/**
 *
 * @author Gani
 */
public class LatihanSoal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buah buahku = new Buah();
        buahku.petik = "sudah matang !";
        buahku.kupas = "hilangkan kulitnya";
        buahku.potong = "silakan di makan";
        System.out.println("dipetik karena : "+buahku.petik);
        System.out.println("dikupas : "+buahku.kupas);
        System.out.println("dipotong : "+buahku.potong);
    }
    
}
