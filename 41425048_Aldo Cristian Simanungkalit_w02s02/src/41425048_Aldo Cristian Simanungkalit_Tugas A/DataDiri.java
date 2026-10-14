/*
Nim : 41425048    
Nama : Aldo Cristian Simanungkalit
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IdentitasMahasiswa;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DataDiri {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggi = input.nextDouble();

        System.out.print("Apakah mahasiswa? (true/false): ");
        boolean isMahasiswa = input.nextBoolean();

        System.out.println("\n=== DATA DIRI ===");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("Status Mahasiswa: " + isMahasiswa);

        int tinggiBulat = (int) tinggi;
        System.out.println("Tinggi (dibulatkan): " + tinggiBulat + " cm");

        input.close();
    }
}
