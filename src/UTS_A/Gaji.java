/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS.A;

/**
 *
 * @author Melida Sari
 */
public class Gaji {
    private String NIP;
    private String nama;
    private String golongan;
    private int gaji_Pokok;
    private int tunjangan;
    private int total;

    public Gaji(String nip, String nama, String golongan) {
        this.NIP = nip;
        this.nama = nama;
        this.golongan = golongan;
        this.gaji_Pokok = hitungGajiPokok(golongan);
        this.tunjangan = hitungTunjangan(gaji_Pokok);
        this.total = gaji_Pokok + tunjangan;
    }

    public String getNip() {
        return NIP;
    }

    public String getNama() {
        return nama;
    }

    public String getGolongan() {
        return golongan;
    }

    public int getGajiPokok() {
        return gaji_Pokok;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public int getTotal() {
        return total;
    }

    public int hitungGajiPokok(String golongan) {
        int gajiPokok = 0;
        switch (golongan) {
            case "3A":
                gajiPokok = 1000000;
                break;
            case "3B":
                gajiPokok = 2000000;
                break;
            case "3C":
                gajiPokok = 3000000;
                break;
            default:
                System.out.println("Golongan tidak valid.");
        }
        return gajiPokok;
    }

    public int hitungTunjangan(int gajiPokok) {
        return (int) (0.05 * gajiPokok);
    }
    public static void main(String[] args) {
        Gaji karyawan1 = new Gaji("2201082008", "Melida Sari", "3C");
        System.out.println("NIP: " + karyawan1.getNip());
        System.out.println("Nama: " + karyawan1.getNama());
        System.out.println("Golongan: " + karyawan1.getGolongan());
        System.out.println("Gaji Pokok: " + karyawan1.getGajiPokok());
        System.out.println("Tunjangan: " + karyawan1.getTunjangan());
        System.out.println("Total: " + karyawan1.getTotal());
    }
}
