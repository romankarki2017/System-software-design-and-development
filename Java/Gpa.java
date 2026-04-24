import java.util.Scanner;
public class Gpa {
    public static void main(StringTest[] args){
        float[] gpa = new float[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<=4; i++){
            System.out.print("Enter the gpa of student" + (i+1) + ": ");
            gpa[i]= sc.nextFloat();

        }
        float sum=0; 
        // sum=gpa[0]+gpa[1]+gpa[2]+gpa[3]+gpa[4]; 
        for(int i=0; i<=4; i++){
            sum=sum+gpa[i];
        } 
        float avg=sum/5;
        System.out.println("Average gpa = " +avg);
    }
}
