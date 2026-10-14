/*
Nim : 41425048    
Nama : Aldo Cristian Simanungkalit
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasB;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class koversisuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Celsius ke Fahrenheit
        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " C = " + fahrenheit + " F");

        // Fahrenheit ke Celsius
        System.out.print("Masukkan suhu dalam Fahrenheit: ");
        double fahrenheitInput = input.nextDouble();

        double celsiusHasil = (fahrenheitInput - 32) * 5 / 9;

        System.out.printf("%.0f F = %.2f C%n", fahrenheitInput, celsiusHasil);

        input.close();
    }
    
}
