package xmlconfiguration;

import com.springpractice.learnspringframework.game.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class XMLConfigurationContextLauncherApp {
    public static void main(String[] args) {
        // Java configuration file
        //try(var context = new AnnotationConfigApplicationContext(XMLConfigurationContextLauncherApp.class)){}

        // XML Configuration file
        var context = new ClassPathXmlApplicationContext("contextConfiguration.xml");
        Arrays.stream(context.getBeanDefinitionNames()).forEach((c) -> System.out.println(c));

        System.out.println(context.getBean("name"));

        context.getBean(GameRunner.class).run();

    }
}
