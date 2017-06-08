package com.demo.mavendemoapplication;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.mavendemoapplication.service.DemoService;

/**
 * Created by Sridhar on 07-06-2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDemoServiceTests {
    @Test
    public void testSayHello() throws Exception {
        DemoService demoService=new DemoService();
        demoService.setName("NinaMyers");
        demoService.setCity("chennai");
        String result=demoService.sayHello();
        assert (result.equals("NinaMyersddddchennai"));
    }
}



