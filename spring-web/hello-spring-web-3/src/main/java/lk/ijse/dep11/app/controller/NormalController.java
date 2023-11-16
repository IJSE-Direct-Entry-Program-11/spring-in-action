package lk.ijse.dep11.app.controller;

import lk.ijse.dep11.app.tm.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/normal")
public class NormalController {

    @GetMapping
    public ModelAndView doSomething(){
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("C001", "Kasun"));
        customerList.add(new Customer("C002", "Nuwan"));
        customerList.add(new Customer("C003", "Ruwan"));
        customerList.add(new Customer("C004", "Supun"));
        Map<String, Object> model = new HashMap<>();
        model.put("customerList", customerList);
        model.put("count", 4);
        ModelAndView mv = new ModelAndView("something.jsp", model);
        return mv;
    }
}
