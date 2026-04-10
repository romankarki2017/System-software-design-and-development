public class TriangleArea {
    public float triangleArea(float b, float h){
        float a = 1/2.0f*b*h;
        return a;
    }
    public static void main(String[] agrs){
        float b=3.4f;
        float h=1.5f;
        TriangleArea var = new TriangleArea();
        float a=var.triangleArea(b,h);
        System.out.println("Area of triangle: "+a);
    }
}
