package edu.java.algorithm.sieveAlgorithmsOfEratosthenes;

import java.util.ArrayList;

public class SieveAlgorithmsOfEratosthenes
{
    private int endNumber;
    private ArrayList<Integer> primes = new ArrayList<>();

    public SieveAlgorithmsOfEratosthenes(int endNumber)
    {
        this.endNumber = endNumber;
    }

    public ArrayList<Integer> execute()
    {
        boolean[] sieve = new boolean[endNumber];
        sieve[0] = true;
        sieve[1] = true;

        for (int i = 2; i < endNumber; i++)
        {
            if (!sieve[i])
            {
                primes.add(i);
            }

            for (int j = i * i; j < endNumber; j += i)
            {
                sieve[j] = true;
            }
        }
        return primes;
    }

    public int getEndNumber()
    {
        return endNumber;
    }

    public ArrayList<Integer> getPrimes()
    {
        return primes;
    }
}
