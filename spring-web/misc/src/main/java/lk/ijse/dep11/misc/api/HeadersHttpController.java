package lk.ijse.dep11.misc.api;

import lk.ijse.dep11.misc.to.CustomerTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/headers")
public class HeadersHttpController {

    private volatile CustomerTO customer;

    @GetMapping("/method1")
    public String headerMethod1(@RequestHeader String host,
                                @RequestHeader("User-Agent") String userAgent){
        return String.format("<h1>Header Method1: Host=%s, User-Agent:%s</h1>", host, userAgent);
    }

    @GetMapping(value = "/method2", headers = {"x-ijse=ijse"})
    public String headerMethod1(@RequestHeader("x-ijse") String ijseHeader,
                                @RequestHeader("x-dep") int depHeader){
        return String.format("<h1>Header Method2: x-ijse=%s, x-dep:%s</h1>", ijseHeader, depHeader);
    }

    @CrossOrigin(exposedHeaders = {"x-count", "x-app-version"})
    @PutMapping(value = "/method3", consumes = "application/json")
    public ResponseEntity<CustomerTO> headerMethod2(@RequestBody CustomerTO customer){
        HttpHeaders myHeaders = new HttpHeaders();
        myHeaders.add("x-count", "10");
        myHeaders.add("x-app-version", "5.2.3");
        if (this.customer == null){
            this.customer = customer;                   // Store
            return new ResponseEntity<>(customer,myHeaders, HttpStatus.CREATED);
        }else{
            this.customer.setName(customer.getName());  // Update
            this.customer.setAddress(customer.getAddress());
            return new ResponseEntity<>(myHeaders, HttpStatus.NO_CONTENT);
        }
    }

    @Scheduled(fixedRate = 5, timeUnit = TimeUnit.SECONDS)
    public void doSomething(){
        this.customer = null;
    }
}
