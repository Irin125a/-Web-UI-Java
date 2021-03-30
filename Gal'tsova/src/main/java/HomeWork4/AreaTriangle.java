package HomeWork4;

public class AreaTriangle {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 6;
        if (a + b < c || a + c < b || b + c < a) {
            System.out.println( "Эти стороны не образуют треугольника" );
            System.exit( 0 );
        }
        double p1 = (a + b + c) / 2.0;
        double p2 = Math.sqrt( p1 * (p1 - a) * (p1 - b) * (p1 - c) );
        System.out.println( "Площадь:" + p2 );
    }
}
