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
public class UjiBus1 {

    public static void main(String[] args) {
        Latihan1 busMini = new Latihan1();
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        busMini.cetak();
        System.out.println();

        busMini.penumpang = busMini.penumpang + 5;
        busMini.cetak();
        System.out.println();

        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();
        System.out.println();

        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
        System.out.println();
    }
}
