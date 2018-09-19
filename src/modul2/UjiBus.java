/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

/**
 *
 * @author ASUS
 */
public class UjiBus {

    public static void main(String[] args) {
        Latihan1 busTayo = new Latihan1();
        busTayo.penumpang = 5;
        busTayo.maxPenumpang = 15;
        busTayo.cetak();
        System.out.println();

        busTayo.penumpang = busTayo.penumpang + 5;
        busTayo.cetak();
        System.out.println();

        busTayo.penumpang = busTayo.penumpang - 2;
        busTayo.cetak();
        System.out.println();

        busTayo.penumpang = busTayo.penumpang + 8;
        busTayo.cetak();
        System.out.println();
    }
}
