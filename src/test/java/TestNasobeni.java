import org.junit.Assert;
import org.junit.Test;


public class TestNasobeni {

    @Test
    public void testSimple() {
        var fraction = TestUtils.createFraction(12, 6);
        var result = fraction.times(new NotImplementedFraction(6, 12));

        Assert.assertEquals((Integer) 1, result.getNumerator());
        Assert.assertEquals((Integer) 1, result.getDenominator());
    }

    @Test
    public void testNormalisation() {
        var fraction = TestUtils.createFraction(1, 2);
        var result = fraction.plus(new NotImplementedFraction(1, 2));

        Assert.assertEquals((Integer) 1, result.getNumerator());
        Assert.assertEquals((Integer) 1, result.getDenominator());
    }
}
