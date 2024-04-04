import org.junit.Assert;
import org.junit.Test;

public class GCDTest {

    @Test
    public void GCDTest1(){
        int expected = 24;
        int actual = GCD.gcd1(1440, 408);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void GCDTest2(){
        int expected = 24;
        int actual = GCD.gcd2(1440, 408);

        Assert.assertEquals(expected, actual);
    }
}
