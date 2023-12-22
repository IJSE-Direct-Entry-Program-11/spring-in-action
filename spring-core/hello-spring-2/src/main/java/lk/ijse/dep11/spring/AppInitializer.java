package lk.ijse.dep11.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("/beans.xml");
    }
}
