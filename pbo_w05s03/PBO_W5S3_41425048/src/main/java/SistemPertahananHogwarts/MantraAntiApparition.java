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
public class MantraAntiApparition extends MantraPerlindungan {

    private String area;

    public MantraAntiApparition(String area) {
        this.area = area;
    }

    @Override
    public void aktifkan() {
        System.out.println("Anti-Apparition diaktifkan di area: " + area);
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Anti-Apparition dinonaktifkan di area: " + area);
    }
}
