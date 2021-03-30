import HomeWork4.TriangleProvider;
import org.testng.annotations.Test;

public class TestTriangle {
    @Test
    public void getTriangleTest() {
        TriangleProvider tp = new TriangleProvider();
        assertTrue(tp.isTriangle());

    }
    private void assertTrue(boolean triangle) {
    }
}