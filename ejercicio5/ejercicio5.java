package ejercicio5;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        String word;
        do {
            word = getWord();
            if (isPalindrome(word)) {
                System.out.println(word + " es un palindromo");
            } else {
                System.out.println(word + " es un palindromo");
            }
        } while (!word.equalsIgnoreCase("adios"));
    }

    public static String getWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("escriba una palabra: ");
        return scanner.nextLine();
    }

    public static boolean isPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }
}