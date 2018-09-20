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
public class Bola {

    private double r, d, lp, v;

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        r = 20;
        return r;
    }

    public double getD() {
        d = r + r;
        return d;
    }

    public double getLp() {
        lp = 4 * Math.PI * r * r;
        return lp;
    }

    public double getV() {
        v = (4 * Math.PI * r * r * r) / 3;
        return v;
    }

}
