package lazyinitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class LazyInitializationAppLauncher {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(LazyInitializationAppLauncher.class)){
            System.out.println("Init complete..");
            context.getBean(B.class).doSomething();
        }
    }

}
