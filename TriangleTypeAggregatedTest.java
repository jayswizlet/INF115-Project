import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TriangleTypeAggregatedTest {

    @Test
    public void testScalene_3_4_5() {
        assertEquals(1, TriangleType.triangleType(3, 4, 5));
    }

    @Test
    public void testIsosceles_5_5_8() {
        assertEquals(2, TriangleType.triangleType(5, 5, 8));
    }

    @Test
    public void testIsosceles_5_5_3() {
        assertEquals(2, TriangleType.triangleType(5, 5, 3));
    }

    @Test
    public void testEquilateral_6_6_6() {
        assertEquals(3, TriangleType.triangleType(6, 6, 6));
    }

    @Test
    public void testEquilateral_5_5_5() {
        assertEquals(3, TriangleType.triangleType(5, 5, 5));
    }

    @Test
    public void testNotATriangle_1_2_3() {
        assertEquals(4, TriangleType.triangleType(1, 2, 3));
    }

    @Test
    public void testNotATriangle_3_4_7() {
        assertEquals(4, TriangleType.triangleType(3, 4, 7));
    }

    @Test
    public void testNotATriangle_isosceles_fail_1_1_3() {
        assertEquals(4, TriangleType.triangleType(1, 1, 3));
    }

    @Test
    public void testOutOfBounds_negative_first_side() {
        assertEquals(5, TriangleType.triangleType(-1, 4, 5));
    }

    @Test
    public void testOutOfBounds_negative_with_valid_pair() {
        assertEquals(5, TriangleType.triangleType(-1, 5, 5));
    }

    @Test
    public void testOutOfBounds_zero_side() {
        assertEquals(5, TriangleType.triangleType(0, 5, 5));
    }

    @Test
    public void testOutOfBounds_one_side_1001() {
        assertEquals(5, TriangleType.triangleType(1001, 5, 5));
    }

    @Test
    public void testOutOfBounds_one_side_large() {
        assertEquals(5, TriangleType.triangleType(1001, 500, 500));
    }

    @Test
    public void testOutOfBounds_all_sides_1001() {
        assertEquals(5, TriangleType.triangleType(1001, 1001, 1001));
    }

    @Test
    public void testOutOfBounds_integer_max_value_all() {
        assertEquals(5, TriangleType.triangleType(
                Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void testOutOfBounds_integer_max_value_two_sides() {
        assertEquals(5, TriangleType.triangleType(
                Integer.MAX_VALUE, Integer.MAX_VALUE, 1));
    }
}
