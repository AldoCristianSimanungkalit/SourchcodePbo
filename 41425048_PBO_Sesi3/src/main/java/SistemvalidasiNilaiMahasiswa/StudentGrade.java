/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemvalidasiNilaiMahasiswa;

/**
 *
 * @author User
 */
public class StudentGrade {
    private String nim;
    private String nama;
    private double nilaiKuis;
    private double nilaiUts;
    private String gradeHuruf; // Tantangan tambahan: read-only property

    // Konstruktor
    public StudentGrade(String nim, String nama, double nilaiKuis, double nilaiUts) {
        this.nim = nim;
        this.nama = nama;
        System.out.println("[Registrasi] Berhasil mendaftarkan mahasiswa: " + nim + " - " + nama);
        setNilaiKuis(nilaiKuis);
        setNilaiUts(nilaiUts);
    }

    // Read-only getter untuk NIM
    public String getNim() {
        return nim;
    }

    // Read-only getter untuk Nama
    public String getNama() {
        return nama;
    }

    // Getter untuk Nilai Kuis
    public double getNilaiKuis() {
        return nilaiKuis;
    }

    // Setter untuk Nilai Kuis dengan validasi
    public void setNilaiKuis(double nilaiKuis) {
        if (nilaiKuis >= 0.0 && nilaiKuis <= 100.0) {
            this.nilaiKuis = nilaiKuis;
            System.out.println("[Update] Nilai kuis berhasil diubah menjadi: " + nilaiKuis);
            hitungGradeHuruf(); // Kalkulasi otomatis setiap nilai berhasil diubah
        } else {
            System.out.println("[Error] Nilai kuis tidak valid: " + nilaiKuis + " (Harus antara 0 - 100)");
        }
    }

    // Getter untuk Nilai UTS
    public double getNilaiUts() {
        return nilaiUts;
    }

    // Setter untuk Nilai UTS dengan validasi
    public void setNilaiUts(double nilaiUts) {
        if (nilaiUts >= 0.0 && nilaiUts <= 100.0) {
            this.nilaiUts = nilaiUts;
            System.out.println("[Update] Nilai UTS berhasil diubah menjadi: " + nilaiUts);
            hitungGradeHuruf(); // Kalkulasi otomatis setiap nilai berhasil diubah
        } else {
            System.out.println("[Error] Nilai UTS tidak valid: " + nilaiUts + " (Harus antara 0 - 100)");
        }
    }

    // Read-only getter untuk Grade Huruf
    public String getGradeHuruf() {
        return gradeHuruf;
    }

    // Internal private method untuk mengkalkulasi grade huruf secara otomatis
    private void hitungGradeHuruf() {
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir >= 85) {
            this.gradeHuruf = "A";
        } else if (nilaiAkhir >= 70) {
            this.gradeHuruf = "B";
        } else if (nilaiAkhir >= 55) {
            this.gradeHuruf = "C";
        } else if (nilaiAkhir >= 40) {
            this.gradeHuruf = "D";
        } else {
            this.gradeHuruf = "E";
        }
    }

    // Method menghitung nilai akhir (Bobot: 40% Kuis + 60% UTS)
    public double hitungNilaiAkhir() {
        return (0.4 * nilaiKuis) + (0.6 * nilaiUts);
    }

    // Method untuk mencetak laporan hasil studi
    public void cetakLaporan() {
        System.out.println("=== KARTU HASIL STUDI ===");
        System.out.println("NIM       : " + nim);
        System.out.println("Nama      : " + nama);
        System.out.println("Nilai Kuis : " + nilaiKuis);
        System.out.println("Nilai UTS : " + nilaiUts);
        System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
        // Jika ingin menampilkan grade huruf tambahan, bisa dicetak di sini juga
    }
}


