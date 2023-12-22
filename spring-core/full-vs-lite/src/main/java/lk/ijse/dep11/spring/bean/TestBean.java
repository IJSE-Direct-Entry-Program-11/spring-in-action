package lk.ijse.dep11.spring.bean;

import org.springframework.context.annotation.Bean;

public class TestBean {

    public TestBean(Bean1 bean1, Bean2 bean2, Bean1 bean1Clone, Bean2 bean2Clone) {
        System.out.println(bean1);
        System.out.println(bean2);
        System.out.println(bean1Clone);
        System.out.println(bean2Clone);
        System.out.println("TestBean()");
    }
}
