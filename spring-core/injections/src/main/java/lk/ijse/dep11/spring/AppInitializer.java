package lk.ijse.dep11.spring;

import lk.ijse.dep11.spring.example.Boy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        Boy thisara = ctx.getBean("boy", Boy.class);
        thisara.kissHer();
    }
}
