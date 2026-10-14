/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.terpadu;

import java.util.Scanner;

/**
 *
 * @author User
 */

public class NumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah deret fibonacci: ");
        int n = scanner.nextInt();
        
        // Generate Fibonacci series
        System.out.println("Deret Fibonacci: ");
        int a = 0, b = 1;
        for(int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
        
        // Check prime number
        System.out.print("Masukkan bilangan untuk di cek prima: ");
        int num = scanner.nextInt();
        boolean isPrime = true;
        
        if(num <= 1) {
            isPrime = false;
        } else {
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        System.out.println(num + (isPrime ? " adalah bilangan prima" : " Bukan bilangan prima"));
        
        scanner.close();
    }
}


/*kita perlu menggunakan tipe data seperti long atau BigInteger agar kapasitas penampung angkanya 
  tidak eror . kemudian kita harus menggunakan perulangan biasa secara iteratif karena jauh lebih 
  efisien dan hemat memori dibandingkan fungsi rekursi. kemudian untuk perhitungan angka yang super 
  besar, kita bisa memanfaatkan teknik lanjutan seperti memoization atau matriks eksponensial supaya 
  prosesnya bisa selesai dengan instan.
*/