import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
        int low = 100;
        int high = 300;
        List<Integer> expected = new ArrayList<>(List.of(123,234));
        List<Integer> actual = new Solution().sequentialDigits(low, high);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2() {
        int low = 58;
        int high = 155;
        List<Integer> expected = new ArrayList<>(List.of(67,78,89,123));
        List<Integer> actual = new Solution().sequentialDigits(low, high);

        Assert.assertEquals(expected, actual);
    }


}
