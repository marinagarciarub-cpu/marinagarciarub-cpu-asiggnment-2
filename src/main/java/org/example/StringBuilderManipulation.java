package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StringBuilderManipulation {
    public static void repeater() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many words do you want to enter?");
        int numWords = scanner.nextInt();
        scanner.nextLine();
        List<String> wordList = new ArrayList<>();
        System.out.println("Enter the " + numWords + "words (one by line):");

        for (int i = 0; i < numWords; i++) {
            wordList.add(scanner.nextLine());
        }
        System.out.println("how many times do you want to repeat each words?");
        int numRepeat = scanner.nextInt();
        if (numWords < 1 || numRepeat < 1) {
            System.out.println("Invalid input");
            return;
        }

    }


}