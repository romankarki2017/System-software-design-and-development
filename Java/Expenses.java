import java.util.Scanner;
public class Expenses {
    public static void main(String[] args){
        float[] expenses = new float[10];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<=9; i++){
            System.out.print("Enter the expenses of day " + (i+1)+ ":");
            expenses[i] = sc.nextFloat();

        }
        float max= expenses[0];
        for(int i=0; i<=9; i++){
            if(expenses[i]>max){
                max = expenses[i];
            }
        }
        System.out.println("Max expenses: " + max);


        for(int i=0; i<=9; i++){
            for(int j=i+1; j<=9; j++){
                if(expenses[i]> expenses[j]){
                    float temp=expenses[i];
                    expenses[i]=expenses[j];
                    expenses[j]=temp;
                }
            }
        }
        //display the sorted array
        System.out.println("Expenses in ascending order: ");
        for(int i=0; i<=9; i++){
            System.out.println(expenses[i]+ ", ");
        }
    }

}
