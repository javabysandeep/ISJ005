package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class ProductApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);
        Product product = applicationContext.getBean(Product.class);
        System.out.println(product);
    }
}
