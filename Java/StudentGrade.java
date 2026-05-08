//write a program to store the marks of any 10 student in an array
// -ask the user to enter the mark from keyboard
// -display the average mark also
// -display the marks of all students

import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        float marks[] = new float[10];
        float sum = 0.0f;
        float average;

        System.out.println("Enter the mark of students: ");

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the mark of student: ");
            marks[i] = scanner.nextFloat();
            sum = sum + marks[i];
        }

        average = sum / 10.0f;
        System.out.println("Average marks: " + average);

        //display the marks of the students
        for(float m: marks){
            System.out.print(m+", ");
        }
        
    }
    
}
