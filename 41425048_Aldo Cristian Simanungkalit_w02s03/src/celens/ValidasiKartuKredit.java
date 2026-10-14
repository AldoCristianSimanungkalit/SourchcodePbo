/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celens;

import java.util.Scanner;

/**
 *
 * @author User
 */

public class ValidasiKartuKredit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nomor kartu: ");
        String nomor = scanner.nextLine();
        
        // Hapus tanda hubung (-) untuk memeriksa digit angka
        String bersih = nomor.replace("-", "");
        
        // Cek apakah panjang digitnya persis 16
        if (bersih.length() != 16 || !bersih.matches("\\d+")) {
            System.out.println("Nomor kartu tidak valid!");
            System.out.println("Harus terdiri dari 16 digit angka.");
        } else {
            // Cek digit pertama apakah 4, 5, atau 6
            char awal = bersih.charAt(0);
            if (awal == '4' || awal == '5' || awal == '6') {
                // Cek format tanda hubung jika ada
                boolean formatValid = true;
                if (nomor.contains("-")) {
                    // Validasi format penempatan tanda hubung tiap 4 digit (XXXX-XXXX-XXXX-XXXX)
                    formatValid = nomor.matches("^\\d{4}-\\d{4}-\\d{4}-\\d{4}$");
                }
                
                if (formatValid) {
                    System.out.println("Nomor kartu valid.");
                } else {
                    System.out.println("Nomor kartu tidak valid!");
                    System.out.println("Format tanda hubung harus setiap 4 digit.");
                }
            } else {
                System.out.println("Nomor kartu tidak valid!");
                System.out.println("Harus dimulai dengan 4, 5, atau 6.");
            }
        }
        
        scanner.close();
    }
}
