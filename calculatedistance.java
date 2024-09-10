// import java.math.*;
public class calculatedistance {
    public static void main(String[] args) {
        float x1=1;
        float x2=2;
        float x3=3;
        float y1=1;
        float y2=4;
        float y3=6;
        System.out.println(distance(x1,x2,x3,y1,y2,y3));
    }
    public static float distance(float x1,float x2,float x3,float y1,float y2,float y3)
    {
        float first=(float)Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        float second=(float)Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
        float third=(float)Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
        float square=first+second+third;
        return square;
    }
}
