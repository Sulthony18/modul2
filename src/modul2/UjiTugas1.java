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
public class UjiTugas1 {

    public static void main(String[] args) {

        TugasPraktikum1 Bus = new TugasPraktikum1(5);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
        System.out.println();

        Bus.addpenumpang(2);
        Bus.cetakpenumpang();
        System.out.println();

        Bus.addpenumpang(1);
        Bus.cetakpenumpang();
        System.out.println();

        Bus.addpenumpang(2);
        Bus.cetakpenumpang();
        System.out.println();

        Bus.addpenumpang(2);
        Bus.cetakpenumpang();
        System.out.println();

        Bus.setJumlahBerat(10);
        Bus.setJumlahPenumpang(5);
        Bus.getAverage();
        System.out.println("rata rata berat penumpang adalah : " + Bus.getAverage());

    }
}
