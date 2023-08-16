package springbasics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {
};

record Address(String firstLine, String city) {
};

@Configuration
public class SpringConfiguration {

    // We can define our Spring beans here. The classes and their instances will be managed by the Spring
    // application context
    @Bean
    public String name() {
        return "Rajdeep";
    }

    @Bean
    public int age() {
        return 18;
    }

    @Bean
    public Person person() {
        return new Person("Raj", 29, new Address("Madhyamgram", "Kolkata"));
    }

    @Bean(name = "defaultAddress")
    @Primary
    public Address address1() {
        return new Address("Kondapur", "Hyderabad");
    }

    @Bean(name = "myAddressBean2")
    @Qualifier("currentAddress")
    public Address address2() {
        return new Address("Raghavendra Colony", "Hyderabad");
    }

    @Bean
    public Person person2() {
        // Referring to other beans
        return new Person(name(), age(), new Address("Barikul", "Jajpur"));
    }

    @Bean
    public Person person3(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person4(String name, int age, @Qualifier("currentAddress") Address address) {
        return new Person(name, age, address);
    }

}
