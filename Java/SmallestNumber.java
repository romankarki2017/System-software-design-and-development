//A program with a method to find the smallest number form two numbers.
public class SmallestNumber {
    public static void main(String[] args){
        int x=45;
        int y=23;
        //calling the methods 
        SmallestNumber var = new SmallestNumber();
        int result = var.smallestNum(x, y);
        System.out.println("Smallest Number " +result);
    }
    public int smallestNum(int a, int b){
        int min;
        min = a<b?a:b;
        System.out.println("Calculation completed");
        return min;
    }
}
