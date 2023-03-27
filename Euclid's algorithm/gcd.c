#include <stdio.h>

// Finds the greatest common divisor of the two numbers passed as parameters (Euclid's algorithm)
long gcd(long a, long b) {
    // If b is 0, we return a
    if (b == 0) return a;

    // Otherwise, we call gcd recursively with b and the remainder of a divided by b
    return gcd(b, a % b);
}

// Main function
int main() {
    printf("Welcome to the Euclid's algorithm program!\n");
    printf("Please enter two positive integers to find their greatest common divisor.\n");

    long a, b;
    printf("First integer: ");
    scanf("%ld", &a);
    printf("Second integer: ");
    scanf("%ld", &b);

    printf("The greatest common divisor of %ld and %ld is %ld.\n", a, b, gcd(a, b));

    return 0;
}
