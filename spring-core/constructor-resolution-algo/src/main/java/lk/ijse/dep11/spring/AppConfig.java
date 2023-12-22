package lk.ijse.dep11.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public String myString(){
        return "DEP";
    }

    @Bean
    public Integer myInt(){
        return 11;
    }

    @Bean
    public Boolean myBoolean(){
        return true;
    }
}
