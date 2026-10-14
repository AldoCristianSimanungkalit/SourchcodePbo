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
public class Fidelius extends MantraPerlindungan {

    private String secretKeeper;

    public Fidelius(String secretKeeper) {
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {
        System.out.println(
            "Mantra Fidelius diaktifkan oleh Secret Keeper: "
            + secretKeeper
        );
    }

    @Override
    public void nonaktifkan() {
        System.out.println(
            "Mantra Fidelius dinonaktifkan oleh Secret Keeper: "
            + secretKeeper
        );
    }
}
