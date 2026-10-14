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

public class DemoPertahananHogwarts {

    public static void main(String[] args) {

        // Membuat sistem pertahanan Hogwarts
        SistemPertahanan hogwarts = new SistemPertahanan();

        // Membuat objek mantra
        MantraPerlindungan protego = new protego();

        MantraPerlindungan fidelius =
                new Fidelius("Albus Dumbledore");

        MantraPerlindungan antiApparition =
                new MantraAntiApparition("Aula Besar");

        // Menambahkan mantra ke sistem pertahanan
        hogwarts.tambahMantra(protego);
        hogwarts.tambahMantra(fidelius);
        hogwarts.tambahMantra(antiApparition);

        // Mengaktifkan semua mantra
        hogwarts.aktifkanSemuaMantra();

        // Menonaktifkan semua mantra
        hogwarts.nonaktifkanSemuaMantra();
    }
}