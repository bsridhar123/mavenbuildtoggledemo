package com.demo.tests;

import com.demo.pack1.MyClass;
import com.demo.pack1.MyClass2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sridhar on 07-06-2017.
 */
public class TestMyClass2 {
    @Test
    public void testDefaultSettings() throws Exception {
        MyClass2 myClass=new MyClass2();
        myClass.setName("Roja");
        myClass.setCity("hyderabad");
        String result=myClass.sayHello();
        assertEquals("HelloRoja",result);




    }
}



