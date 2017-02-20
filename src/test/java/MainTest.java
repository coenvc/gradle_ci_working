package test.java;

import main.java.Main;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fhict on 20/02/2017.
 */
public class MainTest {
    Main main = new Main();
    @Test public void TestMain(){
        Assert.assertEquals(main.Test(),false);
    }
}
