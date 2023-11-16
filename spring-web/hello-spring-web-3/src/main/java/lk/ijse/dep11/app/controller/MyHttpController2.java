package lk.ijse.dep11.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/hello2")
public class MyHttpController2 {

    @RequestMapping(method = RequestMethod.GET)
    //@GetMapping
    public String handlerMethod1(){
        return "MyHttpController2: Handles Get Request";
    }

    @PostMapping
    public String handlerMethod2(){
        return "MyHttpController2: Handles Post Request";
    }

    @DeleteMapping
    public String handlerMethod3(){
        return "MyHttpController2: Handles Delete Request";
    }

    @PutMapping
    public String handlerMethod4(){
        return "MyHttpController2: Handles Put Request";
    }

    @PatchMapping
    public String handlerMethod5(){
        return "MyHttpController2: Handles Patch Request";
    }
}
