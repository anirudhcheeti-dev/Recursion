public class fibonacci {
    static void main() {
        //Print numbers from 1 to 5.
        System.out.print(numbers1(6));

    }

    static int numbers1(int n) {
        if (n < 2) {
            return n;
        }
        return numbers1(n-1)+numbers1(n-2);
    }
}
