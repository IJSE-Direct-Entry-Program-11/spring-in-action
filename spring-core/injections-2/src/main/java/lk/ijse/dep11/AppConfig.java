package lk.ijse.dep11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

@ComponentScan
@Configuration
public class AppConfig {

    @Order(2)
    @Bean
    public String myString1() {
        return "Hi";
    }

    @Order(1)
    @Bean
    public String myString2() {
        return "DEP";
    }

    @Order(3)
    @Bean
    public String myString3() {
        return "DEP-11";
    }
}
