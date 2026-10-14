/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AturandanKarakteristikKelasAbstrak;

/**
 *
 * @author User
 */
// abstarct class KendaraanEkspedisi dan sekalin class parent untuk class child TrukBox, MobilVan dan MotorKurir
abstract class KendaraanEkspedisi {
    protected String noPolisi;
    protected int kapasitasKg;

    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }
    // method infoKendaraan 
    public void infoKendaraan() {
        System.out.println("Plat Nomor: " + noPolisi + " | Daya Angkut: " + kapasitasKg + " Kg");
    }

    public abstract void angkutBarang(String namaBarang);
}
// class extend atau class anak TrukBox dari class parent KendaraanEkspedisi
class TrukBox extends KendaraanEkspedisi {
    public TrukBox(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Truk [" + noPolisi + "] memuat '" + namaBarang +
                "' ke dalam kontainer tertutup pendingin.");
    }
}
// class extend atau class anak MobilVan dari class parent KendaraanEkspedisi
class MobilVan extends KendaraanEkspedisi {
    public MobilVan(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Mobil Van [" + noPolisi + "] memuat '" + namaBarang +
                "' di bagasi belakang untuk distribusi kota.");
    }
}
// class extend atau class anak MotorKurir dari class parent KendaraanEkspedisi
class MotorKurir extends KendaraanEkspedisi {
      public MotorKurir(String noPolisi, int KapasitasKg) {
          super(noPolisi, KapasitasKg);
    }
      
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Supra [" + noPolisi  + "] memuat '" + namaBarang +
        "' di bagasi belakang untuk distribusi kota.");
        
    }
}


/*
* pesan eror pada saat method angkutBarang di hapus
* " MotorKurir is not abstract and does not override abstract method angkutBarang(String) in KendaraanEkspedisi
----
(Alt-Enter shows hints)"
*
* dan opsi yang di berikan java untuk menyelesaikan permasalahn eror itu adalah yaitu
* menambahkan implementasi method angkutBarang(String) di kelas MotorKurir.
*/