package com.demo.mavendemoapplication;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.mavendemoapplication.service.MockService;

/**
 * Created by Sridhar on 07-06-2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMockServiceTests {
    @Test
    public void testSayHello() throws Exception {
        MockService mockService=new MockService();
        mockService.setName("Jack");
        mockService.setCity("pasadena");
        String result=mockService.sayHello();
        assert (result.equals("NinaMyersddddchennai"));
    }
}



