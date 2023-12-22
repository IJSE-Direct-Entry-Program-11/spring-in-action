package lk.ijse.dep11.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class SpringBean {

    @Autowired(required = false)
    public SpringBean() {
        System.out.println("No Arg");
    }

    @Autowired(required = false)
    public SpringBean(String str) {
        System.out.println(str);
    }

    public SpringBean(int x) {
        System.out.println(x);
    }

    @Autowired(required = false)
    public SpringBean(String str, int x) {
        System.out.println(str);
        System.out.println(x);
    }

    @Autowired(required = false)
    public SpringBean(String str, int x, boolean flag) {
        System.out.println("string,int,boolean");
    }

    @Autowired(required = false)
    public SpringBean(boolean str, int x, String flag) {
        System.out.println("boolean,int,string");
    }

    @Autowired(required = false)
    public SpringBean(int str, boolean x, String flag) {
        System.out.println("int,boolean,String");
    }
}
