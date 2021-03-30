package HomeWork4;

public final class TriangleProvider {
    public static void getTriangle() {
    }
    public boolean isTriangle() {

        Triangle t = new Triangle() {
            @Override
            public int getLen1() {
                return 0;
            }

            @Override
            public int getLen2() {
                return 0;
            }

            @Override
            public int getLen3() {
                return 0;
            }
        };
        //не знаю можно ли так делать?
        return ((t.getLen1() + t.getLen2() > t.getLen3()) && (t.getLen2() + t.getLen3() > t.getLen1()) && (t.getLen3() + t.getLen1() > t.getLen2()));
    }
}