package Basics;

public class fibonacci {
    static void main() {
        //Print numbers from 1 to 5.
        System.out.print(numbers1(3));

    }

    static int numbers1(int n) {
        if (n < 3) {
            return n;
        }
        return numbers1(n-1)+numbers1(n-2);
    }
}
