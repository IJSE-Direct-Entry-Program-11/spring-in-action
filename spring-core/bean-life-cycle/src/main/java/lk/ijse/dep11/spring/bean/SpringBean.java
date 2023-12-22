package lk.ijse.dep11.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SpringBean implements BeanNameAware, BeanFactoryAware,
        ApplicationContextAware, InitializingBean, DisposableBean {

    public SpringBean() { System.out.println("SpringBean()"); }
    public void setBeanName(String s) { System.out.println("Bean Name Aware"); }
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware");    }
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext Aware");}
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean");}
    public void destroy() throws Exception {
        System.out.println("Disposable Bean");    }

    @PostConstruct
    public void init1(){        System.out.println("init1()");    }
    @PostConstruct
    public void init2(){        System.out.println("init2()");    }
    @PreDestroy
    public void close(){ System.out.println("close()");}
    @PreDestroy
    public void exit(){ System.out.println("exit()");  }
}
