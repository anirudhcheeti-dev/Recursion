public class Numbers_example {

    static void main() {
        //Print numbers from 1 to 5.
        numbers1(1);
    }

    static void numbers1(int n) {
        //base condition
        if(n==1000){
            System.out.println(n);
            return;
        }
        //body and its progress
        System.out.println(n);
        numbers1(n+1);
        //function calling itself
    }
}
