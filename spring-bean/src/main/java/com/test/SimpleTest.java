package com.test;

import com.smart.anno.LogonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

public class SimpleTest {
    public void testSimple() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/smart/anno/beans.xml");
        LogonService logonService = ctx.getBean(LogonService.class);
        logonService.saveLog();
    }
}
