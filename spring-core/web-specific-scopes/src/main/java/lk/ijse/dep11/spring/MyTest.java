package lk.ijse.dep11.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class MyTest {
    public String name;

    public MyTest() {
        System.out.println("Constructor");
        String[] names = {"Kasun", "Nuwan", "Ruwan", "Supun"};
        this.name = names[(int) Math.floor(Math.random() * names.length)];
    }

    public String getName() {
        return name;
    }
}