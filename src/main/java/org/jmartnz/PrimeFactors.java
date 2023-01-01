package org.jmartnz;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int number) {
        var primes = new ArrayList<Integer>();
        if (number == 2) primes.add(2);
        return primes;
    }
}
