package Week2;

import java.util.Scanner;

public class PolyndromicWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();

        if (isPalindrom(kelime)) {
            System.out.println(kelime + " palindromik bir kelime.");
        } else {
            System.out.println(kelime + " palindromik bir kelime değil.");
        }


    }

    public static boolean isPalindrom(String kelime) {
        int uzunluk = kelime.length();

        for (int i = 0; i < uzunluk / 2; i++) {
            if (kelime.charAt(i) != kelime.charAt(uzunluk - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
