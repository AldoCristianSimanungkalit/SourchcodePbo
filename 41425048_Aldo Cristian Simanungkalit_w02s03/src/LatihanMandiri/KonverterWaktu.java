/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanMandiri;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class KonverterWaktu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Konverter Waktu ===");
            System.out.println("1. Detik ke HH:MM:SS");
            System.out.println("2. HH:MM:SS ke detik");
            System.out.println("3. Keluar");
            
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan sisa baris

            switch (pilihan) {
                case 1:
                    // Konversi Detik ke HH:MM:SS
                    System.out.print("Masukkan jumlah detik: ");
                    long totalDetik = scanner.nextLong();
                    
                    long jam = totalDetik / 3600;
                    long sisaDetik = totalDetik % 3600;
                    long menit = sisaDetik / 60;
                    long detik = sisaDetik % 60;
                    
                    // Format output agar menjadi 2 digit (misal: 01:01:05)
                    System.out.printf("Hasil: %02d:%02d:%02d\n", jam, menit, detik);
                    break;

                case 2:
                    // Konversi HH:MM:SS ke detik
                    System.out.print("Masukkan waktu (HH:MM:SS): ");
                    String waktuInput = scanner.nextLine();
                    
                    // Memecah string berdasarkan tanda titik dua (:)
                    String[] bagianWaktu = waktuInput.split(":");
                    if (bagianWaktu.length == 3) {
                        try {
                            int h = Integer.parseInt(bagianWaktu[0].trim());
                            int m = Integer.parseInt(bagianWaktu[1].trim());
                            int s = Integer.parseInt(bagianWaktu[2].trim());
                            
                            long hasilDetik = (h * 3600L) + (m * 60L) + s;
                            System.out.println("Hasil: " + hasilDetik + " detik");
                        } catch (NumberFormatException e) {
                            System.out.println("Format waktu tidak valid!");
                        }
                    } else {
                        System.out.println("Format harus menggunakan HH:MM:SS!");
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 3);

        scanner.close();
    }
}

