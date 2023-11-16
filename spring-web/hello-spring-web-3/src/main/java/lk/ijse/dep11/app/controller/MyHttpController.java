package lk.ijse.dep11.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class MyHttpController {

    @RequestMapping(method = RequestMethod.GET)
    //@GetMapping
    public String handlerMethod1(){
        return "Handles Get Request";
    }

    @PostMapping
    public String handlerMethod2(){
        return "Handles Post Request";
    }

    @DeleteMapping
    public String handlerMethod3(){
        return "Handles Delete Request";
    }

    @PutMapping
    public String handlerMethod4(){
        return "Handles Put Request";
    }

    @PatchMapping
    public String handlerMethod5(){
        return "Handles Patch Request";
    }
}
