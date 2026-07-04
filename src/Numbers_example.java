public class Numbers_example {

    static void main() {
        //Print numbers from 1 to 5.
        numbers1(1);
    }

    static void numbers1(int n) {
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        numbers1(n+1);
    }
}
