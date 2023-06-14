package VCS;

import VCS.exept.ArgumentIsZeroException;
import VCS.exept.IntDivider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntDividerTest {

    @Test
    public void testDividerWith6_3() throws ArgumentIsZeroException {
        String[] skaiciai = {"6", "3"};
        int expectedResult = 2;
        int actualResult;

        actualResult = IntDivider.divider(skaiciai);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDividerWith10_5() throws ArgumentIsZeroException {
        String[] skaiciai = {"10", "2"};
        int expectedResult = 5;
        int actualResult;

        actualResult = IntDivider.divider(skaiciai);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDividerWith0_4() {
        String[] skaiciai = {"0", "4"};
        String expectedResult = "";
        String actualResult = "";

        try {
            IntDivider.divider(skaiciai);
        } catch (ArgumentIsZeroException e) {
            actualResult = e.toString();
        }

        Assertions.assertTrue(
                actualResult.contains(expectedResult),
                "\nexpected: %s \nactual:%s\n".formatted(expectedResult, actualResult));
    }

    @Test
    public void testDividerWith5_5ExpectTrue() throws ArgumentIsZeroException {
        String[] skaiciai = {"5", "5"};
        int expectedResult = 1;
        int actualResult;

        actualResult = IntDivider.divider(skaiciai);

        Assertions.assertTrue(expectedResult == actualResult);
    }

/*    @Test
    public void testDivisionFormZero() {
        int a = 2;
        int b = 0;
        Exception actualResult = new Exception();

        try {
            int c = a / b;
        } catch (Exception e) {
            actualResult = e;
        } Assertions.assertTrue(
                actualResult instanceof ArgumentIsZeroException
                "\nexpected: %s \nactual:%s\n".formatted(expectedResult, actualResult);
    }*/
}