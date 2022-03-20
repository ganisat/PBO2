/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasgejala;

/**
 *
 * @author Gani
 */
public class TugasGejala {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        gejala covid = new gejala();
        covid.pertama = "hilang indra rasa";
        covid.kedua = "hilang indera penciuman" ;
        covid.ketiga = "batuk kering";
        covid.jumlah = 3;
        covid.kesimpulan = "positif";
        
        System.out.println("Gejala Pertama : " + covid.pertama);
        System.out.println("Gejala Kedua : " + covid.kedua);
        System.out.println("Gejala Ketiga : " + covid.ketiga);
        System.out.println("Gejala Jumlah : " + covid.jumlah);
        System.out.println("Gejala Kesimpulan : " + covid.kesimpulan);
        
    }
    
}
