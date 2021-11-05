import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void add() {
        StringCalculator scal = new StringCalculator();
        Assert.assertEquals(0, scal.add(null));
        Assert.assertEquals(0, scal.add(""));
        Assert.assertEquals(1, scal.add("1"));
        Assert.assertEquals(3, scal.add("1,2"));
        Assert.assertEquals(6, scal.add("1,2:3"));
    }

}
