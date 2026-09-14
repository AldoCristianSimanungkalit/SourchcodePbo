/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sourchcodepbo.ControlStatements;

/**
 *
 * @author User
 */
public class Continue {
    int count=0; String s="peter piper picked...";
    for (int i=0;i<s.length();i++) {
    if (s.charAt(i)!='p') continue;
    count++;
}
}
