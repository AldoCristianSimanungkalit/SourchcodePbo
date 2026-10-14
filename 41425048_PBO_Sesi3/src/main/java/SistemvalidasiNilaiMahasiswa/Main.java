/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemvalidasiNilaiMahasiswa;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // Mendaftarkan mahasiswa (inisialisasi awal)
        StudentGrade student = new StudentGrade("11425001", "Marsha", 0, 0);

        // Menguji validasi nilai kuis yang salah (> 100)
        student.setNilaiKuis(110.0);

        // Mengubah nilai kuis yang valid
        student.setNilaiKuis(85.0);

        // Mengubah nilai UTS yang valid
        student.setNilaiUts(90.0);

        System.out.println();
        
        // Mencetak Kartu Hasil Studi
        student.cetakLaporan();
    }
}
