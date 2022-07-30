/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eyepax_test;

import java.util.*;
import java.util.Random;

/**
 *
 * @author ASUS
 */
public class ContinuousColorGridCount {

    static int a = 12;
    static int b = 10;
    static int visit[][] = new int[a][b];
    static int count = 0;

    public static void colorGridCount(int array[][]) {

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < a; k++) {
                    for (int l = 0; l < b; l++) {
                        visit[k][l] = 0;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Random ran = new Random();

        int array[][] = new int[a][b];

        //fill the array with random number
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

                array[i][j] = ran.nextInt(3);

                System.out.print(array[i][j] + " ");

            }
            System.out.println();

        }
        colorGridCount(array);

    }
}
