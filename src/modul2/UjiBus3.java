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
public class UjiBus3 {

    public static void main(String[] args) {
        Latihan4 Bus = new Latihan4(5);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();

        Bus.addpenumpang(2);
        Bus.cetakpenumpang();

        Bus.addpenumpang(1);
        Bus.cetakpenumpang();

        Bus.addpenumpang(2);
        Bus.cetakpenumpang();

        Bus.addpenumpang(2);
        Bus.cetakpenumpang();

    }

}
