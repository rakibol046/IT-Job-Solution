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
public class Factorial {

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, fact = 1;
        n = input.nextInt();

//        for (i = 1; i <= n; i++) {
//            fact = fact * i;
//        }
//        System.out.println("Factorial of "+n+" is: "+fact);
//    recursion way
        fact = factorial(n);
        System.out.println("Factorial of " + n + " is: " + fact);

    }

}
