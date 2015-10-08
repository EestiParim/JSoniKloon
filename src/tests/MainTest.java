package tests;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tonis on 10/8/15.
 */
public class MainTest {

    @Test
    public void testIfHelloWorldExists(){
        Assert.assertNotNull(program.Main.HelloWorld());
    }

}