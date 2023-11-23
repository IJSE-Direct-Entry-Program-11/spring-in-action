package lk.ijse.dep11.misc.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cookies")
public class CookieHttpController {

    @GetMapping("/method1")
    public String cookieMethod1(@RequestHeader String cookie){
        String cookie1 = cookie.split(";")[0].split("=")[1];
        String cookie2 = cookie.split(";")[1].split("=")[1];
        return String.format("<h1>cookie1=%s, cookie2=%s</h1>", cookie1, cookie2);
    }

    @GetMapping("/method2")
    public String cookieMethod2(@CookieValue(required = false) String cookie1,
                                @CookieValue(name = "abc", required = false) String cookie2){
        return String.format("<h1>cookie1=%s, cookie2=%s</h1>", cookie1, cookie2);
    }
}
