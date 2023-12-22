package lk.ijse.dep11.spring;

import lk.ijse.dep11.spring.bean.SpringBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@ComponentScan
@Configuration
public class AppConfig {

    @Bean
    public SpringBean2 springBean2(){
        System.out.println("springBean2 method works");
        return new SpringBean2();
    }

    @Bean
    public String myString(){
        System.out.println("my string method works");
        return "IJSE";
    }

    @Bean
    public LocalDate localDate(){
        System.out.println("localDate method works");
        return LocalDate.now();
    }
}
