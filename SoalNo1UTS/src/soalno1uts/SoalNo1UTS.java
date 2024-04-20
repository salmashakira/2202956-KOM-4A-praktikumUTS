/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soalno1uts;

/**
 *
 * @author A S U S
 */
import java.util.Scanner;

public class SoalNo1UTS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---PROGRAM MENENTUKAN BILANGAN PALINDROM---");
        System.out.println("Masukkan tiga digit integer: ");
        int bilanganBulat = scanner.nextInt();

        if (Palindrom(bilanganBulat)) {
            System.out.println(bilanganBulat + " adalah bilangan palindrom.");
        } else {
            System.out.println(bilanganBulat + " bukan bilangan palindrom.");
        }

        scanner.close();
    }

    public static boolean Palindrom(int bilangan) {
        int digitPertama = bilangan / 100;
        int digitKetiga = bilangan % 10;

        return digitPertama == digitKetiga;
    }
}