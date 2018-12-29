package atelier_junit;

import org.junit.Assert;
import org.junit.Test;

public class FooTest {
    @Test    
    public void testMin()
    {
        Foo f = new Foo();
        Assert.assertEquals(5,f.min(45,5));
    }
}