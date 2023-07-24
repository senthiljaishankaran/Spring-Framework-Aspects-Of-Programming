package demoAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Loggers {
    @Before("execution(* demoAOP.ShoppingCart.shoppingCartMethod(..))")
    public void beforeLogging(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature());
        String args=joinPoint.getArgs()[0].toString();
        System.out.println(args);
        System.out.println("Before Logging Method is Invoked");
    }
    @After("execution(* demoAOP.ShoppingCart.shoppingCartMethod(..))")
    public void afterLogging(){
        System.out.println("After Logging Method is Invoked");
    }
}
