package lk.ijse.dep11.spring.api;

import lk.ijse.dep11.spring.MyTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/hello")
public class MyHttpController {

    @Autowired
    private MyTest myTest;

    @GetMapping
    public String greeting(){
        return "<h1>" +  myTest.getName() +"</h1>";
    }

    @GetMapping("/start")
    public String start(HttpSession session){
        return "<h1>Session Started</h1>";
    }

    @GetMapping("/stop")
    public String stop(HttpSession session){
        session.invalidate();
        return "<h1>Session Invalidated</h1>";
    }
}
