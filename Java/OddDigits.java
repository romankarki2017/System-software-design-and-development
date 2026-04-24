//Write the program to count the number of odd digits in a give number.
//Ex: if number n=4572 no of odd digits=2

import java.util.Scanner;

public class OddDigits {
    public static void main(StringTest[] args) {
        int n;
        Scanner sc = new Scanner (System.in); 
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        int count =0;
        while (n>0) {
            int singleDigit= n%10;
            if(singleDigit%2 != 0){
                count++;
            }
            n=n/10;
        }
        System.out.println("No. of odd digits: " +count);
    }
    
}
