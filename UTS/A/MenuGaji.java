/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS.A;

/**
 *
 * @author Melida Sari
 */
import java.io.BufferedReader;
import java.util.Scanner;
public class MenuGaji {
    private String nip;
    private String nama;
    private String golongan;
    private int gajiPokok;
    private int tunjangan;
    private int total;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;
    try {
        while (pilihan != 5) {
            System.out.println("=========== MENU ===========");
            System.out.println("1. Memasukkan data");
            System.out.println("2. Menghapus data");
            System.out.println("3. Menampilkan seluruh data");
            System.out.println("4. Update data");
            System.out.println("5. Keluar");
            System.out.print("Masukkan Pilihan Kamu : ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIP: ");
                    String nip = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Golongan: ");
                    String golongan = scanner.nextLine();
                    break;
                case 2:
                    System.out.print("NIP: ");
                    nip = scanner.nextLine();
                    break;
                case 3:
                    break;
                case 4:
                    System.out.print("NIP: ");
                    nip = scanner.nextLine();
                    System.out.print("Golongan: ");
                    golongan = scanner.nextLine();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }


        }

      
    } catch (Exception ex) {
        
    }
   }
}
    