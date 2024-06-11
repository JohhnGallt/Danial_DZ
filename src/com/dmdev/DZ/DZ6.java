package com.dmdev.DZ;

import java.util.Scanner;

public class DZ6 {
    public static void main(String[] args) {
        String alphabet = "qwertyuiopasdfghjklzxcvbnmq";
        char[] alpha = alphabet.toCharArray();

        System.out.println("введите строчную букву английского алфавита");
        Scanner scanner = new Scanner(System.in);
        char w = scanner.next().charAt(0);

        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] == w) {
                System.out.print(alpha[i-1]);
            }
        }

    }
}

