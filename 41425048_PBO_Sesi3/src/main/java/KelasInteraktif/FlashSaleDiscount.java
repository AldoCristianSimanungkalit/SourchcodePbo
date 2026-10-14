/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KelasInteraktif;

/**
 *
 * @author User
 */
public class FlashSaleDiscount implements Discounttable {
    private final double rate = 0.25; // diskon flash sale 25%

    @Override
    public double calculateDiscount(double amount) {
        return amount * rate;
    }
}
