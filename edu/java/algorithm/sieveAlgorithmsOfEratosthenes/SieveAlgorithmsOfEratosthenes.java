package edu.java.algorithm.sieveAlgorithmsOfEratosthenes;

import java.util.ArrayList;

public class SieveAlgorithmsOfEratosthenes
{
    private int startNumber = 0;
    private int endNumber = 0;
    private boolean[] sieve = new boolean[endNumber];
    private ArrayList<Integer> primes = new ArrayList<Integer>();

    public SieveAlgorithmsOfEratosthenes(int endNumber)
    {
        this.endNumber = endNumber;
    }

    public ArrayList<Integer> execute()
    {
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

    public int getStartNumber()
    {
        return startNumber;
    }

    public int getEndNumber()
    {
        return endNumber;
    }

    public boolean[] getSieve()
    {
        return sieve;
    }

    public ArrayList<Integer> getPrimes()
    {
        return primes;
    }
}
