/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu1;

/**
 *
 * @author Judha Maygustya
 */

import java.util.Scanner;
public class SWANGARR {

    static double LuasPersegiPanjang(double p, double l) {
        double luas = p * l;
        return luas;
    }

    static double LuasPersegi(double s) {
        double luas = s * s;
        return luas;
    }

    static double LuasSegitiga(double a, double t) {
        double luas = ((a * t) * 5 / 10);
        return luas;
    }

    static double LuasTrapesium(double a, double b, double t) {
        double luas = (a + b) * t / 2;
        return luas;
    }

    static double LuasLingkaran(double r) {
        double luas = 22 / 7 * r * r;
        return luas;
    }

    static double KelilingLingkaran(double r) {
        double keliling = 22 / 7 * 2 * r;
        return keliling;
    }

    static double VolumePersegi(double s) {	//lom
        double volume = s * s * s;
        return volume;
    }

    static double VolumeBalok(double p, double l, double t) {
        double volume = p * l * t;
        return volume;
    }

    static double VolumePrismaSegitiga(double a, double t, double n) {	//lom
        double volume = LuasSegitiga(a, t) * n;
        return volume;
    }

    static double VolumeLimasSegitiga(double a, double t, double n) {	//lom
        double volume = LuasSegitiga(a, t) * n * 1 / 3;
        return volume;
    }

    static double VolumeLimasSegiempat(double a, double l, double t) {	//lom
        double volume = LuasPersegiPanjang(a, l) * t * 1 / 3;
        return volume;
    }

    static double VolumeKerucut(double r, double t) {	//lom
        double volume = LuasLingkaran(r) * t * 1 / 3;
        return volume;
    }

    static double VolumeTabung(double r, double t) {	//lom
        double volume = LuasLingkaran(r) * t;
        return volume;
    }

    static double VolumeBola(double r) {	//lom
        double volume = 4 / 3 * 22 / 7 * r * r * r;
        return volume;
    }

    static int Faktorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iCek = 0, iCek1 = 0, iCek2 = 0, iCek3 = 0;
        double p = 0;
        double l = 0;
        double t = 0;
        double r = 0;
        double s = 0;
        double a = 0;
        double b = 0;
        int n = 0;
        do {
            System.out.println("1. Bangun Datar");
            System.out.println("2. Bangun Ruang");
            System.out.println("3. Faktorial");
            System.out.println("4. Keluar");
            System.out.print("Pilih : ");
            iCek = sc.nextInt();
            System.out.println();

            if (iCek == 1) {
                do {
                    System.out.println("1. Luas Persegi");
                    System.out.println("2. Luas Persegi Panjang");
                    System.out.println("3. Luas LuasSegitiga");
                    System.out.println("4. Luas Lingkaran");
                    System.out.println("5. Luas Luas Trapesium");
                    System.out.println("6. Keliling Lingkaran");
                    System.out.println("7. Keluar");
                    System.out.print("Pilih : ");
                    iCek1 = sc.nextInt();
                    System.out.println();

                    if (iCek1 == 1) {
                        System.out.print("Masukkan Panjang Sisi : ");
                        s = sc.nextDouble();
                        double hasil = LuasPersegi(s);
                        System.out.println("Luas Persegi = " + hasil + "\n");
                    }
                    if (iCek1 == 2) {
                        System.out.print("Masukkan Panjang : ");
                        p = sc.nextDouble();
                        System.out.print("Masukkan Lebar : ");
                        l = sc.nextDouble();
                        double hasil = LuasPersegiPanjang(p, l);
                        System.out.println("Luas Persegi Panjang = " + hasil + "\n");
                    }
                    if (iCek1 == 3) {
                        System.out.print("Masukkan Panjang Alas : ");
                        a = sc.nextDouble();
                        System.out.print("Masukkan Tinggi : ");
                        t = sc.nextDouble();
                        double hasil = LuasSegitiga(a, t);
                        System.out.println("Luas Segitiga = " + hasil + "\n");
                    }
                    if (iCek1 == 4) {
                        System.out.print("Masukkan Panjang Sisi Atas : ");
                        a = sc.nextDouble();
                        System.out.print("Masukkan Panjang Sisi Bawah : ");
                        b = sc.nextDouble();
                        System.out.print("Masukkan Tinggi : ");
                        t = sc.nextDouble();
                        double hasil = LuasTrapesium(a, b, t);
                        System.out.println("Luas Trapesium = " + hasil + "\n");
                    }
                    if (iCek1 == 5) {
                        System.out.print("Masukkan Jari-Jari : ");
                        r = sc.nextDouble();
                        double hasil = LuasLingkaran(r);
                        System.out.println("Luas Lingkaran =  " + hasil + "\n");
                    }
                    if (iCek1 == 6) {
                        System.out.print("Masukkan Jari-Jari : ");
                        r = sc.nextDouble();
                        double hasil = KelilingLingkaran(r);
                        System.out.println("Keliling Lingkaran = " + hasil + "\n");
                    }
                } while (iCek1 != 7);
            }
            if (iCek == 2) {
                do {
                    System.out.println("1. Volume Balok");
                    System.out.println("2. Keluar");
                    System.out.print("Pilih : ");
                    iCek2 = sc.nextInt();
                    System.out.println();
                    if (iCek2 == 1) {
                        System.out.print("Masukkan Panjang : ");
                        p = sc.nextDouble();
                        System.out.print("Masukkan Lebar : ");
                        l = sc.nextDouble();
                        System.out.print("Masukkan Tinggi : ");
                        t = sc.nextDouble();
                        double hasil = VolumeBalok(p, l, t);
                        System.out.println("Volume Balok = " + hasil + "\n");
                    }
                } while (iCek2 != 2);
            }
            if (iCek == 3) {
                System.out.print("Masukkan Bilangan Bulat : ");
                n = sc.nextInt();
                int hasil = Faktorial(n);
                System.out.println("Nilai Faktorial dari " + n + "! =  " + hasil + "\n");
            }
        } while (iCek != 4);
    }
}