import java.util.Scanner;
public class Calculator {
    public static void main(StringTest[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Enter you choice-----");
        System.out.println("press 1 :Add");
        System.out.println("press 2: Subtract");
        System.out.println("press 3: Multiply");
        System.out.println("press 4: Divide");
        System.out.println("press 0: Exit");

        int choice = sc.nextInt();

        System.out.print("\nEnter a number: ");
        int a = sc.nextInt();

        System.out.print("\nEnter another number: ");
        int b = sc.nextInt();

        switch(choice){
            case 1:
                int s=a+b;
                System.out.println("Sum = " +s);
                break;
            case 2:
                int e=a-b;
                System.out.println("subtract = " +e);
                break;
            case 3:
                int m=a*b;
                System.out.println("Multiplication = " +m);
                break;
            case 4:
                int d=a/b;
                System.out.println("Division = " +d);
                break;
            case 0:
                break;
            default:
                System.out.println("invalid input");
        }



    }
}
