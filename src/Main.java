public class Main {

    public static void main(String[] args) {
        message();
    }

    static void message() {
        System.out.println("Hello World!");
        System.out.println("Hello World! Once Again");
        message1();
    }

    static void message1() {
        System.out.println("Hello World!");
        System.out.println("Hello World! Once Again");
        message2();
    }

    static void message2() {
        System.out.println("Hello World!");
        System.out.println("Hello World! Once Again");
    }
}