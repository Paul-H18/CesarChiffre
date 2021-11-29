package de.paul;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);
    static String str, str1 = "";

    static char[] text, text2, ecryptedCharText, decryptedCharText;
    static String ecryptedText = "", decryptedText = "", c;
    static int key;
    static boolean choice;

    static Alphabeth alpha = new Alphabeth();

    public static void main(String[] args) {


            System.out.print("Geben Sie die zu chiffrierende Nachricht ein: ");
            str = sc.nextLine();
            System.out.println("\n");

            str = str.toLowerCase();

            sc.reset();

            str = str.replaceAll("\\s", "");

            text = str.toCharArray();


            System.out.print("Geben Sie den Schlüssel als Zahl ein: ");
            key = sc.nextInt();
            System.out.println("\n");
            sc.reset();


            ecryptedCharText = new char[text.length];

            for (int i = 0; i < text.length; i++) {
                ecryptedCharText[i] = alpha.getChar(getEcryptedInt(alpha.getIndexFromChar(text[i]), key, alpha.getLength()));
            }

            for (int i = 0; i < ecryptedCharText.length; i++) {
                ecryptedText = ecryptedText + ecryptedCharText[i];
            }


            System.out.println(ecryptedText);

            str = "";


            System.out.print("Geben die sie zu dechiffrierende Nachricht ein: ");

            str = sc2.nextLine();

            System.out.println("\n");

            sc2.reset();

            str = str.toLowerCase();

            str = str.replaceAll("\\s", "");

            text2 = str.toCharArray();

            System.out.print("Geben Sie den Schlüssel als Zahl ein: ");
            key = sc2.nextInt();
            System.out.println("\n");
            sc2.reset();

            for (int i = 0; i < text2.length; i++) {
                decryptedCharText[i] = alpha.getChar(getDecryptedInt(key));
            }

            for (int i = 0; i < decryptedCharText.length; i++) {
                decryptedText = decryptedText + decryptedCharText[i];
            }

            System.out.println(decryptedCharText);

        sc.close();
        sc2.close();

    }

    // c + schlüssel = a mod 36

    public static int getEcryptedInt(int m, int a, int mod) {
        int c = m + a;
        return c % mod;
    }

    public static int getDecryptedInt(int mod) {
        int c = mod - key;
        return c % key;
    }

}


