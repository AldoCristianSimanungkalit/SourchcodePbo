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

public class Kalkulator {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        System.out.println("Tambah: " + (a + b));
        System.out.println("Kurang: " + (a - b));
        System.out.println("Kali: " + (a * b));
        System.out.println("Bagi: " + ((double) a / b));
        System.out.println("Modulus: " + (a % b));
        System.out.println("Pangkat: " + Math.pow(a, b));

        input.close();
    }
    
}

/* 1. Nilai asli double adalah nilai ada bilangan yang memiliki angka di belakang koma
      jadi kalau di casting atau di kovers menjadi int maka nilai bilangan itu akan di bulatkan.
      contoh jika nilai double nya 11.5 maka jika di cesting ke int akan menjadi 11.
   2. Karna jika ingin melihat atau mendapatkan hasil desimal, maka kita harus melakukan pembagian int ke casting double.
      karna int hanya menyimpan bilangan bulat sedangkan double bisa menyimpan bilangan bulat dan desimal.
   3. Program akan menjadi eror, karna java tidak bisa melakukan pembagian bilangan bulat dengan = 0.
*/
