/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ad.del.rental;

/**
 *
 * @author User
 */

// import: kelas dari package lain harus di-import dulu
// hanya kelas public yang bisa di-import
import KelasInteraktif.CorporateDiscount;
import KelasInteraktif.Discountable;
import KelasInteraktif.FlashSaleDiscount;
import KelasInteraktif.MemberDiscount;
import KelasInteraktif.VehicleRental;

public class TestRental {
    public static void main(String[] args) {
        VehicleRental v = new VehicleRental("BK 1234 DEL", 250000);

        v.setRentalDays(-7); // ditolak, pesan error muncul
        v.setRentalDays(7);  // valid

        // referensi bertipe interface, isinya objek berbeda-beda (polimorfisme)
        Discountable member = new MemberDiscount();
        Discountable flash = new FlashSaleDiscount();
        Discountable corporate = new CorporateDiscount();

        System.out.println("Nomor Plat      : " + v.getPlateNumber());
        System.out.println("Harga per Hari  : Rp" + v.getRentalRatePerDay());
        System.out.println("Jumlah Hari     : " + v.getRentalDays());
        // method yang dipanggil sama, hasilnya beda sesuai objek diskonnya
        System.out.println("Total (Member)    : Rp" + v.getTotalCost(member));
        System.out.println("Total (Flash Sale): Rp" + v.getTotalCost(flash));
        System.out.println("Total (Corporate) : Rp" + v.getTotalCost(corporate));
    }
}

/*

/*
 * KODE ASLI DI MODUL 
 *
 * VehicleRental v = new VehicleRental("BK 1234 DEL", 250000);
 * v.plateNumber = "";            // Baris A
 * v.rentalRatePerDay = -500000;  // Baris B
 * v.discountRate = 0.20;         // Baris C
 * v.setRentalDays(-7);           // Baris D
 *
 * Atribut di VehicleRental asli:
 * public String plateNumber;
 * protected double rentalRatePerDay;
 * private int rentalDays;
 * double discountRate;           // tanpa modifier (default)





 * JAWABAN LATIHAN BAGIAN C 
 *
 * 1) Analisis kompilasi dan hak akses
 *  Pada VehicleRental , atribut yang digunakan itu memiliki hak akses yang berbeda, Dimana
 *  plateNumber bersifat public , rentalRatePerDay adalah protected , rentalDays adalah private ,
 *  dan discountRate menggunakan default atau package-private .
 * Baris B dan Baris C yang error saat dikompilasi.
 * - Baris A (plateNumber, public): bisa diakses dari mana saja, termasuk package lain.
 * - Baris B (rentalRatePerDay, protected): hanya bisa diakses di kelas yang sama,
 *   package yang sama, atau subclass. TestRental beda package dan bukan subclass, jadi error.
 * - Baris C (discountRate, tanpa modifier/default): hanya bisa diakses dari package yang sama,
 *   jadi error karena TestRental ada di package lain.
 * - Baris D (setRentalDays, public): bisa diakses, jadi aman.
 * - private: hanya bisa diakses dari dalam kelasnya sendiri (contoh: rentalDays).
 *
 * 2) Kelemahan integritas data
 * i) Menurut hasil diskusi kami, masalah pada Baris D bukan terletak pada cara
 *  pemanggilan setter, tetapi pada isi metode setter-nya .
 *  Jadi, kesimpulan kami adalah setter sudah digunakan, tetapi belum menerapkan
 *  validasi . Setter seharusnya tidak hanya menjadi tempat memasukkan data, tetapi juga
 *  dapat digunakan untuk memastikan data yang masuk valid.
 *  Artinya, tidak ada validasi terhadap nilai hari . Nilai seperti negatif -7 tetap diterima
 * ii) Dari hasil diskusi kami, kenapa nilai total biaya yang di hasilkan bisa bernilai negatif,
 *  karen pada method ini tidak menerapkan validasi, sehingga nilai yang di hasilkan bisa
 *  bernilai negative. Kemudian untuk mencegah korupsi data agar data keuangan aman
 *  yaitu, method rentalRateDay diubah dari public jadi private, memberikan setter yang
 *  melakukan validasi, agar menolak harga sewa yang bernilai negative dan mengubah
 *  nilai diskon agar berada pada rentan yang valid.
 *
 * 3) Penerapan interface
 * i) Interface Discountable berisi calculateDiscount(double amount), ada di Discountable.java.
 * ii) getTotalCost() diubah menjadi getTotalCost(Discountable discount). Objek diskon
 *    (MemberDiscount, FlashSaleDiscount, CorporateDiscount) dikirim dari TestRental saat runtime.
 *    Pemanggilan discount.calculateDiscount(total) sama, tapi hasilnya mengikuti objek yang
 *    dikirim. Itulah polimorfisme, dan VehicleRental tidak perlu diubah saat ada diskon baru.
 

