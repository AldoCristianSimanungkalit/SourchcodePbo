/*
Nama    : Aldo Cristian Simanungkalit
Nim     : 41425048
Kelas   : TRPL-2
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemPertahananHogwarts;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.List;

public class SistemPertahanan {

    private List<MantraPerlindungan> daftarMantra;

    public SistemPertahanan() {
        daftarMantra = new ArrayList<>();
    }

    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
        System.out.println("Mantra berhasil ditambahkan.");
    }

    public void aktifkanSemuaMantra() {
        System.out.println(" Mengaktifkan Semua Mantra ");

        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.aktifkan();
        }
    }

    public void nonaktifkanSemuaMantra() {
        System.out.println(" Menonaktifkan Semua Mantra ");

        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.nonaktifkan();
        }
    }
}
