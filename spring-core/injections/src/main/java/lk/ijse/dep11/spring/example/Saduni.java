package lk.ijse.dep11.spring.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Qualifier("sudu")
@Primary
@Component
public class Saduni implements GoodGirl{
    @Override
    public void kiss() {
        System.out.println("Saduni: Ummaaaaahh....!");
        System.out.println("Saduni: Ummaaaaahh....!");
    }
}
