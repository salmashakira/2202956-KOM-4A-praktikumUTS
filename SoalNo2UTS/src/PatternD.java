/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author A S U S
 */
public class PatternD {
    public static void main(String[] args) {
        System.out.println("Pattern D");
        int tinggiPola = 6;

        for (int i = tinggiPola; i >= 1; i--) {
            int spasiKiri = (tinggiPola - i);

            for (int j = 1; j <= spasiKiri; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}