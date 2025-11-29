/**
 * Java program to demonstrate BigInteger.mod(BigInteger big) with result 0.
 */
package com.mymath;

import java.math.BigInteger;

/**
 * Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating two BigInteger type variables
        BigInteger big = new BigInteger("12345678");
        BigInteger big1 = new BigInteger("12345678");

        // Using BigInteger.mod(BigInteger big) to do operation % with higher accuracy and printing result to console
        System.out.println(big.mod(big1)); // Output: 0

    }
}