package demoAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(BeanConfig.class);
        ShoppingCart shoppingCart=applicationContext.getBean(ShoppingCart.class);
        shoppingCart.shoppingCartMethod("Booked");
    }
}
