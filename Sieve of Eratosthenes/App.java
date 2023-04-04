import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Sieve sieve = new Sieve();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Sieve of Eratosthenes!");
        System.out.println("This program will find all the prime numbers up to a given limit.");
        System.out.print("To get started, enter the desired limit: ");
        int limit = scanner.nextInt();
        scanner.close();

        List<Number> primes = sieve.findPrimes(limit);
        System.out.println("The prime numbers up to " + limit + " are: ");
        primes.forEach(n -> System.out.print(n.getValue() + " "));
    }

}
