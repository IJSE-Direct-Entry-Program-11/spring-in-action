package lk.ijse.dep.app.api;

import lk.ijse.dep.app.to.Customer;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class MyHttpController {

    @GetMapping
    public Customer greeting(HttpServletRequest req,
                             HttpServletResponse res){
        System.out.println(req);
        System.out.println(res);
        Customer customer = new Customer(1, "Kasun", "Galle",
                List.of("011-123", "033-123"));
        return customer;
    }

    @PostMapping
    public String saveCustomer(
            @RequestBody Map<String, Object> customer
            /* @RequestBody String customer */
            /* @RequestBody Customer customer */
    ){
        System.out.println(customer);
        return "Customer Saved";
    }
}
