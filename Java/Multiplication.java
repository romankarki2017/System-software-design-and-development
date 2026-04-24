import java.util.Scanner;
public class Multiplication {
    public static void main(StringTest[] agrs){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        n=sc.nextInt();

        System.out.println();
        for(int i=1; i<=10; i++){
            System.out.println( n + "x" + i + " = " + (n*i));
        }
        
    }


}
