package lk.ijse.dep11.spring.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {

    @DigaKonde
    @Qualifier("sudu")
    @Autowired
    private GoodGirl girlfriend;

    public void kissHer(){
        while(true){
            girlfriend.kiss();
        }
    }
}
