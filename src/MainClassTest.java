import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber(){
        Assert.assertTrue("Number is 14" ,getLocalNumber(number) == 14);
    }

    @Test
    public void testGetClassNumber(){
        Assert.assertTrue("Variable class_number is more than 45", getClassNumber() > 45);
    }

    @Test
    public void testGetClassString(){
        Assert.assertTrue("String doesn't contain 'Hello'",
                getClassString().contains("Hello") || getClassString().contains("hello"));
    }
}
