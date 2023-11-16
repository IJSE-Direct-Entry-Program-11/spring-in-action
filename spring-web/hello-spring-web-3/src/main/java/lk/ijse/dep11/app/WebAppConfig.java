package lk.ijse.dep11.app;

import lk.ijse.dep11.app.interceptor.Interceptor1;
import lk.ijse.dep11.app.interceptor.Interceptor2;
import lk.ijse.dep11.app.interceptor.Interceptor3;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@ComponentScan
@Configuration
public class WebAppConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Interceptor1());
        registry.addInterceptor(new Interceptor2());
        registry.addInterceptor(new Interceptor3());
    }
}
