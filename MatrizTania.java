package com.mycompany.primeiro_project;

import java.util.Scanner;

public class MatrizTania {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l1, l2, c1, c2;
        int[][] matrizA;
        int[][] matrizB;
        int[][] matrizC;

        System.out.println("Linha matriz 1:");
        l1 = scanner.nextInt();
        System.out.println("Coluna 1: ");
        c1 = scanner.nextInt();

        System.out.println("Linha matriz 2:");
        l2 = scanner.nextInt();
        System.out.println("Coluna 2: ");
        c2 = scanner.nextInt();

        matrizA = new int[l1][c1];
        matrizB = new int[l2][c2];
        matrizC = new int[l1][c2];

        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(i + "," + j + " " + "MatrizA: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("");
        for (int i = 0; i < l2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(i + "," + j + " " + "MatrizB ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        System.out.println("");
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(matrizA[i][j] + "|");
            }
            System.out.println("");
        }

        System.out.println("");
        for (int i = 0; i < l2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(matrizB[i][j] + "|");
            }
            System.out.println("");
        }

        if (c1 == l2) {
            for (int i = 0; i < l1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < l2; k++) {
                        matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }
            System.out.println("");
            System.out.println("Exibindo os elementos da MatrizC");
            for (int i = 0; i < l1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(matrizC[i][j] + "|");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Não é possível multiplicar essas 2 matrizes!");
        }
    }

}
