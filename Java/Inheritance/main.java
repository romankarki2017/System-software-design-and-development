package Inheritance;

public class main {
    public static void main(String[] agrs){
        ClothingProduct p1=new ClothingProduct("Polo Tshirt", 1200, 20, "M", "Cotton");
        ClothingProduct p2=new ClothingProduct("NIKE", 10000, 20, "M", "Cotton");
        ClothingProduct p3=new ClothingProduct("FILA", 12000, 20, "L", "Cotton");
        p1.displayDetails();
    }
}
