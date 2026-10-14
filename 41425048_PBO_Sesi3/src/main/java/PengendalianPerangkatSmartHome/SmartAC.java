/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PengendalianPerangkatSmartHome;

/**
 *
 * @author User
 */
public class SmartAC implements Switchable, Connectable {
    private boolean isOn = false;
    private int temperature;

    public SmartAC(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("[AC Pintar] Dinyalakan pada suhu " + temperature + " C");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("[AC Pintar] Dimatikan.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        if (isOn) {
            System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid + " (IP: " + ipAddress + ")");
        } else {
            System.out.println("[Error] AC Pintar masih mati, tidak dapat terhubung ke WiFi!");
        }
    }
}
