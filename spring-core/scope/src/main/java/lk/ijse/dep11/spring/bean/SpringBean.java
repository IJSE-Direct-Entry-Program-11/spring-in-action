package lk.ijse.dep11.spring.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Scope("prototype")
@Component
public class SpringBean {

    public SpringBean() {
        System.out.println("SpringBean()");
    }

    @PostConstruct
    public void init() {
        System.out.println("SpringBean(): Init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("SpringBean(): destroy");
    }
}
