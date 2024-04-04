import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void RecursionTest1(){
        //Given
        Integer expected = 1;

        //When
        Factorial fact = new Factorial();
        Integer actual = fact.FactorialRecursion(1);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void RecursionTest2(){
        //Given
        Integer expected = 6;

        //When
        Factorial fact = new Factorial();
        Integer actual = fact.FactorialRecursion(3);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void FactorialTest1(){
        //Given
        Integer expected = 1;

        //When
        Factorial fact = new Factorial();
        Integer actual = fact.Factorial(1);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void FactorialTest2(){
        //Given
        Integer expected = 24;

        //When
        Factorial fact = new Factorial();
        Integer actual = fact.Factorial(4);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
