package lk.ijse.dep11.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.registerShutdownHook();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        ctx.getBean("springBean");

        boolean springBean = ctx.containsBean("springBean");
        System.out.println("Is SpringBean inside the context? " + springBean);

        boolean myString = ctx.containsBean("dep");
        System.out.println("Is myString inside the context? " + myString);

        boolean appConfig = ctx.containsBean("appConfig");
        System.out.println("Is appConfig inside the context? " + appConfig);

        boolean ABC = ctx.containsBean("abc");
        System.out.println("Is ABC inside the context? " + ABC);

        boolean DAOCustomer = ctx.containsBean("DAOCustomer");
        System.out.println("Is DAOCustomer inside the context? " + DAOCustomer);

        boolean boFACTORY = ctx.containsBean("boFACTORY");
        System.out.println("Is boFACTORY inside the context? " + boFACTORY);
    }
}
