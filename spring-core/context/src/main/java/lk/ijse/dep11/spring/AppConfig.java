package lk.ijse.dep11.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean("dep")
    public String myString(){
        return "IJSE";
    }
}
