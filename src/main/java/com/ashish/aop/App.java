package com.ashish.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashish.aop.service.PaymentService;
public class App {
    public static void main( String args[] )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/ashish/aop/config.xml");
   PaymentService payment=context.getBean("payment",PaymentService.class);
   payment.makePayment();
    
    }
}
