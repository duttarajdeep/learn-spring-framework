package prepostannotations;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready");
    }

    @PostConstruct
    public void initializa() {
        someDependency.getReady();
    }
}
