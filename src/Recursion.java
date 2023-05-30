public class Recursion {
    // recursion = a method that call itself until the statement of calling is false

    Recursion() {
        System.out.println(factorial(7));
    }
    private static int factorial(int num) {
        if(num < 1) return 1; // base case
        return num * factorial(num-1); // recursive case

    }
}
