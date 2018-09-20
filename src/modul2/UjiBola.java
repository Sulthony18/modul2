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
public class UjiBola {

    public static void main(String[] args) {
        Bola bola = new Bola();
        bola.setR(20);

        System.out.println("-------------LUAS BOLA------------");
        System.out.println();

        System.out.println("Jari jari Bola adalah      : " + bola.getR());
        bola.getD();
        System.out.println("Diameter Bola adalah       : " + bola.getD());

        bola.getLp();
        System.out.println("Luas Permukaan Bola adalah : " + bola.getLp());

        bola.getV();
        System.out.println("Volume Bola adalah         : " + bola.getV());
    }
}
