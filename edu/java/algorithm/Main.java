package edu.java.algorithm;

import edu.java.algorithm.sieveAlgorithmsOfEratosthenes.SieveAlgorithmsOfEratosthenes;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Start");
        ArrayList<Integer> array = new SieveAlgorithmsOfEratosthenes(100).execute();

        for (Integer item : array) {
            System.out.print(item + " ");
        }

        System.out.println();
        System.out.println("End");
    }
}
