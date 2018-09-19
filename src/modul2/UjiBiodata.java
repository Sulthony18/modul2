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
public class UjiBiodata {

    public static void main(String[] args) {
        BiodataKeluarga bio = new BiodataKeluarga();

        bio.setNama("Sulthony Akbar Rizky Pambudi");
        bio.setNamaAyah("Agung Pambudi");
        bio.setNamaIbu("Tri Harini");
        bio.setNamaSaudara("Fauziah Asmi Rizky Pambudi");
        bio.setAlamat("Jl. Kapi Anala 1 15 M No.4, Malang");
        bio.setHobi("Sepak bola dan Voli");
        bio.setCita("Masuk surga terhindar dari neraka");
        bio.setTempatLahir("Malang");
        bio.setTelepon("089-563-089-0075");
        bio.setTanggalLahir("1 Februari 2003");

        System.out.println("-------------------BIODATA KELUARGA-------------------");
        System.out.println("Nama Ayah       : " + bio.getNamaAyah());
        System.out.println("Nama Ibu        : " + bio.getNamaIbu());
        System.out.println("Nama Saudara    : " + bio.getNamaSaudara());
        System.out.println("Nama Saya       : " + bio.getNama());
        System.out.println("Alamat          : " + bio.getAlamat());
        System.out.println("Tempat Lahir    : " + bio.getTempatLahir());
        System.out.println("Tanggal Lahir   : " + bio.getTanggalLahir());
        System.out.println("Hobi            : " + bio.getHobi());
        System.out.println("Cita - Cita     : " + bio.getCita());
        System.out.println("No. Telepon     : " + bio.getTelepon());

    }
}
