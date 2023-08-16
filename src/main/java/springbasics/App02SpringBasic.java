package springbasics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02SpringBasic {

    public static void main(String[] args) {
        // Launch a spring context
        var context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        // Configure the things that we want Spring to manage - @Configuration class

        // Referring the beans by names
        /*
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2"));
        System.out.println(context.getBean("person3"));
        System.out.println(context.getBean("myAddressBean"));
         */

        // Referring the beans by return type
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person4"));

        // Get all Spring beans info
        // Arrays.stream(context.getBeanDefinitionNames()).forEach((bean) -> System.out.println(bean));

    }

}
