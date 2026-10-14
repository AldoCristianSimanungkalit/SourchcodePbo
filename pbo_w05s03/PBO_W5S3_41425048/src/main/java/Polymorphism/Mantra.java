/*
Nama    : Aldo Cristian Simanungkalit
Nim     : 41425048
Kelas   : TRPL-2
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author User
 */

public class Mantra {

    // Method ucapkan() dengan satu parameter
    public void ucapkan(String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra);
    }

    // OverLoad: method ucapkan() dengan dua parameter
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }

    // OverLoad: method ucapkan() dengan tiga parameter
    public void ucapkan(String namaMantra, int kekuatan, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan + " pada " + target);
        if (kekuatan > 10) {
            System.out.println("Efek: " + target + " terlempar!");
        } else {
            System.out.println("Efek: Senjata " + target + " terlepas.");
        }
    }

    public static void main(String[] args) {
        Mantra mantra = new Mantra();

        mantra.ucapkan("Expelliarmus");
        mantra.ucapkan("Expelliarmus", 5);
        mantra.ucapkan("Expelliarmus", 15, "Voldemort");
    }
}


/* 1. Apa yang terjado jika kita menghapus salah satu method everloading?Misalnya,method dengan dua parameter
JAWAB : program akan eror, karna di dalam main program memanggil method yang mau di panggil,
contoh method yang di panggil ucapkan, nah jika parameternya di hapus, dan saat di panggil di main, method tersebut tidak akan di temui,
karna parameternya tidak sesuai dengan method yang di panggil main.

   2. Apa keuntungan menggunakan polymorphism dalam contoh ini?
JAWAB : keuntungannya adalah agar kita bisa menggunakan method yang sama, namun untuk melakukan tindakan
dengan cara yang berbeda sesuai parameter yang diberikan. contoh method ucapkan bisa kita gunakan
beberapa kali namun dengan  parameter dan isi yang berbeda.
*/