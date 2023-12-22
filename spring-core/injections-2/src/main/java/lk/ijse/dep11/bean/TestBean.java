package lk.ijse.dep11.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class TestBean {

    public TestBean(String[] str) {
        System.out.println(Arrays.toString(str));
    }

//    @Autowired
//    public TestBean(List<String> str) {
//        System.out.println(str);
//    }

//    @Autowired
//    public TestBean(Set<String> str) {
//        System.out.println(str);
//    }

//    @Autowired
//    public TestBean(Collection<String> str) {
//        System.out.println(str);
//    }

//    @Autowired
//    public TestBean(Map<String, String> str) {
//        System.out.println(str);
//    }
}
