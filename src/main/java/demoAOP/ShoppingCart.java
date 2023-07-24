package demoAOP;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void shoppingCartMethod(String Status){
        System.out.println("Shopping Cart Method Invoked");
    }
}
