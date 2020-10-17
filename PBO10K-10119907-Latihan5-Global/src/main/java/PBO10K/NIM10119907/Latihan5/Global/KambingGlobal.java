/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119907.Latihan5.Global;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk belajar global
 */
public class KambingGlobal {
    
    int jumlahKambing = 88;
    
    public void getJumlahKambing()
    {
        System.out.println("Jumlah Kambing : " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah : " + jumlahKambing);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        KambingGlobal kambingSusu = new KambingGlobal();
        kambingSusu.getJumlahKambing();
        
        kambingSusu.tambahKambing();
        
        kambingSusu.getJumlahKambing();
    }
    
}
