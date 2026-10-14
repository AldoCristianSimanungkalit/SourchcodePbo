
/*
Nim : 41425048    
Nama : Aldo Cristian Simanungkalit
*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasB;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class login {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String username = input.nextLine();

        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        // Mengecek password minimal 6 karakter
        // dan mengandung angka
        boolean adaAngka = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                adaAngka = true;
                break;
            }
        }

        if (username.equals("admin") && password.length() >= 6 && adaAngka) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal! Password tidak valid.");
        }

        input.close();
    }
    
}
