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

public class DaftarBelanja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menggunakan array dengan kapasitas maksimal 100 item
        String[] daftar = new String[100];
        int jumlahItem = 0;
        int pilihan;

        do {
            System.out.println("\n=== Daftar Belanja ===");
            System.out.println("1. Tambah item");
            System.out.println("2. Hapus item");
            System.out.println("3. Tampilkan semua item");
            System.out.println("4. Cari item");
            System.out.println("5. Keluar");
            
            System.out.print("\nPilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan sisa baris setelah nextInt()

            switch (pilihan) {
                case 1:
                    // Menambah item ke daftar belanja
                    System.out.print("Masukkan item: ");
                    String newItem = scanner.nextLine();
                    if (jumlahItem < daftar.length) {
                        daftar[jumlahItem] = newItem;
                        jumlahItem++;
                        System.out.println(newItem + " berhasil ditambahkan!");
                    } else {
                        System.out.println("Daftar belanja penuh!");
                    }
                    break;

                case 2:
                    // Menghapus item berdasarkan posisi (indeks ke-n)
                    System.out.print("Hapus item pada posisi: ");
                    int posisiHapus = scanner.nextInt();
                    
                    if (posisiHapus > 0 && posisiHapus <= jumlahItem) {
                        String itemDihapus = daftar[posisiHapus - 1];
                        
                        // Perulangan untuk menggeser elemen array setelah item yang dihapus
                        for (int i = posisiHapus - 1; i < jumlahItem - 1; i++) {
                            daftar[i] = daftar[i + 1];
                        }
                        daftar[jumlahItem - 1] = null; // Kosongkan elemen terakhir
                        jumlahItem--;
                        
                        System.out.println(itemDihapus + " berhasil dihapus!");
                    } else {
                        System.out.println("Posisi tidak valid!");
                    }
                    break;

                case 3:
                    // Menampilkan semua item dalam daftar
                    System.out.println("Daftar belanja:");
                    if (jumlahItem == 0) {
                        System.out.println("(Daftar kosong)");
                    } else {
                        for (int i = 0; i < jumlahItem; i++) {
                            System.out.println((i + 1) + ". " + daftar[i]);
                        }
                    }
                    break;

                case 4:
                    // Mencari item dalam daftar
                    System.out.print("Cari item: ");
                    String cariItem = scanner.nextLine();
                    int posisiDitemukan = -1;
                    
                    for (int i = 0; i < jumlahItem; i++) {
                        if (daftar[i].equalsIgnoreCase(cariItem)) {
                            posisiDitemukan = i + 1;
                            break;
                        }
                    }
                    
                    if (posisiDitemukan != -1) {
                        System.out.println(cariItem + " ditemukan pada posisi " + posisiDitemukan);
                    } else {
                        System.out.println(cariItem + " tidak ditemukan dalam daftar.");
                    }
                    break;

                case 5:
                    // Keluar dari program
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
