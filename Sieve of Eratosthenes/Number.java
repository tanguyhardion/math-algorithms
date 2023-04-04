/**
 * Class representing a number with a value.
 * 
 * The Number can be marked as prime or composite. Default is prime.
 */
public class Number {
    private int value;
    private boolean prime;

    /**
     * Creates a new Number with the given value.
     * 
     * @param value the value of the number
     */
    public Number(int value) {
        this.value = value;
        this.prime = true;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isPrime() {
        return prime;
    }

    public void setPrime(boolean prime) {
        this.prime = prime;
    }

    @Override
    public String toString() {
        String prime = this.isPrime() ? "prime" : "composite";
        return "Number [value=" + value + ", " + prime + "]\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Number)) {
            return false;
        }

        Number n = (Number) obj;

        return this.value == n.getValue() && this.prime == n.isPrime();

    }
}
