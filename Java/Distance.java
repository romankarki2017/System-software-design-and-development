// write a java program to claculate the distance covered by a body;
public class Distance {
    public static void main(StringTest[] args) {
        float a = 0.10f;
        float u = 20.8f;
        float t = 0.6f;
        float distance = u*t+1.0f/2.0f*a*t*t;
        System.out.println("distance traveled by the given bus: " +distance);
    }
}
