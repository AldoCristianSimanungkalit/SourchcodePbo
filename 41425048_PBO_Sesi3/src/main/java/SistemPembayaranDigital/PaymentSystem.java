/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SistemPembayaranDigital;

/**
 *
 * @author User
 */
public class PaymentSystem {
    public static void main(String[] args) {
        PaymentMethod payment1 = new EWalletPayment("08123456789");
        PaymentMethod payment2 = new CreditCardPayment("4111-XXXX-XXXX-1234");

        payment1.pay(50000);
        payment2.pay(150000);
    }
}

/*
 * file ini adalah main dari file PaymentMethod yang berfungsi untuk memanggil method dari class PaymentMethod
 * dimana terdapat 2 objek baru dengan nama payment1 dan payment2.
 * dimana nilai payment1 adalah 50000 dan nilai payment2 adalah 150000
*/