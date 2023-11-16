package lk.ijse.dep11.app.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")
public class MyHttpController {

    static{
        System.out.println("MyHttpController class object is being initialized");
    }

    public MyHttpController() {
        System.out.println("MyHttpController()");
    }

    @GetMapping
    public String sayHello(){
        return "Hello!";
    }
}
