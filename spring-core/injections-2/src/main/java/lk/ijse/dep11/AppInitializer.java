package lk.ijse.dep11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
    }
}
