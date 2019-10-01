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
public class pelajarMain {
    public static void main(String[] args) {
        pelajarClass p1 = new pelajarClass();
        p1.setNrp("06111840000077");
        p1.setNama("Anugrah Arief Yahya Lubis");
        p1.setUjian1(90);
        p1.setUjian2(85);
        p1.setTugas(95);
        p1.status();
    }
}
