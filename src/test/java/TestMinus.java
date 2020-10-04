import org.junit.Assert;
import org.junit.Test;


public class TestMinus {

    @Test
    public void testSimple() {
        var fraction = TestUtils.createFraction(12, 6);
        var result = fraction.minus(new NotImplementedFraction(6, 12));

        Assert.assertEquals((Integer) 3, result.getNumerator());
        Assert.assertEquals((Integer) 2, result.getDenominator());
    }

    @Test
    public void testNormalisation() {
        var fraction = TestUtils.createFraction(1, 2);
        var result = fraction.minus(new NotImplementedFraction(1, 2));

        Assert.assertEquals((Integer) 1, result.getNumerator());
        Assert.assertEquals((Integer) 1, result.getDenominator());
    }
}
