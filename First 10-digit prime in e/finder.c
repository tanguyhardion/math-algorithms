#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <unistd.h>

bool isPrime(long int n) {
    for (long int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

void main() {
    char c;
    FILE *fp = fopen("e.txt", "r");
    
    if (fp == NULL) {
        printf("Error opening file\n");
        return;
    }
    
    bool prime = false;
    int spot = 2;

    while ((c = fgetc(fp)) != EOF && !prime) {
        char buffer[11];
        fseek(fp, spot++, SEEK_SET);
        fgets(buffer, 11, fp);
        long int num = strtol(buffer, NULL, 10);
        if (isPrime(num)) {
            prime = true;
            printf("The first 10-digit prime number in e is %ld\n", num);
        }
    }
}
