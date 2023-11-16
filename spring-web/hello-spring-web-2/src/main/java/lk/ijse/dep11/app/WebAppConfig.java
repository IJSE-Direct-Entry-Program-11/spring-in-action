package lk.ijse.dep11.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan
public class WebAppConfig {

    static{
        System.out.println("WebAppConfig class object is being initialized");
    }

    public WebAppConfig() {
        System.out.println("WebAppConfig()");
    }
}
