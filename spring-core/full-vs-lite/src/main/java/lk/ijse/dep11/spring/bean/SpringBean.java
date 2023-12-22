package lk.ijse.dep11.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {

    public SpringBean() {
        System.out.println("SpringBean()");
    }

    @Bean
    public Bean1 bean1(){
        System.out.println("Bean1() Method");
        return new Bean1();
    }

    @Bean
    public Bean2 bean2(){
        return new Bean2();
    }

    @Bean
    public TestBean testBean() {
        return new TestBean(bean1(), bean2(), bean1(), bean2());
    }

}
