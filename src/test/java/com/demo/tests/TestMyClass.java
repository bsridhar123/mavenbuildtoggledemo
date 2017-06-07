package com.demo.tests;

import com.demo.pack1.MyClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Sridhar on 07-06-2017.
 */
public class TestMyClass {
    @Test
    public void testDefaultSettings() throws Exception {
        MyClass myClass=new MyClass();
        myClass.setName("Roja");
        myClass.setCity("hyderabad");
        String result=myClass.sayHello();
        assertEquals("h",result);
    }
}



