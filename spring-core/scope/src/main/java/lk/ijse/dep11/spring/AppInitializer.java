package lk.ijse.dep11.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext();
        ctx.registerShutdownHook();
        ctx.register(AppConfig.class);
        ctx.refresh();

        Object springBean1 = ctx.getBean("springBean");
        Object springBean2 = ctx.getBean("springBean");
        Object springBean3 = ctx.getBean("springBean");
//
//        System.out.println(springBean1);
//        System.out.println(springBean2);
//        System.out.println(springBean3);

    }
}
