package demoAOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthorizationAspect {
    @Pointcut("within(demoAOP..*)")
    public void authenticatingPointCut(){

    }
    @Pointcut("within(demoAOP..*)")
    public void authorizationPointCut(){

    }
    @Before("authenticatingPointCut() || authorizationPointCut()")
    public void authenticate(){
        System.out.println("Authenticating the Request");
    }

}
