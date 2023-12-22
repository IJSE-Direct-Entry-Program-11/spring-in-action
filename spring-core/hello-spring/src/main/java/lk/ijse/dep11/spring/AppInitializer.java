package lk.ijse.dep11.spring;

import lk.ijse.dep11.spring.bean.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    // XmlWebApplicationContext
    // AnnotationConfigWebApplicationContext

    // AnnotationConfigApplicationContext
    // ClassPathXmlApplicationContext
    // FileSystemXmlApplicationContext

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
    }
}
