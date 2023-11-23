package lk.ijse.dep11.misc.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mappings")
public class MappingSpecHttpController {

    @GetMapping
    public String mappingMethod1() {
        return "<h1>Mapping Method1: Empty Path Segments</h1>";
    }

    @GetMapping("/?u?e1")
    public String mappingMethod2() {
        return "<h2>Mapping Method2</h2>";
    }

    @GetMapping("/rule2*")
    public String mappingMethod3() {
        return "<h2>Mapping Method3</h2>";
    }

    @GetMapping("/ru*e3")
    public String mappingMethod4() {
        return "<h2>Mapping Method4</h2>";
    }

    @GetMapping("/rule4/*")
    public String mappingMethod5() {
        return "<h2>Mapping Method5</h2>";
    }

    @GetMapping("/rule5/*/rest")
    public String mappingMethod6() {
        return "<h2>Mapping Method6</h2>";
    }

    @GetMapping("/rule6/**")
    public String mappingMethod7() {
        return "<h2>Mapping Method7</h2>";
    }

    @GetMapping("/rule7/**/rest")
    public String mappingMethod8() {
        return "<h2>Mapping Method8</h2>";
    }

    @GetMapping("/rule8/{abc}/{test}")
//    @GetMapping("/rule8/*/*")
    public String mappingMethod9(@PathVariable(required = false) String abc,
                                 @PathVariable(required = false) String test) {
        return "<h2>Mapping Method9</h2> " + abc + " " + test;
    }

    @GetMapping("/rule9/{abc:C\\d{3}}")
    public String mappingMethod10(@PathVariable String abc) {
        return "<h2>Mapping Method10</h2> " + abc;
    }

    @GetMapping("/rule10/?*.php")
    public String mappingMethod11() {
        return "<h2>Mapping Method11</h2>";
    }
}
