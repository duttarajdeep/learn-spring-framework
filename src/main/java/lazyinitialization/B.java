package lazyinitialization;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class B {

    private A classA;

    public B(A classA) {
        System.out.println("Some init logic");
        this.classA = classA;
    }

    public void doSomething(){
        System.out.println("Doing...");
    }
}
