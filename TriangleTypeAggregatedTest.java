import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleTypeAggregatedTest {

    //Prompt 1: black box, spec only (Miles)
    @Test public void testP1_scalene_3_4_5()       { assertEquals(1, TriangleType.triangleType(3, 4, 5)); }
    @Test public void testP1_isosceles_5_5_8()     { assertEquals(2, TriangleType.triangleType(5, 5, 8)); }
    @Test public void testP1_equilateral_6_6_6()   { assertEquals(3, TriangleType.triangleType(6, 6, 6)); }
    @Test public void testP1_notATriangle_1_2_3()  { assertEquals(4, TriangleType.triangleType(1, 2, 3)); }
    @Test public void testP1_outOfBounds_negative(){ assertEquals(5, TriangleType.triangleType(-1, 4, 5)); } // expected fail (actual 4)

    //Prompt 2: white box, branch coverage (Daniel)
    @Test public void testP2_negativeSide_minus1_5_5() { assertEquals(4, TriangleType.triangleType(-1, 5, 5)); } // had source -> correct (4)
    @Test public void testP2_overMax_1001_5_5()        { assertEquals(5, TriangleType.triangleType(1001, 5, 5)); }
    @Test public void testP2_equilateral_5_5_5()       { assertEquals(3, TriangleType.triangleType(5, 5, 5)); }
    @Test public void testP2_isosceles_5_5_3()         { assertEquals(2, TriangleType.triangleType(5, 5, 3)); }
    @Test public void testP2_degenerateIsosceles_1_1_3(){ assertEquals(4, TriangleType.triangleType(1, 1, 3)); }

    //Prompt 3: adversarial / edge-only (Jason)
    @Test public void testP3_zeroSide()              { assertEquals(5, TriangleType.triangleType(0, 5, 5)); } // expected fail (actual 4)
    @Test public void testP3_inequalityBoundary()    { assertEquals(4, TriangleType.triangleType(3, 4, 7)); }    // 3 + 4 == 7
    @Test public void testP3_allSidesOverMax()       { assertEquals(5, TriangleType.triangleType(1001, 1001, 1001)); }
    @Test public void testP3_overflowAllMax()        { assertEquals(5, TriangleType.triangleType(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)); }
    @Test public void testP3_overflowOneNormal()     { assertEquals(5, TriangleType.triangleType(Integer.MAX_VALUE, Integer.MAX_VALUE, 1)); }
}