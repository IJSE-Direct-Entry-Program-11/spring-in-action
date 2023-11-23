package lk.ijse.dep11.misc.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/params")
public class QueryParamsHttpController {

    @GetMapping("/method1")
    public String paramsMethod1(String param1,
                                @RequestParam("param2") String myParam2){
        return String.format("<h1>Params Method1: param1=%s, param2=%s</h1>", param1, myParam2);
    }

    @GetMapping(value = "/method2", params = {"param1", "param2=dep"})
    public String paramsMethod2(String param1, String param2){
        return String.format("<h1>Params Method2: param1=%s, param2=%s</h1>", param1, param2);
    }

    @GetMapping(value = "/method3", params = {"param1", "param2", "param3", "param4"})
    public String paramsMethod3(String param1, boolean param2, int param3, double param4){
        return String.format("<h1>Params Method3: param1=%s, param2=%s, param3=%s, param4=%s</h1>",
                param1, param2, param3, param4);
    }

    @GetMapping(value = "/method4", params = {"page", "size"})
    public String paramsMethod4(int page, int size){
        return String.format("<h1>Params Method4: page=%s, size=%s</h1>", page, size);
    }
}
