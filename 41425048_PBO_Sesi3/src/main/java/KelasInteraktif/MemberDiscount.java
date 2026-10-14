/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KelasInteraktif;

/**
 *
 * @author User
 */
public class MemberDiscount implements Discounttable {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.20;
    }
}
