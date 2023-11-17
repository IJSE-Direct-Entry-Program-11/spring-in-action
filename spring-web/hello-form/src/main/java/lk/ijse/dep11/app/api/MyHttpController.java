package lk.ijse.dep11.app.api;

import lk.ijse.dep11.app.to.Customer;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Part;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class MyHttpController {

    @PostMapping
    public String saveCustomer(
            @RequestParam String id,
            @RequestParam("name") String customerName,
            @RequestParam(required = false) String address,
            @RequestParam List<String> contact
            /* @RequestParam MultiValueMap<String, List<String>> customer */
            /* @RequestParam Map<String, String> customer */
            /* @ModelAttribute Customer customer */
            /* @RequestBody String customer */
    ){
//        System.out.println(customer);
        System.out.println(id);
        System.out.println(customerName);
        System.out.println(address);
        System.out.println(contact);
        return "Customer Saved!";
    }

    @PatchMapping
    public String updateCustomer(
            @RequestPart("picture") List<Part> customerPictures,
            /* @RequestPart MultipartFile picture, */
            /*
            @RequestParam String id,
            @RequestParam("name") String customerName,
            @RequestParam(required = false) String address,
            @RequestParam List<String> contact
            */
            @RequestParam MultiValueMap<String, List<String>> customer
            /* @RequestParam Map<String, String> customer */
            /* @ModelAttribute Customer customer */
            /* @RequestBody String customer */
    ) throws IOException {
        System.out.println(customer);
        customerPictures.forEach(p -> {
            try {
                p.write("/home/ranjith-suranga/Desktop/" + p.getSubmittedFileName());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        //customerPicture.write("/home/ranjith-suranga/Desktop/" + customerPicture.getSubmittedFileName());
//        System.out.println(customerPicture);
//        System.out.println(id);
//        System.out.println(customerName);
//        System.out.println(address);
//        System.out.println(contact);
        return "Customer Updated!";
    }
}
