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
        Latihan3 siswa = new Latihan3();
        siswa.setNama("Sulthony Akbar Rizky Pambudi");
        siswa.setAbsen(38);
        siswa.setAlamat("Jl. Kapi Anala 1 15 M No.4, Malang");

        System.out.println("---------------NAMA SISWA---------------" + "\n" + "\nNama   : "
                + siswa.getNama() + "\nAbsen  : " + siswa.getAbsen() + "\nAlamat : "
                + siswa.getAlamat());

    }
}
