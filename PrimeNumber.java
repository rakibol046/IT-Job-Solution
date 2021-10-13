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
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n, p = 0;
        n = input.nextInt();
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                p = 1;
            }
        }
        if (p == 1) {
            System.out.println("Not prime number");
        } else {
            System.out.println("Prime number");
        }
    }

}
