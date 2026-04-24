public class Calculator2{
   public static void main(String[] args){
         Calculator2 cal=new Calculator2();
         System.out.println("Sum of two numbers: "+cal.sum(3,4));
         System.out.println("Sum of two numbers: "+cal.sum(3,4,17));
         System.out.println("Sum of two numbers: "+cal.sum(3.0f,10.0f));
   }

   public int sum(int a, int b){
      return a+b;
   }

   public int sum(int a, int b, int c){
       return a+b+c;
   }
   
   public float sum(float a, float b){
        return a+b;
   }
}
