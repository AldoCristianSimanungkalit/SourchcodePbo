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
public class sistemkasir {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama barang: ");
        String namaBarang = input.nextLine();

        System.out.print("Masukkan harga barang: ");
        double hargaBarang = input.nextDouble();

        System.out.print("Masukkan jumlah beli: ");
        int jumlahBeli = input.nextInt();

        double totalSebelumDiskon = hargaBarang * jumlahBeli;
        double diskon = 0;

        // Jika total belanja >= 100.000, diskon 10%
        if (totalSebelumDiskon >= 100000) {
            diskon = totalSebelumDiskon * 0.10;
        }

        double totalBayar = totalSebelumDiskon - diskon;

        System.out.println("PBO – W2S2 7");
        System.out.println("Total sebelum diskon: " + (int) totalSebelumDiskon);
        System.out.println("Diskon: " + (int) diskon);
        System.out.println("Total bayar: " + (int) totalBayar);

        input.close();
    }
    
}
