package lk.ijse.dep11.app;

import org.springframework.context.annotation.Configuration;

@Configuration
public class WebRootConfig {

    static{
        System.out.println("WebRootConfig class object is being initialized");
    }

    public WebRootConfig() {
        System.out.println("WebRootConfig()");
    }
}
