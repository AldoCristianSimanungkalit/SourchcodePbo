/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SistemPembayaranDigital;

/**
 *
 * @author User
 */

interface PaymentMethod {
    double TRANSACTION_FEE = 2500.0;

    void pay(double amount);
    String getPaymentDetails();
}

class EWalletPayment implements PaymentMethod {
    private String phoneNumber;

    public EWalletPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(double amount) {
        double total = amount + TRANSACTION_FEE;
        System.out.println("[E-Wallet " + phoneNumber + "] Pembayaran diproses: Rp" + amount 
                + " (Biaya admin: Rp" + TRANSACTION_FEE + ") | Total: Rp" + total);
    }

    @Override
    public String getPaymentDetails() {
        return "Metode: E-Wallet (" + phoneNumber + ")";
    }
}

class CreditCardPayment implements PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("[Credit Card " + cardNumber + "] Pembayaran berhasil diverifikasi sebesar: Rp" + amount);
    }

    @Override
    public String getPaymentDetails() {
        return "Metode: Kartu Kredit (" + cardNumber + ")";
    }
}

/*
 * Program ini mempraktekkan sebuah sistem pembayaran digital dengan menerapkan konsep interface dan polimorfisme.
 * diamana nama file Interface nya adalah 'PaymentMethod', dimana interface ini bertindak sebagai cetak biru atau aturan baku yang wajib diikuti oleh 
 * semua jenis pembayaran (seperti E-Wallet dan Kartu Kredit). Masing-masing kelas kemudian mengimplementasikan 
 * cara pembayaran dan detailnya sendiri secara fleksibel.
 */