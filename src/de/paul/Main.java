package de.paul;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);
    static String str;

    static char[] text, text2, ecryptedCharText, decryptedCharText;
    static String ecryptedText = "", decryptedText = "";
    static int key;

    static Alphabeth alpha = new Alphabeth();

    public static void main(String[] args) {


            System.out.print("Geben Sie die zu chiffrierende Nachricht ein: ");
            str = sc.nextLine();

            str = str.toLowerCase();

            sc.reset();

            str = str.replaceAll("\\s", "");

            text = str.toCharArray();


            System.out.print("Geben Sie den Schlüssel als Zahl ein: ");
            key = sc.nextInt();
            sc.reset();


            ecryptedCharText = new char[text.length];

            for (int i = 0; i < text.length; i++) {
                ecryptedCharText[i] = alpha.getChar(getEcryptedInt(alpha.getIndexFromChar(text[i]), alpha.getLength()));
            }

            for (int i = 0; i < ecryptedCharText.length; i++) {
                ecryptedText = ecryptedText + ecryptedCharText[i];
            }


            System.out.println("Chiffrierte Nachricht: " + ecryptedText);
            System.out.print("\n");

            str = "";


            System.out.print("Geben die sie zu dechiffrierende Nachricht ein: ");

            str = sc2.nextLine();

            sc2.reset();

            str = str.toLowerCase();

            str = str.replaceAll("\\s", "");

            text2 = str.toCharArray();
            decryptedCharText = str.toCharArray();

            System.out.print("Geben Sie den Schlüssel als Zahl ein: ");
            key = sc2.nextInt();
            sc2.reset();

            for (int i = 0; i < text2.length; i++) {
                decryptedCharText[i] = alpha.getChar(getDecryptedInt(alpha.getIndexFromChar(decryptedCharText[i]), alpha.getLength()));
            }

            for (int i = 0; i < decryptedCharText.length; i++) {
                decryptedText = decryptedText + decryptedCharText[i];
            }

            System.out.println("Dechiffrierte Nachricht: " + decryptedText);
            System.out.print("\n");

        sc.close();
        sc2.close();

    }


    /**
     * Platz des klarem chars im Alphabeth + Verschiebung = a
     * a mod 36 = Platz des chiffriertem chars im Alphabeth
     * @param m Platz des klarem chars im Alphabeth
     * @param mod Länge des Alphabeths
     * @return Platz des chiffriertem chars im Alphabeth
     */
    public static int getEcryptedInt(int m, int mod) {
        int c = m + key;
        return c % mod;
    }


    /**
     * Platz des chiffrierten chars im Alphabeth - Verschiebung = c
     * c mod 36 = Platz des dechifrriertem chars im Aplphabeth
     * @param a Platz des chiffrierten chars im Alphabeth
     * @param mod Länge des Alphabeths
     * @return Platz des dechiffriertem chars im Alphabeth
     */
    public static int getDecryptedInt(int a, int mod) {
        int c = a - key;
        if(c >= 0) {
            return c % mod;
        } else {
            int tmp = mod + c;
            return tmp % mod;
        }
    }

}


