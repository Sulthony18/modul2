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
public class TugasPraktikum1 {

    public int penumpang;
    public int maxpenumpang;
    private double average;
    private double jumlahBerat, jumlahPenumpang;

    public TugasPraktikum1(int maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }

    public void addpenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp > maxpenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }
    }

    public void getpenumpang(int password) {
        if (password == 24) {
            System.out.println("Password benar");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Password salah");
        }
    }

    public void cetakpenumpang() {
        System.out.println("Penumpang bus sekarang = " + penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adlah = " + maxpenumpang);
    }

    public double getAverage() {
        average = jumlahBerat / jumlahPenumpang;
        return average;
    }

    public int getPenumpang() {
        return penumpang;
    }

    public int getMaxpenumpang() {
        return maxpenumpang;
    }

    public double getJumlahBerat() {
        return jumlahBerat;
    }

    public double getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public void setPenumpang(int penumpang) {
        this.penumpang = penumpang;
    }

    public void setMaxpenumpang(int maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void setJumlahBerat(double jumlahBerat) {
        this.jumlahBerat = jumlahBerat;
    }

    public void setJumlahPenumpang(double jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }
}
