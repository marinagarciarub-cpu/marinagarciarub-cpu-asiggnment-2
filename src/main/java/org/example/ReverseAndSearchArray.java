package org.example;
import java.util.Scanner;
import java.util.Arrays;

public class ReverseAndSearchArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many integers you want to enter?");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("N must be higher than 0");
            return;
        }

        int[] original = new int[n];
        System.out.println("Enter the " + n + " numbers");
        for (int i = 0; i < n; i++) {
            System.out.println("Number" + i + ":");
            original[i] = scanner.nextInt();
        }
        System.out.println("Original array:" + Arrays.toString(original));


        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = original[n - 1 - i];
        }
        System.out.println("Reversed array:" + Arrays.toString(reversed));

        System.out.println("Enter the number to look up");
        int numberSearch = scanner.nextInt();
        boolean exist = false;
        String index= "";

        for(int i=0; i<n; i++) {
            if (original[i] == numberSearch) {
                index += i + ", ";
                exist = true;
            }
        }
    }






                // 8. Resultado
                System.out.println("\nRESULTADO:");
                if (encontrado) {
        // Eliminamos la última coma y espacio: "1, 4, " -> "1, 4"
        indices = indices.substring(0, indices.length() - 2);
                System.out.println("✅ El número " + X + " FUE encontrado.");
                    System.out.println("   Índice(s): " + indices);
                } else {
                        System.out.println("❌ El número " + X + " NO fue encontrado.");
                }

                        entrada.close();
            }
                    }
