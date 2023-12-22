package lk.ijse.dep11.spring.bean;

import org.springframework.stereotype.Component;

@Component("abc")
public class ABC {

    public ABC() {
        System.out.println("ABC()");
    }
}
