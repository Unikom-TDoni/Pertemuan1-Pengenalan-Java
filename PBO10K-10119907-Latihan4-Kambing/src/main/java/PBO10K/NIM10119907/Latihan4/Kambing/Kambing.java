/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119907.Latihan4.Kambing;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk belajar class
 */
public class Kambing {

    public void tambahKambing()
    {
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah : " + jumlahKambing);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
        // TODO code application logic here
    }
    
}
