/*
Nim : 41425048    
Nama : Aldo Cristian Simanungkalit
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Celens;

import java.util.Scanner;

/**
 *
 * @author User
 */

public class AnalisisTeks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan kata atau kalimat: ");
        String input = scanner.nextLine();
        
        // Membersihkan spasi dan mengubah ke huruf kecil agar pengecekan akurat
        String bersih = input.replaceAll("\\s+", "").toLowerCase();
        
        // Cek Palindrome (membalik string)
        String dibalik = new StringBuilder(bersih).reverse().toString();
        boolean isPalindrome = bersih.equals(dibalik);
        
        // Menghitung jumlah huruf vokal (a, i, u, e, o)
        int jumlahVokal = 0;
        for (int i = 0; i < bersih.length(); i++) {
            char c = bersih.charAt(i);
            if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') {
                jumlahVokal++;
            }
        }
        
        // Tampilkan Hasil
        System.out.println("\n--- Hasil Analisis ---");
        if (isPalindrome) {
            System.out.println("Status: Kata tersebut adalah Palindrome.");
        } else {
            System.out.println("Status: Kata tersebut bukan Palindrome.");
        }
        System.out.println("Jumlah huruf vokal: " + jumlahVokal);
        
        scanner.close();
    }
}
