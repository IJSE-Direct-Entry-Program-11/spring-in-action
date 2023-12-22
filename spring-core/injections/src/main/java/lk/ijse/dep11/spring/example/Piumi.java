package lk.ijse.dep11.spring.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@DigaKonde
@Qualifier("sudu")
@Primary
@Component
public class Piumi implements GoodGirl{

    @Override
    public void kiss() {
        System.out.println("Piumi: Ummmmmaaaaa...!");
        System.out.println("Piumi: Ummmmmaaaaa...!");
        System.out.println("Piumi: Ummmmmaaaaa...!");
    }
}
