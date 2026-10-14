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

public class SistemLogin {
    // Fungsi pembantu untuk mengecek apakah string mengandung angka
    public static boolean mengandungAngka(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Contoh data akun yang terdaftar di sistem untuk simulasi login
        String usernameValid = "admin";
        String passwordValid = "password123";
        
        int maxPercobaan = 3;
        boolean loginBerhasil = false;

        System.out.println("=== Sistem Login ===");

        for (int percobaan = 1; percobaan <= maxPercobaan; percobaan++) {
            System.out.println("Percobaan " + percobaan + ":");
            
            System.out.print("Username: ");
            String usernameInput = scanner.nextLine();
            
            System.out.print("Password: ");
            String passwordInput = scanner.nextLine();

            // Validasi Ketentuan 1: Username harus antara 5-10 karakter
            if (usernameInput.length() < 5 || usernameInput.length() > 10) {
                System.out.println("Login gagal! Username harus antara 5-10 karakter.");
                System.out.println();
                continue;
            }

            // Validasi Ketentuan 2: Password minimal 8 karakter dan mengandung angka
            if (passwordInput.length() < 8 || !mengandungAngka(passwordInput)) {
                System.out.println("Login gagal! Password harus minimal 8 karakter dan mengandung angka.");
                System.out.println();
                continue;
            }

            // Validasi Akun (Username dan Password terdaftar)
            if (usernameInput.equals(usernameValid) && passwordInput.equals(passwordValid)) {
                System.out.println("Login berhasil!");
                loginBerhasil = true;
                break;
            } else {
                // Jika format benar tapi salah ketik user/pass
                System.out.println("Login gagal! Password salah.");
                System.out.println();
            }

            // Jika sudah mencapai percobaan ke-3 dan masih gagal
            if (percobaan == maxPercobaan && !loginBerhasil) {
                System.out.println("Akun terkunci! Terlalu banyak percobaan gagal.");
            }
        }

        scanner.close();
    }
}