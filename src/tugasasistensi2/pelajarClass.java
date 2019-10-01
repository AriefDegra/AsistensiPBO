/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasasistensi2;

/**
 *
 * @author Arief Anugrah
 */
public class pelajarClass {
    private String nip, nama;
    private double nilaiUjian1, nilaiUjian2, nilaiTugas;
    
public pelajarClass(){
    this.nip = "0";
    this.nama = "Anonim";
    this.nilaiUjian1 = 0;
    this.nilaiUjian2 = 0;
    this.nilaiTugas = 0;
}
public pelajarClass(String ni, String na, double nu1, double nu2, double nt){
    this.nip = ni;
    this.nama = na;
    this.nilaiUjian1 = nu1;
    this.nilaiUjian2 = nu2;
    this.nilaiTugas = nt;  
}
public void setNrp(String ni){
    this.nip = ni;
}
public void setNama(String na){
    this.nama = na;
}
public void setUjian1(double nu1){
    this.nilaiUjian1 = nu1;
}
public void setUjian2(double nu2){
    this.nilaiUjian2 = nu2;
}
public void setTugas(double nt){
    this.nilaiTugas = nt;
}
public String getNrp(){
    return nip;
}
public String getNama(){
    return nama;
}
public double getUjian1(){
    return nilaiUjian1;
}
public double getUjian2(){
    return nilaiUjian2;
}
public double getTugas(){
    return nilaiTugas;
}
public double nilaiAkhir(){
    double nA;
    nA = (0.4)*this.nilaiUjian1 + (0.4)*this.nilaiUjian2 + (0.2)*this.nilaiTugas;
    return nA;
}
public String isLulus(){
    if(nilaiAkhir()>60)
        return "lulus";
    else
        return "Tidak lulus";
}
public void status(){
    System.out.println("Nrp \t\t\t\t: "+getNrp());
    System.out.println("Nama pelajar \t\t\t: "+getNama());
    System.out.println("Nilai Ujian 1 \t\t\t: "+getUjian1());
    System.out.println("Nilai Ujian 2 \t\t\t: "+getUjian2());
    System.out.println("Nilai Tugas \t\t\t: "+getTugas());
    System.out.println("Status pelajar tersebut adalah \t: "+isLulus());
}
}
