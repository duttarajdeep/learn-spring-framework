package prepostannotations;

import org.springframework.stereotype.Component;

@Component
public class SomeDependency {
    public void getReady() {
        System.out.println("Some logic using SomeDependency...");
    }
}
