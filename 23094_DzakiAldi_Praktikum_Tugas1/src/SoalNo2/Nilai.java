/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalNo2;

/**
 *
 * @author RenjiRei
 */
public class Nilai {
    String nim;
    String nama;
    int nAbsen;
    int nTugas;
    int nUTS;
    int nUAS;
    double nAkhir;
    String mutu;
    
    void Nilai(String nim, String nama, int nAbsen, int nTugas, int nUTS, int nUAS){
        this.nim = nim;
        this.nama = nama;
        this.nAbsen = nAbsen;
        this.nTugas = nTugas;
        this.nUTS = nUTS;
        this.nUAS = nUAS;
    }
    
    void CetakNilai(){
        nAkhir = (nAbsen*0.1) + (nTugas*0.2) + (nUTS*0.3) + (nUAS*0.4);
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai Absen : " + nAbsen + "    [10%] = " + nAbsen*0.1);
        System.out.println("Nilai Tugas : " + nTugas + "   [20%] = " + nTugas*0.2);
        System.out.println("Nilai UTS   : " + nUTS + "    [30%] = " + nUTS*0.3);
        System.out.println("Nilai UAS   : " + nUAS + "    [40%] = " + nUAS*0.4);
        System.out.println("Nilai Akhir : " + nAkhir);
        
        if (nAkhir >= 80){
            mutu = ("A");
        }
        else if (nAkhir >= 70 && nAkhir <= 79){
            mutu = ("B");
        }
        else if (nAkhir >= 50 && nAkhir <= 69){
            mutu = ("C");
        }
        else if (nAkhir >= 30 && nAkhir <=49 ){
            mutu = ("D");
        }
        else{
            mutu = ("E");
        }
        
        System.out.println("Nilai Mutu  : " + mutu);
    }
}
