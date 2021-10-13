/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itjobsolution;

import java.util.Scanner;

/**
 *
 * @author Md. Rakibul Islam
 */
public class FabonacciSeries {

    public static void main(String[] args) {
        int first = 0, second = 1, n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.print("0 1 ");
        for (int i = 2; i < n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
            System.out.print(temp + " ");
        }

    }

}
