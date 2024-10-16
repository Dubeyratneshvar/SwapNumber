import java.util.Scanner;

class SwapNumber {
    public static void main(String[] args) {

        int a;
        int b;
        int temp;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        System.out.println("a=" + a + ", b=" + b);
        // Using Third Variable

        temp = a;
        a = b;// a=5
        b = temp;// b=4
        System.out.println("---Using Third Variable After swapping Number---");
        System.out.println("After swapping, a = " + a);
        System.out.println("After swapping, b = " + b);

        // Without Third variable

        System.out.println("----without third variable----");
        a = a + b;
        b = a - b;// 9-4=5
        a = a - b;// 9-5=4

        System.out.println("After swapping, a = " + a);
        System.out.println("After swapping, b = " + b);

    }

}