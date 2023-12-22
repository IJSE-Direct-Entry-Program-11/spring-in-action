package lk.ijse.dep11.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        Object springBean = ctx.getBean("springBean");
        System.out.println(springBean);

        Object testBean = ctx.getBean("testBean");
        System.out.println(testBean);
    }
}
