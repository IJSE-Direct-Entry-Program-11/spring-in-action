package lk.ijse.dep11.bean;

import lk.ijse.dep11.Injector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@Component
public class SpringBean implements Injector {

    // Property/Field Injection
     @Autowired
    private String myStr;

    // Setter Method Injection
    @Autowired
    public void setMyStr(String myStr) {
        System.out.println("Setter Method Injection");
        this.myStr = myStr;
    }

    @Autowired
    @Override
    public void injectString(String str) {
        System.out.println("Interface Through Injection");
        this.myStr = str;
    }

    public SpringBean() {
        System.out.println("SpringBean(): " + myStr);
    }

    @PostConstruct
    public void init(){
        System.out.println("Init: " + myStr);
    }

}
