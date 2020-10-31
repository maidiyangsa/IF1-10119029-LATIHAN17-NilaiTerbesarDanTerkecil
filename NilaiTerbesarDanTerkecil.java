/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaiterbesardanterkecil;
import java.util.*;
/**
 *
 * @author Beta Three
 * NAMA         : Adrian Maidiyangsa
 * KELAS        : IF-1
 * NIM          : 10119029
 * Deskripsi Program : Program ini berisi program menentukan nilai terbesar dan terkecil, program ini dibuat sendiri
 * dan dibantu oleh sumber-sumber yang ada diinternet
 */
public class NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here        
        int nilai[];
        String petugas;
    
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nama Petugas : ");
        petugas = scan.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");        
        int jumlah = scan.nextInt();
        nilai = new int[jumlah];
        for(int i = 0; i < jumlah; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" = ");
            nilai[i] = scan.nextInt();
        }      
    
        int nilaiTerkecil = nilai[0];
        for(int x : nilai){
            if(nilaiTerkecil > x){
                nilaiTerkecil = x;
            }            
        }      
    
        int nilaiTerbesar = nilai[0]; 
        for(int x : nilai){           
           if(nilaiTerbesar < x){
                nilaiTerbesar = x;
           }            
        }
    
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        int num = 1;
        for(int x : nilai){
            System.out.println("Nilai Mahasiswa ke-"+num+" = "+x);
            num++;
        }
        System.out.println("Nilai Terbesar adalah "+nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah "+nilaiTerkecil);
        System.out.println("Petugas : "+petugas);
    }
    
}