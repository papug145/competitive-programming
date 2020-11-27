package com.codeforces.ladder.below1300;

import java.util.Scanner;

public class YoungPhysicist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coordinates = new int[3];

        int numberOfVectors = scanner.nextInt();
        for (int i = 0; i < numberOfVectors; i++) {
            coordinates[0] += scanner.nextInt();
            coordinates[1] += scanner.nextInt();
            coordinates[2] += scanner.nextInt();
        }
        if (coordinates[0] == 0 && coordinates[1] == 0 && coordinates[2] == 0) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
