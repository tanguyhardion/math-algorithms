import java.util.ArrayList;
import java.util.List;

public class Sieve {

    public List<Number> findPrimes(int limit) {
        List<Number> list = integerList(limit);

        int i = 0;
        // Checking all the numbers up to the square root of the limit
        while (i * i < limit) {
            // Find the smallest prime number in the list
            Number firstPrime = list.stream().filter(n -> n.isPrime()).findFirst().get();
            // Mark all of its multiples as composite (and not the number itself)
            list.stream()
                    .filter(n -> n.getValue() % firstPrime.getValue() == 0 && n.getValue() != firstPrime.getValue())
                    .forEach(n -> n.setPrime(false));

            i++;
        }

        // Return all the numbers that are still marked as prime
        return list.stream().filter(n -> n.isPrime()).toList();
    }

    public List<Number> integerList(int limit) {
        List<Number> list = new ArrayList<Number>();
        for (int i = 2; i <= limit; i++) {
            list.add(new Number(i));
        }
        return list;
    }

}