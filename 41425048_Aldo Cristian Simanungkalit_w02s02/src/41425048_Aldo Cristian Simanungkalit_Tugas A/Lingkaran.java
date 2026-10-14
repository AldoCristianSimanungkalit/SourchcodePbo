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


public class Lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;

        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();

        if (r < 0) {
            System.out.println("Error: jari-jari tidak boleh negatif.");
        } else {
            double luas = PI * r * r;
            double keliling = 2 * PI * r;

            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + keliling);
        }

        input.close();
    }
    
}


/* 1. Karna validasi x < 0 itu yang menentukan hasi atau pesan apa yang di tampilkan.
      contohnya kalau nilai x itu -1 maka akan menampilkan pesan eror karna -1 itu lebih 
      kecil dari 0 dan memenuhi kondisi x < 0. sedangkan kalau misalnya angka yang kita 
      masukkan nilai X lebih dari 0, kan dia tidak memenuhi kondisi x < 0, jadi dia melewatkan kondisi
      tersebut dan lanjut ke kondisi berikutnya.
   2. Contohnya dalam cis saat mahasisswa atau dosen masuk ke dalam akun cis, nah dimana saat memasukkan 
      username atau passsword, saat username dan psswordnya salah makah sistem akan menampilkan pesan atau 
      pop up username atau password salah tetapi jika saat username atau passsword nya benar atau memenuhi 
      kondisi maka akan masuk ke dalam halaman cis.
*/